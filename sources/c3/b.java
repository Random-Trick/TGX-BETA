package c3;

import c3.g;
import java.util.Objects;

public final class b extends g {
    public final g.a f4403a;
    public final long f4404b;

    public b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f4403a = aVar;
        this.f4404b = j10;
    }

    @Override
    public long b() {
        return this.f4404b;
    }

    @Override
    public g.a c() {
        return this.f4403a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f4403a.equals(gVar.c()) && this.f4404b == gVar.b();
    }

    public int hashCode() {
        long j10 = this.f4404b;
        return ((this.f4403a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f4403a + ", nextRequestWaitMillis=" + this.f4404b + "}";
    }
}
