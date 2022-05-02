package p126j$.util.stream;

import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5485a;
import p126j$.util.C5545i;
import p126j$.util.C5547k;
import p126j$.util.C5549m;
import p126j$.util.C5807u;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.C5520b;
import p126j$.util.function.C5534p;

public final class C5772t0 implements LongStream {
    final AbstractC5777u0 f18474a;

    private C5772t0(AbstractC5777u0 u0Var) {
        this.f18474a = u0Var;
    }

    public static LongStream m22178i(AbstractC5777u0 u0Var) {
        if (u0Var == null) {
            return null;
        }
        return new C5772t0(u0Var);
    }

    @Override
    public boolean allMatch(LongPredicate longPredicate) {
        AbstractC5777u0 u0Var = this.f18474a;
        C5520b k = C5520b.m22490k(longPredicate);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        return ((Boolean) s0Var.m22298t0(AbstractC5572D0.m22419j0(k, EnumC5557A0.ALL))).booleanValue();
    }

    @Override
    public boolean anyMatch(LongPredicate longPredicate) {
        AbstractC5777u0 u0Var = this.f18474a;
        C5520b k = C5520b.m22490k(longPredicate);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        return ((Boolean) s0Var.m22298t0(AbstractC5572D0.m22419j0(k, EnumC5557A0.ANY))).booleanValue();
    }

    @Override
    public DoubleStream asDoubleStream() {
        AbstractC5767s0 s0Var = (AbstractC5767s0) this.f18474a;
        Objects.requireNonNull(s0Var);
        return C5586G.m22388i(new C5561B(s0Var, s0Var, 3, EnumC5705f3.f18366p | EnumC5705f3.f18364n, 2));
    }

    @Override
    public OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC5767s0) this.f18474a).m22195M0(C5737m0.f18427a, C5726k.f18404i, C5606K.f18170b);
        return AbstractC5485a.m22558x(jArr[0] > 0 ? C5547k.m22471d(jArr[1] / jArr[0]) : C5547k.m22474a());
    }

    @Override
    public Stream boxed() {
        return C5685b3.m22313i(((AbstractC5767s0) this.f18474a).m22193O0(C5676a.f18300q));
    }

    @Override
    public void close() {
        ((AbstractC5686c) this.f18474a).close();
    }

    @Override
    public Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return ((AbstractC5767s0) this.f18474a).m22195M0(C5520b.m22502B(supplier), objLongConsumer == null ? null : new C5520b(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public long count() {
        return ((AbstractC5767s0) ((AbstractC5767s0) this.f18474a).m22194N0(C5676a.f18301r)).sum();
    }

    @Override
    public LongStream distinct() {
        return m22178i(((AbstractC5719i2) ((AbstractC5719i2) ((AbstractC5767s0) this.f18474a).m22193O0(C5676a.f18300q)).m22250K0()).m22247N0(C5676a.f18298o));
    }

    @Override
    public LongStream filter(LongPredicate longPredicate) {
        AbstractC5777u0 u0Var = this.f18474a;
        C5520b k = C5520b.m22490k(longPredicate);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        Objects.requireNonNull(k);
        return m22178i(new C5556A(s0Var, s0Var, 3, EnumC5705f3.f18370t, k, 4));
    }

    @Override
    public OptionalLong findAny() {
        AbstractC5767s0 s0Var = (AbstractC5767s0) this.f18474a;
        Objects.requireNonNull(s0Var);
        return AbstractC5485a.m22556z((C5549m) s0Var.m22298t0(new C5616M(false, 3, C5549m.m22466a(), C5746o.f18438c, C5606K.f18169a)));
    }

    @Override
    public OptionalLong findFirst() {
        AbstractC5767s0 s0Var = (AbstractC5767s0) this.f18474a;
        Objects.requireNonNull(s0Var);
        return AbstractC5485a.m22556z((C5549m) s0Var.m22298t0(new C5616M(true, 3, C5549m.m22466a(), C5746o.f18438c, C5606K.f18169a)));
    }

    @Override
    public LongStream flatMap(LongFunction longFunction) {
        AbstractC5777u0 u0Var = this.f18474a;
        C5520b bVar = longFunction == null ? null : new C5520b(longFunction);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        return m22178i(new C5556A(s0Var, s0Var, 3, EnumC5705f3.f18366p | EnumC5705f3.f18364n | EnumC5705f3.f18370t, bVar, 3));
    }

    @Override
    public void forEach(LongConsumer longConsumer) {
        this.f18474a.mo22172b(C5534p.m22484a(longConsumer));
    }

    @Override
    public void forEachOrdered(LongConsumer longConsumer) {
        this.f18474a.mo22171f(C5534p.m22484a(longConsumer));
    }

    @Override
    public boolean isParallel() {
        return ((AbstractC5686c) this.f18474a).isParallel();
    }

    @Override
    public Iterator<Long> iterator2() {
        return C5807u.m22127a(AbstractC5482V.m22593h(((AbstractC5767s0) this.f18474a).spliterator()));
    }

    @Override
    public LongStream limit(long j) {
        AbstractC5767s0 s0Var = (AbstractC5767s0) this.f18474a;
        Objects.requireNonNull(s0Var);
        if (j >= 0) {
            return m22178i(AbstractC5572D0.m22421i0(s0Var, 0L, j));
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override
    public LongStream map(LongUnaryOperator longUnaryOperator) {
        return m22178i(((AbstractC5767s0) this.f18474a).m22194N0(longUnaryOperator == null ? null : new C5520b(longUnaryOperator)));
    }

    @Override
    public DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        AbstractC5777u0 u0Var = this.f18474a;
        C5520b bVar = longToDoubleFunction == null ? null : new C5520b(longToDoubleFunction);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        Objects.requireNonNull(bVar);
        return C5586G.m22388i(new C5791x(s0Var, s0Var, 3, EnumC5705f3.f18366p | EnumC5705f3.f18364n, bVar, 5));
    }

    @Override
    public IntStream mapToInt(LongToIntFunction longToIntFunction) {
        AbstractC5777u0 u0Var = this.f18474a;
        C5520b bVar = longToIntFunction == null ? null : new C5520b(longToIntFunction);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        Objects.requireNonNull(bVar);
        return C5727k0.m22229i(new C5801z(s0Var, s0Var, 3, EnumC5705f3.f18366p | EnumC5705f3.f18364n, bVar, 5));
    }

    @Override
    public Stream mapToObj(LongFunction longFunction) {
        return C5685b3.m22313i(((AbstractC5767s0) this.f18474a).m22193O0(longFunction == null ? null : new C5520b(longFunction)));
    }

    @Override
    public OptionalLong max() {
        return AbstractC5485a.m22556z(((AbstractC5767s0) this.f18474a).m22192P0(C5726k.f18405j));
    }

    @Override
    public OptionalLong min() {
        return AbstractC5485a.m22556z(((AbstractC5767s0) this.f18474a).m22192P0(C5731l.f18421g));
    }

    @Override
    public boolean noneMatch(LongPredicate longPredicate) {
        AbstractC5777u0 u0Var = this.f18474a;
        C5520b k = C5520b.m22490k(longPredicate);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        return ((Boolean) s0Var.m22298t0(AbstractC5572D0.m22419j0(k, EnumC5557A0.NONE))).booleanValue();
    }

    @Override
    public LongStream onClose(Runnable runnable) {
        AbstractC5686c cVar = (AbstractC5686c) this.f18474a;
        cVar.m22312A0(runnable);
        return C5706g.m22262i(cVar);
    }

    @Override
    public LongStream peek(LongConsumer longConsumer) {
        AbstractC5777u0 u0Var = this.f18474a;
        AbstractC5535q a = C5534p.m22484a(longConsumer);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        Objects.requireNonNull(a);
        return m22178i(new C5556A(s0Var, s0Var, 3, 0, a, 5));
    }

    @Override
    public long reduce(long j, LongBinaryOperator longBinaryOperator) {
        AbstractC5777u0 u0Var = this.f18474a;
        C5520b bVar = longBinaryOperator == null ? null : new C5520b(longBinaryOperator);
        AbstractC5767s0 s0Var = (AbstractC5767s0) u0Var;
        Objects.requireNonNull(s0Var);
        Objects.requireNonNull(bVar);
        return ((Long) s0Var.m22298t0(new C5658V1(3, bVar, j))).longValue();
    }

    @Override
    public LongStream skip(long j) {
        AbstractC5767s0 s0Var = (AbstractC5767s0) this.f18474a;
        Objects.requireNonNull(s0Var);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        AbstractC5767s0 s0Var2 = s0Var;
        if (i >= 0) {
            if (i != 0) {
                s0Var2 = AbstractC5572D0.m22421i0(s0Var, j, -1L);
            }
            return m22178i(s0Var2);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override
    public LongStream sorted() {
        AbstractC5767s0 s0Var = (AbstractC5767s0) this.f18474a;
        Objects.requireNonNull(s0Var);
        return m22178i(new C5609K2(s0Var));
    }

    @Override
    public long sum() {
        return ((AbstractC5767s0) this.f18474a).sum();
    }

    @Override
    public LongSummaryStatistics summaryStatistics() {
        C5545i iVar = (C5545i) ((AbstractC5767s0) this.f18474a).m22195M0(C5731l.f18415a, C5676a.f18297n, C5601J.f18161b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override
    public long[] toArray() {
        return (long[]) AbstractC5572D0.m22431X((AbstractC5622N0) ((AbstractC5767s0) this.f18474a).m22297u0(C5771t.f18473c)).mo22157l();
    }

    @Override
    public LongStream unordered() {
        return C5706g.m22262i(((AbstractC5767s0) this.f18474a).unordered());
    }

    @Override
    public OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC5485a.m22556z(((AbstractC5767s0) this.f18474a).m22192P0(longBinaryOperator == null ? null : new C5520b(longBinaryOperator)));
    }
}
