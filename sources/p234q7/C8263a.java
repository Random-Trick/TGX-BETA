package p234q7;

import p234q7.AbstractC8270d;

public final class C8263a extends AbstractC8270d {
    public final String f26723a;
    public final String f26724b;
    public final String f26725c;
    public final AbstractC8274f f26726d;
    public final AbstractC8270d.EnumC8272b f26727e;

    public static final class C8265b extends AbstractC8270d.AbstractC8271a {
        public String f26728a;
        public String f26729b;
        public String f26730c;
        public AbstractC8274f f26731d;
        public AbstractC8270d.EnumC8272b f26732e;

        @Override
        public AbstractC8270d mo12988a() {
            return new C8263a(this.f26728a, this.f26729b, this.f26730c, this.f26731d, this.f26732e);
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12987b(AbstractC8274f fVar) {
            this.f26731d = fVar;
            return this;
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12986c(String str) {
            this.f26729b = str;
            return this;
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12985d(String str) {
            this.f26730c = str;
            return this;
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12984e(AbstractC8270d.EnumC8272b bVar) {
            this.f26732e = bVar;
            return this;
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12983f(String str) {
            this.f26728a = str;
            return this;
        }
    }

    @Override
    public AbstractC8274f mo12993b() {
        return this.f26726d;
    }

    @Override
    public String mo12992c() {
        return this.f26724b;
    }

    @Override
    public String mo12991d() {
        return this.f26725c;
    }

    @Override
    public AbstractC8270d.EnumC8272b mo12990e() {
        return this.f26727e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8270d)) {
            return false;
        }
        AbstractC8270d dVar = (AbstractC8270d) obj;
        String str = this.f26723a;
        if (str != null ? str.equals(dVar.mo12989f()) : dVar.mo12989f() == null) {
            String str2 = this.f26724b;
            if (str2 != null ? str2.equals(dVar.mo12992c()) : dVar.mo12992c() == null) {
                String str3 = this.f26725c;
                if (str3 != null ? str3.equals(dVar.mo12991d()) : dVar.mo12991d() == null) {
                    AbstractC8274f fVar = this.f26726d;
                    if (fVar != null ? fVar.equals(dVar.mo12993b()) : dVar.mo12993b() == null) {
                        AbstractC8270d.EnumC8272b bVar = this.f26727e;
                        if (bVar == null) {
                            if (dVar.mo12990e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.mo12990e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String mo12989f() {
        return this.f26723a;
    }

    public int hashCode() {
        String str = this.f26723a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f26724b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f26725c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC8274f fVar = this.f26726d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC8270d.EnumC8272b bVar = this.f26727e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f26723a + ", fid=" + this.f26724b + ", refreshToken=" + this.f26725c + ", authToken=" + this.f26726d + ", responseCode=" + this.f26727e + "}";
    }

    public C8263a(String str, String str2, String str3, AbstractC8274f fVar, AbstractC8270d.EnumC8272b bVar) {
        this.f26723a = str;
        this.f26724b = str2;
        this.f26725c = str3;
        this.f26726d = fVar;
        this.f26727e = bVar;
    }
}
