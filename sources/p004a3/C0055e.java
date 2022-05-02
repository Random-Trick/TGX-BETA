package p004a3;

import p004a3.AbstractC0069k;

public final class C0055e extends AbstractC0069k {
    public final AbstractC0069k.EnumC0071b f183a;
    public final AbstractC0042a f184b;

    public static final class C0057b extends AbstractC0069k.AbstractC0070a {
        public AbstractC0069k.EnumC0071b f185a;
        public AbstractC0042a f186b;

        @Override
        public AbstractC0069k mo42474a() {
            return new C0055e(this.f185a, this.f186b);
        }

        @Override
        public AbstractC0069k.AbstractC0070a mo42473b(AbstractC0042a aVar) {
            this.f186b = aVar;
            return this;
        }

        @Override
        public AbstractC0069k.AbstractC0070a mo42472c(AbstractC0069k.EnumC0071b bVar) {
            this.f185a = bVar;
            return this;
        }
    }

    @Override
    public AbstractC0042a mo42476b() {
        return this.f184b;
    }

    @Override
    public AbstractC0069k.EnumC0071b mo42475c() {
        return this.f183a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0069k)) {
            return false;
        }
        AbstractC0069k kVar = (AbstractC0069k) obj;
        AbstractC0069k.EnumC0071b bVar = this.f183a;
        if (bVar != null ? bVar.equals(kVar.mo42475c()) : kVar.mo42475c() == null) {
            AbstractC0042a aVar = this.f184b;
            if (aVar == null) {
                if (kVar.mo42476b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.mo42476b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC0069k.EnumC0071b bVar = this.f183a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC0042a aVar = this.f184b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f183a + ", androidClientInfo=" + this.f184b + "}";
    }

    public C0055e(AbstractC0069k.EnumC0071b bVar, AbstractC0042a aVar) {
        this.f183a = bVar;
        this.f184b = aVar;
    }
}
