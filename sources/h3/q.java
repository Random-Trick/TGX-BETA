package h3;

import d3.b;
import ha.a;
import i3.c;
import java.util.concurrent.Executor;

public final class q implements b<p> {
    public final a<Executor> f12514a;
    public final a<c> f12515b;
    public final a<r> f12516c;
    public final a<j3.b> f12517d;

    public q(a<Executor> aVar, a<c> aVar2, a<r> aVar3, a<j3.b> aVar4) {
        this.f12514a = aVar;
        this.f12515b = aVar2;
        this.f12516c = aVar3;
        this.f12517d = aVar4;
    }

    public static q a(a<Executor> aVar, a<c> aVar2, a<r> aVar3, a<j3.b> aVar4) {
        return new q(aVar, aVar2, aVar3, aVar4);
    }

    public static p c(Executor executor, c cVar, r rVar, j3.b bVar) {
        return new p(executor, cVar, rVar, bVar);
    }

    public p get() {
        return c(this.f12514a.get(), this.f12515b.get(), this.f12516c.get(), this.f12517d.get());
    }
}
