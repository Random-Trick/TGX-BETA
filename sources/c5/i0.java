package c5;

public final class i0 {
    public long f4830a;
    public long f4831b;
    public long f4832c;
    public final ThreadLocal<Long> f4833d = new ThreadLocal<>();

    public i0(long j10) {
        g(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long h(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f4831b == -9223372036854775807L) {
            long j11 = this.f4830a;
            if (j11 == 9223372036854775806L) {
                j11 = ((Long) a.e(this.f4833d.get())).longValue();
            }
            this.f4831b = j11 - j10;
            notifyAll();
        }
        this.f4832c = j10;
        return j10 + this.f4831b;
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f4832c;
        if (j11 != -9223372036854775807L) {
            long h10 = h(j11);
            long j12 = (4294967296L + h10) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - h10) < Math.abs(j10 - h10)) {
                j10 = j13;
            }
        }
        return a(f(j10));
    }

    public synchronized long c() {
        long j10;
        j10 = this.f4830a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long d() {
        long j10;
        long j11 = this.f4832c;
        if (j11 != -9223372036854775807L) {
            j10 = j11 + this.f4831b;
        } else {
            j10 = c();
        }
        return j10;
    }

    public synchronized long e() {
        return this.f4831b;
    }

    public synchronized void g(long j10) {
        this.f4830a = j10;
        this.f4831b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f4832c = -9223372036854775807L;
    }
}
