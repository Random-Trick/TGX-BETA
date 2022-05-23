package v7;

import z5.f0;
import z5.k;

public final class b {
    public static final b f24780b = new a().a();
    public final v7.a f24781a;

    public static final class a {
        public v7.a f24782a = null;

        public b a() {
            return new b(this.f24782a);
        }

        public a b(v7.a aVar) {
            this.f24782a = aVar;
            return this;
        }
    }

    public b(v7.a aVar) {
        this.f24781a = aVar;
    }

    public static a b() {
        return new a();
    }

    @f0(zza = 1)
    public v7.a a() {
        return this.f24781a;
    }

    public byte[] c() {
        return k.a(this);
    }
}
