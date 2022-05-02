package p126j$.util.function;

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

public final class C5520b implements AbstractC5521c, AbstractC5523e, AbstractC5526h, AbstractC5527i, AbstractC5528j, AbstractC5531m, AbstractC5532n, AbstractC5533o, AbstractC5536r, AbstractC5537s, AbstractC5538t, AbstractC5539u, AbstractC5540v, AbstractC5541w, AbstractC5542x {
    final Object f18070a;

    public C5520b(Object obj) {
        this.f18070a = obj;
    }

    public static AbstractC5542x m22502B(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return new C5520b(supplier);
    }

    public static C5520b m22492h(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C5520b(doublePredicate);
    }

    public static C5520b m22491j(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new C5520b(intPredicate);
    }

    public static C5520b m22490k(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new C5520b(longPredicate);
    }

    public static AbstractC5521c m22489p(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return new C5520b(binaryOperator);
    }

    public static AbstractC5531m m22488t(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return new C5520b(intFunction);
    }

    public static AbstractC5541w m22487v(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return new C5520b(predicate);
    }

    @Override
    public long mo22328A(int i) {
        return ((IntToLongFunction) this.f18070a).applyAsLong(i);
    }

    public boolean m22501C(double d) {
        return ((DoublePredicate) this.f18070a).test(d);
    }

    public boolean m22500D(int i) {
        return ((IntPredicate) this.f18070a).test(i);
    }

    public boolean m22499E(long j) {
        return ((LongPredicate) this.f18070a).test(j);
    }

    @Override
    public void mo22225a(Object obj, double d) {
        ((ObjDoubleConsumer) this.f18070a).accept(obj, d);
    }

    public double m22498b(double d) {
        return ((DoubleUnaryOperator) this.f18070a).applyAsDouble(d);
    }

    public double m22497c(int i) {
        return ((IntToDoubleFunction) this.f18070a).applyAsDouble(i);
    }

    public double m22496d(long j) {
        return ((LongToDoubleFunction) this.f18070a).applyAsDouble(j);
    }

    public int m22495e(double d) {
        return ((DoubleToIntFunction) this.f18070a).applyAsInt(d);
    }

    public int m22494f(int i) {
        return ((IntUnaryOperator) this.f18070a).applyAsInt(i);
    }

    public int m22493g(long j) {
        return ((LongToIntFunction) this.f18070a).applyAsInt(j);
    }

    @Override
    public Object get() {
        return ((Supplier) this.f18070a).get();
    }

    @Override
    public int mo22224i(int i, int i2) {
        return ((IntBinaryOperator) this.f18070a).applyAsInt(i, i2);
    }

    @Override
    public long mo22223l(long j, long j2) {
        return ((LongBinaryOperator) this.f18070a).applyAsLong(j, j2);
    }

    @Override
    public double mo22232m(double d, double d2) {
        return ((DoubleBinaryOperator) this.f18070a).applyAsDouble(d, d2);
    }

    @Override
    public boolean mo22211n(Object obj) {
        return ((Predicate) this.f18070a).test(obj);
    }

    @Override
    public void mo22231o(Object obj, int i) {
        ((ObjIntConsumer) this.f18070a).accept(obj, i);
    }

    @Override
    public void mo22230q(Object obj, long j) {
        ((ObjLongConsumer) this.f18070a).accept(obj, j);
    }

    @Override
    public long mo22326r(double d) {
        return ((DoubleToLongFunction) this.f18070a).applyAsLong(d);
    }

    @Override
    public Object mo22173u(Object obj, Object obj2) {
        return ((BinaryOperator) this.f18070a).apply(obj, obj2);
    }

    @Override
    public Object mo22179w(int i) {
        return ((IntFunction) this.f18070a).apply(i);
    }

    @Override
    public Object mo22210x(long j) {
        return ((LongFunction) this.f18070a).apply(j);
    }

    @Override
    public long mo22324y(long j) {
        return ((LongUnaryOperator) this.f18070a).applyAsLong(j);
    }

    @Override
    public Object mo22323z(double d) {
        return ((DoubleFunction) this.f18070a).apply(d);
    }
}
