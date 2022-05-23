package ib;

public final class c {
    public static boolean a(int i10, int i11, int i12) {
        if (i11 == i12) {
            return false;
        }
        int j10 = j(i11);
        int k10 = k(i11);
        int l10 = l(i11);
        int j11 = j(i12);
        int k11 = k(i12);
        int l11 = l(i12);
        int j12 = j(i10);
        int k12 = k(i10);
        int l12 = l(i10);
        if (j12 == j10 && k12 == k10 && l12 == l10) {
            return true;
        }
        if (j12 == j11 && k12 == k11 && l12 == l11) {
            return false;
        }
        return e(j10, j11) ? e(i10, i11) || e(i12, i10) : e(i10, i11) && e(i12, i10);
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean c(long j10, long j11) {
        return (j10 & j11) != 0;
    }

    public static int d(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean e(int i10, int i11) {
        return i10 > i11;
    }

    public static long f(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static int g(int i10, int i11, int i12) {
        return ((i10 & 255) << 16) | ((i11 & 255) << 8) | (i12 & 255);
    }

    public static int h(int i10, int i11, boolean z10) {
        return z10 ? i10 | i11 : i10 & (~i11);
    }

    public static long i(long j10, long j11, boolean z10) {
        return z10 ? j10 | j11 : j10 & (~j11);
    }

    public static int j(int i10) {
        return (i10 >> 16) & 255;
    }

    public static int k(int i10) {
        return (i10 >> 8) & 255;
    }

    public static int l(int i10) {
        return i10 & 255;
    }

    public static int m(long j10) {
        return (int) (j10 >> 32);
    }

    public static int n(long j10) {
        return (int) j10;
    }
}
