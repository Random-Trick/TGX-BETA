package p004a3;

public final class C0064h extends AbstractC0076n {
    public final long f215a;

    public C0064h(long j) {
        this.f215a = j;
    }

    @Override
    public long mo42433c() {
        return this.f215a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC0076n) && this.f215a == ((AbstractC0076n) obj).mo42433c();
    }

    public int hashCode() {
        long j = this.f215a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f215a + "}";
    }
}
