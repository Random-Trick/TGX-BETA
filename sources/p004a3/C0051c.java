package p004a3;

import p004a3.AbstractC0042a;

public final class C0051c extends AbstractC0042a {
    public final Integer f158a;
    public final String f159b;
    public final String f160c;
    public final String f161d;
    public final String f162e;
    public final String f163f;
    public final String f164g;
    public final String f165h;
    public final String f166i;
    public final String f167j;
    public final String f168k;
    public final String f169l;

    public static final class C0053b extends AbstractC0042a.AbstractC0043a {
        public Integer f170a;
        public String f171b;
        public String f172c;
        public String f173d;
        public String f174e;
        public String f175f;
        public String f176g;
        public String f177h;
        public String f178i;
        public String f179j;
        public String f180k;
        public String f181l;

        @Override
        public AbstractC0042a mo42490a() {
            return new C0051c(this.f170a, this.f171b, this.f172c, this.f173d, this.f174e, this.f175f, this.f176g, this.f177h, this.f178i, this.f179j, this.f180k, this.f181l);
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42489b(String str) {
            this.f181l = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42488c(String str) {
            this.f179j = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42487d(String str) {
            this.f173d = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42486e(String str) {
            this.f177h = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42485f(String str) {
            this.f172c = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42484g(String str) {
            this.f178i = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42483h(String str) {
            this.f176g = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42482i(String str) {
            this.f180k = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42481j(String str) {
            this.f171b = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42480k(String str) {
            this.f175f = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42479l(String str) {
            this.f174e = str;
            return this;
        }

        @Override
        public AbstractC0042a.AbstractC0043a mo42478m(Integer num) {
            this.f170a = num;
            return this;
        }
    }

    @Override
    public String mo42502b() {
        return this.f169l;
    }

    @Override
    public String mo42501c() {
        return this.f167j;
    }

    @Override
    public String mo42500d() {
        return this.f161d;
    }

    @Override
    public String mo42499e() {
        return this.f165h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0042a)) {
            return false;
        }
        AbstractC0042a aVar = (AbstractC0042a) obj;
        Integer num = this.f158a;
        if (num != null ? num.equals(aVar.mo42491m()) : aVar.mo42491m() == null) {
            String str = this.f159b;
            if (str != null ? str.equals(aVar.mo42494j()) : aVar.mo42494j() == null) {
                String str2 = this.f160c;
                if (str2 != null ? str2.equals(aVar.mo42498f()) : aVar.mo42498f() == null) {
                    String str3 = this.f161d;
                    if (str3 != null ? str3.equals(aVar.mo42500d()) : aVar.mo42500d() == null) {
                        String str4 = this.f162e;
                        if (str4 != null ? str4.equals(aVar.mo42492l()) : aVar.mo42492l() == null) {
                            String str5 = this.f163f;
                            if (str5 != null ? str5.equals(aVar.mo42493k()) : aVar.mo42493k() == null) {
                                String str6 = this.f164g;
                                if (str6 != null ? str6.equals(aVar.mo42496h()) : aVar.mo42496h() == null) {
                                    String str7 = this.f165h;
                                    if (str7 != null ? str7.equals(aVar.mo42499e()) : aVar.mo42499e() == null) {
                                        String str8 = this.f166i;
                                        if (str8 != null ? str8.equals(aVar.mo42497g()) : aVar.mo42497g() == null) {
                                            String str9 = this.f167j;
                                            if (str9 != null ? str9.equals(aVar.mo42501c()) : aVar.mo42501c() == null) {
                                                String str10 = this.f168k;
                                                if (str10 != null ? str10.equals(aVar.mo42495i()) : aVar.mo42495i() == null) {
                                                    String str11 = this.f169l;
                                                    if (str11 == null) {
                                                        if (aVar.mo42502b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.mo42502b())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String mo42498f() {
        return this.f160c;
    }

    @Override
    public String mo42497g() {
        return this.f166i;
    }

    @Override
    public String mo42496h() {
        return this.f164g;
    }

    public int hashCode() {
        Integer num = this.f158a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f159b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f160c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f161d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f162e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f163f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f164g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f165h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f166i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f167j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f168k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f169l;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode11 ^ i;
    }

    @Override
    public String mo42495i() {
        return this.f168k;
    }

    @Override
    public String mo42494j() {
        return this.f159b;
    }

    @Override
    public String mo42493k() {
        return this.f163f;
    }

    @Override
    public String mo42492l() {
        return this.f162e;
    }

    @Override
    public Integer mo42491m() {
        return this.f158a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f158a + ", model=" + this.f159b + ", hardware=" + this.f160c + ", device=" + this.f161d + ", product=" + this.f162e + ", osBuild=" + this.f163f + ", manufacturer=" + this.f164g + ", fingerprint=" + this.f165h + ", locale=" + this.f166i + ", country=" + this.f167j + ", mccMnc=" + this.f168k + ", applicationBuild=" + this.f169l + "}";
    }

    public C0051c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f158a = num;
        this.f159b = str;
        this.f160c = str2;
        this.f161d = str3;
        this.f162e = str4;
        this.f163f = str5;
        this.f164g = str6;
        this.f165h = str7;
        this.f166i = str8;
        this.f167j = str9;
        this.f168k = str10;
        this.f169l = str11;
    }
}
