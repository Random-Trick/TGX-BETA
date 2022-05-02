package p126j$.util.stream;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5485a;
import p126j$.util.C5544h;
import p126j$.util.C5547k;
import p126j$.util.C5548l;
import p126j$.util.C5554r;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.C5520b;
import p126j$.util.function.C5529k;

public final class C5727k0 implements IntStream {
    final AbstractC5732l0 f18410a;

    private C5727k0(AbstractC5732l0 l0Var) {
        this.f18410a = l0Var;
    }

    public static IntStream m22228i(AbstractC5732l0 l0Var) {
        if (l0Var == null) {
            return null;
        }
        return new C5727k0(l0Var);
    }

    @Override
    public boolean allMatch(IntPredicate intPredicate) {
        AbstractC5732l0 l0Var = this.f18410a;
        C5520b j = C5520b.m22490j(intPredicate);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        return ((Boolean) j0Var.m22297t0(AbstractC5572D0.m22422h0(j, EnumC5557A0.ALL))).booleanValue();
    }

    @Override
    public boolean anyMatch(IntPredicate intPredicate) {
        AbstractC5732l0 l0Var = this.f18410a;
        C5520b j = C5520b.m22490j(intPredicate);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        return ((Boolean) j0Var.m22297t0(AbstractC5572D0.m22422h0(j, EnumC5557A0.ANY))).booleanValue();
    }

    @Override
    public DoubleStream asDoubleStream() {
        AbstractC5722j0 j0Var = (AbstractC5722j0) this.f18410a;
        Objects.requireNonNull(j0Var);
        return C5586G.m22387i(new C5561B(j0Var, j0Var, 2, EnumC5705f3.f18366p | EnumC5705f3.f18364n, 1));
    }

    @Override
    public LongStream asLongStream() {
        AbstractC5722j0 j0Var = (AbstractC5722j0) this.f18410a;
        Objects.requireNonNull(j0Var);
        return C5772t0.m22177i(new C5697e0(j0Var, j0Var, 2, EnumC5705f3.f18366p | EnumC5705f3.f18364n, 0));
    }

    @Override
    public OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC5722j0) this.f18410a).m22238M0(C5682b0.f18313a, C5726k.f18402g, C5596I.f18153b);
        return AbstractC5485a.m22557x(jArr[0] > 0 ? C5547k.m22470d(jArr[1] / jArr[0]) : C5547k.m22473a());
    }

    @Override
    public Stream boxed() {
        return C5685b3.m22312i(((AbstractC5722j0) this.f18410a).m22236O0(C5746o.f18439d));
    }

    @Override
    public void close() {
        ((AbstractC5686c) this.f18410a).close();
    }

    @Override
    public Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return ((AbstractC5722j0) this.f18410a).m22238M0(C5520b.m22501B(supplier), objIntConsumer == null ? null : new C5520b(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public long count() {
        return ((AbstractC5767s0) ((AbstractC5722j0) this.f18410a).m22237N0(C5676a.f18296m)).sum();
    }

    @Override
    public IntStream distinct() {
        return m22228i(((AbstractC5719i2) ((AbstractC5719i2) ((AbstractC5722j0) this.f18410a).m22236O0(C5746o.f18439d)).m22249K0()).m22247M0(C5676a.f18294k));
    }

    @Override
    public IntStream filter(IntPredicate intPredicate) {
        AbstractC5732l0 l0Var = this.f18410a;
        C5520b j = C5520b.m22490j(intPredicate);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        Objects.requireNonNull(j);
        return m22228i(new C5801z(j0Var, j0Var, 2, EnumC5705f3.f18370t, j, 4));
    }

    @Override
    public OptionalInt findAny() {
        AbstractC5722j0 j0Var = (AbstractC5722j0) this.f18410a;
        Objects.requireNonNull(j0Var);
        return AbstractC5485a.m22556y((C5548l) j0Var.m22297t0(new C5616M(false, 2, C5548l.m22469a(), C5731l.f18418d, C5601J.f18160a)));
    }

    @Override
    public OptionalInt findFirst() {
        AbstractC5722j0 j0Var = (AbstractC5722j0) this.f18410a;
        Objects.requireNonNull(j0Var);
        return AbstractC5485a.m22556y((C5548l) j0Var.m22297t0(new C5616M(true, 2, C5548l.m22469a(), C5731l.f18418d, C5601J.f18160a)));
    }

    @Override
    public IntStream flatMap(IntFunction intFunction) {
        AbstractC5732l0 l0Var = this.f18410a;
        AbstractC5531m t = C5520b.m22487t(intFunction);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        return m22228i(new C5801z(j0Var, j0Var, 2, EnumC5705f3.f18366p | EnumC5705f3.f18364n | EnumC5705f3.f18370t, t, 3));
    }

    @Override
    public void forEach(IntConsumer intConsumer) {
        this.f18410a.mo22221e(C5529k.m22484a(intConsumer));
    }

    @Override
    public void forEachOrdered(IntConsumer intConsumer) {
        this.f18410a.mo22220g(C5529k.m22484a(intConsumer));
    }

    @Override
    public boolean isParallel() {
        return ((AbstractC5686c) this.f18410a).isParallel();
    }

    @Override
    public Iterator<Integer> iterator2() {
        return C5554r.m22460a(AbstractC5482V.m22593g(((AbstractC5722j0) this.f18410a).spliterator()));
    }

    @Override
    public IntStream limit(long j) {
        AbstractC5722j0 j0Var = (AbstractC5722j0) this.f18410a;
        Objects.requireNonNull(j0Var);
        if (j >= 0) {
            return m22228i(AbstractC5572D0.m22423g0(j0Var, 0L, j));
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override
    public IntStream map(IntUnaryOperator intUnaryOperator) {
        AbstractC5732l0 l0Var = this.f18410a;
        C5520b bVar = intUnaryOperator == null ? null : new C5520b(intUnaryOperator);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        Objects.requireNonNull(bVar);
        return m22228i(new C5801z(j0Var, j0Var, 2, EnumC5705f3.f18366p | EnumC5705f3.f18364n, bVar, 2));
    }

    @Override
    public DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        AbstractC5732l0 l0Var = this.f18410a;
        C5520b bVar = intToDoubleFunction == null ? null : new C5520b(intToDoubleFunction);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        Objects.requireNonNull(bVar);
        return C5586G.m22387i(new C5791x(j0Var, j0Var, 2, EnumC5705f3.f18366p | EnumC5705f3.f18364n, bVar, 4));
    }

    @Override
    public LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C5772t0.m22177i(((AbstractC5722j0) this.f18410a).m22237N0(intToLongFunction == null ? null : new C5520b(intToLongFunction)));
    }

    @Override
    public Stream mapToObj(IntFunction intFunction) {
        return C5685b3.m22312i(((AbstractC5722j0) this.f18410a).m22236O0(C5520b.m22487t(intFunction)));
    }

    @Override
    public OptionalInt max() {
        return AbstractC5485a.m22556y(((AbstractC5722j0) this.f18410a).m22235P0(C5726k.f18403h));
    }

    @Override
    public OptionalInt min() {
        return AbstractC5485a.m22556y(((AbstractC5722j0) this.f18410a).m22235P0(C5731l.f18420f));
    }

    @Override
    public boolean noneMatch(IntPredicate intPredicate) {
        AbstractC5732l0 l0Var = this.f18410a;
        C5520b j = C5520b.m22490j(intPredicate);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        return ((Boolean) j0Var.m22297t0(AbstractC5572D0.m22422h0(j, EnumC5557A0.NONE))).booleanValue();
    }

    @Override
    public IntStream onClose(Runnable runnable) {
        AbstractC5686c cVar = (AbstractC5686c) this.f18410a;
        cVar.m22311A0(runnable);
        return C5706g.m22261i(cVar);
    }

    @Override
    public IntStream peek(IntConsumer intConsumer) {
        AbstractC5732l0 l0Var = this.f18410a;
        AbstractC5530l a = C5529k.m22484a(intConsumer);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        Objects.requireNonNull(a);
        return m22228i(new C5801z(j0Var, j0Var, 2, 0, a, 1));
    }

    @Override
    public int reduce(int i, IntBinaryOperator intBinaryOperator) {
        AbstractC5732l0 l0Var = this.f18410a;
        C5520b bVar = intBinaryOperator == null ? null : new C5520b(intBinaryOperator);
        AbstractC5722j0 j0Var = (AbstractC5722j0) l0Var;
        Objects.requireNonNull(j0Var);
        Objects.requireNonNull(bVar);
        return ((Integer) j0Var.m22297t0(new C5642R1(2, bVar, i))).intValue();
    }

    @Override
    public IntStream skip(long j) {
        AbstractC5722j0 j0Var = (AbstractC5722j0) this.f18410a;
        Objects.requireNonNull(j0Var);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        AbstractC5722j0 j0Var2 = j0Var;
        if (i >= 0) {
            if (i != 0) {
                j0Var2 = AbstractC5572D0.m22423g0(j0Var, j, -1L);
            }
            return m22228i(j0Var2);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override
    public IntStream sorted() {
        AbstractC5722j0 j0Var = (AbstractC5722j0) this.f18410a;
        Objects.requireNonNull(j0Var);
        return m22228i(new C5604J2(j0Var));
    }

    @Override
    public int sum() {
        AbstractC5722j0 j0Var = (AbstractC5722j0) this.f18410a;
        Objects.requireNonNull(j0Var);
        return ((Integer) j0Var.m22297t0(new C5642R1(2, C5676a.f18295l, 0))).intValue();
    }

    @Override
    public IntSummaryStatistics summaryStatistics() {
        C5544h hVar = (C5544h) ((AbstractC5722j0) this.f18410a).m22238M0(C5726k.f18396a, C5676a.f18293j, C5771t.f18472b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override
    public int[] toArray() {
        return (int[]) AbstractC5572D0.m22431W((AbstractC5612L0) ((AbstractC5722j0) this.f18410a).m22296u0(C5766s.f18462c)).mo22156l();
    }

    @Override
    public IntStream unordered() {
        return C5706g.m22261i(((AbstractC5722j0) this.f18410a).unordered());
    }

    @Override
    public OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC5485a.m22556y(((AbstractC5722j0) this.f18410a).m22235P0(intBinaryOperator == null ? null : new C5520b(intBinaryOperator)));
    }
}
