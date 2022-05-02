package p126j$.util.stream;

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
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5485a;
import p126j$.util.C5543g;
import p126j$.util.C5547k;
import p126j$.util.C5551o;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.C5520b;
import p126j$.util.function.C5524f;

public final class C5586G implements DoubleStream {
    final AbstractC5591H f18143a;

    private C5586G(AbstractC5591H h) {
        this.f18143a = h;
    }

    public static DoubleStream m22388i(AbstractC5591H h) {
        if (h == null) {
            return null;
        }
        return new C5586G(h);
    }

    @Override
    public boolean allMatch(DoublePredicate doublePredicate) {
        AbstractC5591H h = this.f18143a;
        C5520b h2 = C5520b.m22492h(doublePredicate);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        return ((Boolean) f.m22298t0(AbstractC5572D0.m22425f0(h2, EnumC5557A0.ALL))).booleanValue();
    }

    @Override
    public boolean anyMatch(DoublePredicate doublePredicate) {
        AbstractC5591H h = this.f18143a;
        C5520b h2 = C5520b.m22492h(doublePredicate);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        return ((Boolean) f.m22298t0(AbstractC5572D0.m22425f0(h2, EnumC5557A0.ANY))).booleanValue();
    }

    @Override
    public OptionalDouble average() {
        double[] dArr = (double[]) ((AbstractC5581F) this.f18143a).m22393M0(C5766s.f18460a, C5726k.f18398c, C5746o.f18437b);
        return AbstractC5485a.m22558x(dArr[2] > 0.0d ? C5547k.m22471d(AbstractC5736m.m22217a(dArr) / dArr[2]) : C5547k.m22474a());
    }

    @Override
    public Stream boxed() {
        return C5685b3.m22313i(((AbstractC5581F) this.f18143a).m22391O0(C5676a.f18290g));
    }

    @Override
    public void close() {
        ((AbstractC5686c) this.f18143a).close();
    }

    @Override
    public Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return ((AbstractC5581F) this.f18143a).m22393M0(C5520b.m22502B(supplier), objDoubleConsumer == null ? null : new C5520b(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public long count() {
        return ((AbstractC5767s0) ((AbstractC5581F) this.f18143a).m22392N0(C5676a.f18291h)).sum();
    }

    @Override
    public DoubleStream distinct() {
        return m22388i(((AbstractC5719i2) ((AbstractC5719i2) ((AbstractC5581F) this.f18143a).m22391O0(C5676a.f18290g)).m22250K0()).m22249L0(C5676a.f18288e));
    }

    @Override
    public DoubleStream filter(DoublePredicate doublePredicate) {
        AbstractC5591H h = this.f18143a;
        C5520b h2 = C5520b.m22492h(doublePredicate);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        Objects.requireNonNull(h2);
        return m22388i(new C5791x(f, f, 4, EnumC5705f3.f18370t, h2, 2));
    }

    @Override
    public OptionalDouble findAny() {
        AbstractC5581F f = (AbstractC5581F) this.f18143a;
        Objects.requireNonNull(f);
        return AbstractC5485a.m22558x((C5547k) f.m22298t0(new C5616M(false, 4, C5547k.m22474a(), C5726k.f18401f, C5596I.f18152a)));
    }

    @Override
    public OptionalDouble findFirst() {
        AbstractC5581F f = (AbstractC5581F) this.f18143a;
        Objects.requireNonNull(f);
        return AbstractC5485a.m22558x((C5547k) f.m22298t0(new C5616M(true, 4, C5547k.m22474a(), C5726k.f18401f, C5596I.f18152a)));
    }

    @Override
    public DoubleStream flatMap(DoubleFunction doubleFunction) {
        AbstractC5591H h = this.f18143a;
        C5520b bVar = doubleFunction == null ? null : new C5520b(doubleFunction);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        return m22388i(new C5791x(f, f, 4, EnumC5705f3.f18366p | EnumC5705f3.f18364n | EnumC5705f3.f18370t, bVar, 1));
    }

    @Override
    public void forEach(DoubleConsumer doubleConsumer) {
        this.f18143a.mo22386d(C5524f.m22486a(doubleConsumer));
    }

    @Override
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f18143a.mo22385h(C5524f.m22486a(doubleConsumer));
    }

    @Override
    public boolean isParallel() {
        return ((AbstractC5686c) this.f18143a).isParallel();
    }

    @Override
    public Iterator<Double> iterator2() {
        return C5551o.m22462a(AbstractC5482V.m22595f(((AbstractC5581F) this.f18143a).spliterator()));
    }

    @Override
    public DoubleStream limit(long j) {
        AbstractC5581F f = (AbstractC5581F) this.f18143a;
        Objects.requireNonNull(f);
        if (j >= 0) {
            return m22388i(AbstractC5572D0.m22426e0(f, 0L, j));
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override
    public DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        AbstractC5591H h = this.f18143a;
        C5520b bVar = doubleUnaryOperator == null ? null : new C5520b(doubleUnaryOperator);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        Objects.requireNonNull(bVar);
        return m22388i(new C5791x(f, f, 4, EnumC5705f3.f18366p | EnumC5705f3.f18364n, bVar, 0));
    }

    @Override
    public IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        AbstractC5591H h = this.f18143a;
        C5520b bVar = doubleToIntFunction == null ? null : new C5520b(doubleToIntFunction);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        Objects.requireNonNull(bVar);
        return C5727k0.m22229i(new C5801z(f, f, 4, EnumC5705f3.f18366p | EnumC5705f3.f18364n, bVar, 0));
    }

    @Override
    public LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C5772t0.m22178i(((AbstractC5581F) this.f18143a).m22392N0(doubleToLongFunction == null ? null : new C5520b(doubleToLongFunction)));
    }

    @Override
    public Stream mapToObj(DoubleFunction doubleFunction) {
        return C5685b3.m22313i(((AbstractC5581F) this.f18143a).m22391O0(doubleFunction == null ? null : new C5520b(doubleFunction)));
    }

    @Override
    public OptionalDouble max() {
        return AbstractC5485a.m22558x(((AbstractC5581F) this.f18143a).m22390P0(C5676a.f18289f));
    }

    @Override
    public OptionalDouble min() {
        return AbstractC5485a.m22558x(((AbstractC5581F) this.f18143a).m22390P0(C5726k.f18399d));
    }

    @Override
    public boolean noneMatch(DoublePredicate doublePredicate) {
        AbstractC5591H h = this.f18143a;
        C5520b h2 = C5520b.m22492h(doublePredicate);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        return ((Boolean) f.m22298t0(AbstractC5572D0.m22425f0(h2, EnumC5557A0.NONE))).booleanValue();
    }

    @Override
    public DoubleStream onClose(Runnable runnable) {
        AbstractC5686c cVar = (AbstractC5686c) this.f18143a;
        cVar.m22312A0(runnable);
        return C5706g.m22262i(cVar);
    }

    @Override
    public DoubleStream peek(DoubleConsumer doubleConsumer) {
        AbstractC5591H h = this.f18143a;
        AbstractC5525g a = C5524f.m22486a(doubleConsumer);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        Objects.requireNonNull(a);
        return m22388i(new C5791x(f, f, 4, 0, a, 3));
    }

    @Override
    public double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        AbstractC5591H h = this.f18143a;
        C5520b bVar = doubleBinaryOperator == null ? null : new C5520b(doubleBinaryOperator);
        AbstractC5581F f = (AbstractC5581F) h;
        Objects.requireNonNull(f);
        Objects.requireNonNull(bVar);
        return ((Double) f.m22298t0(new C5593H1(4, bVar, d))).doubleValue();
    }

    @Override
    public DoubleStream skip(long j) {
        AbstractC5581F f = (AbstractC5581F) this.f18143a;
        Objects.requireNonNull(f);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        AbstractC5581F f2 = f;
        if (i >= 0) {
            if (i != 0) {
                f2 = AbstractC5572D0.m22426e0(f, j, -1L);
            }
            return m22388i(f2);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override
    public DoubleStream sorted() {
        AbstractC5581F f = (AbstractC5581F) this.f18143a;
        Objects.requireNonNull(f);
        return m22388i(new C5599I2(f));
    }

    @Override
    public double sum() {
        return AbstractC5736m.m22217a((double[]) ((AbstractC5581F) this.f18143a).m22393M0(C5771t.f18471a, C5731l.f18417c, C5766s.f18461b));
    }

    @Override
    public DoubleSummaryStatistics summaryStatistics() {
        C5543g gVar = (C5543g) ((AbstractC5581F) this.f18143a).m22393M0(C5676a.f18285b, C5676a.f18287d, C5731l.f18416b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override
    public double[] toArray() {
        return (double[]) AbstractC5572D0.m22433V((AbstractC5602J0) ((AbstractC5581F) this.f18143a).m22297u0(C5726k.f18400e)).mo22157l();
    }

    @Override
    public DoubleStream unordered() {
        return C5706g.m22262i(((AbstractC5581F) this.f18143a).unordered());
    }

    @Override
    public OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC5485a.m22558x(((AbstractC5581F) this.f18143a).m22390P0(doubleBinaryOperator == null ? null : new C5520b(doubleBinaryOperator)));
    }
}
