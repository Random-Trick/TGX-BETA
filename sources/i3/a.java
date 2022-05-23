package i3;

import i3.d;

public final class a extends d {
    public final long f13927b;
    public final int f13928c;
    public final int f13929d;
    public final long f13930e;
    public final int f13931f;

    public static final class b extends d.a {
        public Long f13932a;
        public Integer f13933b;
        public Integer f13934c;
        public Long f13935d;
        public Integer f13936e;

        @Override
        public d a() {
            String str = "";
            if (this.f13932a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f13933b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f13934c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f13935d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f13936e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f13932a.longValue(), this.f13933b.intValue(), this.f13934c.intValue(), this.f13935d.longValue(), this.f13936e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public d.a b(int i10) {
            this.f13934c = Integer.valueOf(i10);
            return this;
        }

        @Override
        public d.a c(long j10) {
            this.f13935d = Long.valueOf(j10);
            return this;
        }

        @Override
        public d.a d(int i10) {
            this.f13933b = Integer.valueOf(i10);
            return this;
        }

        @Override
        public d.a e(int i10) {
            this.f13936e = Integer.valueOf(i10);
            return this;
        }

        @Override
        public d.a f(long j10) {
            this.f13932a = Long.valueOf(j10);
            return this;
        }
    }

    @Override
    public int b() {
        return this.f13929d;
    }

    @Override
    public long c() {
        return this.f13930e;
    }

    @Override
    public int d() {
        return this.f13928c;
    }

    @Override
    public int e() {
        return this.f13931f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f13927b == dVar.f() && this.f13928c == dVar.d() && this.f13929d == dVar.b() && this.f13930e == dVar.c() && this.f13931f == dVar.e();
    }

    @Override
    public long f() {
        return this.f13927b;
    }

    public int hashCode() {
        long j10 = this.f13927b;
        long j11 = this.f13930e;
        return this.f13931f ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13928c) * 1000003) ^ this.f13929d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f13927b + ", loadBatchSize=" + this.f13928c + ", criticalSectionEnterTimeoutMs=" + this.f13929d + ", eventCleanUpAge=" + this.f13930e + ", maxBlobByteSizePerRow=" + this.f13931f + "}";
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f13927b = j10;
        this.f13928c = i10;
        this.f13929d = i11;
        this.f13930e = j11;
        this.f13931f = i12;
    }
}
