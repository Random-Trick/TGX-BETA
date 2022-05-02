package p153ka;

public final class C6223c {
    public static final int m21040a(int i, int i2, int i3) {
        return m21036e(m21036e(i, i3) - m21036e(i2, i3), i3);
    }

    public static final long m21039b(long j, long j2, long j3) {
        return m21035f(m21035f(j, j3) - m21035f(j2, j3), j3);
    }

    public static final int m21038c(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m21040a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m21040a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long m21037d(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return j >= j2 ? j2 : j2 - m21039b(j2, j, j3);
        }
        if (i < 0) {
            return j <= j2 ? j2 : j2 + m21039b(j, j2, -j3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final int m21036e(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static final long m21035f(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
