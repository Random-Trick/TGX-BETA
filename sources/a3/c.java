package a3;

import a3.a;

public final class c extends a3.a {
    public final Integer f144a;
    public final String f145b;
    public final String f146c;
    public final String f147d;
    public final String f148e;
    public final String f149f;
    public final String f150g;
    public final String f151h;
    public final String f152i;
    public final String f153j;
    public final String f154k;
    public final String f155l;

    public static final class b extends a.AbstractC0009a {
        public Integer f156a;
        public String f157b;
        public String f158c;
        public String f159d;
        public String f160e;
        public String f161f;
        public String f162g;
        public String f163h;
        public String f164i;
        public String f165j;
        public String f166k;
        public String f167l;

        @Override
        public a3.a a() {
            return new c(this.f156a, this.f157b, this.f158c, this.f159d, this.f160e, this.f161f, this.f162g, this.f163h, this.f164i, this.f165j, this.f166k, this.f167l);
        }

        @Override
        public a.AbstractC0009a b(String str) {
            this.f167l = str;
            return this;
        }

        @Override
        public a.AbstractC0009a c(String str) {
            this.f165j = str;
            return this;
        }

        @Override
        public a.AbstractC0009a d(String str) {
            this.f159d = str;
            return this;
        }

        @Override
        public a.AbstractC0009a e(String str) {
            this.f163h = str;
            return this;
        }

        @Override
        public a.AbstractC0009a f(String str) {
            this.f158c = str;
            return this;
        }

        @Override
        public a.AbstractC0009a g(String str) {
            this.f164i = str;
            return this;
        }

        @Override
        public a.AbstractC0009a h(String str) {
            this.f162g = str;
            return this;
        }

        @Override
        public a.AbstractC0009a i(String str) {
            this.f166k = str;
            return this;
        }

        @Override
        public a.AbstractC0009a j(String str) {
            this.f157b = str;
            return this;
        }

        @Override
        public a.AbstractC0009a k(String str) {
            this.f161f = str;
            return this;
        }

        @Override
        public a.AbstractC0009a l(String str) {
            this.f160e = str;
            return this;
        }

        @Override
        public a.AbstractC0009a m(Integer num) {
            this.f156a = num;
            return this;
        }
    }

    @Override
    public String b() {
        return this.f155l;
    }

    @Override
    public String c() {
        return this.f153j;
    }

    @Override
    public String d() {
        return this.f147d;
    }

    @Override
    public String e() {
        return this.f151h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3.a)) {
            return false;
        }
        a3.a aVar = (a3.a) obj;
        Integer num = this.f144a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f145b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f146c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f147d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f148e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f149f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f150g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f151h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f152i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f153j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f154k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f155l;
                                                    if (str11 == null) {
                                                        if (aVar.b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.b())) {
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
    public String f() {
        return this.f146c;
    }

    @Override
    public String g() {
        return this.f152i;
    }

    @Override
    public String h() {
        return this.f150g;
    }

    public int hashCode() {
        Integer num = this.f144a;
        int i10 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f145b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f146c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f147d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f148e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f149f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f150g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f151h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f152i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f153j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f154k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f155l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return hashCode11 ^ i10;
    }

    @Override
    public String i() {
        return this.f154k;
    }

    @Override
    public String j() {
        return this.f145b;
    }

    @Override
    public String k() {
        return this.f149f;
    }

    @Override
    public String l() {
        return this.f148e;
    }

    @Override
    public Integer m() {
        return this.f144a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f144a + ", model=" + this.f145b + ", hardware=" + this.f146c + ", device=" + this.f147d + ", product=" + this.f148e + ", osBuild=" + this.f149f + ", manufacturer=" + this.f150g + ", fingerprint=" + this.f151h + ", locale=" + this.f152i + ", country=" + this.f153j + ", mccMnc=" + this.f154k + ", applicationBuild=" + this.f155l + "}";
    }

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f144a = num;
        this.f145b = str;
        this.f146c = str2;
        this.f147d = str3;
        this.f148e = str4;
        this.f149f = str5;
        this.f150g = str6;
        this.f151h = str7;
        this.f152i = str8;
        this.f153j = str9;
        this.f154k = str10;
        this.f155l = str11;
    }
}
