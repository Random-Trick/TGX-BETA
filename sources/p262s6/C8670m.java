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
    public static final Map f27996o = new HashMap();
    public final Context f27997a;
    public final C8646a f27998b;
    public final String f27999c;
    public boolean f28003g;
    public final Intent f28004h;
    public final AbstractC8660h f28005i;
    public ServiceConnection f28009m;
    public IInterface f28010n;
    public final List f28000d = new ArrayList();
    public final Set f28001e = new HashSet();
    public final Object f28002f = new Object();
    public final IBinder.DeathRecipient f28007k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            C8670m.m11785i(C8670m.this);
        }
    };
    public final AtomicInteger f28008l = new AtomicInteger(0);
    public final WeakReference f28006j = new WeakReference(null);

    public C8670m(Context context, C8646a aVar, String str, Intent intent, AbstractC8660h hVar, AbstractC8658g gVar) {
        this.f27997a = context;
        this.f27998b = aVar;
        this.f27999c = str;
        this.f28004h = intent;
        this.f28005i = hVar;
    }

    public static void m11785i(C8670m mVar) {
        mVar.f27998b.m11814d("reportBinderDeath", new Object[0]);
        AbstractC8658g gVar = (AbstractC8658g) mVar.f28006j.get();
        if (gVar != null) {
            mVar.f27998b.m11814d("calling onBinderDied", new Object[0]);
            gVar.zza();
        } else {
            mVar.f27998b.m11814d("%s : Binder has died.", mVar.f27999c);
            for (AbstractRunnableC8648b bVar : mVar.f28000d) {
                bVar.m11808c(mVar.m11774t());
            }
            mVar.f28000d.clear();
        }
        mVar.m11773u();
    }

    public static void m11780n(C8670m mVar, AbstractRunnableC8648b bVar) {
        if (mVar.f28010n == null && !mVar.f28003g) {
            mVar.f27998b.m11814d("Initiate binding to the service.", new Object[0]);
            mVar.f28000d.add(bVar);
            ServiceConnectionC8668l lVar = new ServiceConnectionC8668l(mVar, null);
            mVar.f28009m = lVar;
            mVar.f28003g = true;
            if (!mVar.f27997a.bindService(mVar.f28004h, lVar, 1)) {
                mVar.f27998b.m11814d("Failed to bind to the service.", new Object[0]);
                mVar.f28003g = false;
                for (AbstractRunnableC8648b bVar2 : mVar.f28000d) {
                    bVar2.m11808c(new C8672n());
                }
                mVar.f28000d.clear();
            }
        } else if (mVar.f28003g) {
            mVar.f27998b.m11814d("Waiting to bind to the service.", new Object[0]);
            mVar.f28000d.add(bVar);
        } else {
            bVar.run();
        }
    }

    public static void m11779o(C8670m mVar) {
        mVar.f27998b.m11814d("linkToDeath", new Object[0]);
        try {
            mVar.f28010n.asBinder().linkToDeath(mVar.f28007k, 0);
        } catch (RemoteException e) {
            mVar.f27998b.m11815c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static void m11778p(C8670m mVar) {
        mVar.f27998b.m11814d("unlinkToDeath", new Object[0]);
        mVar.f28010n.asBinder().unlinkToDeath(mVar.f28007k, 0);
    }

    public final Handler m11791c() {
        Handler handler;
        Map map = f27996o;
        synchronized (map) {
            if (!map.containsKey(this.f27999c)) {
                HandlerThread handlerThread = new HandlerThread(this.f27999c, 10);
                handlerThread.start();
                map.put(this.f27999c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f27999c);
        }
        return handler;
    }

    public final IInterface m11789e() {
        return this.f28010n;
    }

    public final void m11777q(AbstractRunnableC8648b bVar, final C9865p pVar) {
        synchronized (this.f28002f) {
            this.f28001e.add(pVar);
            pVar.m6735a().mo6729a(new AbstractC9850a() {
                @Override
                public final void mo6750a(AbstractC9854e eVar) {
                    C8670m.this.m11776r(pVar, eVar);
                }
            });
        }
        synchronized (this.f28002f) {
            if (this.f28008l.getAndIncrement() > 0) {
                this.f27998b.m11817a("Already connected to the service.", new Object[0]);
            }
        }
        m11791c().post(new C8654e(this, bVar.m11809b(), bVar));
    }

    public final void m11776r(C9865p pVar, AbstractC9854e eVar) {
        synchronized (this.f28002f) {
            this.f28001e.remove(pVar);
        }
    }

    public final void m11775s(C9865p pVar) {
        synchronized (this.f28002f) {
            this.f28001e.remove(pVar);
        }
        synchronized (this.f28002f) {
            if (this.f28008l.get() <= 0 || this.f28008l.decrementAndGet() <= 0) {
                m11791c().post(new C8656f(this));
                return;
            }
            this.f27998b.m11814d("Leaving the connection open for other ongoing calls.", new Object[0]);
        }
    }

    public final RemoteException m11774t() {
        return Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f27999c).concat(" : Binder has died."));
    }

    public final void m11773u() {
        synchronized (this.f28002f) {
            for (C9865p pVar : this.f28001e) {
                pVar.m6732d(m11774t());
            }
            this.f28001e.clear();
        }
    }
}
