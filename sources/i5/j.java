package i5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import m5.r;
import q5.a;
import x5.e;

public final class j implements ServiceConnection {
    @GuardedBy("this")
    public final Queue<u<?>> M;
    @GuardedBy("this")
    public final SparseArray<u<?>> N;
    public final i O;
    @GuardedBy("this")
    public int f14018a;
    public final Messenger f14019b;
    public s f14020c;

    public j(i iVar) {
        this.O = iVar;
        this.f14018a = 0;
        this.f14019b = new Messenger(new e(Looper.getMainLooper(), new Handler.Callback(this) {
            public final j f14022a;

            {
                this.f14022a = this;
            }

            @Override
            public final boolean handleMessage(Message message) {
                return this.f14022a.d(message);
            }
        }));
        this.M = new ArrayDeque();
        this.N = new SparseArray<>();
    }

    public final void a() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.O.f14015b;
        scheduledExecutorService.execute(new Runnable(this) {
            public final j f14023a;

            {
                this.f14023a = this;
            }

            @Override
            public final void run() {
                final u<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final j jVar = this.f14023a;
                while (true) {
                    synchronized (jVar) {
                        if (jVar.f14018a == 2) {
                            if (jVar.M.isEmpty()) {
                                jVar.f();
                                return;
                            }
                            poll = jVar.M.poll();
                            jVar.N.put(poll.f14032a, poll);
                            scheduledExecutorService2 = jVar.O.f14015b;
                            scheduledExecutorService2.schedule(new Runnable(jVar, poll) {
                                public final j f14026a;
                                public final u f14027b;

                                {
                                    this.f14026a = jVar;
                                    this.f14027b = poll;
                                }

                                @Override
                                public final void run() {
                                    this.f14026a.b(this.f14027b.f14032a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } else {
                            return;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    context = jVar.O.f14014a;
                    Messenger messenger = jVar.f14019b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f14034c;
                    obtain.arg1 = poll.f14032a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.f14035d);
                    obtain.setData(bundle);
                    try {
                        jVar.f14020c.a(obtain);
                    } catch (RemoteException e10) {
                        jVar.c(2, e10.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void b(int i10) {
        u<?> uVar = this.N.get(i10);
        if (uVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.N.remove(i10);
            uVar.b(new t(3, "Timed out waiting for response"));
            f();
        }
    }

    public final synchronized void c(int i10, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f14018a;
        if (i11 == 0) {
            throw new IllegalStateException();
        } else if (i11 == 1 || i11 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f14018a = 4;
            a b10 = a.b();
            context = this.O.f14014a;
            b10.c(context, this);
            t tVar = new t(i10, str);
            for (u<?> uVar : this.M) {
                uVar.b(tVar);
            }
            this.M.clear();
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                this.N.valueAt(i12).b(tVar);
            }
            this.N.clear();
        } else if (i11 == 3) {
            this.f14018a = 4;
        } else if (i11 != 4) {
            int i13 = this.f14018a;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unknown state: ");
            sb2.append(i13);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final boolean d(Message message) {
        int i10 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Received response to request: ");
            sb2.append(i10);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        synchronized (this) {
            u<?> uVar = this.N.get(i10);
            if (uVar == null) {
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("Received response for unknown request: ");
                sb3.append(i10);
                Log.w("MessengerIpcClient", sb3.toString());
                return true;
            }
            this.N.remove(i10);
            f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                uVar.b(new t(4, "Not supported by GmsCore"));
            } else {
                uVar.a(data);
            }
            return true;
        }
    }

    public final synchronized boolean e(u<?> uVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i10 = this.f14018a;
        if (i10 == 0) {
            this.M.add(uVar);
            r.m(this.f14018a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f14018a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            a b10 = a.b();
            context = this.O.f14014a;
            if (!b10.a(context, intent, this, 1)) {
                c(0, "Unable to bind to service");
            } else {
                scheduledExecutorService = this.O.f14015b;
                scheduledExecutorService.schedule(new Runnable(this) {
                    public final j f14021a;

                    {
                        this.f14021a = this;
                    }

                    @Override
                    public final void run() {
                        this.f14021a.g();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
            return true;
        } else if (i10 == 1) {
            this.M.add(uVar);
            return true;
        } else if (i10 != 2) {
            if (!(i10 == 3 || i10 == 4)) {
                int i11 = this.f14018a;
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown state: ");
                sb2.append(i11);
                throw new IllegalStateException(sb2.toString());
            }
            return false;
        } else {
            this.M.add(uVar);
            a();
            return true;
        }
    }

    public final synchronized void f() {
        Context context;
        if (this.f14018a == 2 && this.M.isEmpty() && this.N.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f14018a = 3;
            a b10 = a.b();
            context = this.O.f14014a;
            b10.c(context, this);
        }
    }

    public final synchronized void g() {
        if (this.f14018a == 1) {
            c(1, "Timed out while binding");
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.O.f14015b;
        scheduledExecutorService.execute(new Runnable(this, iBinder) {
            public final j f14024a;
            public final IBinder f14025b;

            {
                this.f14024a = this;
                this.f14025b = iBinder;
            }

            @Override
            public final void run() {
                j jVar = this.f14024a;
                IBinder iBinder2 = this.f14025b;
                synchronized (jVar) {
                    try {
                        if (iBinder2 == null) {
                            jVar.c(0, "Null service connection");
                            return;
                        }
                        try {
                            jVar.f14020c = new s(iBinder2);
                            jVar.f14018a = 2;
                            jVar.a();
                        } catch (RemoteException e10) {
                            jVar.c(0, e10.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.O.f14015b;
        scheduledExecutorService.execute(new Runnable(this) {
            public final j f14028a;

            {
                this.f14028a = this;
            }

            @Override
            public final void run() {
                this.f14028a.c(2, "Service disconnected");
            }
        });
    }
}
