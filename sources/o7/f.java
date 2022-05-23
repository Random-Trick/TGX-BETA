package o7;

import android.text.TextUtils;
import d7.c;
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
import m5.r;
import n6.l;
import n6.m;
import n6.o;
import o7.h;
import r7.d;
import r7.f;
import w7.i;

public class f implements g {
    public static final Object f19280m = new Object();
    public static final ThreadFactory f19281n = new a();
    public final c f19282a;
    public final r7.c f19283b;
    public final q7.c f19284c;
    public final o f19285d;
    public final q7.b f19286e;
    public final m f19287f;
    public final Object f19288g;
    public final ExecutorService f19289h;
    public final ExecutorService f19290i;
    public String f19291j;
    public Set<p7.a> f19292k;
    public final List<n> f19293l;

    public class a implements ThreadFactory {
        public final AtomicInteger f19294a = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f19294a.getAndIncrement())));
        }
    }

    public static class b {
        public static final int[] f19295a;
        public static final int[] f19296b;

        static {
            int[] iArr = new int[f.b.values().length];
            f19296b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19296b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19296b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f19295a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19295a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public f(c cVar, n7.b<i> bVar, n7.b<l7.f> bVar2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f19281n), cVar, new r7.c(cVar.h(), bVar, bVar2), new q7.c(cVar), o.c(), new q7.b(cVar), new m());
    }

    public static f o(c cVar) {
        r.b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (f) cVar.g(g.class);
    }

    public void u() {
        v(false);
    }

    public final void A(q7.d dVar) {
        synchronized (this.f19288g) {
            Iterator<n> it = this.f19293l.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void B(String str) {
        this.f19291j = str;
    }

    public final synchronized void C(q7.d dVar, q7.d dVar2) {
        if (this.f19292k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            for (p7.a aVar : this.f19292k) {
                aVar.a(dVar2.d());
            }
        }
    }

    @Override
    public l<String> a() {
        w();
        String n10 = n();
        if (n10 != null) {
            return o.f(n10);
        }
        l<String> g10 = g();
        this.f19289h.execute(new Runnable() {
            @Override
            public final void run() {
                f.this.u();
            }
        });
        return g10;
    }

    @Override
    public l<l> b(final boolean z10) {
        w();
        l<l> f10 = f();
        this.f19289h.execute(new Runnable() {
            @Override
            public final void run() {
                f.this.v(z10);
            }
        });
        return f10;
    }

    public final l<l> f() {
        m mVar = new m();
        h(new j(this.f19285d, mVar));
        return mVar.a();
    }

    public final l<String> g() {
        m mVar = new m();
        h(new k(mVar));
        return mVar.a();
    }

    public final void h(n nVar) {
        synchronized (this.f19288g) {
            this.f19293l.add(nVar);
        }
    }

    public final void t(boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: o7.f.t(boolean):void");
    }

    public final void v(final boolean z10) {
        q7.d q10 = q();
        if (z10) {
            q10 = q10.p();
        }
        A(q10);
        this.f19290i.execute(new Runnable() {
            @Override
            public final void run() {
                f.this.t(z10);
            }
        });
    }

    public final q7.d k(q7.d dVar) {
        r7.f e10 = this.f19283b.e(l(), dVar.d(), r(), dVar.f());
        int i10 = b.f19296b[e10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(e10.c(), e10.d(), this.f19285d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 == 3) {
            B(null);
            return dVar.r();
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }

    public String l() {
        return this.f19282a.k().b();
    }

    public String m() {
        return this.f19282a.k().c();
    }

    public final synchronized String n() {
        return this.f19291j;
    }

    public final q7.d p() {
        q7.d c10;
        synchronized (f19280m) {
            o7.b a10 = o7.b.a(this.f19282a.h(), "generatefid.lock");
            c10 = this.f19284c.c();
            if (a10 != null) {
                a10.b();
            }
        }
        return c10;
    }

    public final q7.d q() {
        q7.d c10;
        synchronized (f19280m) {
            o7.b a10 = o7.b.a(this.f19282a.h(), "generatefid.lock");
            c10 = this.f19284c.c();
            if (c10.j()) {
                c10 = this.f19284c.a(c10.t(x(c10)));
            }
            if (a10 != null) {
                a10.b();
            }
        }
        return c10;
    }

    public String r() {
        return this.f19282a.k().e();
    }

    public final void s(q7.d dVar) {
        synchronized (f19280m) {
            o7.b a10 = o7.b.a(this.f19282a.h(), "generatefid.lock");
            this.f19284c.a(dVar);
            if (a10 != null) {
                a10.b();
            }
        }
    }

    public final void w() {
        r.h(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.h(r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.h(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(o.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(o.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String x(q7.d dVar) {
        if ((!this.f19282a.j().equals("CHIME_ANDROID_SDK") && !this.f19282a.r()) || !dVar.m()) {
            return this.f19287f.a();
        }
        String f10 = this.f19286e.f();
        return TextUtils.isEmpty(f10) ? this.f19287f.a() : f10;
    }

    public final q7.d y(q7.d dVar) {
        d d10 = this.f19283b.d(l(), dVar.d(), r(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f19286e.i());
        int i10 = b.f19295a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f19285d.b(), d10.b().c(), d10.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }

    public final void z(Exception exc) {
        synchronized (this.f19288g) {
            Iterator<n> it = this.f19293l.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    public f(ExecutorService executorService, c cVar, r7.c cVar2, q7.c cVar3, o oVar, q7.b bVar, m mVar) {
        this.f19288g = new Object();
        this.f19292k = new HashSet();
        this.f19293l = new ArrayList();
        this.f19282a = cVar;
        this.f19283b = cVar2;
        this.f19284c = cVar3;
        this.f19285d = oVar;
        this.f19286e = bVar;
        this.f19287f = mVar;
        this.f19289h = executorService;
        this.f19290i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f19281n);
    }
}
