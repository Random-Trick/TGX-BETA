package a3;

public final class h extends n {
    public final long f201a;

    public h(long j10) {
        this.f201a = j10;
    }

    @Override
    public long c() {
        return this.f201a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f201a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f201a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f201a + "}";
    }
}
