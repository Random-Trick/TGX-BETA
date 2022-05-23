package j$.util.stream;

import j$.util.AbstractC0283k;
import j$.util.C0280h;
import j$.util.C0284l;
import j$.util.C0285m;
import j$.util.C0290s;
import j$.util.W;
import j$.util.function.BiConsumer;
import j$.util.function.C0274b;
import j$.util.function.m;
import j$.util.function.n;
import j$.util.function.o;
import j$.util.function.p;
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

public final class C0347l0 implements IntStream {
    final AbstractC0352m0 f14804a;

    private C0347l0(AbstractC0352m0 m0Var) {
        this.f14804a = m0Var;
    }

    public static IntStream i(AbstractC0352m0 m0Var) {
        if (m0Var == null) {
            return null;
        }
        return new C0347l0(m0Var);
    }

    @Override
    public final boolean allMatch(IntPredicate intPredicate) {
        AbstractC0352m0 m0Var = this.f14804a;
        p p10 = C0274b.p(intPredicate);
        AbstractC0342k0 k0Var = (AbstractC0342k0) m0Var;
        Objects.requireNonNull(k0Var);
        return ((Boolean) k0Var.x0(E0.m0(p10, B0.ALL))).booleanValue();
    }

    @Override
    public final boolean anyMatch(IntPredicate intPredicate) {
        AbstractC0352m0 m0Var = this.f14804a;
        p p10 = C0274b.p(intPredicate);
        AbstractC0342k0 k0Var = (AbstractC0342k0) m0Var;
        Objects.requireNonNull(k0Var);
        return ((Boolean) k0Var.x0(E0.m0(p10, B0.ANY))).booleanValue();
    }

    @Override
    public final DoubleStream asDoubleStream() {
        AbstractC0342k0 k0Var = (AbstractC0342k0) this.f14804a;
        Objects.requireNonNull(k0Var);
        return H.i(new C(k0Var, 2, EnumC0325g3.f14761p | EnumC0325g3.f14759n, 1));
    }

    @Override
    public final LongStream asLongStream() {
        AbstractC0342k0 k0Var = (AbstractC0342k0) this.f14804a;
        Objects.requireNonNull(k0Var);
        return C0389u0.i(new C0317f0(k0Var, 2, EnumC0325g3.f14761p | EnumC0325g3.f14759n, 0));
    }

    @Override
    public final OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC0342k0) this.f14804a).Q0(C0302c0.f14720a, C0346l.f14796g, J.f14548b);
        return AbstractC0283k.b(jArr[0] > 0 ? C0284l.d(jArr[1] / jArr[0]) : C0284l.a());
    }

    @Override
    public final Stream boxed() {
        return C0305c3.i(((AbstractC0342k0) this.f14804a).S0(C0366p.f14833d));
    }

    @Override
    public final void close() {
        ((AbstractC0301c) this.f14804a).close();
    }

    @Override
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return ((AbstractC0342k0) this.f14804a).Q0(C0274b.w(supplier), objIntConsumer == null ? null : new C0274b(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public final long count() {
        return ((AbstractC0385t0) ((AbstractC0342k0) this.f14804a).R0(C0291a.f14680m)).sum();
    }

    @Override
    public final IntStream distinct() {
        return i(((AbstractC0339j2) ((AbstractC0339j2) ((AbstractC0342k0) this.f14804a).S0(C0366p.f14833d)).O0()).Q0(C0291a.f14678k));
    }

    @Override
    public final IntStream filter(IntPredicate intPredicate) {
        AbstractC0352m0 m0Var = this.f14804a;
        p p10 = C0274b.p(intPredicate);
        AbstractC0342k0 k0Var = (AbstractC0342k0) m0Var;
        Objects.requireNonNull(k0Var);
        Objects.requireNonNull(p10);
        return i(new A(k0Var, 2, EnumC0325g3.f14765t, p10, 4));
    }

    @Override
    public final OptionalInt findAny() {
        AbstractC0342k0 k0Var = (AbstractC0342k0) this.f14804a;
        Objects.requireNonNull(k0Var);
        return AbstractC0283k.c((C0285m) k0Var.x0(new N(false, 2, C0285m.a(), C0351m.f14812d, K.f14555a)));
    }

    @Override
    public final OptionalInt findFirst() {
        AbstractC0342k0 k0Var = (AbstractC0342k0) this.f14804a;
        Objects.requireNonNull(k0Var);
        return AbstractC0283k.c((C0285m) k0Var.x0(new N(true, 2, C0285m.a(), C0351m.f14812d, K.f14555a)));
    }

    @Override
    public final IntStream flatMap(IntFunction intFunction) {
        AbstractC0352m0 m0Var = this.f14804a;
        o l10 = C0274b.l(intFunction);
        AbstractC0342k0 k0Var = (AbstractC0342k0) m0Var;
        Objects.requireNonNull(k0Var);
        return i(new A(k0Var, 2, EnumC0325g3.f14761p | EnumC0325g3.f14759n | EnumC0325g3.f14765t, l10, 3));
    }

    @Override
    public final void forEach(IntConsumer intConsumer) {
        this.f14804a.e(m.a(intConsumer));
    }

    @Override
    public final void forEachOrdered(IntConsumer intConsumer) {
        this.f14804a.g(m.a(intConsumer));
    }

    @Override
    public final boolean isParallel() {
        return ((AbstractC0301c) this.f14804a).isParallel();
    }

    @Override
    public final Iterator<Integer> iterator2() {
        return C0290s.a(W.g(((AbstractC0342k0) this.f14804a).spliterator()));
    }

    @Override
    public final IntStream limit(long j10) {
        AbstractC0342k0 k0Var = (AbstractC0342k0) this.f14804a;
        Objects.requireNonNull(k0Var);
        if (j10 >= 0) {
            return i(E0.l0(k0Var, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        AbstractC0352m0 m0Var = this.f14804a;
        C0274b bVar = intUnaryOperator == null ? null : new C0274b(intUnaryOperator);
        AbstractC0342k0 k0Var = (AbstractC0342k0) m0Var;
        Objects.requireNonNull(k0Var);
        Objects.requireNonNull(bVar);
        return i(new A(k0Var, 2, EnumC0325g3.f14761p | EnumC0325g3.f14759n, bVar, 2));
    }

    @Override
    public final DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        AbstractC0352m0 m0Var = this.f14804a;
        C0274b bVar = intToDoubleFunction == null ? null : new C0274b(intToDoubleFunction);
        AbstractC0342k0 k0Var = (AbstractC0342k0) m0Var;
        Objects.requireNonNull(k0Var);
        Objects.requireNonNull(bVar);
        return H.i(new C0404y(k0Var, 2, EnumC0325g3.f14761p | EnumC0325g3.f14759n, bVar, 4));
    }

    @Override
    public final LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C0389u0.i(((AbstractC0342k0) this.f14804a).R0(intToLongFunction == null ? null : new C0274b(intToLongFunction)));
    }

    @Override
    public final Stream mapToObj(IntFunction intFunction) {
        return C0305c3.i(((AbstractC0342k0) this.f14804a).S0(C0274b.l(intFunction)));
    }

    @Override
    public final OptionalInt max() {
        return AbstractC0283k.c(((AbstractC0342k0) this.f14804a).U0(C0346l.f14797h));
    }

    @Override
    public final OptionalInt min() {
        return AbstractC0283k.c(((AbstractC0342k0) this.f14804a).U0(C0351m.f14814f));
    }

    @Override
    public final boolean noneMatch(IntPredicate intPredicate) {
        AbstractC0352m0 m0Var = this.f14804a;
        p p10 = C0274b.p(intPredicate);
        AbstractC0342k0 k0Var = (AbstractC0342k0) m0Var;
        Objects.requireNonNull(k0Var);
        return ((Boolean) k0Var.x0(E0.m0(p10, B0.NONE))).booleanValue();
    }

    @Override
    public final IntStream onClose(Runnable runnable) {
        AbstractC0301c cVar = (AbstractC0301c) this.f14804a;
        cVar.E0(runnable);
        return C0321g.i(cVar);
    }

    @Override
    public final IntStream peek(IntConsumer intConsumer) {
        AbstractC0352m0 m0Var = this.f14804a;
        n a10 = m.a(intConsumer);
        AbstractC0342k0 k0Var = (AbstractC0342k0) m0Var;
        Objects.requireNonNull(k0Var);
        Objects.requireNonNull(a10);
        return i(new A(k0Var, 2, 0, a10, 1));
    }

    @Override
    public final int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        return ((AbstractC0342k0) this.f14804a).T0(i10, intBinaryOperator == null ? null : new C0274b(intBinaryOperator));
    }

    @Override
    public final IntStream skip(long j10) {
        AbstractC0342k0 k0Var = (AbstractC0342k0) this.f14804a;
        Objects.requireNonNull(k0Var);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        AbstractC0342k0 k0Var2 = k0Var;
        if (i10 >= 0) {
            if (i10 != 0) {
                k0Var2 = E0.l0(k0Var, j10, -1L);
            }
            return i(k0Var2);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override
    public final IntStream sorted() {
        AbstractC0342k0 k0Var = (AbstractC0342k0) this.f14804a;
        Objects.requireNonNull(k0Var);
        return i(new K2(k0Var));
    }

    @Override
    public final int sum() {
        return ((AbstractC0342k0) this.f14804a).T0(0, C0291a.f14679l);
    }

    @Override
    public final IntSummaryStatistics summaryStatistics() {
        C0280h hVar = (C0280h) ((AbstractC0342k0) this.f14804a).Q0(C0346l.f14790a, C0291a.f14677j, C0388u.f14866b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override
    public final int[] toArray() {
        return (int[]) E0.b0((M0) ((AbstractC0342k0) this.f14804a).y0(C0384t.f14856c)).m();
    }

    @Override
    public final IntStream unordered() {
        return C0321g.i(((AbstractC0342k0) this.f14804a).unordered());
    }

    @Override
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC0283k.c(((AbstractC0342k0) this.f14804a).U0(intBinaryOperator == null ? null : new C0274b(intBinaryOperator)));
    }
}
