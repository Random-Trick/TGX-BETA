package a3;

import a3.l;
import java.util.Arrays;

public final class f extends l {
    public final long f173a;
    public final Integer f174b;
    public final long f175c;
    public final byte[] f176d;
    public final String f177e;
    public final long f178f;
    public final o f179g;

    public static final class b extends l.a {
        public Long f180a;
        public Integer f181b;
        public Long f182c;
        public byte[] f183d;
        public String f184e;
        public Long f185f;
        public o f186g;

        @Override
        public l a() {
            String str = "";
            if (this.f180a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f182c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f185f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f180a.longValue(), this.f181b, this.f182c.longValue(), this.f183d, this.f184e, this.f185f.longValue(), this.f186g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public l.a b(Integer num) {
            this.f181b = num;
            return this;
        }

        @Override
        public l.a c(long j10) {
            this.f180a = Long.valueOf(j10);
            return this;
        }

        @Override
        public l.a d(long j10) {
            this.f182c = Long.valueOf(j10);
            return this;
        }

        @Override
        public l.a e(o oVar) {
            this.f186g = oVar;
            return this;
        }

        @Override
        public l.a f(byte[] bArr) {
            this.f183d = bArr;
            return this;
        }

        @Override
        public l.a g(String str) {
            this.f184e = str;
            return this;
        }

        @Override
        public l.a h(long j10) {
            this.f185f = Long.valueOf(j10);
            return this;
        }
    }

    @Override
    public Integer b() {
        return this.f174b;
    }

    @Override
    public long c() {
        return this.f173a;
    }

    @Override
    public long d() {
        return this.f175c;
    }

    @Override
    public o e() {
        return this.f179g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f173a == lVar.c() && ((num = this.f174b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f175c == lVar.d()) {
            if (Arrays.equals(this.f176d, lVar instanceof f ? ((f) lVar).f176d : lVar.f()) && ((str = this.f177e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f178f == lVar.h()) {
                o oVar = this.f179g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public byte[] f() {
        return this.f176d;
    }

    @Override
    public String g() {
        return this.f177e;
    }

    @Override
    public long h() {
        return this.f178f;
    }

    public int hashCode() {
        long j10 = this.f173a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f174b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f175c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f176d)) * 1000003;
        String str = this.f177e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f178f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f179g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f173a + ", eventCode=" + this.f174b + ", eventUptimeMs=" + this.f175c + ", sourceExtension=" + Arrays.toString(this.f176d) + ", sourceExtensionJsonProto3=" + this.f177e + ", timezoneOffsetSeconds=" + this.f178f + ", networkConnectionInfo=" + this.f179g + "}";
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f173a = j10;
        this.f174b = num;
        this.f175c = j11;
        this.f176d = bArr;
        this.f177e = str;
        this.f178f = j12;
        this.f179g = oVar;
    }
}
