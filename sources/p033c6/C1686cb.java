package p033c6;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p009a8.C0207c;
import p009a8.C0215g;
import p009a8.C0223n;
import p048d8.C3906g;
import p163l5.C6368o;
import p177m6.AbstractC6775l;
import p337y0.C10329c;
import p337y0.C10335g;

public final class C1686cb {
    public static AbstractC1721f1<String> f6165j;
    public final String f6166a;
    public final String f6167b;
    public final AbstractC1671bb f6168c;
    public final C0223n f6169d;
    public final AbstractC6775l<String> f6170e;
    public final AbstractC6775l<String> f6171f;
    public final String f6172g;
    public final Map<EnumC1860o8, Long> f6173h = new HashMap();
    public final Map<EnumC1860o8, AbstractC1751h1<Object, Long>> f6174i = new HashMap();

    public C1686cb(Context context, final C0223n nVar, AbstractC1671bb bbVar, final String str) {
        this.f6166a = context.getPackageName();
        this.f6167b = C0207c.m42091a(context);
        this.f6169d = nVar;
        this.f6168c = bbVar;
        this.f6172g = str;
        this.f6170e = C0215g.m42087a().m42086b(new Callable() {
            @Override
            public final Object call() {
                return C6368o.m20534a().m20533b(str);
            }
        });
        C0215g a = C0215g.m42087a();
        nVar.getClass();
        this.f6171f = a.m42086b(new Callable() {
            @Override
            public final Object call() {
                return C0223n.this.m42067a();
            }
        });
    }

    public static long m36101a(List<Long> list, double d) {
        return list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0)).longValue();
    }

    public static synchronized AbstractC1721f1<String> m36095g() {
        synchronized (C1686cb.class) {
            AbstractC1721f1<String> f1Var = f6165j;
            if (f1Var != null) {
                return f1Var;
            }
            C10335g a = C10329c.m5412a(Resources.getSystem().getConfiguration());
            C1661b1 b1Var = new C1661b1();
            for (int i = 0; i < a.m5402d(); i++) {
                b1Var.m36120e(C0207c.m42090b(a.m5403c(i)));
            }
            AbstractC1721f1<String> g = b1Var.m36118g();
            f6165j = g;
            return g;
        }
    }

    public final void m36100b(AbstractC1656ab abVar, EnumC1860o8 o8Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m36093i(o8Var, elapsedRealtime, 30L)) {
            this.f6173h.put(o8Var, Long.valueOf(elapsedRealtime));
            m36097e(abVar.zza(), o8Var, m36094h());
        }
    }

    public final void m36099c(C1731fb fbVar, EnumC1860o8 o8Var, String str) {
        String str2;
        fbVar.m36049f(o8Var);
        String b = fbVar.m36053b();
        C1760ha haVar = new C1760ha();
        haVar.m36019b(this.f6166a);
        haVar.m36018c(this.f6167b);
        haVar.m36013h(m36095g());
        haVar.m36014g(Boolean.TRUE);
        haVar.m36010k(b);
        haVar.m36011j(str);
        if (this.f6171f.mo19066p()) {
            str2 = this.f6171f.mo19070l();
        } else {
            str2 = this.f6169d.m42067a();
        }
        haVar.m36012i(str2);
        haVar.m36017d(10);
        fbVar.m36048g(haVar);
        this.f6168c.mo35843a(fbVar);
    }

    public final void m36098d(C1731fb fbVar, EnumC1860o8 o8Var) {
        m36097e(fbVar, o8Var, m36094h());
    }

    public final void m36097e(final C1731fb fbVar, final EnumC1860o8 o8Var, final String str) {
        C0215g.m42084d().execute(new Runnable(fbVar, o8Var, str, null) {
            public final C1731fb f7082M;
            public final EnumC1860o8 f7084b;
            public final String f7085c;

            @Override
            public final void run() {
                C1686cb.this.m36099c(this.f7082M, this.f7084b, this.f7085c);
            }
        });
    }

    public final <K> void m36096f(K k, long j, EnumC1860o8 o8Var, C3906g gVar) {
        if (!this.f6174i.containsKey(o8Var)) {
            this.f6174i.put(o8Var, C1780j0.m35993p());
        }
        AbstractC1751h1<Object, Long> h1Var = this.f6174i.get(o8Var);
        h1Var.mo35971b(k, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m36093i(o8Var, elapsedRealtime, 30L)) {
            this.f6173h.put(o8Var, Long.valueOf(elapsedRealtime));
            for (Object obj : h1Var.mo35970d()) {
                List<Long> c = h1Var.mo35889c(obj);
                Collections.sort(c);
                C1929t7 t7Var = new C1929t7();
                long j2 = 0;
                for (Long l : c) {
                    j2 += l.longValue();
                }
                t7Var.m35902a(Long.valueOf(j2 / c.size()));
                t7Var.m35900c(Long.valueOf(m36101a(c, 100.0d)));
                t7Var.m35897f(Long.valueOf(m36101a(c, 75.0d)));
                t7Var.m35899d(Long.valueOf(m36101a(c, 50.0d)));
                t7Var.m35901b(Long.valueOf(m36101a(c, 25.0d)));
                t7Var.m35898e(Long.valueOf(m36101a(c, 0.0d)));
                C1957v7 g = t7Var.m35896g();
                m36097e(gVar.f13190a.m29609k((C1924t2) obj, h1Var.mo35889c(obj).size(), g), o8Var, m36094h());
            }
            this.f6174i.remove(o8Var);
        }
    }

    public final String m36094h() {
        if (this.f6170e.mo19066p()) {
            return this.f6170e.mo19070l();
        }
        return C6368o.m20534a().m20533b(this.f6172g);
    }

    public final boolean m36093i(EnumC1860o8 o8Var, long j, long j2) {
        return this.f6173h.get(o8Var) == null || j - this.f6173h.get(o8Var).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
