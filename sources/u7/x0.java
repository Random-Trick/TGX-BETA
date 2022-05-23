package u7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n6.f;
import n6.l;
import n6.m;
import u7.x0;

public class x0 implements ServiceConnection {
    public final Queue<a> M;
    public u0 N;
    public boolean O;
    public final Context f23706a;
    public final Intent f23707b;
    public final ScheduledExecutorService f23708c;

    public static class a {
        public final Intent f23709a;
        public final m<Void> f23710b = new m<>();

        public a(Intent intent) {
            this.f23709a = intent;
        }

        public void a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable(this) {
                public final x0.a f23702a;

                {
                    this.f23702a = this;
                }

                @Override
                public void run() {
                    this.f23702a.d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            c().b(scheduledExecutorService, new f(schedule) {
                public final ScheduledFuture f23704a;

                {
                    this.f23704a = schedule;
                }

                @Override
                public void a(l lVar) {
                    this.f23704a.cancel(false);
                }
            });
        }

        public void b() {
            this.f23710b.e(null);
        }

        public l<Void> c() {
            return this.f23710b.a();
        }

        public final void d() {
            String action = this.f23709a.getAction();
            StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 61);
            sb2.append("Service took too long to process intent: ");
            sb2.append(action);
            sb2.append(" App may get closed.");
            Log.w("FirebaseMessaging", sb2.toString());
            b();
        }
    }

    public x0(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new s5.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public final void a() {
        while (!this.M.isEmpty()) {
            this.M.poll().b();
        }
    }

    public final synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.M.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            u0 u0Var = this.N;
            if (u0Var == null || !u0Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.N.b(this.M.poll());
        }
    }

    public synchronized l<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.a(this.f23708c);
        this.M.add(aVar);
        b();
        return aVar.c();
    }

    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z10 = this.O;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("binder is dead. start connection? ");
            sb2.append(!z10);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.O) {
            this.O = true;
            try {
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
            if (!q5.a.b().a(this.f23706a, this.f23707b, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.O = false;
                a();
            }
        }
    }

    @Override
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("onServiceConnected: ");
            sb2.append(valueOf);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        this.O = false;
        if (!(iBinder instanceof u0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 28);
            sb3.append("Invalid service connection: ");
            sb3.append(valueOf2);
            Log.e("FirebaseMessaging", sb3.toString());
            a();
            return;
        }
        this.N = (u0) iBinder;
        b();
    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("onServiceDisconnected: ");
            sb2.append(valueOf);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        b();
    }

    public x0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.M = new ArrayDeque();
        this.O = false;
        Context applicationContext = context.getApplicationContext();
        this.f23706a = applicationContext;
        this.f23707b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f23708c = scheduledExecutorService;
    }
}
