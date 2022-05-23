package j$.util.stream;

import j$.util.B;
import j$.util.C0285m;
import j$.util.H;
import j$.util.W;
import j$.util.function.BiConsumer;
import j$.util.function.C;
import j$.util.function.F;
import j$.util.function.l;
import j$.util.function.n;
import j$.util.function.o;
import j$.util.function.r;
import java.util.Iterator;
import java.util.Objects;

abstract class AbstractC0342k0 extends AbstractC0301c implements AbstractC0352m0 {
    public static final int f14787t = 0;

    public AbstractC0342k0(H h10, int i10) {
        super(h10, i10, false);
    }

    public AbstractC0342k0(AbstractC0301c cVar, int i10) {
        super(cVar, i10);
    }

    public static B P0(H h10) {
        if (h10 instanceof B) {
            return (B) h10;
        }
        if (R3.f14615a) {
            R3.a(AbstractC0301c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override
    final void A0(H h10, AbstractC0378r2 r2Var) {
        n nVar;
        B P0 = P0(h10);
        if (r2Var instanceof n) {
            nVar = (n) r2Var;
        } else if (!R3.f14615a) {
            Objects.requireNonNull(r2Var);
            nVar = new C0307d0(r2Var, 0);
        } else {
            R3.a(AbstractC0301c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        }
        while (!r2Var.u() && P0.i(nVar)) {
        }
    }

    @Override
    public final int B0() {
        return 2;
    }

    @Override
    final H N0(E0 e02, F f10, boolean z10) {
        return new t3(e02, f10, z10);
    }

    public final Object Q0(F f10, C c10, BiConsumer biConsumer) {
        C0392v vVar = new C0392v(biConsumer, 1);
        Objects.requireNonNull(f10);
        Objects.requireNonNull(c10);
        return x0(new G1(2, vVar, c10, f10, 4));
    }

    public final AbstractC0393v0 R0(r rVar) {
        Objects.requireNonNull(rVar);
        return new B(this, 2, EnumC0325g3.f14761p | EnumC0325g3.f14759n, rVar, 1);
    }

    public final AbstractC0310d3 S0(o oVar) {
        Objects.requireNonNull(oVar);
        return new C0408z(this, 2, EnumC0325g3.f14761p | EnumC0325g3.f14759n, oVar, 1);
    }

    public final int T0(int i10, l lVar) {
        Objects.requireNonNull(lVar);
        return ((Integer) x0(new S1(2, lVar, i10))).intValue();
    }

    public final C0285m U0(l lVar) {
        Objects.requireNonNull(lVar);
        return (C0285m) x0(new K1(2, lVar, 2));
    }

    public final B spliterator() {
        return P0(super.spliterator());
    }

    public void e(n nVar) {
        Objects.requireNonNull(nVar);
        x0(new W(nVar, false));
    }

    public void g(n nVar) {
        Objects.requireNonNull(nVar);
        x0(new W(nVar, true));
    }

    @Override
    public final Iterator iterator() {
        return W.g(spliterator());
    }

    @Override
    public final I0 p0(long j10, o oVar) {
        return E0.f0(j10);
    }

    @Override
    public final AbstractC0326h unordered() {
        return !C0() ? this : new C0322g0(this, 2, EnumC0325g3.f14763r);
    }

    @Override
    final Q0 z0(E0 e02, H h10, boolean z10, o oVar) {
        return E0.O(e02, h10, z10);
    }
}
