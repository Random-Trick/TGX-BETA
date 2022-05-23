package j$.util.stream;

import j$.util.C0286n;
import j$.util.D;
import j$.util.H;
import j$.util.W;
import j$.util.function.A;
import j$.util.function.BiConsumer;
import j$.util.function.F;
import j$.util.function.o;
import j$.util.function.t;
import j$.util.function.v;
import j$.util.function.w;
import java.util.Iterator;
import java.util.Objects;

public abstract class AbstractC0385t0 extends AbstractC0301c implements AbstractC0393v0 {
    public static final int f14857t = 0;

    public AbstractC0385t0(H h10, int i10) {
        super(h10, i10, false);
    }

    public AbstractC0385t0(AbstractC0301c cVar, int i10) {
        super(cVar, i10);
    }

    public static D P0(H h10) {
        if (h10 instanceof D) {
            return (D) h10;
        }
        if (R3.f14615a) {
            R3.a(AbstractC0301c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override
    final void A0(H h10, AbstractC0378r2 r2Var) {
        v vVar;
        D P0 = P0(h10);
        if (r2Var instanceof v) {
            vVar = (v) r2Var;
        } else if (!R3.f14615a) {
            Objects.requireNonNull(r2Var);
            vVar = new C0362o0(r2Var, 0);
        } else {
            R3.a(AbstractC0301c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        }
        while (!r2Var.u() && P0.g(vVar)) {
        }
    }

    @Override
    public final int B0() {
        return 3;
    }

    @Override
    final H N0(E0 e02, F f10, boolean z10) {
        return new v3(e02, f10, z10);
    }

    public final Object Q0(F f10, j$.util.function.D d10, BiConsumer biConsumer) {
        C0392v vVar = new C0392v(biConsumer, 2);
        Objects.requireNonNull(f10);
        Objects.requireNonNull(d10);
        return x0(new G1(3, vVar, d10, f10, 0));
    }

    public final AbstractC0393v0 R0(A a10) {
        Objects.requireNonNull(a10);
        return new B(this, 3, EnumC0325g3.f14761p | EnumC0325g3.f14759n, a10, 2);
    }

    public final AbstractC0310d3 S0(w wVar) {
        Objects.requireNonNull(wVar);
        return new C0408z(this, 3, EnumC0325g3.f14761p | EnumC0325g3.f14759n, wVar, 2);
    }

    public final long T0(long j10, t tVar) {
        Objects.requireNonNull(tVar);
        return ((Long) x0(new W1(3, tVar, j10))).longValue();
    }

    public final C0286n U0(t tVar) {
        Objects.requireNonNull(tVar);
        return (C0286n) x0(new K1(3, tVar, 3));
    }

    public final D spliterator() {
        return P0(super.spliterator());
    }

    public void b(v vVar) {
        Objects.requireNonNull(vVar);
        x0(new X(vVar, false));
    }

    public void f(v vVar) {
        Objects.requireNonNull(vVar);
        x0(new X(vVar, true));
    }

    @Override
    public final Iterator iterator() {
        return W.h(spliterator());
    }

    @Override
    public final I0 p0(long j10, o oVar) {
        return E0.h0(j10);
    }

    public final long sum() {
        return T0(0L, C0291a.f14683p);
    }

    @Override
    public final AbstractC0326h unordered() {
        return !C0() ? this : new C0317f0(this, 3, EnumC0325g3.f14763r, 1);
    }

    @Override
    final Q0 z0(E0 e02, H h10, boolean z10, o oVar) {
        return E0.P(e02, h10, z10);
    }
}
