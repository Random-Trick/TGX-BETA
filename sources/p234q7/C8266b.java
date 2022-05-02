package p234q7;

import p234q7.AbstractC8274f;

public final class C8266b extends AbstractC8274f {
    public final String f26730a;
    public final long f26731b;
    public final AbstractC8274f.EnumC8276b f26732c;

    public static final class C8268b extends AbstractC8274f.AbstractC8275a {
        public String f26733a;
        public Long f26734b;
        public AbstractC8274f.EnumC8276b f26735c;

        @Override
        public AbstractC8274f mo12973a() {
            String str = "";
            if (this.f26734b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8266b(this.f26733a, this.f26734b.longValue(), this.f26735c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC8274f.AbstractC8275a mo12972b(AbstractC8274f.EnumC8276b bVar) {
            this.f26735c = bVar;
            return this;
        }

        @Override
        public AbstractC8274f.AbstractC8275a mo12971c(String str) {
            this.f26733a = str;
            return this;
        }

        @Override
        public AbstractC8274f.AbstractC8275a mo12970d(long j) {
            this.f26734b = Long.valueOf(j);
            return this;
        }
    }

    @Override
    public AbstractC8274f.EnumC8276b mo12976b() {
        return this.f26732c;
    }

    @Override
    public String mo12975c() {
        return this.f26730a;
    }

    @Override
    public long mo12974d() {
        return this.f26731b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8274f)) {
            return false;
        }
        AbstractC8274f fVar = (AbstractC8274f) obj;
        String str = this.f26730a;
        if (str != null ? str.equals(fVar.mo12975c()) : fVar.mo12975c() == null) {
            if (this.f26731b == fVar.mo12974d()) {
                AbstractC8274f.EnumC8276b bVar = this.f26732c;
                if (bVar == null) {
                    if (fVar.mo12976b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.mo12976b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26730a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f26731b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC8274f.EnumC8276b bVar = this.f26732c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f26730a + ", tokenExpirationTimestamp=" + this.f26731b + ", responseCode=" + this.f26732c + "}";
    }

    public C8266b(String str, long j, AbstractC8274f.EnumC8276b bVar) {
        this.f26730a = str;
        this.f26731b = j;
        this.f26732c = bVar;
    }
}
