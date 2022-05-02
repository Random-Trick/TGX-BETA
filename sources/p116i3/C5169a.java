package p116i3;

import p116i3.AbstractC5181d;

public final class C5169a extends AbstractC5181d {
    public final long f17283b;
    public final int f17284c;
    public final int f17285d;
    public final long f17286e;
    public final int f17287f;

    public static final class C5171b extends AbstractC5181d.AbstractC5182a {
        public Long f17288a;
        public Integer f17289b;
        public Integer f17290c;
        public Long f17291d;
        public Integer f17292e;

        @Override
        public AbstractC5181d mo23658a() {
            String str = "";
            if (this.f17288a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f17289b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f17290c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f17291d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f17292e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C5169a(this.f17288a.longValue(), this.f17289b.intValue(), this.f17290c.intValue(), this.f17291d.longValue(), this.f17292e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC5181d.AbstractC5182a mo23657b(int i) {
            this.f17290c = Integer.valueOf(i);
            return this;
        }

        @Override
        public AbstractC5181d.AbstractC5182a mo23656c(long j) {
            this.f17291d = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC5181d.AbstractC5182a mo23655d(int i) {
            this.f17289b = Integer.valueOf(i);
            return this;
        }

        @Override
        public AbstractC5181d.AbstractC5182a mo23654e(int i) {
            this.f17292e = Integer.valueOf(i);
            return this;
        }

        @Override
        public AbstractC5181d.AbstractC5182a mo23653f(long j) {
            this.f17288a = Long.valueOf(j);
            return this;
        }
    }

    @Override
    public int mo23663b() {
        return this.f17285d;
    }

    @Override
    public long mo23662c() {
        return this.f17286e;
    }

    @Override
    public int mo23661d() {
        return this.f17284c;
    }

    @Override
    public int mo23660e() {
        return this.f17287f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5181d)) {
            return false;
        }
        AbstractC5181d dVar = (AbstractC5181d) obj;
        return this.f17283b == dVar.mo23659f() && this.f17284c == dVar.mo23661d() && this.f17285d == dVar.mo23663b() && this.f17286e == dVar.mo23662c() && this.f17287f == dVar.mo23660e();
    }

    @Override
    public long mo23659f() {
        return this.f17283b;
    }

    public int hashCode() {
        long j = this.f17283b;
        long j2 = this.f17286e;
        return this.f17287f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17284c) * 1000003) ^ this.f17285d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f17283b + ", loadBatchSize=" + this.f17284c + ", criticalSectionEnterTimeoutMs=" + this.f17285d + ", eventCleanUpAge=" + this.f17286e + ", maxBlobByteSizePerRow=" + this.f17287f + "}";
    }

    public C5169a(long j, int i, int i2, long j2, int i3) {
        this.f17283b = j;
        this.f17284c = i;
        this.f17285d = i2;
        this.f17286e = j2;
        this.f17287f = i3;
    }
}
