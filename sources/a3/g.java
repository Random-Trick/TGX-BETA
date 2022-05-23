package a3;

import a3.m;
import java.util.List;

public final class g extends m {
    public final long f187a;
    public final long f188b;
    public final k f189c;
    public final Integer f190d;
    public final String f191e;
    public final List<l> f192f;
    public final p f193g;

    public static final class b extends m.a {
        public Long f194a;
        public Long f195b;
        public k f196c;
        public Integer f197d;
        public String f198e;
        public List<l> f199f;
        public p f200g;

        @Override
        public m a() {
            String str = "";
            if (this.f194a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f195b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f194a.longValue(), this.f195b.longValue(), this.f196c, this.f197d, this.f198e, this.f199f, this.f200g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public m.a b(k kVar) {
            this.f196c = kVar;
            return this;
        }

        @Override
        public m.a c(List<l> list) {
            this.f199f = list;
            return this;
        }

        @Override
        public m.a d(Integer num) {
            this.f197d = num;
            return this;
        }

        @Override
        public m.a e(String str) {
            this.f198e = str;
            return this;
        }

        @Override
        public m.a f(p pVar) {
            this.f200g = pVar;
            return this;
        }

        @Override
        public m.a g(long j10) {
            this.f194a = Long.valueOf(j10);
            return this;
        }

        @Override
        public m.a h(long j10) {
            this.f195b = Long.valueOf(j10);
            return this;
        }
    }

    @Override
    public k b() {
        return this.f189c;
    }

    @Override
    public List<l> c() {
        return this.f192f;
    }

    @Override
    public Integer d() {
        return this.f190d;
    }

    @Override
    public String e() {
        return this.f191e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f187a == mVar.g() && this.f188b == mVar.h() && ((kVar = this.f189c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f190d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f191e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f192f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f193g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public p f() {
        return this.f193g;
    }

    @Override
    public long g() {
        return this.f187a;
    }

    @Override
    public long h() {
        return this.f188b;
    }

    public int hashCode() {
        long j10 = this.f187a;
        long j11 = this.f188b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f189c;
        int i11 = 0;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f190d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f191e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f192f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f193g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f187a + ", requestUptimeMs=" + this.f188b + ", clientInfo=" + this.f189c + ", logSource=" + this.f190d + ", logSourceName=" + this.f191e + ", logEvents=" + this.f192f + ", qosTier=" + this.f193g + "}";
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f187a = j10;
        this.f188b = j11;
        this.f189c = kVar;
        this.f190d = num;
        this.f191e = str;
        this.f192f = list;
        this.f193g = pVar;
    }
}
