package p234q7;

import p234q7.AbstractC8274f;

public final class C8266b extends AbstractC8274f {
    public final String f26733a;
    public final long f26734b;
    public final AbstractC8274f.EnumC8276b f26735c;

    public static final class C8268b extends AbstractC8274f.AbstractC8275a {
        public String f26736a;
        public Long f26737b;
        public AbstractC8274f.EnumC8276b f26738c;

        @Override
        public AbstractC8274f mo12972a() {
            String str = "";
            if (this.f26737b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8266b(this.f26736a, this.f26737b.longValue(), this.f26738c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC8274f.AbstractC8275a mo12971b(AbstractC8274f.EnumC8276b bVar) {
            this.f26738c = bVar;
            return this;
        }

        @Override
        public AbstractC8274f.AbstractC8275a mo12970c(String str) {
            this.f26736a = str;
            return this;
        }

        @Override
        public AbstractC8274f.AbstractC8275a mo12969d(long j) {
            this.f26737b = Long.valueOf(j);
            return this;
        }
    }

    @Override
    public AbstractC8274f.EnumC8276b mo12975b() {
        return this.f26735c;
    }

    @Override
    public String mo12974c() {
        return this.f26733a;
    }

    @Override
    public long mo12973d() {
        return this.f26734b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8274f)) {
            return false;
        }
        AbstractC8274f fVar = (AbstractC8274f) obj;
        String str = this.f26733a;
        if (str != null ? str.equals(fVar.mo12974c()) : fVar.mo12974c() == null) {
            if (this.f26734b == fVar.mo12973d()) {
                AbstractC8274f.EnumC8276b bVar = this.f26735c;
                if (bVar == null) {
                    if (fVar.mo12975b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.mo12975b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26733a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f26734b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC8274f.EnumC8276b bVar = this.f26735c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f26733a + ", tokenExpirationTimestamp=" + this.f26734b + ", responseCode=" + this.f26735c + "}";
    }

    public C8266b(String str, long j, AbstractC8274f.EnumC8276b bVar) {
        this.f26733a = str;
        this.f26734b = j;
        this.f26735c = bVar;
    }
}
