package p126j$.util;

import java.util.Iterator;
import java.util.Objects;

public abstract class AbstractC5482V {
    private static final AbstractC5468G f17967a = new C5478Q();
    private static final AbstractC5462A f17968b = new C5476O();
    private static final AbstractC5464C f17969c = new C5477P();
    private static final AbstractC5811y f17970d = new C5475N();

    private static void m22599a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
        } else if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2);
        } else if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
    }

    public static AbstractC5811y m22598b() {
        return f17970d;
    }

    public static AbstractC5462A m22597c() {
        return f17968b;
    }

    public static AbstractC5464C m22596d() {
        return f17969c;
    }

    public static AbstractC5468G m22595e() {
        return f17967a;
    }

    public static AbstractC5552p m22594f(AbstractC5811y yVar) {
        Objects.requireNonNull(yVar);
        return new C5472K(yVar);
    }

    public static AbstractC5555s m22593g(AbstractC5462A a) {
        Objects.requireNonNull(a);
        return new C5470I(a);
    }

    public static AbstractC5808v m22592h(AbstractC5464C c) {
        Objects.requireNonNull(c);
        return new C5471J(c);
    }

    public static Iterator m22591i(AbstractC5468G g) {
        Objects.requireNonNull(g);
        return new C5469H(g);
    }

    public static AbstractC5811y m22590j(double[] dArr, int i, int i2, int i3) {
        Objects.requireNonNull(dArr);
        m22599a(dArr.length, i, i2);
        return new C5474M(dArr, i, i2, i3);
    }

    public static AbstractC5462A m22589k(int[] iArr, int i, int i2, int i3) {
        Objects.requireNonNull(iArr);
        m22599a(iArr.length, i, i2);
        return new C5479S(iArr, i, i2, i3);
    }

    public static AbstractC5464C m22588l(long[] jArr, int i, int i2, int i3) {
        Objects.requireNonNull(jArr);
        m22599a(jArr.length, i, i2);
        return new C5481U(jArr, i, i2, i3);
    }

    public static AbstractC5468G m22587m(Object[] objArr, int i, int i2, int i3) {
        Objects.requireNonNull(objArr);
        m22599a(objArr.length, i, i2);
        return new C5473L(objArr, i, i2, i3);
    }
}
