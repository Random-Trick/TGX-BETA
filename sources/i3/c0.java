package i3;

import d3.b;
import ha.a;

public final class c0 implements b<b0> {
    public final a<k3.a> f13946a;
    public final a<k3.a> f13947b;
    public final a<d> f13948c;
    public final a<h0> f13949d;

    public c0(a<k3.a> aVar, a<k3.a> aVar2, a<d> aVar3, a<h0> aVar4) {
        this.f13946a = aVar;
        this.f13947b = aVar2;
        this.f13948c = aVar3;
        this.f13949d = aVar4;
    }

    public static c0 a(a<k3.a> aVar, a<k3.a> aVar2, a<d> aVar3, a<h0> aVar4) {
        return new c0(aVar, aVar2, aVar3, aVar4);
    }

    public static b0 c(k3.a aVar, k3.a aVar2, Object obj, Object obj2) {
        return new b0(aVar, aVar2, (d) obj, (h0) obj2);
    }

    public b0 get() {
        return c(this.f13946a.get(), this.f13947b.get(), this.f13948c.get(), this.f13949d.get());
    }
}
