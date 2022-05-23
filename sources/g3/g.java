package g3;

import d3.b;
import d3.d;
import h3.f;
import ha.a;

public final class g implements b<f> {
    public final a<k3.a> f12095a;

    public g(a<k3.a> aVar) {
        this.f12095a = aVar;
    }

    public static f a(k3.a aVar) {
        return (f) d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(a<k3.a> aVar) {
        return new g(aVar);
    }

    public f get() {
        return a(this.f12095a.get());
    }
}
