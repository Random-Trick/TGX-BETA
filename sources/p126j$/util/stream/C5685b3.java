package p126j$.util.stream;

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
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p126j$.util.AbstractC5485a;
import p126j$.util.C5467F;
import p126j$.util.C5546j;
import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.BiFunction;
import p126j$.util.function.C5519a;
import p126j$.util.function.C5520b;
import p126j$.util.function.Consumer;
import p126j$.util.function.Function;
import p126j$.util.function.ToDoubleFunction;
import p126j$.util.function.ToIntFunction;
import p126j$.util.function.ToLongFunction;

public final class C5685b3 implements Stream {
    final AbstractC5690c3 f18318a;

    private C5685b3(AbstractC5690c3 c3Var) {
        this.f18318a = c3Var;
    }

    public static Stream m22312i(AbstractC5690c3 c3Var) {
        return new C5685b3(c3Var);
    }

    @Override
    public boolean allMatch(Predicate predicate) {
        AbstractC5690c3 c3Var = this.f18318a;
        AbstractC5541w v = C5520b.m22486v(predicate);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        return ((Boolean) i2Var.m22297t0(AbstractC5572D0.m22413m0(v, EnumC5557A0.ALL))).booleanValue();
    }

    @Override
    public boolean anyMatch(Predicate predicate) {
        AbstractC5690c3 c3Var = this.f18318a;
        AbstractC5541w v = C5520b.m22486v(predicate);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        return ((Boolean) i2Var.m22297t0(AbstractC5572D0.m22413m0(v, EnumC5557A0.ANY))).booleanValue();
    }

    @Override
    public void close() {
        ((AbstractC5686c) this.f18318a).close();
    }

    @Override
    public Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        AbstractC5690c3 c3Var = this.f18318a;
        AbstractC5542x B = C5520b.m22501B(supplier);
        p126j$.util.function.BiConsumer convert = BiConsumer.VivifiedWrapper.convert(biConsumer);
        p126j$.util.function.BiConsumer convert2 = BiConsumer.VivifiedWrapper.convert(biConsumer2);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        return i2Var.m22297t0(AbstractC5572D0.m22411n0(B, convert, convert2));
    }

    @Override
    public long count() {
        return ((AbstractC5767s0) ((AbstractC5719i2) this.f18318a).m22246N0(C5726k.f18408m)).sum();
    }

    @Override
    public Stream distinct() {
        return m22312i(((AbstractC5719i2) this.f18318a).m22249K0());
    }

    @Override
    public Stream filter(Predicate predicate) {
        AbstractC5690c3 c3Var = this.f18318a;
        AbstractC5541w v = C5520b.m22486v(predicate);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(v);
        return new C5685b3(new C5796y(i2Var, i2Var, 1, EnumC5705f3.f18370t, v, 4));
    }

    @Override
    public Optional findAny() {
        AbstractC5719i2 i2Var = (AbstractC5719i2) this.f18318a;
        Objects.requireNonNull(i2Var);
        return AbstractC5485a.m22558w((C5546j) i2Var.m22297t0(new C5616M(false, 1, C5546j.m22477a(), C5676a.f18292i, C5611L.f18178a)));
    }

    @Override
    public Optional findFirst() {
        AbstractC5719i2 i2Var = (AbstractC5719i2) this.f18318a;
        Objects.requireNonNull(i2Var);
        return AbstractC5485a.m22558w((C5546j) i2Var.m22297t0(new C5616M(true, 1, C5546j.m22477a(), C5676a.f18292i, C5611L.f18178a)));
    }

    @Override
    public Stream flatMap(Function function) {
        AbstractC5690c3 c3Var = this.f18318a;
        p126j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(convert);
        return new C5685b3(new C5699e2(i2Var, i2Var, 1, EnumC5705f3.f18366p | EnumC5705f3.f18364n | EnumC5705f3.f18370t, convert, 1));
    }

    @Override
    public DoubleStream flatMapToDouble(java.util.function.Function function) {
        AbstractC5690c3 c3Var = this.f18318a;
        p126j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(convert);
        return C5586G.m22387i(new C5791x(i2Var, i2Var, 1, EnumC5705f3.f18366p | EnumC5705f3.f18364n | EnumC5705f3.f18370t, convert, 7));
    }

    @Override
    public IntStream flatMapToInt(java.util.function.Function function) {
        AbstractC5690c3 c3Var = this.f18318a;
        p126j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(convert);
        return C5727k0.m22228i(new C5801z(i2Var, i2Var, 1, EnumC5705f3.f18366p | EnumC5705f3.f18364n | EnumC5705f3.f18370t, convert, 7));
    }

    @Override
    public LongStream flatMapToLong(java.util.function.Function function) {
        AbstractC5690c3 c3Var = this.f18318a;
        p126j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(convert);
        return C5772t0.m22177i(new C5556A(i2Var, i2Var, 1, EnumC5705f3.f18366p | EnumC5705f3.f18364n | EnumC5705f3.f18370t, convert, 6));
    }

    @Override
    public void forEach(Consumer consumer) {
        this.f18318a.mo22244a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public void forEachOrdered(java.util.function.Consumer consumer) {
        this.f18318a.mo22243c(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public boolean isParallel() {
        return ((AbstractC5686c) this.f18318a).isParallel();
    }

    @Override
    public Iterator iterator() {
        return ((AbstractC5719i2) this.f18318a).iterator();
    }

    @Override
    public Stream limit(long j) {
        AbstractC5719i2 i2Var = (AbstractC5719i2) this.f18318a;
        Objects.requireNonNull(i2Var);
        if (j >= 0) {
            return m22312i(AbstractC5572D0.m22415l0(i2Var, 0L, j));
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override
    public Stream map(java.util.function.Function function) {
        AbstractC5690c3 c3Var = this.f18318a;
        p126j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(convert);
        return new C5685b3(new C5699e2(i2Var, i2Var, 1, EnumC5705f3.f18366p | EnumC5705f3.f18364n, convert, 0));
    }

    @Override
    public DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C5586G.m22387i(((AbstractC5719i2) this.f18318a).m22248L0(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction)));
    }

    @Override
    public IntStream mapToInt(ToIntFunction toIntFunction) {
        return C5727k0.m22228i(((AbstractC5719i2) this.f18318a).m22247M0(ToIntFunction.VivifiedWrapper.convert(toIntFunction)));
    }

    @Override
    public LongStream mapToLong(ToLongFunction toLongFunction) {
        return C5772t0.m22177i(((AbstractC5719i2) this.f18318a).m22246N0(ToLongFunction.VivifiedWrapper.convert(toLongFunction)));
    }

    @Override
    public Optional max(Comparator comparator) {
        AbstractC5719i2 i2Var = (AbstractC5719i2) this.f18318a;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(comparator);
        return AbstractC5485a.m22558w(i2Var.m22245O0(new C5519a(comparator, 0)));
    }

    @Override
    public Optional min(Comparator comparator) {
        AbstractC5719i2 i2Var = (AbstractC5719i2) this.f18318a;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(comparator);
        return AbstractC5485a.m22558w(i2Var.m22245O0(new C5519a(comparator, 1)));
    }

    @Override
    public boolean noneMatch(Predicate predicate) {
        AbstractC5690c3 c3Var = this.f18318a;
        AbstractC5541w v = C5520b.m22486v(predicate);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        return ((Boolean) i2Var.m22297t0(AbstractC5572D0.m22413m0(v, EnumC5557A0.NONE))).booleanValue();
    }

    @Override
    public BaseStream onClose(Runnable runnable) {
        AbstractC5686c cVar = (AbstractC5686c) this.f18318a;
        cVar.m22311A0(runnable);
        return C5706g.m22261i(cVar);
    }

    @Override
    public BaseStream parallel() {
        AbstractC5686c cVar = (AbstractC5686c) this.f18318a;
        cVar.m22310F0();
        return C5706g.m22261i(cVar);
    }

    @Override
    public Stream peek(java.util.function.Consumer consumer) {
        AbstractC5690c3 c3Var = this.f18318a;
        p126j$.util.function.Consumer convert = Consumer.VivifiedWrapper.convert(consumer);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        Objects.requireNonNull(convert);
        return new C5685b3(new C5796y(i2Var, i2Var, 1, 0, convert, 3));
    }

    @Override
    public Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        AbstractC5690c3 c3Var = this.f18318a;
        p126j$.util.function.BiFunction convert = BiFunction.VivifiedWrapper.convert(biFunction);
        AbstractC5521c p = C5520b.m22488p(binaryOperator);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        return i2Var.m22297t0(AbstractC5572D0.m22409o0(obj, convert, p));
    }

    @Override
    public Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC5485a.m22558w(((AbstractC5719i2) this.f18318a).m22245O0(C5520b.m22488p(binaryOperator)));
    }

    @Override
    public BaseStream sequential() {
        AbstractC5686c cVar = (AbstractC5686c) this.f18318a;
        cVar.m22309G0();
        return C5706g.m22261i(cVar);
    }

    @Override
    public Stream skip(long j) {
        AbstractC5719i2 i2Var = (AbstractC5719i2) this.f18318a;
        Objects.requireNonNull(i2Var);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        AbstractC5719i2 i2Var2 = i2Var;
        if (i >= 0) {
            if (i != 0) {
                i2Var2 = AbstractC5572D0.m22415l0(i2Var, j, -1L);
            }
            return m22312i(i2Var2);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override
    public Stream sorted() {
        AbstractC5719i2 i2Var = (AbstractC5719i2) this.f18318a;
        Objects.requireNonNull(i2Var);
        return m22312i(new C5614L2(i2Var));
    }

    @Override
    public Spliterator spliterator() {
        return C5467F.m22604a(((AbstractC5686c) this.f18318a).spliterator());
    }

    @Override
    public Object[] toArray() {
        C5596I i = C5596I.f18154c;
        return AbstractC5572D0.m22433U(((AbstractC5719i2) this.f18318a).m22296u0(i), i).mo22152p(i);
    }

    @Override
    public BaseStream unordered() {
        return C5706g.m22261i(((AbstractC5719i2) this.f18318a).unordered());
    }

    @Override
    public Object collect(Collector collector) {
        Object obj;
        AbstractC5690c3 c3Var = this.f18318a;
        C5721j b = C5721j.m22241b(collector);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        if (!i2Var.isParallel() || !b.m22242a().contains(EnumC5716i.CONCURRENT) || (i2Var.m22295y0() && !b.m22242a().contains(EnumC5716i.UNORDERED))) {
            Objects.requireNonNull(b);
            obj = i2Var.m22297t0(new C5628O1(1, C5520b.m22488p(b.f18392a.combiner()), BiConsumer.VivifiedWrapper.convert(b.f18392a.accumulator()), C5520b.m22501B(b.f18392a.supplier()), b));
        } else {
            obj = ((C5520b) C5520b.m22501B(b.f18392a.supplier())).get();
            i2Var.mo22244a(new C5741n(BiConsumer.VivifiedWrapper.convert(b.f18392a.accumulator()), obj, 5));
        }
        return b.m22242a().contains(EnumC5716i.IDENTITY_FINISH) ? obj : Function.VivifiedWrapper.convert(b.f18392a.finisher()).mo22502a(obj);
    }

    @Override
    public Object reduce(Object obj, BinaryOperator binaryOperator) {
        AbstractC5690c3 c3Var = this.f18318a;
        AbstractC5521c p = C5520b.m22488p(binaryOperator);
        AbstractC5719i2 i2Var = (AbstractC5719i2) c3Var;
        Objects.requireNonNull(i2Var);
        return i2Var.m22297t0(AbstractC5572D0.m22409o0(obj, p, p));
    }

    @Override
    public Stream sorted(Comparator comparator) {
        AbstractC5719i2 i2Var = (AbstractC5719i2) this.f18318a;
        Objects.requireNonNull(i2Var);
        return m22312i(new C5614L2(i2Var, comparator));
    }

    @Override
    public Object[] toArray(IntFunction intFunction) {
        AbstractC5690c3 c3Var = this.f18318a;
        AbstractC5531m t = C5520b.m22487t(intFunction);
        return AbstractC5572D0.m22433U(((AbstractC5719i2) c3Var).m22296u0(t), t).mo22152p(t);
    }
}
