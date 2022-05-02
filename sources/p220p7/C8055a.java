package p220p7;

import java.util.Objects;
import p220p7.AbstractC8061d;
import p220p7.C8059c;

public final class C8055a extends AbstractC8061d {
    public final String f26229b;
    public final C8059c.EnumC8060a f26230c;
    public final String f26231d;
    public final String f26232e;
    public final long f26233f;
    public final long f26234g;
    public final String f26235h;

    public static final class C8057b extends AbstractC8061d.AbstractC8062a {
        public String f26236a;
        public C8059c.EnumC8060a f26237b;
        public String f26238c;
        public String f26239d;
        public Long f26240e;
        public Long f26241f;
        public String f26242g;

        @Override
        public AbstractC8061d mo13656a() {
            String str = "";
            if (this.f26237b == null) {
                str = str + " registrationStatus";
            }
            if (this.f26240e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f26241f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C8055a(this.f26236a, this.f26237b, this.f26238c, this.f26239d, this.f26240e.longValue(), this.f26241f.longValue(), this.f26242g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13655b(String str) {
            this.f26238c = str;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13654c(long j) {
            this.f26240e = Long.valueOf(j);
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13653d(String str) {
            this.f26236a = str;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13652e(String str) {
            this.f26242g = str;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13651f(String str) {
            this.f26239d = str;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13650g(C8059c.EnumC8060a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f26237b = aVar;
            return this;
        }

        @Override
        public AbstractC8061d.AbstractC8062a mo13649h(long j) {
            this.f26241f = Long.valueOf(j);
            return this;
        }

        public C8057b() {
        }

        public C8057b(AbstractC8061d dVar) {
            this.f26236a = dVar.mo13673d();
            this.f26237b = dVar.mo13670g();
            this.f26238c = dVar.mo13675b();
            this.f26239d = dVar.mo13671f();
            this.f26240e = Long.valueOf(dVar.mo13674c());
            this.f26241f = Long.valueOf(dVar.mo13669h());
            this.f26242g = dVar.mo13672e();
        }
    }

    @Override
    public String mo13675b() {
        return this.f26231d;
    }

    @Override
    public long mo13674c() {
        return this.f26233f;
    }

    @Override
    public String mo13673d() {
        return this.f26229b;
    }

    @Override
    public String mo13672e() {
        return this.f26235h;
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
        String str3 = this.f26229b;
        if (str3 != null ? str3.equals(dVar.mo13673d()) : dVar.mo13673d() == null) {
            if (this.f26230c.equals(dVar.mo13670g()) && ((str = this.f26231d) != null ? str.equals(dVar.mo13675b()) : dVar.mo13675b() == null) && ((str2 = this.f26232e) != null ? str2.equals(dVar.mo13671f()) : dVar.mo13671f() == null) && this.f26233f == dVar.mo13674c() && this.f26234g == dVar.mo13669h()) {
                String str4 = this.f26235h;
                if (str4 == null) {
                    if (dVar.mo13672e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.mo13672e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String mo13671f() {
        return this.f26232e;
    }

    @Override
    public C8059c.EnumC8060a mo13670g() {
        return this.f26230c;
    }

    @Override
    public long mo13669h() {
        return this.f26234g;
    }

    public int hashCode() {
        String str = this.f26229b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f26230c.hashCode()) * 1000003;
        String str2 = this.f26231d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f26232e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f26233f;
        long j2 = this.f26234g;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f26235h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    @Override
    public AbstractC8061d.AbstractC8062a mo13663n() {
        return new C8057b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f26229b + ", registrationStatus=" + this.f26230c + ", authToken=" + this.f26231d + ", refreshToken=" + this.f26232e + ", expiresInSecs=" + this.f26233f + ", tokenCreationEpochInSecs=" + this.f26234g + ", fisError=" + this.f26235h + "}";
    }

    public C8055a(String str, C8059c.EnumC8060a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f26229b = str;
        this.f26230c = aVar;
        this.f26231d = str2;
        this.f26232e = str3;
        this.f26233f = j;
        this.f26234g = j2;
        this.f26235h = str4;
    }
}
