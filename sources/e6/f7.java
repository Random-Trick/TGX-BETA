package e6;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import b8.c;
import b8.g;
import b8.n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import m5.o;
import n6.l;

public final class f7 {
    public static z7<String> f10769j;
    public final String f10770a;
    public final String f10771b;
    public final e7 f10772c;
    public final n f10773d;
    public final l<String> f10774e;
    public final l<String> f10775f;
    public final String f10776g;
    public final Map<y4, Long> f10777h = new HashMap();
    public final Map<y4, Object> f10778i = new HashMap();

    public f7(Context context, final n nVar, e7 e7Var, final String str) {
        this.f10770a = context.getPackageName();
        this.f10771b = c.a(context);
        this.f10773d = nVar;
        this.f10772c = e7Var;
        this.f10776g = str;
        this.f10774e = g.a().b(new Callable() {
            @Override
            public final Object call() {
                return o.a().b(str);
            }
        });
        g a10 = g.a();
        nVar.getClass();
        this.f10775f = a10.b(new Callable() {
            @Override
            public final Object call() {
                return n.this.a();
            }
        });
    }

    public static synchronized z7<String> c() {
        synchronized (f7.class) {
            z7<String> z7Var = f10769j;
            if (z7Var != null) {
                return z7Var;
            }
            y0.g a10 = y0.c.a(Resources.getSystem().getConfiguration());
            w7 w7Var = new w7();
            for (int i10 = 0; i10 < a10.d(); i10++) {
                w7Var.c(c.b(a10.c(i10)));
            }
            z7<String> d10 = w7Var.d();
            f10769j = d10;
            return d10;
        }
    }

    public final void a(g7 g7Var, y4 y4Var, String str) {
        String str2;
        g7Var.d(y4Var);
        String a10 = g7Var.a();
        n6 n6Var = new n6();
        n6Var.b(this.f10770a);
        n6Var.c(this.f10771b);
        n6Var.h(c());
        n6Var.g(Boolean.TRUE);
        n6Var.k(a10);
        n6Var.j(str);
        if (this.f10775f.p()) {
            str2 = this.f10775f.l();
        } else {
            str2 = this.f10773d.a();
        }
        n6Var.i(str2);
        n6Var.d(10);
        g7Var.e(n6Var);
        this.f10772c.a(g7Var);
    }

    public final void b(q7 q7Var, final y4 y4Var) {
        m4 m4Var;
        s4 s4Var;
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f10777h.get(y4Var) == null || elapsedRealtime - this.f10777h.get(y4Var).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            this.f10777h.put(y4Var, Long.valueOf(elapsedRealtime));
            int i10 = q7Var.f11040a;
            int i11 = q7Var.f11041b;
            int i12 = q7Var.f11042c;
            int i13 = q7Var.f11043d;
            int i14 = q7Var.f11044e;
            long j10 = q7Var.f11045f;
            int i15 = q7Var.f11046g;
            r4 r4Var = new r4();
            if (i10 == -1) {
                m4Var = m4.BITMAP;
            } else if (i10 == 35) {
                m4Var = m4.YUV_420_888;
            } else if (i10 == 842094169) {
                m4Var = m4.YV12;
            } else if (i10 == 16) {
                m4Var = m4.NV16;
            } else if (i10 != 17) {
                m4Var = m4.UNKNOWN_FORMAT;
            } else {
                m4Var = m4.NV21;
            }
            r4Var.d(m4Var);
            if (i11 == 1) {
                s4Var = s4.BITMAP;
            } else if (i11 == 2) {
                s4Var = s4.BYTEARRAY;
            } else if (i11 == 3) {
                s4Var = s4.BYTEBUFFER;
            } else if (i11 != 4) {
                s4Var = s4.ANDROID_MEDIA_IMAGE;
            } else {
                s4Var = s4.FILEPATH;
            }
            r4Var.f(s4Var);
            r4Var.c(Integer.valueOf(i12));
            r4Var.e(Integer.valueOf(i13));
            r4Var.g(Integer.valueOf(i14));
            r4Var.b(Long.valueOf(j10));
            r4Var.h(Integer.valueOf(i15));
            t4 j11 = r4Var.j();
            a5 a5Var = new a5();
            a5Var.d(j11);
            final g7 c10 = g7.c(a5Var);
            if (this.f10774e.p()) {
                str = this.f10774e.l();
            } else {
                str = o.a().b(this.f10776g);
            }
            final String str2 = str;
            g.d().execute(new Runnable(c10, y4Var, str2, null) {
                public final g7 M;
                public final y4 f10660b;
                public final String f10661c;

                @Override
                public final void run() {
                    f7.this.a(this.M, this.f10660b, this.f10661c);
                }
            });
        }
    }
}
