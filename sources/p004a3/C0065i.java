package p004a3;

import p004a3.AbstractC0077o;

public final class C0065i extends AbstractC0077o {
    public final AbstractC0077o.EnumC0080c f216a;
    public final AbstractC0077o.EnumC0079b f217b;

    public static final class C0067b extends AbstractC0077o.AbstractC0078a {
        public AbstractC0077o.EnumC0080c f218a;
        public AbstractC0077o.EnumC0079b f219b;

        @Override
        public AbstractC0077o mo42429a() {
            return new C0065i(this.f218a, this.f219b);
        }

        @Override
        public AbstractC0077o.AbstractC0078a mo42428b(AbstractC0077o.EnumC0079b bVar) {
            this.f219b = bVar;
            return this;
        }

        @Override
        public AbstractC0077o.AbstractC0078a mo42427c(AbstractC0077o.EnumC0080c cVar) {
            this.f218a = cVar;
            return this;
        }
    }

    @Override
    public AbstractC0077o.EnumC0079b mo42431b() {
        return this.f217b;
    }

    @Override
    public AbstractC0077o.EnumC0080c mo42430c() {
        return this.f216a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0077o)) {
            return false;
        }
        AbstractC0077o oVar = (AbstractC0077o) obj;
        AbstractC0077o.EnumC0080c cVar = this.f216a;
        if (cVar != null ? cVar.equals(oVar.mo42430c()) : oVar.mo42430c() == null) {
            AbstractC0077o.EnumC0079b bVar = this.f217b;
            if (bVar == null) {
                if (oVar.mo42431b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.mo42431b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC0077o.EnumC0080c cVar = this.f216a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC0077o.EnumC0079b bVar = this.f217b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f216a + ", mobileSubtype=" + this.f217b + "}";
    }

    public C0065i(AbstractC0077o.EnumC0080c cVar, AbstractC0077o.EnumC0079b bVar) {
        this.f216a = cVar;
        this.f217b = bVar;
    }
}
