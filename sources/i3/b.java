package i3;

import b3.h;
import b3.m;
import java.util.Objects;

public final class b extends i {
    public final long f13938a;
    public final m f13939b;
    public final h f13940c;

    public b(long j10, m mVar, h hVar) {
        this.f13938a = j10;
        Objects.requireNonNull(mVar, "Null transportContext");
        this.f13939b = mVar;
        Objects.requireNonNull(hVar, "Null event");
        this.f13940c = hVar;
    }

    @Override
    public h b() {
        return this.f13940c;
    }

    @Override
    public long c() {
        return this.f13938a;
    }

    @Override
    public m d() {
        return this.f13939b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f13938a == iVar.c() && this.f13939b.equals(iVar.d()) && this.f13940c.equals(iVar.b());
    }

    public int hashCode() {
        long j10 = this.f13938a;
        return this.f13940c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13939b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f13938a + ", transportContext=" + this.f13939b + ", event=" + this.f13940c + "}";
    }
}
