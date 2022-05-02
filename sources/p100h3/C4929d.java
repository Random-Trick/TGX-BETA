package p100h3;

import java.util.Objects;
import java.util.Set;
import p100h3.AbstractC4934g;

public final class C4929d extends AbstractC4934g.AbstractC4936b {
    public final long f16807a;
    public final long f16808b;
    public final Set<AbstractC4934g.EnumC4938c> f16809c;

    public static final class C4931b extends AbstractC4934g.AbstractC4936b.AbstractC4937a {
        public Long f16810a;
        public Long f16811b;
        public Set<AbstractC4934g.EnumC4938c> f16812c;

        @Override
        public AbstractC4934g.AbstractC4936b mo24418a() {
            String str = "";
            if (this.f16810a == null) {
                str = str + " delta";
            }
            if (this.f16811b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f16812c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C4929d(this.f16810a.longValue(), this.f16811b.longValue(), this.f16812c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC4934g.AbstractC4936b.AbstractC4937a mo24417b(long j) {
            this.f16810a = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC4934g.AbstractC4936b.AbstractC4937a mo24416c(Set<AbstractC4934g.EnumC4938c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f16812c = set;
            return this;
        }

        @Override
        public AbstractC4934g.AbstractC4936b.AbstractC4937a mo24415d(long j) {
            this.f16811b = Long.valueOf(j);
            return this;
        }
    }

    @Override
    public long mo24421b() {
        return this.f16807a;
    }

    @Override
    public Set<AbstractC4934g.EnumC4938c> mo24420c() {
        return this.f16809c;
    }

    @Override
    public long mo24419d() {
        return this.f16808b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4934g.AbstractC4936b)) {
            return false;
        }
        AbstractC4934g.AbstractC4936b bVar = (AbstractC4934g.AbstractC4936b) obj;
        return this.f16807a == bVar.mo24421b() && this.f16808b == bVar.mo24419d() && this.f16809c.equals(bVar.mo24420c());
    }

    public int hashCode() {
        long j = this.f16807a;
        long j2 = this.f16808b;
        return this.f16809c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f16807a + ", maxAllowedDelay=" + this.f16808b + ", flags=" + this.f16809c + "}";
    }

    public C4929d(long j, long j2, Set<AbstractC4934g.EnumC4938c> set) {
        this.f16807a = j;
        this.f16808b = j2;
        this.f16809c = set;
    }
}
