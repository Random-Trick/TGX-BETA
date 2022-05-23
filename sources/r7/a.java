package r7;

import r7.d;

public final class a extends d {
    public final String f21763a;
    public final String f21764b;
    public final String f21765c;
    public final f f21766d;
    public final d.b f21767e;

    public static final class b extends d.a {
        public String f21768a;
        public String f21769b;
        public String f21770c;
        public f f21771d;
        public d.b f21772e;

        @Override
        public d a() {
            return new a(this.f21768a, this.f21769b, this.f21770c, this.f21771d, this.f21772e);
        }

        @Override
        public d.a b(f fVar) {
            this.f21771d = fVar;
            return this;
        }

        @Override
        public d.a c(String str) {
            this.f21769b = str;
            return this;
        }

        @Override
        public d.a d(String str) {
            this.f21770c = str;
            return this;
        }

        @Override
        public d.a e(d.b bVar) {
            this.f21772e = bVar;
            return this;
        }

        @Override
        public d.a f(String str) {
            this.f21768a = str;
            return this;
        }
    }

    @Override
    public f b() {
        return this.f21766d;
    }

    @Override
    public String c() {
        return this.f21764b;
    }

    @Override
    public String d() {
        return this.f21765c;
    }

    @Override
    public d.b e() {
        return this.f21767e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f21763a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f21764b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f21765c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f21766d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f21767e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String f() {
        return this.f21763a;
    }

    public int hashCode() {
        String str = this.f21763a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f21764b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f21765c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f21766d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f21767e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f21763a + ", fid=" + this.f21764b + ", refreshToken=" + this.f21765c + ", authToken=" + this.f21766d + ", responseCode=" + this.f21767e + "}";
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f21763a = str;
        this.f21764b = str2;
        this.f21765c = str3;
        this.f21766d = fVar;
        this.f21767e = bVar;
    }
}
