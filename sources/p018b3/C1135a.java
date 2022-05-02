package p018b3;

import java.util.Map;
import java.util.Objects;
import p018b3.AbstractC1150h;

public final class C1135a extends AbstractC1150h {
    public final String f4337a;
    public final Integer f4338b;
    public final C1149g f4339c;
    public final long f4340d;
    public final long f4341e;
    public final Map<String, String> f4342f;

    public static final class C1137b extends AbstractC1150h.AbstractC1151a {
        public String f4343a;
        public Integer f4344b;
        public C1149g f4345c;
        public Long f4346d;
        public Long f4347e;
        public Map<String, String> f4348f;

        @Override
        public AbstractC1150h mo38290d() {
            String str = "";
            if (this.f4343a == null) {
                str = str + " transportName";
            }
            if (this.f4345c == null) {
                str = str + " encodedPayload";
            }
            if (this.f4346d == null) {
                str = str + " eventMillis";
            }
            if (this.f4347e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f4348f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C1135a(this.f4343a, this.f4344b, this.f4345c, this.f4346d.longValue(), this.f4347e.longValue(), this.f4348f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public Map<String, String> mo38289e() {
            Map<String, String> map = this.f4348f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override
        public AbstractC1150h.AbstractC1151a mo38288f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f4348f = map;
            return this;
        }

        @Override
        public AbstractC1150h.AbstractC1151a mo38287g(Integer num) {
            this.f4344b = num;
            return this;
        }

        @Override
        public AbstractC1150h.AbstractC1151a mo38286h(C1149g gVar) {
            Objects.requireNonNull(gVar, "Null encodedPayload");
            this.f4345c = gVar;
            return this;
        }

        @Override
        public AbstractC1150h.AbstractC1151a mo38285i(long j) {
            this.f4346d = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC1150h.AbstractC1151a mo38284j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f4343a = str;
            return this;
        }

        @Override
        public AbstractC1150h.AbstractC1151a mo38283k(long j) {
            this.f4347e = Long.valueOf(j);
            return this;
        }
    }

    @Override
    public Map<String, String> mo38303c() {
        return this.f4342f;
    }

    @Override
    public Integer mo38302d() {
        return this.f4338b;
    }

    @Override
    public C1149g mo38301e() {
        return this.f4339c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1150h)) {
            return false;
        }
        AbstractC1150h hVar = (AbstractC1150h) obj;
        return this.f4337a.equals(hVar.mo38296j()) && ((num = this.f4338b) != null ? num.equals(hVar.mo38302d()) : hVar.mo38302d() == null) && this.f4339c.equals(hVar.mo38301e()) && this.f4340d == hVar.mo38300f() && this.f4341e == hVar.mo38295k() && this.f4342f.equals(hVar.mo38303c());
    }

    @Override
    public long mo38300f() {
        return this.f4340d;
    }

    public int hashCode() {
        int hashCode = (this.f4337a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f4338b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f4340d;
        long j2 = this.f4341e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f4339c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f4342f.hashCode();
    }

    @Override
    public String mo38296j() {
        return this.f4337a;
    }

    @Override
    public long mo38295k() {
        return this.f4341e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f4337a + ", code=" + this.f4338b + ", encodedPayload=" + this.f4339c + ", eventMillis=" + this.f4340d + ", uptimeMillis=" + this.f4341e + ", autoMetadata=" + this.f4342f + "}";
    }

    public C1135a(String str, Integer num, C1149g gVar, long j, long j2, Map<String, String> map) {
        this.f4337a = str;
        this.f4338b = num;
        this.f4339c = gVar;
        this.f4340d = j;
        this.f4341e = j2;
        this.f4342f = map;
    }
}
