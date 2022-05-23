package j$.util;

import java.util.Iterator;
import java.util.Objects;

public abstract class W {
    private static final H f14355a = new S();
    private static final B f14356b = new P();
    private static final D f14357c = new Q();
    private static final z f14358d = new O();

    private static void a(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
        } else if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(i11);
        } else if (i12 > i10) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
    }

    public static z b() {
        return f14358d;
    }

    public static B c() {
        return f14356b;
    }

    public static D d() {
        return f14357c;
    }

    public static H e() {
        return f14355a;
    }

    public static AbstractC0289q f(z zVar) {
        Objects.requireNonNull(zVar);
        return new L(zVar);
    }

    public static AbstractC0412t g(B b10) {
        Objects.requireNonNull(b10);
        return new J(b10);
    }

    public static AbstractC0415w h(D d10) {
        Objects.requireNonNull(d10);
        return new K(d10);
    }

    public static Iterator i(H h10) {
        Objects.requireNonNull(h10);
        return new I(h10);
    }

    public static z j(double[] dArr, int i10, int i11) {
        Objects.requireNonNull(dArr);
        a(dArr.length, i10, i11);
        return new N(dArr, i10, i11, 1040);
    }

    public static B k(int[] iArr, int i10, int i11) {
        Objects.requireNonNull(iArr);
        a(iArr.length, i10, i11);
        return new T(iArr, i10, i11, 1040);
    }

    public static D l(long[] jArr, int i10, int i11) {
        Objects.requireNonNull(jArr);
        a(jArr.length, i10, i11);
        return new V(jArr, i10, i11, 1040);
    }

    public static H m(Object[] objArr, int i10, int i11) {
        Objects.requireNonNull(objArr);
        a(objArr.length, i10, i11);
        return new M(objArr, i10, i11, 1040);
    }
}
