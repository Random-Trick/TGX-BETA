package b3;

import d3.b;
import g3.e;
import h3.l;
import h3.p;
import ha.a;

public final class t implements b<r> {
    public final a<k3.a> f3749a;
    public final a<k3.a> f3750b;
    public final a<e> f3751c;
    public final a<l> f3752d;
    public final a<p> f3753e;

    public t(a<k3.a> aVar, a<k3.a> aVar2, a<e> aVar3, a<l> aVar4, a<p> aVar5) {
        this.f3749a = aVar;
        this.f3750b = aVar2;
        this.f3751c = aVar3;
        this.f3752d = aVar4;
        this.f3753e = aVar5;
    }

    public static t a(a<k3.a> aVar, a<k3.a> aVar2, a<e> aVar3, a<l> aVar4, a<p> aVar5) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static r c(k3.a aVar, k3.a aVar2, e eVar, l lVar, p pVar) {
        return new r(aVar, aVar2, eVar, lVar, pVar);
    }

    public r get() {
        return c(this.f3749a.get(), this.f3750b.get(), this.f3751c.get(), this.f3752d.get(), this.f3753e.get());
    }
}
