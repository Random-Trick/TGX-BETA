package p108hb;

import p317wa.C10029k;
import p317wa.C10030l;
import qa.C8298k;
import sa.C8710b;
import ua.AbstractC9486c;

public final class C5069h {
    public static final float m24092a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0f;
        }
        return Math.max(i, i2) / Math.min(i, i2);
    }

    public static final double m24091b(double d) {
        return m24087f(d, 0.0d, 0.0d, 6, null);
    }

    public static final double m24090c(double d, double d2, double d3) {
        return ((Number) C10030l.m6190g(Double.valueOf(d), C10029k.m6195b(d2, d3))).doubleValue();
    }

    public static final float m24089d(float f) {
        return m24086g(f, 0.0f, 0.0f, 6, null);
    }

    public static final float m24088e(float f, float f2, float f3) {
        return ((Number) C10030l.m6190g(Float.valueOf(f), C10029k.m6194c(f2, f3))).floatValue();
    }

    public static double m24087f(double d, double d2, double d3, int i, Object obj) {
        if ((i & 2) != 0) {
            d2 = 0.0d;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            d3 = 1.0d;
        }
        return m24090c(d, d4, d3);
    }

    public static float m24086g(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        return m24088e(f, f2, f3);
    }

    public static final float m24085h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public static final float m24084i(float f, float f2, float f3) {
        return !((f > f2 ? 1 : (f == f2 ? 0 : -1)) == 0) ? f + ((f2 - f) * f3) : f;
    }

    public static final int m24083j(int i, int i2, float f) {
        return C8710b.m11703a(m24084i(i, i2, f));
    }

    public static final float m24082k(float f, float f2) {
        return f >= 0.0f ? f % f2 : f2 - ((-f) % f2);
    }

    public static final int m24081l(int i, int i2) {
        return i >= 0 ? i % i2 : i2 - ((-i) % i2);
    }

    public static final int m24080m(int i, String str) {
        C8298k.m12934e(str, "basedOn");
        int length = str.length();
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            i2++;
            j += str.codePointAt(i2);
        }
        return (int) (j % i);
    }

    public static final int m24079n(int i, int i2) {
        return i + ((int) Math.rint(AbstractC9486c.f30717a.mo8552b() * (i2 - i)));
    }

    public static final double m24078o(double d) {
        return Math.rint(d * 1000000.0d) / 1000000.0d;
    }
}
