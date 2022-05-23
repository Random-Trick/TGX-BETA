package q7;

import java.util.Objects;
import q7.c;
import q7.d;

public final class a extends d {
    public final String f21429b;
    public final c.a f21430c;
    public final String f21431d;
    public final String f21432e;
    public final long f21433f;
    public final long f21434g;
    public final String f21435h;

    public static final class b extends d.a {
        public String f21436a;
        public c.a f21437b;
        public String f21438c;
        public String f21439d;
        public Long f21440e;
        public Long f21441f;
        public String f21442g;

        @Override
        public d a() {
            String str = "";
            if (this.f21437b == null) {
                str = str + " registrationStatus";
            }
            if (this.f21440e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f21441f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f21436a, this.f21437b, this.f21438c, this.f21439d, this.f21440e.longValue(), this.f21441f.longValue(), this.f21442g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public d.a b(String str) {
            this.f21438c = str;
            return this;
        }

        @Override
        public d.a c(long j10) {
            this.f21440e = Long.valueOf(j10);
            return this;
        }

        @Override
        public d.a d(String str) {
            this.f21436a = str;
            return this;
        }

        @Override
        public d.a e(String str) {
            this.f21442g = str;
            return this;
        }

        @Override
        public d.a f(String str) {
            this.f21439d = str;
            return this;
        }

        @Override
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f21437b = aVar;
            return this;
        }

        @Override
        public d.a h(long j10) {
            this.f21441f = Long.valueOf(j10);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f21436a = dVar.d();
            this.f21437b = dVar.g();
            this.f21438c = dVar.b();
            this.f21439d = dVar.f();
            this.f21440e = Long.valueOf(dVar.c());
            this.f21441f = Long.valueOf(dVar.h());
            this.f21442g = dVar.e();
        }
    }

    @Override
    public String b() {
        return this.f21431d;
    }

    @Override
    public long c() {
        return this.f21433f;
    }

    @Override
    public String d() {
        return this.f21429b;
    }

    @Override
    public String e() {
        return this.f21435h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f21429b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f21430c.equals(dVar.g()) && ((str = this.f21431d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f21432e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f21433f == dVar.c() && this.f21434g == dVar.h()) {
                String str4 = this.f21435h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String f() {
        return this.f21432e;
    }

    @Override
    public c.a g() {
        return this.f21430c;
    }

    @Override
    public long h() {
        return this.f21434g;
    }

    public int hashCode() {
        String str = this.f21429b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f21430c.hashCode()) * 1000003;
        String str2 = this.f21431d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f21432e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f21433f;
        long j11 = this.f21434g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f21435h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    @Override
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f21429b + ", registrationStatus=" + this.f21430c + ", authToken=" + this.f21431d + ", refreshToken=" + this.f21432e + ", expiresInSecs=" + this.f21433f + ", tokenCreationEpochInSecs=" + this.f21434g + ", fisError=" + this.f21435h + "}";
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f21429b = str;
        this.f21430c = aVar;
        this.f21431d = str2;
        this.f21432e = str3;
        this.f21433f = j10;
        this.f21434g = j11;
        this.f21435h = str4;
    }
}
