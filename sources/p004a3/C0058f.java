package p004a3;

import java.util.Arrays;
import p004a3.AbstractC0072l;

public final class C0058f extends AbstractC0072l {
    public final long f187a;
    public final Integer f188b;
    public final long f189c;
    public final byte[] f190d;
    public final String f191e;
    public final long f192f;
    public final AbstractC0077o f193g;

    public static final class C0060b extends AbstractC0072l.AbstractC0073a {
        public Long f194a;
        public Integer f195b;
        public Long f196c;
        public byte[] f197d;
        public String f198e;
        public Long f199f;
        public AbstractC0077o f200g;

        @Override
        public AbstractC0072l mo42461a() {
            String str = "";
            if (this.f194a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f196c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f199f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C0058f(this.f194a.longValue(), this.f195b, this.f196c.longValue(), this.f197d, this.f198e, this.f199f.longValue(), this.f200g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC0072l.AbstractC0073a mo42460b(Integer num) {
            this.f195b = num;
            return this;
        }

        @Override
        public AbstractC0072l.AbstractC0073a mo42459c(long j) {
            this.f194a = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC0072l.AbstractC0073a mo42458d(long j) {
            this.f196c = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC0072l.AbstractC0073a mo42457e(AbstractC0077o oVar) {
            this.f200g = oVar;
            return this;
        }

        @Override
        public AbstractC0072l.AbstractC0073a mo42456f(byte[] bArr) {
            this.f197d = bArr;
            return this;
        }

        @Override
        public AbstractC0072l.AbstractC0073a mo42455g(String str) {
            this.f198e = str;
            return this;
        }

        @Override
        public AbstractC0072l.AbstractC0073a mo42454h(long j) {
            this.f199f = Long.valueOf(j);
            return this;
        }
    }

    @Override
    public Integer mo42470b() {
        return this.f188b;
    }

    @Override
    public long mo42469c() {
        return this.f187a;
    }

    @Override
    public long mo42468d() {
        return this.f189c;
    }

    @Override
    public AbstractC0077o mo42467e() {
        return this.f193g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0072l)) {
            return false;
        }
        AbstractC0072l lVar = (AbstractC0072l) obj;
        if (this.f187a == lVar.mo42469c() && ((num = this.f188b) != null ? num.equals(lVar.mo42470b()) : lVar.mo42470b() == null) && this.f189c == lVar.mo42468d()) {
            if (Arrays.equals(this.f190d, lVar instanceof C0058f ? ((C0058f) lVar).f190d : lVar.mo42466f()) && ((str = this.f191e) != null ? str.equals(lVar.mo42465g()) : lVar.mo42465g() == null) && this.f192f == lVar.mo42464h()) {
                AbstractC0077o oVar = this.f193g;
                if (oVar == null) {
                    if (lVar.mo42467e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.mo42467e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public byte[] mo42466f() {
        return this.f190d;
    }

    @Override
    public String mo42465g() {
        return this.f191e;
    }

    @Override
    public long mo42464h() {
        return this.f192f;
    }

    public int hashCode() {
        long j = this.f187a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f188b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f189c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f190d)) * 1000003;
        String str = this.f191e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f192f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC0077o oVar = this.f193g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f187a + ", eventCode=" + this.f188b + ", eventUptimeMs=" + this.f189c + ", sourceExtension=" + Arrays.toString(this.f190d) + ", sourceExtensionJsonProto3=" + this.f191e + ", timezoneOffsetSeconds=" + this.f192f + ", networkConnectionInfo=" + this.f193g + "}";
    }

    public C0058f(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC0077o oVar) {
        this.f187a = j;
        this.f188b = num;
        this.f189c = j2;
        this.f190d = bArr;
        this.f191e = str;
        this.f192f = j3;
        this.f193g = oVar;
    }
}
