package p274t7;

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
import p177m6.AbstractC6763f;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p218p5.C8050a;
import p246r5.ThreadFactoryC8371a;
import p274t7.ServiceConnectionC9052x0;

public class ServiceConnectionC9052x0 implements ServiceConnection {
    public final Queue<C9053a> f29026M;
    public BinderC9045u0 f29027N;
    public boolean f29028O;
    public final Context f29029a;
    public final Intent f29030b;
    public final ScheduledExecutorService f29031c;

    public static class C9053a {
        public final Intent f29032a;
        public final C6777m<Void> f29033b = new C6777m<>();

        public C9053a(Intent intent) {
            this.f29032a = intent;
        }

        public void m10602a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable(this) {
                public final ServiceConnectionC9052x0.C9053a f29022a;

                {
                    this.f29022a = this;
                }

                @Override
                public void run() {
                    this.f29022a.m10599d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            m10600c().mo19080b(scheduledExecutorService, new AbstractC6763f(schedule) {
                public final ScheduledFuture f29024a;

                {
                    this.f29024a = schedule;
                }

                @Override
                public void mo10607a(AbstractC6775l lVar) {
                    this.f29024a.cancel(false);
                }
            });
        }

        public void m10601b() {
            this.f29033b.m19083e(null);
        }

        public AbstractC6775l<Void> m10600c() {
            return this.f29033b.m19087a();
        }

        public final void m10599d() {
            String action = this.f29032a.getAction();
            StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 61);
            sb2.append("Service took too long to process intent: ");
            sb2.append(action);
            sb2.append(" App may get closed.");
            Log.w("FirebaseMessaging", sb2.toString());
            m10601b();
        }
    }

    public ServiceConnectionC9052x0(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new ThreadFactoryC8371a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public final void m10606a() {
        while (!this.f29026M.isEmpty()) {
            this.f29026M.poll().m10601b();
        }
    }

    public final synchronized void m10605b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f29026M.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC9045u0 u0Var = this.f29027N;
            if (u0Var == null || !u0Var.isBinderAlive()) {
                m10603d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f29027N.m10610b(this.f29026M.poll());
        }
    }

    public synchronized AbstractC6775l<Void> m10604c(Intent intent) {
        C9053a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new C9053a(intent);
        aVar.m10602a(this.f29031c);
        this.f29026M.add(aVar);
        m10605b();
        return aVar.m10600c();
    }

    public final void m10603d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z = this.f29028O;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("binder is dead. start connection? ");
            sb2.append(!z);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f29028O) {
            this.f29028O = true;
            try {
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
            if (!C8050a.m13701b().m13702a(this.f29029a, this.f29030b, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.f29028O = false;
                m10606a();
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
        this.f29028O = false;
        if (!(iBinder instanceof BinderC9045u0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 28);
            sb3.append("Invalid service connection: ");
            sb3.append(valueOf2);
            Log.e("FirebaseMessaging", sb3.toString());
            m10606a();
            return;
        }
        this.f29027N = (BinderC9045u0) iBinder;
        m10605b();
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
        m10605b();
    }

    public ServiceConnectionC9052x0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f29026M = new ArrayDeque();
        this.f29028O = false;
        Context applicationContext = context.getApplicationContext();
        this.f29029a = applicationContext;
        this.f29030b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f29031c = scheduledExecutorService;
    }
}
