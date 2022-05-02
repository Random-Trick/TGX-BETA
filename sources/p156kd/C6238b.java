package p156kd;

import android.view.View;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5918j;
import p143k0.C6035e;
import p168ld.RunnableC6507m;

public class C6238b implements AbstractC5911c {
    public boolean f19669O;
    public final View f19670a;
    public boolean f19668N = true;
    public final C6035e<C6257p> f19671b = new C6035e<>(10);
    public final C6035e<RunnableC6507m> f19672c = new C6035e<>(10);
    public final C6035e<C6240c> f19667M = new C6035e<>(10);

    public interface AbstractC6239a {
        boolean mo8015h(int i, AbstractC6264v vVar, long j);
    }

    public C6238b(View view) {
        this.f19670a = view;
    }

    public static <T extends AbstractC6264v> void m21001c(C6035e<T> eVar, boolean z) {
        int p = eVar.m21497p();
        int i = 0;
        if (z) {
            while (i < p) {
                eVar.m21496q(i).mo20246f();
                i++;
            }
            return;
        }
        while (i < p) {
            eVar.m21496q(i).mo20248b();
            i++;
        }
    }

    public static <T extends AbstractC6264v> void m20999e(C6035e<T> eVar, int i, AbstractC6239a aVar) {
        int p = eVar.m21497p();
        for (int i2 = 0; i2 < p; i2++) {
            T q = eVar.m21496q(i2);
            if (aVar == null || !aVar.mo8015h(i, q, eVar.m21502j(i2))) {
                q.clear();
            }
        }
    }

    public static <T extends AbstractC6264v> void m20996h(C6035e<T> eVar, long j) {
        int p = eVar.m21497p();
        for (int i = 0; i < p; i++) {
            if (eVar.m21502j(i) >= j) {
                eVar.m21496q(i).clear();
            }
        }
    }

    public static <T extends AbstractC6264v> T m20990n(C6035e<T> eVar, View view, boolean z, boolean z2, long j, int i) {
        T t;
        int h = eVar.m21504h(j);
        if (h >= 0) {
            return eVar.m21496q(h);
        }
        if (i == 1) {
            t = new C6240c(view, 0);
        } else if (i == 2) {
            t = new C6257p(view, 0);
        } else if (i == 3) {
            t = new RunnableC6507m(view);
        } else {
            throw new IllegalArgumentException("type == " + i);
        }
        if (!z) {
            t.mo20248b();
        }
        if (z2) {
            t.mo20252S0(z2);
        }
        eVar.m21511a(j, t);
        return t;
    }

    public static <T extends AbstractC6264v> void m20988p(C6035e<T> eVar, AbstractC5918j<AbstractC6264v> jVar) {
        int p = eVar.m21497p();
        for (int i = 0; i < p; i++) {
            jVar.mo1330a(eVar.m21496q(i));
        }
    }

    @Override
    public void mo4501a3() {
        m21000d();
    }

    public void m21002b() {
        this.f19668N = true;
        m21001c(this.f19671b, true);
        m21001c(this.f19672c, true);
        m21001c(this.f19667M, true);
    }

    public void m21000d() {
        m20998f(null);
    }

    public void m20998f(AbstractC6239a aVar) {
        m20999e(this.f19671b, 1, aVar);
        m20999e(this.f19672c, 2, aVar);
        m20999e(this.f19667M, 0, aVar);
    }

    public void m20997g(int i) {
        long j = i;
        m20996h(this.f19671b, j);
        m20996h(this.f19672c, j);
        m20996h(this.f19667M, j);
    }

    public void m20995i() {
        this.f19668N = false;
        m21001c(this.f19671b, false);
        m21001c(this.f19672c, false);
        m21001c(this.f19667M, false);
    }

    public RunnableC6507m m20994j(long j) {
        return (RunnableC6507m) m20990n(this.f19672c, this.f19670a, this.f19668N, this.f19669O, j, 3);
    }

    public C6257p m20993k(long j) {
        return (C6257p) m20990n(this.f19671b, this.f19670a, this.f19668N, this.f19669O, j, 2);
    }

    public C6240c m20992l(int i) {
        return (C6240c) m20990n(this.f19667M, this.f19670a, this.f19668N, this.f19669O, i, 1);
    }

    public AbstractC6264v m20991m(long j, boolean z) {
        if (z) {
            return m20994j(j);
        }
        return m20993k(j);
    }

    public final void m20989o(AbstractC5918j<AbstractC6264v> jVar) {
        m20988p(this.f19671b, jVar);
        m20988p(this.f19672c, jVar);
        m20988p(this.f19667M, jVar);
    }

    public void m20986r(final boolean z) {
        if (this.f19669O != z) {
            this.f19669O = z;
            m20989o(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    ((AbstractC6264v) obj).mo20252S0(z);
                }
            });
        }
    }
}
