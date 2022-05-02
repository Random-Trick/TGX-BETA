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
    public final Random f25046a;
    public C8711a f25047b;
    public C8712b f25048c;
    public int[] f25049d = {-65536};
    public C8422c[] f25050e = {new C8422c(16, 0.0f, 2, null)};
    public AbstractC8418b[] f25051f = {AbstractC8418b.C8421c.f27329a};
    public C8417a f25052g = new C8417a(false, 0, false, false, 0, 31, null);
    public C8423d f25053h = new C8423d(0.0f, 0.01f);
    public C8102c f25054i;
    public final KonfettiView f25055j;

    public C7815b(KonfettiView konfettiView) {
        C8298k.m12934e(konfettiView, "konfettiView");
        this.f25055j = konfettiView;
        Random random = new Random();
        this.f25046a = random;
        this.f25047b = new C8711a(random);
        this.f25048c = new C8712b(random);
    }

    public final C7815b m14976a(int... iArr) {
        C8298k.m12934e(iArr, "colors");
        this.f25049d = iArr;
        return this;
    }

    public final C7815b m14975b(AbstractC8418b... bVarArr) {
        C8298k.m12934e(bVarArr, "shapes");
        ArrayList arrayList = new ArrayList();
        for (AbstractC8418b bVar : bVarArr) {
            if (bVar instanceof AbstractC8418b) {
                arrayList.add(bVar);
            }
        }
        Object[] array = arrayList.toArray(new AbstractC8418b[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f25051f = (AbstractC8418b[]) array;
        return this;
    }

    public final C7815b m14974c(C8422c... cVarArr) {
        C8298k.m12934e(cVarArr, "possibleSizes");
        ArrayList arrayList = new ArrayList();
        for (C8422c cVar : cVarArr) {
            if (cVar instanceof C8422c) {
                arrayList.add(cVar);
            }
        }
        Object[] array = arrayList.toArray(new C8422c[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f25050e = (C8422c[]) array;
        return this;
    }

    public final void m14973d(int i) {
        m14963n(new C8100a().m13607e(i));
    }

    public final boolean m14972e() {
        C8102c cVar = this.f25054i;
        if (cVar == null) {
            C8298k.m12925n("renderSystem");
        }
        return cVar.m13597e();
    }

    public final long m14971f() {
        return this.f25052g.m12541b();
    }

    public final C8102c m14970g() {
        C8102c cVar = this.f25054i;
        if (cVar == null) {
            C8298k.m12925n("renderSystem");
        }
        return cVar;
    }

    public final C7815b m14969h(double d, double d2) {
        this.f25048c.m11691h(Math.toRadians(d));
        this.f25048c.m11693f(Double.valueOf(Math.toRadians(d2)));
        return this;
    }

    public final C7815b m14968i(boolean z) {
        this.f25052g.m12537f(z);
        return this;
    }

    public final C7815b m14967j(float f, float f2) {
        this.f25047b.m11700c(f);
        this.f25047b.m11699d(f2);
        return this;
    }

    public final C7815b m14966k(float f, float f2) {
        this.f25048c.m11690i(f);
        this.f25048c.m11692g(Float.valueOf(f2));
        return this;
    }

    public final C7815b m14965l(long j) {
        this.f25052g.m12536g(j);
        return this;
    }

    public final void m14964m() {
        this.f25055j.m15740b(this);
    }

    public final void m14963n(AbstractC8101b bVar) {
        this.f25054i = new C8102c(this.f25047b, this.f25048c, this.f25053h, this.f25050e, this.f25051f, this.f25049d, this.f25052g, bVar, 0L, Log.TAG_CRASH, null);
        m14964m();
    }
}
