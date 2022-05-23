package ib;

import ta.b;
import va.c;
import xa.k;
import xa.l;

public final class h {
    public static final float a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0.0f;
        }
        return Math.max(i10, i11) / Math.min(i10, i11);
    }

    public static final double b(double d10) {
        return f(d10, 0.0d, 0.0d, 6, null);
    }

    public static final double c(double d10, double d11, double d12) {
        return ((Number) l.g(Double.valueOf(d10), k.b(d11, d12))).doubleValue();
    }

    public static final float d(float f10) {
        return g(f10, 0.0f, 0.0f, 6, null);
    }

    public static final float e(float f10, float f11, float f12) {
        return ((Number) l.g(Float.valueOf(f10), k.c(f11, f12))).floatValue();
    }

    public static double f(double d10, double d11, double d12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d11 = 0.0d;
        }
        double d13 = d11;
        if ((i10 & 4) != 0) {
            d12 = 1.0d;
        }
        return c(d10, d13, d12);
    }

    public static float g(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        return e(f10, f11, f12);
    }

    public static final float h(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    public static final float i(float f10, float f11, float f12) {
        return !((f10 > f11 ? 1 : (f10 == f11 ? 0 : -1)) == 0) ? f10 + ((f11 - f10) * f12) : f10;
    }

    public static final int j(int i10, int i11, float f10) {
        return b.a(i(i10, i11, f10));
    }

    public static final float k(float f10, float f11) {
        return f10 >= 0.0f ? f10 % f11 : f11 - ((-f10) % f11);
    }

    public static final int l(int i10, int i11) {
        return i10 >= 0 ? i10 % i11 : i11 - ((-i10) % i11);
    }

    public static final int m(int i10, String str) {
        ra.k.e(str, "basedOn");
        int length = str.length();
        long j10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            j10 += str.codePointAt(i11);
        }
        return (int) (j10 % i10);
    }

    public static final int n(int i10, int i11) {
        return i10 + ((int) Math.rint(c.f24807a.b() * (i11 - i10)));
    }

    public static final double o(double d10) {
        return Math.rint(d10 * 1000000.0d) / 1000000.0d;
    }
}
