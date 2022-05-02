package p153ka;

public final class C6223c {
    public static final int m21039a(int i, int i2, int i3) {
        return m21035e(m21035e(i, i3) - m21035e(i2, i3), i3);
    }

    public static final long m21038b(long j, long j2, long j3) {
        return m21034f(m21034f(j, j3) - m21034f(j2, j3), j3);
    }

    public static final int m21037c(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m21039a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m21039a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long m21036d(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return j >= j2 ? j2 : j2 - m21038b(j2, j, j3);
        }
        if (i < 0) {
            return j <= j2 ? j2 : j2 + m21038b(j, j2, -j3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final int m21035e(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static final long m21034f(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
