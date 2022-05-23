package b3;

import b3.h;
import java.util.Map;
import java.util.Objects;

public final class a extends h {
    public final String f3698a;
    public final Integer f3699b;
    public final g f3700c;
    public final long f3701d;
    public final long f3702e;
    public final Map<String, String> f3703f;

    public static final class b extends h.a {
        public String f3704a;
        public Integer f3705b;
        public g f3706c;
        public Long f3707d;
        public Long f3708e;
        public Map<String, String> f3709f;

        @Override
        public h d() {
            String str = "";
            if (this.f3704a == null) {
                str = str + " transportName";
            }
            if (this.f3706c == null) {
                str = str + " encodedPayload";
            }
            if (this.f3707d == null) {
                str = str + " eventMillis";
            }
            if (this.f3708e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f3709f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.f3704a, this.f3705b, this.f3706c, this.f3707d.longValue(), this.f3708e.longValue(), this.f3709f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public Map<String, String> e() {
            Map<String, String> map = this.f3709f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override
        public h.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f3709f = map;
            return this;
        }

        @Override
        public h.a g(Integer num) {
            this.f3705b = num;
            return this;
        }

        @Override
        public h.a h(g gVar) {
            Objects.requireNonNull(gVar, "Null encodedPayload");
            this.f3706c = gVar;
            return this;
        }

        @Override
        public h.a i(long j10) {
            this.f3707d = Long.valueOf(j10);
            return this;
        }

        @Override
        public h.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f3704a = str;
            return this;
        }

        @Override
        public h.a k(long j10) {
            this.f3708e = Long.valueOf(j10);
            return this;
        }
    }

    @Override
    public Map<String, String> c() {
        return this.f3703f;
    }

    @Override
    public Integer d() {
        return this.f3699b;
    }

    @Override
    public g e() {
        return this.f3700c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3698a.equals(hVar.j()) && ((num = this.f3699b) != null ? num.equals(hVar.d()) : hVar.d() == null) && this.f3700c.equals(hVar.e()) && this.f3701d == hVar.f() && this.f3702e == hVar.k() && this.f3703f.equals(hVar.c());
    }

    @Override
    public long f() {
        return this.f3701d;
    }

    public int hashCode() {
        int hashCode = (this.f3698a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3699b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f3701d;
        long j11 = this.f3702e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f3700c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f3703f.hashCode();
    }

    @Override
    public String j() {
        return this.f3698a;
    }

    @Override
    public long k() {
        return this.f3702e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f3698a + ", code=" + this.f3699b + ", encodedPayload=" + this.f3700c + ", eventMillis=" + this.f3701d + ", uptimeMillis=" + this.f3702e + ", autoMetadata=" + this.f3703f + "}";
    }

    public a(String str, Integer num, g gVar, long j10, long j11, Map<String, String> map) {
        this.f3698a = str;
        this.f3699b = num;
        this.f3700c = gVar;
        this.f3701d = j10;
        this.f3702e = j11;
        this.f3703f = map;
    }
}
