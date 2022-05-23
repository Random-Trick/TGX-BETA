package j$.util.stream;

import j$.util.C0282j;
import j$.util.H;
import j$.util.W;
import j$.util.function.AbstractC0275c;
import j$.util.function.Consumer;
import j$.util.function.F;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.function.o;
import java.util.Iterator;
import java.util.Objects;

abstract class AbstractC0339j2 extends AbstractC0301c implements AbstractC0310d3 {
    public static final int f14785t = 0;

    public AbstractC0339j2(H h10, int i10, boolean z10) {
        super(h10, i10, z10);
    }

    public AbstractC0339j2(AbstractC0301c cVar, int i10) {
        super(cVar, i10);
    }

    @Override
    final void A0(H h10, AbstractC0378r2 r2Var) {
        while (!r2Var.u() && h10.a(r2Var)) {
        }
    }

    @Override
    public final int B0() {
        return 1;
    }

    @Override
    final H N0(E0 e02, F f10, boolean z10) {
        return new M3(e02, f10, z10);
    }

    public final AbstractC0310d3 O0() {
        return new C0380s(this, 1, EnumC0325g3.f14758m | EnumC0325g3.f14765t);
    }

    public final I P0(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C0404y(this, 1, EnumC0325g3.f14761p | EnumC0325g3.f14759n, toDoubleFunction, 6);
    }

    public final AbstractC0352m0 Q0(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new A(this, 1, EnumC0325g3.f14761p | EnumC0325g3.f14759n, toIntFunction, 6);
    }

    public final AbstractC0393v0 R0(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new B(this, 1, EnumC0325g3.f14761p | EnumC0325g3.f14759n, toLongFunction, 7);
    }

    public final C0282j S0(AbstractC0275c cVar) {
        Objects.requireNonNull(cVar);
        return (C0282j) x0(new K1(1, cVar, 1));
    }

    public void a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        x0(new Y(consumer, false));
    }

    public void c(Consumer consumer) {
        Objects.requireNonNull(consumer);
        x0(new Y(consumer, true));
    }

    @Override
    public final Iterator iterator() {
        return W.i(spliterator());
    }

    @Override
    public final I0 p0(long j10, o oVar) {
        return E0.L(j10, oVar);
    }

    @Override
    public final AbstractC0326h unordered() {
        return !C0() ? this : new C0314e2(this, 1, EnumC0325g3.f14763r);
    }

    @Override
    final Q0 z0(E0 e02, H h10, boolean z10, o oVar) {
        return E0.M(e02, h10, z10, oVar);
    }
}
