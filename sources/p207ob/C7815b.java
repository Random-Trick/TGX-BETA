package p207ob;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import nl.dionsegijn.konfetti.KonfettiView;
import org.thunderdog.challegram.Log;
import p223pb.AbstractC8101b;
import p223pb.C8100a;
import p223pb.C8102c;
import p252rb.AbstractC8418b;
import p252rb.C8417a;
import p252rb.C8422c;
import p252rb.C8423d;
import qa.C8298k;
import sb.C8711a;
import sb.C8712b;

public final class C7815b {
    public final Random f25049a;
    public C8711a f25050b;
    public C8712b f25051c;
    public int[] f25052d = {-65536};
    public C8422c[] f25053e = {new C8422c(16, 0.0f, 2, null)};
    public AbstractC8418b[] f25054f = {AbstractC8418b.C8421c.f27332a};
    public C8417a f25055g = new C8417a(false, 0, false, false, 0, 31, null);
    public C8423d f25056h = new C8423d(0.0f, 0.01f);
    public C8102c f25057i;
    public final KonfettiView f25058j;

    public C7815b(KonfettiView konfettiView) {
        C8298k.m12933e(konfettiView, "konfettiView");
        this.f25058j = konfettiView;
        Random random = new Random();
        this.f25049a = random;
        this.f25050b = new C8711a(random);
        this.f25051c = new C8712b(random);
    }

    public final C7815b m14976a(int... iArr) {
        C8298k.m12933e(iArr, "colors");
        this.f25052d = iArr;
        return this;
    }

    public final C7815b m14975b(AbstractC8418b... bVarArr) {
        C8298k.m12933e(bVarArr, "shapes");
        ArrayList arrayList = new ArrayList();
        for (AbstractC8418b bVar : bVarArr) {
            if (bVar instanceof AbstractC8418b) {
                arrayList.add(bVar);
            }
        }
        Object[] array = arrayList.toArray(new AbstractC8418b[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f25054f = (AbstractC8418b[]) array;
        return this;
    }

    public final C7815b m14974c(C8422c... cVarArr) {
        C8298k.m12933e(cVarArr, "possibleSizes");
        ArrayList arrayList = new ArrayList();
        for (C8422c cVar : cVarArr) {
            if (cVar instanceof C8422c) {
                arrayList.add(cVar);
            }
        }
        Object[] array = arrayList.toArray(new C8422c[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f25053e = (C8422c[]) array;
        return this;
    }

    public final void m14973d(int i) {
        m14963n(new C8100a().m13606e(i));
    }

    public final boolean m14972e() {
        C8102c cVar = this.f25057i;
        if (cVar == null) {
            C8298k.m12924n("renderSystem");
        }
        return cVar.m13596e();
    }

    public final long m14971f() {
        return this.f25055g.m12540b();
    }

    public final C8102c m14970g() {
        C8102c cVar = this.f25057i;
        if (cVar == null) {
            C8298k.m12924n("renderSystem");
        }
        return cVar;
    }

    public final C7815b m14969h(double d, double d2) {
        this.f25051c.m11690h(Math.toRadians(d));
        this.f25051c.m11692f(Double.valueOf(Math.toRadians(d2)));
        return this;
    }

    public final C7815b m14968i(boolean z) {
        this.f25055g.m12536f(z);
        return this;
    }

    public final C7815b m14967j(float f, float f2) {
        this.f25050b.m11699c(f);
        this.f25050b.m11698d(f2);
        return this;
    }

    public final C7815b m14966k(float f, float f2) {
        this.f25051c.m11689i(f);
        this.f25051c.m11691g(Float.valueOf(f2));
        return this;
    }

    public final C7815b m14965l(long j) {
        this.f25055g.m12535g(j);
        return this;
    }

    public final void m14964m() {
        this.f25058j.m15740b(this);
    }

    public final void m14963n(AbstractC8101b bVar) {
        this.f25057i = new C8102c(this.f25050b, this.f25051c, this.f25056h, this.f25053e, this.f25054f, this.f25052d, this.f25055g, bVar, 0L, Log.TAG_CRASH, null);
        m14964m();
    }
}
