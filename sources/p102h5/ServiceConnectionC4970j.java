package p102h5;

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
import p163l5.C6378r;
import p218p5.C8050a;
import p312w5.HandlerC9983e;

public final class ServiceConnectionC4970j implements ServiceConnection {
    @GuardedBy("this")
    public final Queue<AbstractC4981u<?>> f16904M;
    @GuardedBy("this")
    public final SparseArray<AbstractC4981u<?>> f16905N;
    public final C4969i f16906O;
    @GuardedBy("this")
    public int f16907a;
    public final Messenger f16908b;
    public C4979s f16909c;

    public ServiceConnectionC4970j(C4969i iVar) {
        this.f16906O = iVar;
        this.f16907a = 0;
        this.f16908b = new Messenger(new HandlerC9983e(Looper.getMainLooper(), new Handler.Callback(this) {
            public final ServiceConnectionC4970j f16911a;

            {
                this.f16911a = this;
            }

            @Override
            public final boolean handleMessage(Message message) {
                return this.f16911a.m24352d(message);
            }
        }));
        this.f16904M = new ArrayDeque();
        this.f16905N = new SparseArray<>();
    }

    public final void m24355a() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f16906O.f16901b;
        scheduledExecutorService.execute(new Runnable(this) {
            public final ServiceConnectionC4970j f16912a;

            {
                this.f16912a = this;
            }

            @Override
            public final void run() {
                final AbstractC4981u<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final ServiceConnectionC4970j jVar = this.f16912a;
                while (true) {
                    synchronized (jVar) {
                        if (jVar.f16907a == 2) {
                            if (jVar.f16904M.isEmpty()) {
                                jVar.m24350f();
                                return;
                            }
                            poll = jVar.f16904M.poll();
                            jVar.f16905N.put(poll.f16921a, poll);
                            scheduledExecutorService2 = jVar.f16906O.f16901b;
                            scheduledExecutorService2.schedule(new Runnable(jVar, poll) {
                                public final ServiceConnectionC4970j f16915a;
                                public final AbstractC4981u f16916b;

                                {
                                    this.f16915a = jVar;
                                    this.f16916b = poll;
                                }

                                @Override
                                public final void run() {
                                    this.f16915a.m24354b(this.f16916b.f16921a);
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
                    context = jVar.f16906O.f16900a;
                    Messenger messenger = jVar.f16908b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f16923c;
                    obtain.arg1 = poll.f16921a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo24341d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.f16924d);
                    obtain.setData(bundle);
                    try {
                        jVar.f16909c.m24348a(obtain);
                    } catch (RemoteException e) {
                        jVar.m24353c(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void m24354b(int i) {
        AbstractC4981u<?> uVar = this.f16905N.get(i);
        if (uVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f16905N.remove(i);
            uVar.m24347b(new C4980t(3, "Timed out waiting for response"));
            m24350f();
        }
    }

    public final synchronized void m24353c(int i, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f16907a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f16907a = 4;
            C8050a b = C8050a.m13701b();
            context = this.f16906O.f16900a;
            b.m13700c(context, this);
            C4980t tVar = new C4980t(i, str);
            for (AbstractC4981u<?> uVar : this.f16904M) {
                uVar.m24347b(tVar);
            }
            this.f16904M.clear();
            for (int i3 = 0; i3 < this.f16905N.size(); i3++) {
                this.f16905N.valueAt(i3).m24347b(tVar);
            }
            this.f16905N.clear();
        } else if (i2 == 3) {
            this.f16907a = 4;
        } else if (i2 != 4) {
            int i4 = this.f16907a;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unknown state: ");
            sb2.append(i4);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final boolean m24352d(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Received response to request: ");
            sb2.append(i);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        synchronized (this) {
            AbstractC4981u<?> uVar = this.f16905N.get(i);
            if (uVar == null) {
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("Received response for unknown request: ");
                sb3.append(i);
                Log.w("MessengerIpcClient", sb3.toString());
                return true;
            }
            this.f16905N.remove(i);
            m24350f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                uVar.m24347b(new C4980t(4, "Not supported by GmsCore"));
            } else {
                uVar.mo24342a(data);
            }
            return true;
        }
    }

    public final synchronized boolean m24351e(AbstractC4981u<?> uVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.f16907a;
        if (i == 0) {
            this.f16904M.add(uVar);
            C6378r.m20505m(this.f16907a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f16907a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            C8050a b = C8050a.m13701b();
            context = this.f16906O.f16900a;
            if (!b.m13702a(context, intent, this, 1)) {
                m24353c(0, "Unable to bind to service");
            } else {
                scheduledExecutorService = this.f16906O.f16901b;
                scheduledExecutorService.schedule(new Runnable(this) {
                    public final ServiceConnectionC4970j f16910a;

                    {
                        this.f16910a = this;
                    }

                    @Override
                    public final void run() {
                        this.f16910a.m24349g();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
            return true;
        } else if (i == 1) {
            this.f16904M.add(uVar);
            return true;
        } else if (i != 2) {
            if (!(i == 3 || i == 4)) {
                int i2 = this.f16907a;
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown state: ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
            return false;
        } else {
            this.f16904M.add(uVar);
            m24355a();
            return true;
        }
    }

    public final synchronized void m24350f() {
        Context context;
        if (this.f16907a == 2 && this.f16904M.isEmpty() && this.f16905N.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f16907a = 3;
            C8050a b = C8050a.m13701b();
            context = this.f16906O.f16900a;
            b.m13700c(context, this);
        }
    }

    public final synchronized void m24349g() {
        if (this.f16907a == 1) {
            m24353c(1, "Timed out while binding");
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f16906O.f16901b;
        scheduledExecutorService.execute(new Runnable(this, iBinder) {
            public final ServiceConnectionC4970j f16913a;
            public final IBinder f16914b;

            {
                this.f16913a = this;
                this.f16914b = iBinder;
            }

            @Override
            public final void run() {
                ServiceConnectionC4970j jVar = this.f16913a;
                IBinder iBinder2 = this.f16914b;
                synchronized (jVar) {
                    try {
                        if (iBinder2 == null) {
                            jVar.m24353c(0, "Null service connection");
                            return;
                        }
                        try {
                            jVar.f16909c = new C4979s(iBinder2);
                            jVar.f16907a = 2;
                            jVar.m24355a();
                        } catch (RemoteException e) {
                            jVar.m24353c(0, e.getMessage());
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
        scheduledExecutorService = this.f16906O.f16901b;
        scheduledExecutorService.execute(new Runnable(this) {
            public final ServiceConnectionC4970j f16917a;

            {
                this.f16917a = this;
            }

            @Override
            public final void run() {
                this.f16917a.m24353c(2, "Service disconnected");
            }
        });
    }
}
