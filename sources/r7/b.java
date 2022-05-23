package r7;

import r7.f;

public final class b extends f {
    public final String f21773a;
    public final long f21774b;
    public final f.b f21775c;

    public static final class C0208b extends f.a {
        public String f21776a;
        public Long f21777b;
        public f.b f21778c;

        @Override
        public f a() {
            String str = "";
            if (this.f21777b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f21776a, this.f21777b.longValue(), this.f21778c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public f.a b(f.b bVar) {
            this.f21778c = bVar;
            return this;
        }

        @Override
        public f.a c(String str) {
            this.f21776a = str;
            return this;
        }

        @Override
        public f.a d(long j10) {
            this.f21777b = Long.valueOf(j10);
            return this;
        }
    }

    @Override
    public f.b b() {
        return this.f21775c;
    }

    @Override
    public String c() {
        return this.f21773a;
    }

    @Override
    public long d() {
        return this.f21774b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f21773a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f21774b == fVar.d()) {
                f.b bVar = this.f21775c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f21773a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f21774b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f21775c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "TokenResult{token=" + this.f21773a + ", tokenExpirationTimestamp=" + this.f21774b + ", responseCode=" + this.f21775c + "}";
    }

    public b(String str, long j10, f.b bVar) {
        this.f21773a = str;
        this.f21774b = j10;
        this.f21775c = bVar;
    }
}
