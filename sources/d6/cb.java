package d6;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import b8.c;
import b8.g;
import b8.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import m5.o;
import n6.l;

public final class cb {
    public static f1<String> f6413j;
    public final String f6414a;
    public final String f6415b;
    public final bb f6416c;
    public final n f6417d;
    public final l<String> f6418e;
    public final l<String> f6419f;
    public final String f6420g;
    public final Map<o8, Long> f6421h = new HashMap();
    public final Map<o8, h1<Object, Long>> f6422i = new HashMap();

    public cb(Context context, final n nVar, bb bbVar, final String str) {
        this.f6414a = context.getPackageName();
        this.f6415b = c.a(context);
        this.f6417d = nVar;
        this.f6416c = bbVar;
        this.f6420g = str;
        this.f6418e = g.a().b(new Callable() {
            @Override
            public final Object call() {
                return o.a().b(str);
            }
        });
        g a10 = g.a();
        nVar.getClass();
        this.f6419f = a10.b(new Callable() {
            @Override
            public final Object call() {
                return n.this.a();
            }
        });
    }

    public static long a(List<Long> list, double d10) {
        return list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * list.size())) - 1, 0)).longValue();
    }

    public static synchronized f1<String> g() {
        synchronized (cb.class) {
            f1<String> f1Var = f6413j;
            if (f1Var != null) {
                return f1Var;
            }
            y0.g a10 = y0.c.a(Resources.getSystem().getConfiguration());
            b1 b1Var = new b1();
            for (int i10 = 0; i10 < a10.d(); i10++) {
                b1Var.e(c.b(a10.c(i10)));
            }
            f1<String> g10 = b1Var.g();
            f6413j = g10;
            return g10;
        }
    }

    public final void b(ab abVar, o8 o8Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i(o8Var, elapsedRealtime, 30L)) {
            this.f6421h.put(o8Var, Long.valueOf(elapsedRealtime));
            e(abVar.zza(), o8Var, h());
        }
    }

    public final void c(fb fbVar, o8 o8Var, String str) {
        String str2;
        fbVar.f(o8Var);
        String b10 = fbVar.b();
        ha haVar = new ha();
        haVar.b(this.f6414a);
        haVar.c(this.f6415b);
        haVar.h(g());
        haVar.g(Boolean.TRUE);
        haVar.k(b10);
        haVar.j(str);
        if (this.f6419f.p()) {
            str2 = this.f6419f.l();
        } else {
            str2 = this.f6417d.a();
        }
        haVar.i(str2);
        haVar.d(10);
        fbVar.g(haVar);
        this.f6416c.a(fbVar);
    }

    public final void d(fb fbVar, o8 o8Var) {
        e(fbVar, o8Var, h());
    }

    public final void e(final fb fbVar, final o8 o8Var, final String str) {
        g.d().execute(new Runnable(fbVar, o8Var, str, null) {
            public final fb M;
            public final o8 f7119b;
            public final String f7120c;

            @Override
            public final void run() {
                cb.this.c(this.M, this.f7119b, this.f7120c);
            }
        });
    }

    public final <K> void f(K k10, long j10, o8 o8Var, e8.g gVar) {
        if (!this.f6422i.containsKey(o8Var)) {
            this.f6422i.put(o8Var, j0.p());
        }
        h1<Object, Long> h1Var = this.f6422i.get(o8Var);
        h1Var.b(k10, Long.valueOf(j10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i(o8Var, elapsedRealtime, 30L)) {
            this.f6421h.put(o8Var, Long.valueOf(elapsedRealtime));
            for (Object obj : h1Var.d()) {
                List<Long> c10 = h1Var.c(obj);
                Collections.sort(c10);
                t7 t7Var = new t7();
                long j11 = 0;
                for (Long l10 : c10) {
                    j11 += l10.longValue();
                }
                t7Var.a(Long.valueOf(j11 / c10.size()));
                t7Var.c(Long.valueOf(a(c10, 100.0d)));
                t7Var.f(Long.valueOf(a(c10, 75.0d)));
                t7Var.d(Long.valueOf(a(c10, 50.0d)));
                t7Var.b(Long.valueOf(a(c10, 25.0d)));
                t7Var.e(Long.valueOf(a(c10, 0.0d)));
                v7 g10 = t7Var.g();
                e(gVar.f11363a.k((t2) obj, h1Var.c(obj).size(), g10), o8Var, h());
            }
            this.f6422i.remove(o8Var);
        }
    }

    public final String h() {
        if (this.f6418e.p()) {
            return this.f6418e.l();
        }
        return o.a().b(this.f6420g);
    }

    public final boolean i(o8 o8Var, long j10, long j11) {
        return this.f6421h.get(o8Var) == null || j10 - this.f6421h.get(o8Var).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
