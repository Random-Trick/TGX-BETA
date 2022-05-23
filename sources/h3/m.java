package h3;

import android.content.Context;
import c3.e;
import d3.b;
import ha.a;
import i3.c;
import java.util.concurrent.Executor;

public final class m implements b<l> {
    public final a<Context> f12501a;
    public final a<e> f12502b;
    public final a<c> f12503c;
    public final a<r> f12504d;
    public final a<Executor> f12505e;
    public final a<j3.b> f12506f;
    public final a<k3.a> f12507g;

    public m(a<Context> aVar, a<e> aVar2, a<c> aVar3, a<r> aVar4, a<Executor> aVar5, a<j3.b> aVar6, a<k3.a> aVar7) {
        this.f12501a = aVar;
        this.f12502b = aVar2;
        this.f12503c = aVar3;
        this.f12504d = aVar4;
        this.f12505e = aVar5;
        this.f12506f = aVar6;
        this.f12507g = aVar7;
    }

    public static m a(a<Context> aVar, a<e> aVar2, a<c> aVar3, a<r> aVar4, a<Executor> aVar5, a<j3.b> aVar6, a<k3.a> aVar7) {
        return new m(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static l c(Context context, e eVar, c cVar, r rVar, Executor executor, j3.b bVar, k3.a aVar) {
        return new l(context, eVar, cVar, rVar, executor, bVar, aVar);
    }

    public l get() {
        return c(this.f12501a.get(), this.f12502b.get(), this.f12503c.get(), this.f12504d.get(), this.f12505e.get(), this.f12506f.get(), this.f12507g.get());
    }
}
