package g3;

import c3.e;
import d3.b;
import h3.r;
import ha.a;
import i3.c;
import java.util.concurrent.Executor;

public final class d implements b<c> {
    public final a<Executor> f12090a;
    public final a<e> f12091b;
    public final a<r> f12092c;
    public final a<c> f12093d;
    public final a<j3.b> f12094e;

    public d(a<Executor> aVar, a<e> aVar2, a<r> aVar3, a<c> aVar4, a<j3.b> aVar5) {
        this.f12090a = aVar;
        this.f12091b = aVar2;
        this.f12092c = aVar3;
        this.f12093d = aVar4;
        this.f12094e = aVar5;
    }

    public static d a(a<Executor> aVar, a<e> aVar2, a<r> aVar3, a<c> aVar4, a<j3.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, e eVar, r rVar, c cVar, j3.b bVar) {
        return new c(executor, eVar, rVar, cVar, bVar);
    }

    public c get() {
        return c(this.f12090a.get(), this.f12091b.get(), this.f12092c.get(), this.f12093d.get(), this.f12094e.get());
    }
}
