package j$.util.stream;

import j$.util.AbstractC0283k;
import j$.util.C0281i;
import j$.util.C0284l;
import j$.util.C0286n;
import j$.util.C0414v;
import j$.util.W;
import j$.util.function.BiConsumer;
import j$.util.function.C0274b;
import j$.util.function.u;
import j$.util.function.v;
import j$.util.function.x;
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

public final class C0389u0 implements LongStream {
    final AbstractC0393v0 f14868a;

    private C0389u0(AbstractC0393v0 v0Var) {
        this.f14868a = v0Var;
    }

    public static LongStream i(AbstractC0393v0 v0Var) {
        if (v0Var == null) {
            return null;
        }
        return new C0389u0(v0Var);
    }

    @Override
    public final boolean allMatch(LongPredicate longPredicate) {
        AbstractC0393v0 v0Var = this.f14868a;
        x q10 = C0274b.q(longPredicate);
        AbstractC0385t0 t0Var = (AbstractC0385t0) v0Var;
        Objects.requireNonNull(t0Var);
        return ((Boolean) t0Var.x0(E0.o0(q10, B0.ALL))).booleanValue();
    }

    @Override
    public final boolean anyMatch(LongPredicate longPredicate) {
        AbstractC0393v0 v0Var = this.f14868a;
        x q10 = C0274b.q(longPredicate);
        AbstractC0385t0 t0Var = (AbstractC0385t0) v0Var;
        Objects.requireNonNull(t0Var);
        return ((Boolean) t0Var.x0(E0.o0(q10, B0.ANY))).booleanValue();
    }

    @Override
    public final DoubleStream asDoubleStream() {
        AbstractC0385t0 t0Var = (AbstractC0385t0) this.f14868a;
        Objects.requireNonNull(t0Var);
        return H.i(new C(t0Var, 3, EnumC0325g3.f14761p | EnumC0325g3.f14759n, 2));
    }

    @Override
    public final OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC0385t0) this.f14868a).Q0(C0357n0.f14821a, C0346l.f14798i, L.f14565b);
        return AbstractC0283k.b(jArr[0] > 0 ? C0284l.d(jArr[1] / jArr[0]) : C0284l.a());
    }

    @Override
    public final Stream boxed() {
        return C0305c3.i(((AbstractC0385t0) this.f14868a).S0(C0291a.f14684q));
    }

    @Override
    public final void close() {
        ((AbstractC0301c) this.f14868a).close();
    }

    @Override
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return ((AbstractC0385t0) this.f14868a).Q0(C0274b.w(supplier), objLongConsumer == null ? null : new C0274b(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override
    public final long count() {
        return ((AbstractC0385t0) ((AbstractC0385t0) this.f14868a).R0(C0291a.f14685r)).sum();
    }

    @Override
    public final LongStream distinct() {
        return i(((AbstractC0339j2) ((AbstractC0339j2) ((AbstractC0385t0) this.f14868a).S0(C0291a.f14684q)).O0()).R0(C0291a.f14682o));
    }

    @Override
    public final LongStream filter(LongPredicate longPredicate) {
        AbstractC0393v0 v0Var = this.f14868a;
        x q10 = C0274b.q(longPredicate);
        AbstractC0385t0 t0Var = (AbstractC0385t0) v0Var;
        Objects.requireNonNull(t0Var);
        Objects.requireNonNull(q10);
        return i(new B(t0Var, 3, EnumC0325g3.f14765t, q10, 4));
    }

    @Override
    public final OptionalLong findAny() {
        AbstractC0385t0 t0Var = (AbstractC0385t0) this.f14868a;
        Objects.requireNonNull(t0Var);
        return AbstractC0283k.d((C0286n) t0Var.x0(new N(false, 3, C0286n.a(), C0366p.f14832c, L.f14564a)));
    }

    @Override
    public final OptionalLong findFirst() {
        AbstractC0385t0 t0Var = (AbstractC0385t0) this.f14868a;
        Objects.requireNonNull(t0Var);
        return AbstractC0283k.d((C0286n) t0Var.x0(new N(true, 3, C0286n.a(), C0366p.f14832c, L.f14564a)));
    }

    @Override
    public final LongStream flatMap(LongFunction longFunction) {
        AbstractC0393v0 v0Var = this.f14868a;
        C0274b bVar = longFunction == null ? null : new C0274b(longFunction);
        AbstractC0385t0 t0Var = (AbstractC0385t0) v0Var;
        Objects.requireNonNull(t0Var);
        return i(new B(t0Var, 3, EnumC0325g3.f14761p | EnumC0325g3.f14759n | EnumC0325g3.f14765t, bVar, 3));
    }

    @Override
    public final void forEach(LongConsumer longConsumer) {
        this.f14868a.b(u.a(longConsumer));
    }

    @Override
    public final void forEachOrdered(LongConsumer longConsumer) {
        this.f14868a.f(u.a(longConsumer));
    }

    @Override
    public final boolean isParallel() {
        return ((AbstractC0301c) this.f14868a).isParallel();
    }

    @Override
    public final Iterator<Long> iterator2() {
        return C0414v.a(W.h(((AbstractC0385t0) this.f14868a).spliterator()));
    }

    @Override
    public final LongStream limit(long j10) {
        AbstractC0385t0 t0Var = (AbstractC0385t0) this.f14868a;
        Objects.requireNonNull(t0Var);
        if (j10 >= 0) {
            return i(E0.n0(t0Var, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override
    public final LongStream map(LongUnaryOperator longUnaryOperator) {
        return i(((AbstractC0385t0) this.f14868a).R0(longUnaryOperator == null ? null : new C0274b(longUnaryOperator)));
    }

    @Override
    public final DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        AbstractC0393v0 v0Var = this.f14868a;
        C0274b bVar = longToDoubleFunction == null ? null : new C0274b(longToDoubleFunction);
        AbstractC0385t0 t0Var = (AbstractC0385t0) v0Var;
        Objects.requireNonNull(t0Var);
        Objects.requireNonNull(bVar);
        return H.i(new C0404y(t0Var, 3, EnumC0325g3.f14761p | EnumC0325g3.f14759n, bVar, 5));
    }

    @Override
    public final IntStream mapToInt(LongToIntFunction longToIntFunction) {
        AbstractC0393v0 v0Var = this.f14868a;
        C0274b bVar = longToIntFunction == null ? null : new C0274b(longToIntFunction);
        AbstractC0385t0 t0Var = (AbstractC0385t0) v0Var;
        Objects.requireNonNull(t0Var);
        Objects.requireNonNull(bVar);
        return C0347l0.i(new A(t0Var, 3, EnumC0325g3.f14761p | EnumC0325g3.f14759n, bVar, 5));
    }

    @Override
    public final Stream mapToObj(LongFunction longFunction) {
        return C0305c3.i(((AbstractC0385t0) this.f14868a).S0(longFunction == null ? null : new C0274b(longFunction)));
    }

    @Override
    public final OptionalLong max() {
        return AbstractC0283k.d(((AbstractC0385t0) this.f14868a).U0(C0346l.f14799j));
    }

    @Override
    public final OptionalLong min() {
        return AbstractC0283k.d(((AbstractC0385t0) this.f14868a).U0(C0351m.f14815g));
    }

    @Override
    public final boolean noneMatch(LongPredicate longPredicate) {
        AbstractC0393v0 v0Var = this.f14868a;
        x q10 = C0274b.q(longPredicate);
        AbstractC0385t0 t0Var = (AbstractC0385t0) v0Var;
        Objects.requireNonNull(t0Var);
        return ((Boolean) t0Var.x0(E0.o0(q10, B0.NONE))).booleanValue();
    }

    @Override
    public final LongStream onClose(Runnable runnable) {
        AbstractC0301c cVar = (AbstractC0301c) this.f14868a;
        cVar.E0(runnable);
        return C0321g.i(cVar);
    }

    @Override
    public final LongStream peek(LongConsumer longConsumer) {
        AbstractC0393v0 v0Var = this.f14868a;
        v a10 = u.a(longConsumer);
        AbstractC0385t0 t0Var = (AbstractC0385t0) v0Var;
        Objects.requireNonNull(t0Var);
        Objects.requireNonNull(a10);
        return i(new B(t0Var, 3, 0, a10, 5));
    }

    @Override
    public final long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return ((AbstractC0385t0) this.f14868a).T0(j10, longBinaryOperator == null ? null : new C0274b(longBinaryOperator));
    }

    @Override
    public final LongStream skip(long j10) {
        AbstractC0385t0 t0Var = (AbstractC0385t0) this.f14868a;
        Objects.requireNonNull(t0Var);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        AbstractC0385t0 t0Var2 = t0Var;
        if (i10 >= 0) {
            if (i10 != 0) {
                t0Var2 = E0.n0(t0Var, j10, -1L);
            }
            return i(t0Var2);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override
    public final LongStream sorted() {
        AbstractC0385t0 t0Var = (AbstractC0385t0) this.f14868a;
        Objects.requireNonNull(t0Var);
        return i(new L2(t0Var));
    }

    @Override
    public final long sum() {
        return ((AbstractC0385t0) this.f14868a).sum();
    }

    @Override
    public final LongSummaryStatistics summaryStatistics() {
        C0281i iVar = (C0281i) ((AbstractC0385t0) this.f14868a).Q0(C0351m.f14809a, C0291a.f14681n, K.f14556b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override
    public final long[] toArray() {
        return (long[]) E0.c0((O0) ((AbstractC0385t0) this.f14868a).y0(C0388u.f14867c)).m();
    }

    @Override
    public final LongStream unordered() {
        return C0321g.i(((AbstractC0385t0) this.f14868a).unordered());
    }

    @Override
    public final OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC0283k.d(((AbstractC0385t0) this.f14868a).U0(longBinaryOperator == null ? null : new C0274b(longBinaryOperator)));
    }
}
