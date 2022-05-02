package p004a3;

import java.util.List;
import p004a3.AbstractC0074m;

public final class C0061g extends AbstractC0074m {
    public final long f201a;
    public final long f202b;
    public final AbstractC0069k f203c;
    public final Integer f204d;
    public final String f205e;
    public final List<AbstractC0072l> f206f;
    public final EnumC0081p f207g;

    public static final class C0063b extends AbstractC0074m.AbstractC0075a {
        public Long f208a;
        public Long f209b;
        public AbstractC0069k f210c;
        public Integer f211d;
        public String f212e;
        public List<AbstractC0072l> f213f;
        public EnumC0081p f214g;

        @Override
        public AbstractC0074m mo42442a() {
            String str = "";
            if (this.f208a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f209b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C0061g(this.f208a.longValue(), this.f209b.longValue(), this.f210c, this.f211d, this.f212e, this.f213f, this.f214g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC0074m.AbstractC0075a mo42441b(AbstractC0069k kVar) {
            this.f210c = kVar;
            return this;
        }

        @Override
        public AbstractC0074m.AbstractC0075a mo42440c(List<AbstractC0072l> list) {
            this.f213f = list;
            return this;
        }

        @Override
        public AbstractC0074m.AbstractC0075a mo42439d(Integer num) {
            this.f211d = num;
            return this;
        }

        @Override
        public AbstractC0074m.AbstractC0075a mo42438e(String str) {
            this.f212e = str;
            return this;
        }

        @Override
        public AbstractC0074m.AbstractC0075a mo42437f(EnumC0081p pVar) {
            this.f214g = pVar;
            return this;
        }

        @Override
        public AbstractC0074m.AbstractC0075a mo42436g(long j) {
            this.f208a = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC0074m.AbstractC0075a mo42435h(long j) {
            this.f209b = Long.valueOf(j);
            return this;
        }
    }

    @Override
    public AbstractC0069k mo42449b() {
        return this.f203c;
    }

    @Override
    public List<AbstractC0072l> mo42448c() {
        return this.f206f;
    }

    @Override
    public Integer mo42447d() {
        return this.f204d;
    }

    @Override
    public String mo42446e() {
        return this.f205e;
    }

    public boolean equals(Object obj) {
        AbstractC0069k kVar;
        Integer num;
        String str;
        List<AbstractC0072l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0074m)) {
            return false;
        }
        AbstractC0074m mVar = (AbstractC0074m) obj;
        if (this.f201a == mVar.mo42444g() && this.f202b == mVar.mo42443h() && ((kVar = this.f203c) != null ? kVar.equals(mVar.mo42449b()) : mVar.mo42449b() == null) && ((num = this.f204d) != null ? num.equals(mVar.mo42447d()) : mVar.mo42447d() == null) && ((str = this.f205e) != null ? str.equals(mVar.mo42446e()) : mVar.mo42446e() == null) && ((list = this.f206f) != null ? list.equals(mVar.mo42448c()) : mVar.mo42448c() == null)) {
            EnumC0081p pVar = this.f207g;
            if (pVar == null) {
                if (mVar.mo42445f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.mo42445f())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public EnumC0081p mo42445f() {
        return this.f207g;
    }

    @Override
    public long mo42444g() {
        return this.f201a;
    }

    @Override
    public long mo42443h() {
        return this.f202b;
    }

    public int hashCode() {
        long j = this.f201a;
        long j2 = this.f202b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC0069k kVar = this.f203c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f204d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f205e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC0072l> list = this.f206f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC0081p pVar = this.f207g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f201a + ", requestUptimeMs=" + this.f202b + ", clientInfo=" + this.f203c + ", logSource=" + this.f204d + ", logSourceName=" + this.f205e + ", logEvents=" + this.f206f + ", qosTier=" + this.f207g + "}";
    }

    public C0061g(long j, long j2, AbstractC0069k kVar, Integer num, String str, List<AbstractC0072l> list, EnumC0081p pVar) {
        this.f201a = j;
        this.f202b = j2;
        this.f203c = kVar;
        this.f204d = num;
        this.f205e = str;
        this.f206f = list;
        this.f207g = pVar;
    }
}
