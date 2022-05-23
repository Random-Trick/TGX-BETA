package t6;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
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
import w6.a;
import w6.e;
import w6.p;

public final class m {
    public static final Map f22953o = new HashMap();
    public final Context f22954a;
    public final a f22955b;
    public final String f22956c;
    public boolean f22960g;
    public final Intent f22961h;
    public final h f22962i;
    public ServiceConnection f22966m;
    public IInterface f22967n;
    public final List f22957d = new ArrayList();
    public final Set f22958e = new HashSet();
    public final Object f22959f = new Object();
    public final IBinder.DeathRecipient f22964k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            m.i(m.this);
        }
    };
    public final AtomicInteger f22965l = new AtomicInteger(0);
    public final WeakReference f22963j = new WeakReference(null);

    public m(Context context, a aVar, String str, Intent intent, h hVar, g gVar) {
        this.f22954a = context;
        this.f22955b = aVar;
        this.f22956c = str;
        this.f22961h = intent;
        this.f22962i = hVar;
    }

    public static void i(m mVar) {
        mVar.f22955b.d("reportBinderDeath", new Object[0]);
        g gVar = (g) mVar.f22963j.get();
        if (gVar != null) {
            mVar.f22955b.d("calling onBinderDied", new Object[0]);
            gVar.zza();
        } else {
            mVar.f22955b.d("%s : Binder has died.", mVar.f22956c);
            for (b bVar : mVar.f22957d) {
                bVar.c(mVar.t());
            }
            mVar.f22957d.clear();
        }
        mVar.u();
    }

    public static void n(m mVar, b bVar) {
        if (mVar.f22967n == null && !mVar.f22960g) {
            mVar.f22955b.d("Initiate binding to the service.", new Object[0]);
            mVar.f22957d.add(bVar);
            l lVar = new l(mVar, null);
            mVar.f22966m = lVar;
            mVar.f22960g = true;
            if (!mVar.f22954a.bindService(mVar.f22961h, lVar, 1)) {
                mVar.f22955b.d("Failed to bind to the service.", new Object[0]);
                mVar.f22960g = false;
                for (b bVar2 : mVar.f22957d) {
                    bVar2.c(new n());
                }
                mVar.f22957d.clear();
            }
        } else if (mVar.f22960g) {
            mVar.f22955b.d("Waiting to bind to the service.", new Object[0]);
            mVar.f22957d.add(bVar);
        } else {
            bVar.run();
        }
    }

    public static void o(m mVar) {
        mVar.f22955b.d("linkToDeath", new Object[0]);
        try {
            mVar.f22967n.asBinder().linkToDeath(mVar.f22964k, 0);
        } catch (RemoteException e10) {
            mVar.f22955b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static void p(m mVar) {
        mVar.f22955b.d("unlinkToDeath", new Object[0]);
        mVar.f22967n.asBinder().unlinkToDeath(mVar.f22964k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f22953o;
        synchronized (map) {
            if (!map.containsKey(this.f22956c)) {
                HandlerThread handlerThread = new HandlerThread(this.f22956c, 10);
                handlerThread.start();
                map.put(this.f22956c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f22956c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f22967n;
    }

    public final void q(b bVar, final p pVar) {
        synchronized (this.f22959f) {
            this.f22958e.add(pVar);
            pVar.a().a(new a() {
                @Override
                public final void a(e eVar) {
                    m.this.r(pVar, eVar);
                }
            });
        }
        synchronized (this.f22959f) {
            if (this.f22965l.getAndIncrement() > 0) {
                this.f22955b.a("Already connected to the service.", new Object[0]);
            }
        }
        c().post(new e(this, bVar.b(), bVar));
    }

    public final void r(p pVar, e eVar) {
        synchronized (this.f22959f) {
            this.f22958e.remove(pVar);
        }
    }

    public final void s(p pVar) {
        synchronized (this.f22959f) {
            this.f22958e.remove(pVar);
        }
        synchronized (this.f22959f) {
            if (this.f22965l.get() <= 0 || this.f22965l.decrementAndGet() <= 0) {
                c().post(new f(this));
                return;
            }
            this.f22955b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
        }
    }

    public final RemoteException t() {
        return new RemoteException(String.valueOf(this.f22956c).concat(" : Binder has died."));
    }

    public final void u() {
        synchronized (this.f22959f) {
            for (p pVar : this.f22958e) {
                pVar.d(t());
            }
            this.f22958e.clear();
        }
    }
}
