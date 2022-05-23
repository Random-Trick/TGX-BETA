package a3;

import a3.k;

public final class e extends k {
    public final k.b f169a;
    public final a3.a f170b;

    public static final class b extends k.a {
        public k.b f171a;
        public a3.a f172b;

        @Override
        public k a() {
            return new e(this.f171a, this.f172b);
        }

        @Override
        public k.a b(a3.a aVar) {
            this.f172b = aVar;
            return this;
        }

        @Override
        public k.a c(k.b bVar) {
            this.f171a = bVar;
            return this;
        }
    }

    @Override
    public a3.a b() {
        return this.f170b;
    }

    @Override
    public k.b c() {
        return this.f169a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f169a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            a3.a aVar = this.f170b;
            if (aVar == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f169a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a3.a aVar = this.f170b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f169a + ", androidClientInfo=" + this.f170b + "}";
    }

    public e(k.b bVar, a3.a aVar) {
        this.f169a = bVar;
        this.f170b = aVar;
    }
}
