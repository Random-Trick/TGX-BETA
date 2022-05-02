package p220p7;

import java.util.Objects;
import p220p7.AbstractC8061d;
import p220p7.C8059c;

public final class C8055a extends AbstractC8061d {
    public final String f26226b;
    public final C8059c.EnumC8060a f26227c;
    public final String f26228d;
    public final String f26229e;
    public final long f26230f;
    public final long f26231g;
    public final String f26232h;

    public static final class C8057b extends AbstractC8061d.AbstractC8062a {
        public String f26233a;
        public C8059c.EnumC8060a f26234b;
        public String f26235c;
        public String f26236d;
        public Long f26237e;
        public Long f26238f;
        public String f26239g;

        @Override
        public AbstractC8061d mo13657a() {
            String str = "";
            if (this.f26234b == null) {
                str = str + " registrationStatus";
            }
            if (this.f26237e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f26238f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C8055a(this.f26233a, this.f26234b, this.f26235c, this.f26236d, this.f26237e.longValue(), this.f26238f.longValue(), this.f26239g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13656b(String str) {
            this.f26235c = str;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13655c(long j) {
            this.f26237e = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13654d(String str) {
            this.f26233a = str;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13653e(String str) {
            this.f26239g = str;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13652f(String str) {
            this.f26236d = str;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13651g(C8059c.EnumC8060a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f26234b = aVar;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13650h(long j) {
            this.f26238f = Long.valueOf(j);
            return this;
        }

        public C8057b() {
        }

        public C8057b(AbstractC8061d dVar) {
            this.f26233a = dVar.mo13674d();
            this.f26234b = dVar.mo13671g();
            this.f26235c = dVar.mo13676b();
            this.f26236d = dVar.mo13672f();
            this.f26237e = Long.valueOf(dVar.mo13675c());
            this.f26238f = Long.valueOf(dVar.mo13670h());
            this.f26239g = dVar.mo13673e();
        }
    }

    @Override
    public String mo13676b() {
        return this.f26228d;
    }

    @Override
    public long mo13675c() {
        return this.f26230f;
    }

    @Override
    public String mo13674d() {
        return this.f26226b;
    }

    @Override
    public String mo13673e() {
        return this.f26232h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8061d)) {
            return false;
        }
        AbstractC8061d dVar = (AbstractC8061d) obj;
        String str3 = this.f26226b;
        if (str3 != null ? str3.equals(dVar.mo13674d()) : dVar.mo13674d() == null) {
            if (this.f26227c.equals(dVar.mo13671g()) && ((str = this.f26228d) != null ? str.equals(dVar.mo13676b()) : dVar.mo13676b() == null) && ((str2 = this.f26229e) != null ? str2.equals(dVar.mo13672f()) : dVar.mo13672f() == null) && this.f26230f == dVar.mo13675c() && this.f26231g == dVar.mo13670h()) {
                String str4 = this.f26232h;
                if (str4 == null) {
                    if (dVar.mo13673e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.mo13673e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String mo13672f() {
        return this.f26229e;
    }

    @Override
    public C8059c.EnumC8060a mo13671g() {
        return this.f26227c;
    }

    @Override
    public long mo13670h() {
        return this.f26231g;
    }

    public int hashCode() {
        String str = this.f26226b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f26227c.hashCode()) * 1000003;
        String str2 = this.f26228d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f26229e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f26230f;
        long j2 = this.f26231g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f26232h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    @Override
    public AbstractC8061d.AbstractC8062a mo13664n() {
        return new C8057b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f26226b + ", registrationStatus=" + this.f26227c + ", authToken=" + this.f26228d + ", refreshToken=" + this.f26229e + ", expiresInSecs=" + this.f26230f + ", tokenCreationEpochInSecs=" + this.f26231g + ", fisError=" + this.f26232h + "}";
    }

    public C8055a(String str, C8059c.EnumC8060a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f26226b = str;
        this.f26227c = aVar;
        this.f26228d = str2;
        this.f26229e = str3;
        this.f26230f = j;
        this.f26231g = j2;
        this.f26232h = str4;
    }
}
