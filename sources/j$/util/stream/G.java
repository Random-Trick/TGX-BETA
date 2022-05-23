package j$.util.stream;

import j$.util.C0284l;
import j$.util.H;
import j$.util.W;
import j$.util.function.AbstractC0276d;
import j$.util.function.AbstractC0278f;
import j$.util.function.B;
import j$.util.function.BiConsumer;
import j$.util.function.F;
import j$.util.function.g;
import j$.util.function.j;
import j$.util.function.o;
import j$.util.z;
import java.util.Iterator;
import java.util.Objects;

abstract class G extends AbstractC0301c implements I {
    public static final int f14531t = 0;

    public G(H h10, int i10) {
        super(h10, i10, false);
    }

    public G(AbstractC0301c cVar, int i10) {
        super(cVar, i10);
    }

    public static z P0(H h10) {
        if (h10 instanceof z) {
            return (z) h10;
        }
        if (R3.f14615a) {
            R3.a(AbstractC0301c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override
    final void A0(H h10, AbstractC0378r2 r2Var) {
        AbstractC0278f fVar;
        z P0 = P0(h10);
        if (r2Var instanceof AbstractC0278f) {
            fVar = (AbstractC0278f) r2Var;
        } else if (!R3.f14615a) {
            Objects.requireNonNull(r2Var);
            fVar = new C0396w(r2Var, 0);
        } else {
            R3.a(AbstractC0301c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        }
        while (!r2Var.u() && P0.j(fVar)) {
        }
    }

    @Override
    public final int B0() {
        return 4;
    }

    @Override
    final H N0(E0 e02, F f10, boolean z10) {
        return new C0379r3(e02, f10, z10);
    }

    public final Object Q0(F f10, B b10, BiConsumer biConsumer) {
        C0392v vVar = new C0392v(biConsumer, 0);
        Objects.requireNonNull(f10);
        Objects.requireNonNull(b10);
        return x0(new G1(4, vVar, b10, f10, 1));
    }

    public final AbstractC0393v0 R0(j jVar) {
        Objects.requireNonNull(jVar);
        return new B(this, 4, EnumC0325g3.f14761p | EnumC0325g3.f14759n, jVar, 0);
    }

    public final AbstractC0310d3 S0(g gVar) {
        Objects.requireNonNull(gVar);
        return new C0408z(this, 4, EnumC0325g3.f14761p | EnumC0325g3.f14759n, gVar, 0);
    }

    public final C0284l T0(AbstractC0276d dVar) {
        Objects.requireNonNull(dVar);
        return (C0284l) x0(new K1(4, dVar, 0));
    }

    public final z spliterator() {
        return P0(super.spliterator());
    }

    public void d(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
        x0(new V(fVar, false));
    }

    public void h(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
        x0(new V(fVar, true));
    }

    @Override
    public final Iterator iterator() {
        return W.f(spliterator());
    }

    @Override
    public final I0 p0(long j10, o oVar) {
        return E0.T(j10);
    }

    @Override
    public final AbstractC0326h unordered() {
        return !C0() ? this : new C(this, 4, EnumC0325g3.f14763r, 0);
    }

    @Override
    final Q0 z0(E0 e02, H h10, boolean z10, o oVar) {
        return E0.N(e02, h10, z10);
    }
}
