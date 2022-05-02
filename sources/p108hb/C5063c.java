package p108hb;

public final class C5063c {
    public static boolean m24146a(int i, int i2, int i3) {
        if (i2 == i3) {
            return false;
        }
        int j = m24137j(i2);
        int k = m24136k(i2);
        int l = m24135l(i2);
        int j2 = m24137j(i3);
        int k2 = m24136k(i3);
        int l2 = m24135l(i3);
        int j3 = m24137j(i);
        int k3 = m24136k(i);
        int l3 = m24135l(i);
        if (j3 == j && k3 == k && l3 == l) {
            return true;
        }
        if (j3 == j2 && k3 == k2 && l3 == l2) {
            return false;
        }
        return m24142e(j, j2) ? m24142e(i, i2) || m24142e(i3, i) : m24142e(i, i2) && m24142e(i3, i);
    }

    public static boolean m24145b(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean m24144c(long j, long j2) {
        return (j & j2) != 0;
    }

    public static int m24143d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean m24142e(int i, int i2) {
        return i > i2;
    }

    public static long m24141f(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static int m24140g(int i, int i2, int i3) {
        return ((i & 255) << 16) | ((i2 & 255) << 8) | (i3 & 255);
    }

    public static int m24139h(int i, int i2, boolean z) {
        return z ? i | i2 : i & (~i2);
    }

    public static long m24138i(long j, long j2, boolean z) {
        return z ? j | j2 : j & (~j2);
    }

    public static int m24137j(int i) {
        return (i >> 16) & 255;
    }

    public static int m24136k(int i) {
        return (i >> 8) & 255;
    }

    public static int m24135l(int i) {
        return i & 255;
    }

    public static int m24134m(long j) {
        return (int) (j >> 32);
    }

    public static int m24133n(long j) {
        return (int) j;
    }
}
