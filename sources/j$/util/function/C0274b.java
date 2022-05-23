package j$.util.function;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class C0274b implements AbstractC0275c, AbstractC0276d, g, h, i, j, k, l, o, p, q, r, s, t, w, x, y, z, A, B, C, D, E, F {
    final Object f14458a;

    public C0274b(Object obj) {
        this.f14458a = obj;
    }

    public static AbstractC0275c h(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return new C0274b(binaryOperator);
    }

    public static h k(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C0274b(doublePredicate);
    }

    public static o l(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return new C0274b(intFunction);
    }

    public static p p(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new C0274b(intPredicate);
    }

    public static x q(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new C0274b(longPredicate);
    }

    public static E u(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return new C0274b(predicate);
    }

    public static F w(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return new C0274b(supplier);
    }

    @Override
    public final Object A(long j10) {
        return ((LongFunction) this.f14458a).apply(j10);
    }

    @Override
    public final long B(long j10) {
        return ((LongUnaryOperator) this.f14458a).applyAsLong(j10);
    }

    @Override
    public final Object C(double d10) {
        return ((DoubleFunction) this.f14458a).apply(d10);
    }

    @Override
    public final long D(int i10) {
        return ((IntToLongFunction) this.f14458a).applyAsLong(i10);
    }

    public final boolean E(long j10) {
        return ((LongPredicate) this.f14458a).test(j10);
    }

    @Override
    public final void a(Object obj, double d10) {
        ((ObjDoubleConsumer) this.f14458a).accept(obj, d10);
    }

    public final double b(double d10) {
        return ((DoubleUnaryOperator) this.f14458a).applyAsDouble(d10);
    }

    public final double c(int i10) {
        return ((IntToDoubleFunction) this.f14458a).applyAsDouble(i10);
    }

    public final double d(long j10) {
        return ((LongToDoubleFunction) this.f14458a).applyAsDouble(j10);
    }

    public final int e(double d10) {
        return ((DoubleToIntFunction) this.f14458a).applyAsInt(d10);
    }

    public final int f(int i10) {
        return ((IntUnaryOperator) this.f14458a).applyAsInt(i10);
    }

    public final int g(long j10) {
        return ((LongToIntFunction) this.f14458a).applyAsInt(j10);
    }

    @Override
    public final Object get() {
        return ((Supplier) this.f14458a).get();
    }

    @Override
    public final int i(int i10, int i11) {
        return ((IntBinaryOperator) this.f14458a).applyAsInt(i10, i11);
    }

    @Override
    public final long j(long j10, long j11) {
        return ((LongBinaryOperator) this.f14458a).applyAsLong(j10, j11);
    }

    @Override
    public final double m(double d10, double d11) {
        return ((DoubleBinaryOperator) this.f14458a).applyAsDouble(d10, d11);
    }

    @Override
    public final boolean n(Object obj) {
        return ((Predicate) this.f14458a).test(obj);
    }

    @Override
    public final void o(Object obj, int i10) {
        ((ObjIntConsumer) this.f14458a).accept(obj, i10);
    }

    @Override
    public final void r(Object obj, long j10) {
        ((ObjLongConsumer) this.f14458a).accept(obj, j10);
    }

    @Override
    public final long s(double d10) {
        return ((DoubleToLongFunction) this.f14458a).applyAsLong(d10);
    }

    @Override
    public final Object v(Object obj, Object obj2) {
        return ((BinaryOperator) this.f14458a).apply(obj, obj2);
    }

    public final boolean x(double d10) {
        return ((DoublePredicate) this.f14458a).test(d10);
    }

    public final boolean y(int i10) {
        return ((IntPredicate) this.f14458a).test(i10);
    }

    @Override
    public final Object z(int i10) {
        return ((IntFunction) this.f14458a).apply(i10);
    }
}
