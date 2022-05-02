package p088g3;

import ga.AbstractC4533a;
import java.util.concurrent.Executor;
import p030c3.AbstractC1538e;
import p043d3.AbstractC3589b;
import p100h3.AbstractC4950s;
import p116i3.AbstractC5179c;
import p131j3.AbstractC5843b;

public final class C4466d implements AbstractC3589b<C4465c> {
    public final AbstractC4533a<Executor> f14807a;
    public final AbstractC4533a<AbstractC1538e> f14808b;
    public final AbstractC4533a<AbstractC4950s> f14809c;
    public final AbstractC4533a<AbstractC5179c> f14810d;
    public final AbstractC4533a<AbstractC5843b> f14811e;

    public C4466d(AbstractC4533a<Executor> aVar, AbstractC4533a<AbstractC1538e> aVar2, AbstractC4533a<AbstractC4950s> aVar3, AbstractC4533a<AbstractC5179c> aVar4, AbstractC4533a<AbstractC5843b> aVar5) {
        this.f14807a = aVar;
        this.f14808b = aVar2;
        this.f14809c = aVar3;
        this.f14810d = aVar4;
        this.f14811e = aVar5;
    }

    public static C4466d m27559a(AbstractC4533a<Executor> aVar, AbstractC4533a<AbstractC1538e> aVar2, AbstractC4533a<AbstractC4950s> aVar3, AbstractC4533a<AbstractC5179c> aVar4, AbstractC4533a<AbstractC5843b> aVar5) {
        return new C4466d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C4465c m27557c(Executor executor, AbstractC1538e eVar, AbstractC4950s sVar, AbstractC5179c cVar, AbstractC5843b bVar) {
        return new C4465c(executor, eVar, sVar, cVar, bVar);
    }

    public C4465c get() {
        return m27557c(this.f14807a.get(), this.f14808b.get(), this.f14809c.get(), this.f14810d.get(), this.f14811e.get());
    }
}
