package j$.util.stream;

import j$.util.AbstractC0283k;
import j$.util.C0282j;
import j$.util.G;
import j$.util.function.AbstractC0275c;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0273a;
import j$.util.function.C0274b;
import j$.util.function.Consumer;
import j$.util.function.E;
import j$.util.function.F;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.function.o;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class C0305c3 implements Stream {
    final AbstractC0310d3 f14725a;

    private C0305c3(AbstractC0310d3 d3Var) {
        this.f14725a = d3Var;
    }

    public static Stream i(AbstractC0310d3 d3Var) {
        return new C0305c3(d3Var);
    }

    @Override
    public final boolean allMatch(Predicate predicate) {
        AbstractC0310d3 d3Var = this.f14725a;
        E u10 = C0274b.u(predicate);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        return ((Boolean) j2Var.x0(E0.r0(u10, B0.ALL))).booleanValue();
    }

    @Override
    public final boolean anyMatch(Predicate predicate) {
        AbstractC0310d3 d3Var = this.f14725a;
        E u10 = C0274b.u(predicate);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        return ((Boolean) j2Var.x0(E0.r0(u10, B0.ANY))).booleanValue();
    }

    @Override
    public final void close() {
        ((AbstractC0301c) this.f14725a).close();
    }

    @Override
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        AbstractC0310d3 d3Var = this.f14725a;
        F w10 = C0274b.w(supplier);
        j$.util.function.BiConsumer convert = BiConsumer.VivifiedWrapper.convert(biConsumer);
        j$.util.function.BiConsumer convert2 = BiConsumer.VivifiedWrapper.convert(biConsumer2);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        return j2Var.x0(E0.s0(w10, convert, convert2));
    }

    @Override
    public final long count() {
        return ((AbstractC0385t0) ((AbstractC0339j2) this.f14725a).R0(C0346l.f14802m)).sum();
    }

    @Override
    public final Stream distinct() {
        return i(((AbstractC0339j2) this.f14725a).O0());
    }

    @Override
    public final Stream filter(Predicate predicate) {
        AbstractC0310d3 d3Var = this.f14725a;
        E u10 = C0274b.u(predicate);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(u10);
        return new C0305c3(new C0408z(j2Var, 1, EnumC0325g3.f14765t, u10, 4));
    }

    @Override
    public final Optional findAny() {
        AbstractC0339j2 j2Var = (AbstractC0339j2) this.f14725a;
        Objects.requireNonNull(j2Var);
        return AbstractC0283k.a((C0282j) j2Var.x0(new N(false, 1, C0282j.a(), C0291a.f14676i, M.f14573a)));
    }

    @Override
    public final Optional findFirst() {
        AbstractC0339j2 j2Var = (AbstractC0339j2) this.f14725a;
        Objects.requireNonNull(j2Var);
        return AbstractC0283k.a((C0282j) j2Var.x0(new N(true, 1, C0282j.a(), C0291a.f14676i, M.f14573a)));
    }

    @Override
    public final Stream flatMap(Function function) {
        AbstractC0310d3 d3Var = this.f14725a;
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(convert);
        return new C0305c3(new C0319f2(j2Var, 1, EnumC0325g3.f14761p | EnumC0325g3.f14759n | EnumC0325g3.f14765t, convert, 1));
    }

    @Override
    public final DoubleStream flatMapToDouble(java.util.function.Function function) {
        AbstractC0310d3 d3Var = this.f14725a;
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(convert);
        return H.i(new C0404y(j2Var, 1, EnumC0325g3.f14761p | EnumC0325g3.f14759n | EnumC0325g3.f14765t, convert, 7));
    }

    @Override
    public final IntStream flatMapToInt(java.util.function.Function function) {
        AbstractC0310d3 d3Var = this.f14725a;
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(convert);
        return C0347l0.i(new A(j2Var, 1, EnumC0325g3.f14761p | EnumC0325g3.f14759n | EnumC0325g3.f14765t, convert, 7));
    }

    @Override
    public final LongStream flatMapToLong(java.util.function.Function function) {
        AbstractC0310d3 d3Var = this.f14725a;
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(convert);
        return C0389u0.i(new B(j2Var, 1, EnumC0325g3.f14761p | EnumC0325g3.f14759n | EnumC0325g3.f14765t, convert, 6));
    }

    @Override
    public final void forEach(Consumer consumer) {
        this.f14725a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final void forEachOrdered(java.util.function.Consumer consumer) {
        this.f14725a.c(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final boolean isParallel() {
        return ((AbstractC0301c) this.f14725a).isParallel();
    }

    @Override
    public final Iterator iterator() {
        return ((AbstractC0339j2) this.f14725a).iterator();
    }

    @Override
    public final Stream limit(long j10) {
        AbstractC0339j2 j2Var = (AbstractC0339j2) this.f14725a;
        Objects.requireNonNull(j2Var);
        if (j10 >= 0) {
            return i(E0.q0(j2Var, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override
    public final Stream map(java.util.function.Function function) {
        AbstractC0310d3 d3Var = this.f14725a;
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(convert);
        return new C0305c3(new C0319f2(j2Var, 1, EnumC0325g3.f14761p | EnumC0325g3.f14759n, convert, 0));
    }

    @Override
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return H.i(((AbstractC0339j2) this.f14725a).P0(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction)));
    }

    @Override
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        return C0347l0.i(((AbstractC0339j2) this.f14725a).Q0(ToIntFunction.VivifiedWrapper.convert(toIntFunction)));
    }

    @Override
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        return C0389u0.i(((AbstractC0339j2) this.f14725a).R0(ToLongFunction.VivifiedWrapper.convert(toLongFunction)));
    }

    @Override
    public final Optional max(Comparator comparator) {
        AbstractC0339j2 j2Var = (AbstractC0339j2) this.f14725a;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(comparator);
        return AbstractC0283k.a(j2Var.S0(new C0273a(comparator, 0)));
    }

    @Override
    public final Optional min(Comparator comparator) {
        AbstractC0339j2 j2Var = (AbstractC0339j2) this.f14725a;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(comparator);
        return AbstractC0283k.a(j2Var.S0(new C0273a(comparator, 1)));
    }

    @Override
    public final boolean noneMatch(Predicate predicate) {
        AbstractC0310d3 d3Var = this.f14725a;
        E u10 = C0274b.u(predicate);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        return ((Boolean) j2Var.x0(E0.r0(u10, B0.NONE))).booleanValue();
    }

    @Override
    public final BaseStream onClose(Runnable runnable) {
        AbstractC0301c cVar = (AbstractC0301c) this.f14725a;
        cVar.E0(runnable);
        return C0321g.i(cVar);
    }

    @Override
    public final BaseStream parallel() {
        AbstractC0301c cVar = (AbstractC0301c) this.f14725a;
        cVar.J0();
        return C0321g.i(cVar);
    }

    @Override
    public final Stream peek(java.util.function.Consumer consumer) {
        AbstractC0310d3 d3Var = this.f14725a;
        j$.util.function.Consumer convert = Consumer.VivifiedWrapper.convert(consumer);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(convert);
        return new C0305c3(new C0408z(j2Var, 1, 0, convert, 3));
    }

    @Override
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        AbstractC0310d3 d3Var = this.f14725a;
        j$.util.function.BiFunction convert = BiFunction.VivifiedWrapper.convert(biFunction);
        AbstractC0275c h10 = C0274b.h(binaryOperator);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(convert);
        Objects.requireNonNull(h10);
        return j2Var.x0(new G1(1, h10, convert, obj, 2));
    }

    @Override
    public final Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC0283k.a(((AbstractC0339j2) this.f14725a).S0(C0274b.h(binaryOperator)));
    }

    @Override
    public final BaseStream sequential() {
        AbstractC0301c cVar = (AbstractC0301c) this.f14725a;
        cVar.K0();
        return C0321g.i(cVar);
    }

    @Override
    public final Stream skip(long j10) {
        AbstractC0339j2 j2Var = (AbstractC0339j2) this.f14725a;
        Objects.requireNonNull(j2Var);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        AbstractC0339j2 j2Var2 = j2Var;
        if (i10 >= 0) {
            if (i10 != 0) {
                j2Var2 = E0.q0(j2Var, j10, -1L);
            }
            return i(j2Var2);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override
    public final Stream sorted() {
        AbstractC0339j2 j2Var = (AbstractC0339j2) this.f14725a;
        Objects.requireNonNull(j2Var);
        return i(new M2(j2Var));
    }

    @Override
    public final Spliterator spliterator() {
        return G.a(((AbstractC0301c) this.f14725a).spliterator());
    }

    @Override
    public final Object[] toArray() {
        J j10 = J.f14549c;
        return E0.Z(((AbstractC0339j2) this.f14725a).y0(j10), j10).v(j10);
    }

    @Override
    public final BaseStream unordered() {
        return C0321g.i(((AbstractC0339j2) this.f14725a).unordered());
    }

    @Override
    public final java.lang.Object collect(java.util.stream.Collector r9) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0305c3.collect(java.util.stream.Collector):java.lang.Object");
    }

    @Override
    public final Stream sorted(Comparator comparator) {
        AbstractC0339j2 j2Var = (AbstractC0339j2) this.f14725a;
        Objects.requireNonNull(j2Var);
        return i(new M2(j2Var, comparator));
    }

    @Override
    public final Object[] toArray(IntFunction intFunction) {
        AbstractC0310d3 d3Var = this.f14725a;
        o l10 = C0274b.l(intFunction);
        return E0.Z(((AbstractC0339j2) d3Var).y0(l10), l10).v(l10);
    }

    @Override
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        AbstractC0310d3 d3Var = this.f14725a;
        AbstractC0275c h10 = C0274b.h(binaryOperator);
        AbstractC0339j2 j2Var = (AbstractC0339j2) d3Var;
        Objects.requireNonNull(j2Var);
        Objects.requireNonNull(h10);
        return j2Var.x0(new G1(1, h10, h10, obj, 2));
    }
}
