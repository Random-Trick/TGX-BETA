package p234q7;

import p234q7.AbstractC8270d;

public final class C8263a extends AbstractC8270d {
    public final String f26720a;
    public final String f26721b;
    public final String f26722c;
    public final AbstractC8274f f26723d;
    public final AbstractC8270d.EnumC8272b f26724e;

    public static final class C8265b extends AbstractC8270d.AbstractC8271a {
        public String f26725a;
        public String f26726b;
        public String f26727c;
        public AbstractC8274f f26728d;
        public AbstractC8270d.EnumC8272b f26729e;

        @Override
        public AbstractC8270d mo12989a() {
            return new C8263a(this.f26725a, this.f26726b, this.f26727c, this.f26728d, this.f26729e);
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12988b(AbstractC8274f fVar) {
            this.f26728d = fVar;
            return this;
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12987c(String str) {
            this.f26726b = str;
            return this;
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12986d(String str) {
            this.f26727c = str;
            return this;
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12985e(AbstractC8270d.EnumC8272b bVar) {
            this.f26729e = bVar;
            return this;
        }

        @Override
        public AbstractC8270d.AbstractC8271a mo12984f(String str) {
            this.f26725a = str;
            return this;
        }
    }

    @Override
    public AbstractC8274f mo12994b() {
        return this.f26723d;
    }

    @Override
    public String mo12993c() {
        return this.f26721b;
    }

    @Override
    public String mo12992d() {
        return this.f26722c;
    }

    @Override
    public AbstractC8270d.EnumC8272b mo12991e() {
        return this.f26724e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8270d)) {
            return false;
        }
        AbstractC8270d dVar = (AbstractC8270d) obj;
        String str = this.f26720a;
        if (str != null ? str.equals(dVar.mo12990f()) : dVar.mo12990f() == null) {
            String str2 = this.f26721b;
            if (str2 != null ? str2.equals(dVar.mo12993c()) : dVar.mo12993c() == null) {
                String str3 = this.f26722c;
                if (str3 != null ? str3.equals(dVar.mo12992d()) : dVar.mo12992d() == null) {
                    AbstractC8274f fVar = this.f26723d;
                    if (fVar != null ? fVar.equals(dVar.mo12994b()) : dVar.mo12994b() == null) {
                        AbstractC8270d.EnumC8272b bVar = this.f26724e;
                        if (bVar == null) {
                            if (dVar.mo12991e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.mo12991e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String mo12990f() {
        return this.f26720a;
    }

    public int hashCode() {
        String str = this.f26720a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f26721b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f26722c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC8274f fVar = this.f26723d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC8270d.EnumC8272b bVar = this.f26724e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f26720a + ", fid=" + this.f26721b + ", refreshToken=" + this.f26722c + ", authToken=" + this.f26723d + ", responseCode=" + this.f26724e + "}";
    }

    public C8263a(String str, String str2, String str3, AbstractC8274f fVar, AbstractC8270d.EnumC8272b bVar) {
        this.f26720a = str;
        this.f26721b = str2;
        this.f26722c = str3;
        this.f26723d = fVar;
        this.f26724e = bVar;
    }
}
