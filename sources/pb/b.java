package pb;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import nl.dionsegijn.konfetti.KonfettiView;
import org.thunderdog.challegram.Log;
import ra.k;
import sb.b;
import sb.c;
import sb.d;
import tb.a;

public final class b {
    public final Random f20996a;
    public a f20997b;
    public tb.b f20998c;
    public int[] f20999d = {-65536};
    public c[] f21000e = {new c(16, 0.0f, 2, null)};
    public sb.b[] f21001f = {b.c.f22699a};
    public sb.a f21002g = new sb.a(false, 0, false, false, 0, 31, null);
    public d f21003h = new d(0.0f, 0.01f);
    public qb.c f21004i;
    public final KonfettiView f21005j;

    public b(KonfettiView konfettiView) {
        k.e(konfettiView, "konfettiView");
        this.f21005j = konfettiView;
        Random random = new Random();
        this.f20996a = random;
        this.f20997b = new a(random);
        this.f20998c = new tb.b(random);
    }

    public final b a(int... iArr) {
        k.e(iArr, "colors");
        this.f20999d = iArr;
        return this;
    }

    public final b b(sb.b... bVarArr) {
        k.e(bVarArr, "shapes");
        ArrayList arrayList = new ArrayList();
        for (sb.b bVar : bVarArr) {
            if (bVar instanceof sb.b) {
                arrayList.add(bVar);
            }
        }
        Object[] array = arrayList.toArray(new sb.b[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f21001f = (sb.b[]) array;
        return this;
    }

    public final b c(c... cVarArr) {
        k.e(cVarArr, "possibleSizes");
        ArrayList arrayList = new ArrayList();
        for (c cVar : cVarArr) {
            if (cVar instanceof c) {
                arrayList.add(cVar);
            }
        }
        Object[] array = arrayList.toArray(new c[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f21000e = (c[]) array;
        return this;
    }

    public final void d(int i10) {
        n(new qb.a().e(i10));
    }

    public final boolean e() {
        qb.c cVar = this.f21004i;
        if (cVar == null) {
            k.n("renderSystem");
        }
        return cVar.e();
    }

    public final long f() {
        return this.f21002g.b();
    }

    public final qb.c g() {
        qb.c cVar = this.f21004i;
        if (cVar == null) {
            k.n("renderSystem");
        }
        return cVar;
    }

    public final b h(double d10, double d11) {
        this.f20998c.h(Math.toRadians(d10));
        this.f20998c.f(Double.valueOf(Math.toRadians(d11)));
        return this;
    }

    public final b i(boolean z10) {
        this.f21002g.f(z10);
        return this;
    }

    public final b j(float f10, float f11) {
        this.f20997b.c(f10);
        this.f20997b.d(f11);
        return this;
    }

    public final b k(float f10, float f11) {
        this.f20998c.i(f10);
        this.f20998c.g(Float.valueOf(f11));
        return this;
    }

    public final b l(long j10) {
        this.f21002g.g(j10);
        return this;
    }

    public final void m() {
        this.f21005j.b(this);
    }

    public final void n(qb.b bVar) {
        this.f21004i = new qb.c(this.f20997b, this.f20998c, this.f21003h, this.f21000e, this.f21001f, this.f20999d, this.f21002g, bVar, 0L, Log.TAG_CRASH, null);
        m();
    }
}
