package p108hb;

public final class C5063c {
    public static boolean m24145a(int i, int i2, int i3) {
        if (i2 == i3) {
            return false;
        }
        int j = m24136j(i2);
        int k = m24135k(i2);
        int l = m24134l(i2);
        int j2 = m24136j(i3);
        int k2 = m24135k(i3);
        int l2 = m24134l(i3);
        int j3 = m24136j(i);
        int k3 = m24135k(i);
        int l3 = m24134l(i);
        if (j3 == j && k3 == k && l3 == l) {
            return true;
        }
        if (j3 == j2 && k3 == k2 && l3 == l2) {
            return false;
        }
        return m24141e(j, j2) ? m24141e(i, i2) || m24141e(i3, i) : m24141e(i, i2) && m24141e(i3, i);
    }

    public static boolean m24144b(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean m24143c(long j, long j2) {
        return (j & j2) != 0;
    }

    public static int m24142d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean m24141e(int i, int i2) {
        return i > i2;
    }

    public static long m24140f(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static int m24139g(int i, int i2, int i3) {
        return ((i & 255) << 16) | ((i2 & 255) << 8) | (i3 & 255);
    }

    public static int m24138h(int i, int i2, boolean z) {
        return z ? i | i2 : i & (~i2);
    }

    public static long m24137i(long j, long j2, boolean z) {
        return z ? j | j2 : j & (~j2);
    }

    public static int m24136j(int i) {
        return (i >> 16) & 255;
    }

    public static int m24135k(int i) {
        return (i >> 8) & 255;
    }

    public static int m24134l(int i) {
        return i & 255;
    }

    public static int m24133m(long j) {
        return (int) (j >> 32);
    }

    public static int m24132n(long j) {
        return (int) j;
    }
}
