package h3;

import h3.f;
import java.util.Objects;
import java.util.Set;

public final class c extends f.b {
    public final long f12464a;
    public final long f12465b;
    public final Set<f.c> f12466c;

    public static final class b extends f.b.a {
        public Long f12467a;
        public Long f12468b;
        public Set<f.c> f12469c;

        @Override
        public f.b a() {
            String str = "";
            if (this.f12467a == null) {
                str = str + " delta";
            }
            if (this.f12468b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f12469c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f12467a.longValue(), this.f12468b.longValue(), this.f12469c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public f.b.a b(long j10) {
            this.f12467a = Long.valueOf(j10);
            return this;
        }

        @Override
        public f.b.a c(Set<f.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f12469c = set;
            return this;
        }

        @Override
        public f.b.a d(long j10) {
            this.f12468b = Long.valueOf(j10);
            return this;
        }
    }

    @Override
    public long b() {
        return this.f12464a;
    }

    @Override
    public Set<f.c> c() {
        return this.f12466c;
    }

    @Override
    public long d() {
        return this.f12465b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f12464a == bVar.b() && this.f12465b == bVar.d() && this.f12466c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f12464a;
        long j11 = this.f12465b;
        return this.f12466c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f12464a + ", maxAllowedDelay=" + this.f12465b + ", flags=" + this.f12466c + "}";
    }

    public c(long j10, long j11, Set<f.c> set) {
        this.f12464a = j10;
        this.f12465b = j11;
        this.f12466c = set;
    }
}
