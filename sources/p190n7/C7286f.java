package p190n7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p034c7.C2021c;
import p150k7.AbstractC6214f;
import p163l5.C6378r;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p177m6.C6781o;
import p178m7.AbstractC6794b;
import p190n7.C7290h;
import p203o7.AbstractC7792a;
import p220p7.AbstractC8061d;
import p220p7.C8058b;
import p220p7.C8059c;
import p234q7.AbstractC8270d;
import p234q7.AbstractC8274f;
import p234q7.C8269c;
import p301v7.AbstractC9882i;

public class C7286f implements AbstractC7289g {
    public static final Object f23145m = new Object();
    public static final ThreadFactory f23146n = new ThreadFactoryC7287a();
    public final C2021c f23147a;
    public final C8269c f23148b;
    public final C8059c f23149c;
    public final C7299o f23150d;
    public final C8058b f23151e;
    public final C7297m f23152f;
    public final Object f23153g;
    public final ExecutorService f23154h;
    public final ExecutorService f23155i;
    public String f23156j;
    public Set<AbstractC7792a> f23157k;
    public final List<AbstractC7298n> f23158l;

    public class ThreadFactoryC7287a implements ThreadFactory {
        public final AtomicInteger f23159a = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f23159a.getAndIncrement())));
        }
    }

    public static class C7288b {
        public static final int[] f23160a;
        public static final int[] f23161b;

        static {
            int[] iArr = new int[AbstractC8274f.EnumC8276b.values().length];
            f23161b = iArr;
            try {
                iArr[AbstractC8274f.EnumC8276b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23161b[AbstractC8274f.EnumC8276b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23161b[AbstractC8274f.EnumC8276b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC8270d.EnumC8272b.values().length];
            f23160a = iArr2;
            try {
                iArr2[AbstractC8270d.EnumC8272b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23160a[AbstractC8270d.EnumC8272b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C7286f(C2021c cVar, AbstractC6794b<AbstractC9882i> bVar, AbstractC6794b<AbstractC6214f> bVar2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f23146n), cVar, new C8269c(cVar.m35818h(), bVar, bVar2), new C8059c(cVar), C7299o.m17117c(), new C8058b(cVar), new C7297m());
    }

    public static C7286f m17146o(C2021c cVar) {
        C6378r.m20516b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (C7286f) cVar.m35819g(AbstractC7289g.class);
    }

    public void m17140u() {
        m17139v(false);
    }

    public final void m17161A(AbstractC8061d dVar) {
        synchronized (this.f23153g) {
            Iterator<AbstractC7298n> it = this.f23158l.iterator();
            while (it.hasNext()) {
                if (it.next().mo17120b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void m17160B(String str) {
        this.f23156j = str;
    }

    public final synchronized void m17159C(AbstractC8061d dVar, AbstractC8061d dVar2) {
        if (this.f23157k.size() != 0 && !dVar.mo13673d().equals(dVar2.mo13673d())) {
            for (AbstractC7792a aVar : this.f23157k) {
                aVar.m15079a(dVar2.mo13673d());
            }
        }
    }

    @Override
    public AbstractC6775l<String> mo17134a() {
        m17138w();
        String n = m17147n();
        if (n != null) {
            return C6781o.m19050f(n);
        }
        AbstractC6775l<String> g = m17154g();
        this.f23154h.execute(new Runnable() {
            @Override
            public final void run() {
                C7286f.this.m17140u();
            }
        });
        return g;
    }

    @Override
    public AbstractC6775l<AbstractC7295l> mo17133b(final boolean z) {
        m17138w();
        AbstractC6775l<AbstractC7295l> f = m17155f();
        this.f23154h.execute(new Runnable() {
            @Override
            public final void run() {
                C7286f.this.m17139v(z);
            }
        });
        return f;
    }

    public final AbstractC6775l<AbstractC7295l> m17155f() {
        C6777m mVar = new C6777m();
        m17153h(new C7293j(this.f23150d, mVar));
        return mVar.m19087a();
    }

    public final AbstractC6775l<String> m17154g() {
        C6777m mVar = new C6777m();
        m17153h(new C7294k(mVar));
        return mVar.m19087a();
    }

    public final void m17153h(AbstractC7298n nVar) {
        synchronized (this.f23153g) {
            this.f23158l.add(nVar);
        }
    }

    public final void m17141t(boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: p190n7.C7286f.m17141t(boolean):void");
    }

    public final void m17139v(final boolean z) {
        AbstractC8061d q = m17144q();
        if (z) {
            q = q.m13661p();
        }
        m17161A(q);
        this.f23155i.execute(new Runnable() {
            @Override
            public final void run() {
                C7286f.this.m17141t(z);
            }
        });
    }

    public final AbstractC8061d m17150k(AbstractC8061d dVar) {
        AbstractC8274f e = this.f23148b.m13009e(m17149l(), dVar.mo13673d(), m17143r(), dVar.mo13671f());
        int i = C7288b.f23161b[e.mo12975b().ordinal()];
        if (i == 1) {
            return dVar.m13662o(e.mo12974c(), e.mo12973d(), this.f23150d.m17118b());
        }
        if (i == 2) {
            return dVar.m13660q("BAD CONFIG");
        }
        if (i == 3) {
            m17160B(null);
            return dVar.m13659r();
        }
        throw new C7290h("Firebase Installations Service is unavailable. Please try again later.", C7290h.EnumC7291a.UNAVAILABLE);
    }

    public String m17149l() {
        return this.f23147a.m35815k().m35797b();
    }

    public String m17148m() {
        return this.f23147a.m35815k().m35796c();
    }

    public final synchronized String m17147n() {
        return this.f23156j;
    }

    public final AbstractC8061d m17145p() {
        AbstractC8061d c;
        synchronized (f23145m) {
            C7282b a = C7282b.m17163a(this.f23147a.m35818h(), "generatefid.lock");
            c = this.f23149c.m13677c();
            if (a != null) {
                a.m17162b();
            }
        }
        return c;
    }

    public final AbstractC8061d m17144q() {
        AbstractC8061d c;
        synchronized (f23145m) {
            C7282b a = C7282b.m17163a(this.f23147a.m35818h(), "generatefid.lock");
            c = this.f23149c.m13677c();
            if (c.m13667j()) {
                c = this.f23149c.m13679a(c.m13657t(m17137x(c)));
            }
            if (a != null) {
                a.m17162b();
            }
        }
        return c;
    }

    public String m17143r() {
        return this.f23147a.m35815k().m35794e();
    }

    public final void m17142s(AbstractC8061d dVar) {
        synchronized (f23145m) {
            C7282b a = C7282b.m17163a(this.f23147a.m35818h(), "generatefid.lock");
            this.f23149c.m13679a(dVar);
            if (a != null) {
                a.m17162b();
            }
        }
    }

    public final void m17138w() {
        C6378r.m20510h(m17148m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C6378r.m20510h(m17143r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C6378r.m20510h(m17149l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C6378r.m20516b(C7299o.m17112h(m17148m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C6378r.m20516b(C7299o.m17113g(m17149l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String m17137x(AbstractC8061d dVar) {
        if ((!this.f23147a.m35816j().equals("CHIME_ANDROID_SDK") && !this.f23147a.m35808r()) || !dVar.m13664m()) {
            return this.f23152f.m17124a();
        }
        String f = this.f23151e.m13683f();
        return TextUtils.isEmpty(f) ? this.f23152f.m17124a() : f;
    }

    public final AbstractC8061d m17136y(AbstractC8061d dVar) {
        AbstractC8270d d = this.f23148b.m13010d(m17149l(), dVar.mo13673d(), m17143r(), m17148m(), (dVar.mo13673d() == null || dVar.mo13673d().length() != 11) ? null : this.f23151e.m13680i());
        int i = C7288b.f23160a[d.mo12990e().ordinal()];
        if (i == 1) {
            return dVar.m13658s(d.mo12992c(), d.mo12991d(), this.f23150d.m17118b(), d.mo12993b().mo12974c(), d.mo12993b().mo12973d());
        }
        if (i == 2) {
            return dVar.m13660q("BAD CONFIG");
        }
        throw new C7290h("Firebase Installations Service is unavailable. Please try again later.", C7290h.EnumC7291a.UNAVAILABLE);
    }

    public final void m17135z(Exception exc) {
        synchronized (this.f23153g) {
            Iterator<AbstractC7298n> it = this.f23158l.iterator();
            while (it.hasNext()) {
                if (it.next().mo17121a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public C7286f(ExecutorService executorService, C2021c cVar, C8269c cVar2, C8059c cVar3, C7299o oVar, C8058b bVar, C7297m mVar) {
        this.f23153g = new Object();
        this.f23157k = new HashSet();
        this.f23158l = new ArrayList();
        this.f23147a = cVar;
        this.f23148b = cVar2;
        this.f23149c = cVar3;
        this.f23150d = oVar;
        this.f23151e = bVar;
        this.f23152f = mVar;
        this.f23154h = executorService;
        this.f23155i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f23146n);
    }
}
