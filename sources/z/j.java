package z;

public final class j {
    public final long f26762a;
    public final long f26763b;

    public j(long j10, long j11) {
        this.f26762a = j10;
        this.f26763b = j11;
    }

    public long a() {
        return this.f26763b;
    }

    public long b() {
        return this.f26762a;
    }

    public String toString() {
        return this.f26762a + "/" + this.f26763b;
    }

    public j(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
