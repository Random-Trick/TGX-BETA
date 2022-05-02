package p030c3;

import java.util.Objects;
import p030c3.AbstractC1541g;

public final class C1535b extends AbstractC1541g {
    public final AbstractC1541g.EnumC1542a f5485a;
    public final long f5486b;

    public C1535b(AbstractC1541g.EnumC1542a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.f5485a = aVar;
        this.f5486b = j;
    }

    @Override
    public long mo36504b() {
        return this.f5486b;
    }

    @Override
    public AbstractC1541g.EnumC1542a mo36503c() {
        return this.f5485a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1541g)) {
            return false;
        }
        AbstractC1541g gVar = (AbstractC1541g) obj;
        return this.f5485a.equals(gVar.mo36503c()) && this.f5486b == gVar.mo36504b();
    }

    public int hashCode() {
        long j = this.f5486b;
        return ((this.f5485a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5485a + ", nextRequestWaitMillis=" + this.f5486b + "}";
    }
}
