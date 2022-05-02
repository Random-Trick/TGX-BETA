package p262s6;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p300v6.AbstractC9850a;
import p300v6.AbstractC9854e;
import p300v6.C9865p;

public final class C8670m {
    public static final Map f27993o = new HashMap();
    public final Context f27994a;
    public final C8646a f27995b;
    public final String f27996c;
    public boolean f28000g;
    public final Intent f28001h;
    public final AbstractC8660h f28002i;
    public ServiceConnection f28006m;
    public IInterface f28007n;
    public final List f27997d = new ArrayList();
    public final Set f27998e = new HashSet();
    public final Object f27999f = new Object();
    public final IBinder.DeathRecipient f28004k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            C8670m.m11786i(C8670m.this);
        }
    };
    public final AtomicInteger f28005l = new AtomicInteger(0);
    public final WeakReference f28003j = new WeakReference(null);

    public C8670m(Context context, C8646a aVar, String str, Intent intent, AbstractC8660h hVar, AbstractC8658g gVar) {
        this.f27994a = context;
        this.f27995b = aVar;
        this.f27996c = str;
        this.f28001h = intent;
        this.f28002i = hVar;
    }

    public static void m11786i(C8670m mVar) {
        mVar.f27995b.m11815d("reportBinderDeath", new Object[0]);
        AbstractC8658g gVar = (AbstractC8658g) mVar.f28003j.get();
        if (gVar != null) {
            mVar.f27995b.m11815d("calling onBinderDied", new Object[0]);
            gVar.zza();
        } else {
            mVar.f27995b.m11815d("%s : Binder has died.", mVar.f27996c);
            for (AbstractRunnableC8648b bVar : mVar.f27997d) {
                bVar.m11809c(mVar.m11775t());
            }
            mVar.f27997d.clear();
        }
        mVar.m11774u();
    }

    public static void m11781n(C8670m mVar, AbstractRunnableC8648b bVar) {
        if (mVar.f28007n == null && !mVar.f28000g) {
            mVar.f27995b.m11815d("Initiate binding to the service.", new Object[0]);
            mVar.f27997d.add(bVar);
            ServiceConnectionC8668l lVar = new ServiceConnectionC8668l(mVar, null);
            mVar.f28006m = lVar;
            mVar.f28000g = true;
            if (!mVar.f27994a.bindService(mVar.f28001h, lVar, 1)) {
                mVar.f27995b.m11815d("Failed to bind to the service.", new Object[0]);
                mVar.f28000g = false;
                for (AbstractRunnableC8648b bVar2 : mVar.f27997d) {
                    bVar2.m11809c(new C8672n());
                }
                mVar.f27997d.clear();
            }
        } else if (mVar.f28000g) {
            mVar.f27995b.m11815d("Waiting to bind to the service.", new Object[0]);
            mVar.f27997d.add(bVar);
        } else {
            bVar.run();
        }
    }

    public static void m11780o(C8670m mVar) {
        mVar.f27995b.m11815d("linkToDeath", new Object[0]);
        try {
            mVar.f28007n.asBinder().linkToDeath(mVar.f28004k, 0);
        } catch (RemoteException e) {
            mVar.f27995b.m11816c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static void m11779p(C8670m mVar) {
        mVar.f27995b.m11815d("unlinkToDeath", new Object[0]);
        mVar.f28007n.asBinder().unlinkToDeath(mVar.f28004k, 0);
    }

    public final Handler m11792c() {
        Handler handler;
        Map map = f27993o;
        synchronized (map) {
            if (!map.containsKey(this.f27996c)) {
                HandlerThread handlerThread = new HandlerThread(this.f27996c, 10);
                handlerThread.start();
                map.put(this.f27996c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f27996c);
        }
        return handler;
    }

    public final IInterface m11790e() {
        return this.f28007n;
    }

    public final void m11778q(AbstractRunnableC8648b bVar, final C9865p pVar) {
        synchronized (this.f27999f) {
            this.f27998e.add(pVar);
            pVar.m6735a().mo6729a(new AbstractC9850a() {
                @Override
                public final void mo6750a(AbstractC9854e eVar) {
                    C8670m.this.m11777r(pVar, eVar);
                }
            });
        }
        synchronized (this.f27999f) {
            if (this.f28005l.getAndIncrement() > 0) {
                this.f27995b.m11818a("Already connected to the service.", new Object[0]);
            }
        }
        m11792c().post(new C8654e(this, bVar.m11810b(), bVar));
    }

    public final void m11777r(C9865p pVar, AbstractC9854e eVar) {
        synchronized (this.f27999f) {
            this.f27998e.remove(pVar);
        }
    }

    public final void m11776s(C9865p pVar) {
        synchronized (this.f27999f) {
            this.f27998e.remove(pVar);
        }
        synchronized (this.f27999f) {
            if (this.f28005l.get() <= 0 || this.f28005l.decrementAndGet() <= 0) {
                m11792c().post(new C8656f(this));
                return;
            }
            this.f27995b.m11815d("Leaving the connection open for other ongoing calls.", new Object[0]);
        }
    }

    public final RemoteException m11775t() {
        return Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f27996c).concat(" : Binder has died."));
    }

    public final void m11774u() {
        synchronized (this.f27999f) {
            for (C9865p pVar : this.f27998e) {
                pVar.m6732d(m11775t());
            }
            this.f27998e.clear();
        }
    }
}
