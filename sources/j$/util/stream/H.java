package j$.util.stream;

import j$.util.AbstractC0283k;
import j$.util.C0279g;
import j$.util.C0284l;
import j$.util.C0288p;
import j$.util.W;
import j$.util.function.AbstractC0278f;
import j$.util.function.BiConsumer;
import j$.util.function.C0274b;
import j$.util.function.C0277e;
import j$.util.function.h;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class H implements DoubleStream {
    final I f14538a;

    private H(I i10) {
        this.f14538a = i10;
    }

    public static DoubleStream i(I i10) {
        if (i10 == null) {
            return null;
        }
        return new H(i10);
    }

    @Override
    public final boolean allMatch(DoublePredicate doublePredicate) {
        I i10 = this.f14538a;
        h k10 = C0274b.k(doublePredicate);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        return ((Boolean) g10.x0(E0.k0(k10, B0.ALL))).booleanValue();
    }

    @Override
    public final boolean anyMatch(DoublePredicate doublePredicate) {
        I i10 = this.f14538a;
        h k10 = C0274b.k(doublePredicate);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        return ((Boolean) g10.x0(E0.k0(k10, B0.ANY))).booleanValue();
    }

    @Override
    public final OptionalDouble average() {
        double[] dArr = (double[]) ((G) this.f14538a).Q0(C0384t.f14854a, C0346l.f14792c, C0366p.f14831b);
        return AbstractC0283k.b(dArr[2] > 0.0d ? C0284l.d(AbstractC0356n.a(dArr) / dArr[2]) : C0284l.a());
    }

    @Override
    public final Stream boxed() {
        return C0305c3.i(((G) this.f14538a).S0(C0291a.f14674g));
    }

    @Override
    public final void close() {
        ((AbstractC0301c) this.f14538a).close();
    }

    @Override
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return ((G) this.f14538a).Q0(C0274b.w(supplier), objDoubleConsumer == null ? null : new C0274b(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public final long count() {
        return ((AbstractC0385t0) ((G) this.f14538a).R0(C0291a.f14675h)).sum();
    }

    @Override
    public final DoubleStream distinct() {
        return i(((AbstractC0339j2) ((AbstractC0339j2) ((G) this.f14538a).S0(C0291a.f14674g)).O0()).P0(C0291a.f14672e));
    }

    @Override
    public final DoubleStream filter(DoublePredicate doublePredicate) {
        I i10 = this.f14538a;
        h k10 = C0274b.k(doublePredicate);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(k10);
        return i(new C0404y(g10, 4, EnumC0325g3.f14765t, k10, 2));
    }

    @Override
    public final OptionalDouble findAny() {
        G g10 = (G) this.f14538a;
        Objects.requireNonNull(g10);
        return AbstractC0283k.b((C0284l) g10.x0(new N(false, 4, C0284l.a(), C0346l.f14795f, J.f14547a)));
    }

    @Override
    public final OptionalDouble findFirst() {
        G g10 = (G) this.f14538a;
        Objects.requireNonNull(g10);
        return AbstractC0283k.b((C0284l) g10.x0(new N(true, 4, C0284l.a(), C0346l.f14795f, J.f14547a)));
    }

    @Override
    public final DoubleStream flatMap(DoubleFunction doubleFunction) {
        I i10 = this.f14538a;
        C0274b bVar = doubleFunction == null ? null : new C0274b(doubleFunction);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        return i(new C0404y(g10, 4, EnumC0325g3.f14761p | EnumC0325g3.f14759n | EnumC0325g3.f14765t, bVar, 1));
    }

    @Override
    public final void forEach(DoubleConsumer doubleConsumer) {
        this.f14538a.d(C0277e.a(doubleConsumer));
    }

    @Override
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f14538a.h(C0277e.a(doubleConsumer));
    }

    @Override
    public final boolean isParallel() {
        return ((AbstractC0301c) this.f14538a).isParallel();
    }

    @Override
    public final Iterator<Double> iterator2() {
        return C0288p.a(W.f(((G) this.f14538a).spliterator()));
    }

    @Override
    public final DoubleStream limit(long j10) {
        G g10 = (G) this.f14538a;
        Objects.requireNonNull(g10);
        if (j10 >= 0) {
            return i(E0.j0(g10, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override
    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        I i10 = this.f14538a;
        C0274b bVar = doubleUnaryOperator == null ? null : new C0274b(doubleUnaryOperator);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(bVar);
        return i(new C0404y(g10, 4, EnumC0325g3.f14761p | EnumC0325g3.f14759n, bVar, 0));
    }

    @Override
    public final IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        I i10 = this.f14538a;
        C0274b bVar = doubleToIntFunction == null ? null : new C0274b(doubleToIntFunction);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(bVar);
        return C0347l0.i(new A(g10, 4, EnumC0325g3.f14761p | EnumC0325g3.f14759n, bVar, 0));
    }

    @Override
    public final LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C0389u0.i(((G) this.f14538a).R0(doubleToLongFunction == null ? null : new C0274b(doubleToLongFunction)));
    }

    @Override
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        return C0305c3.i(((G) this.f14538a).S0(doubleFunction == null ? null : new C0274b(doubleFunction)));
    }

    @Override
    public final OptionalDouble max() {
        return AbstractC0283k.b(((G) this.f14538a).T0(C0291a.f14673f));
    }

    @Override
    public final OptionalDouble min() {
        return AbstractC0283k.b(((G) this.f14538a).T0(C0346l.f14793d));
    }

    @Override
    public final boolean noneMatch(DoublePredicate doublePredicate) {
        I i10 = this.f14538a;
        h k10 = C0274b.k(doublePredicate);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        return ((Boolean) g10.x0(E0.k0(k10, B0.NONE))).booleanValue();
    }

    @Override
    public final DoubleStream onClose(Runnable runnable) {
        AbstractC0301c cVar = (AbstractC0301c) this.f14538a;
        cVar.E0(runnable);
        return C0321g.i(cVar);
    }

    @Override
    public final DoubleStream peek(DoubleConsumer doubleConsumer) {
        I i10 = this.f14538a;
        AbstractC0278f a10 = C0277e.a(doubleConsumer);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(a10);
        return i(new C0404y(g10, 4, 0, a10, 3));
    }

    @Override
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        I i10 = this.f14538a;
        C0274b bVar = doubleBinaryOperator == null ? null : new C0274b(doubleBinaryOperator);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(bVar);
        return ((Double) g10.x0(new I1(4, bVar, d10))).doubleValue();
    }

    @Override
    public final DoubleStream skip(long j10) {
        G g10 = (G) this.f14538a;
        Objects.requireNonNull(g10);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        G g11 = g10;
        if (i10 >= 0) {
            if (i10 != 0) {
                g11 = E0.j0(g10, j10, -1L);
            }
            return i(g11);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override
    public final DoubleStream sorted() {
        G g10 = (G) this.f14538a;
        Objects.requireNonNull(g10);
        return i(new J2(g10));
    }

    @Override
    public final double sum() {
        return AbstractC0356n.a((double[]) ((G) this.f14538a).Q0(C0388u.f14865a, C0351m.f14811c, C0384t.f14855b));
    }

    @Override
    public final DoubleSummaryStatistics summaryStatistics() {
        C0279g gVar = (C0279g) ((G) this.f14538a).Q0(C0291a.f14669b, C0291a.f14671d, C0351m.f14810b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override
    public final double[] toArray() {
        return (double[]) E0.a0((K0) ((G) this.f14538a).y0(C0346l.f14794e)).m();
    }

    @Override
    public final DoubleStream unordered() {
        return C0321g.i(((G) this.f14538a).unordered());
    }

    @Override
    public final OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC0283k.b(((G) this.f14538a).T0(doubleBinaryOperator == null ? null : new C0274b(doubleBinaryOperator)));
    }
}
