package a3;

import a3.o;

public final class i extends o {
    public final o.c f202a;
    public final o.b f203b;

    public static final class b extends o.a {
        public o.c f204a;
        public o.b f205b;

        @Override
        public o a() {
            return new i(this.f204a, this.f205b);
        }

        @Override
        public o.a b(o.b bVar) {
            this.f205b = bVar;
            return this;
        }

        @Override
        public o.a c(o.c cVar) {
            this.f204a = cVar;
            return this;
        }
    }

    @Override
    public o.b b() {
        return this.f203b;
    }

    @Override
    public o.c c() {
        return this.f202a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f202a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f203b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f202a;
        int i10 = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f203b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f202a + ", mobileSubtype=" + this.f203b + "}";
    }

    public i(o.c cVar, o.b bVar) {
        this.f202a = cVar;
        this.f203b = bVar;
    }
}
