package p100h3;

import ga.AbstractC4533a;
import java.util.concurrent.Executor;
import p043d3.AbstractC3589b;
import p116i3.AbstractC5179c;
import p131j3.AbstractC5843b;

public final class C4949r implements AbstractC3589b<C4948q> {
    public final AbstractC4533a<Executor> f16859a;
    public final AbstractC4533a<AbstractC5179c> f16860b;
    public final AbstractC4533a<AbstractC4950s> f16861c;
    public final AbstractC4533a<AbstractC5843b> f16862d;

    public C4949r(AbstractC4533a<Executor> aVar, AbstractC4533a<AbstractC5179c> aVar2, AbstractC4533a<AbstractC4950s> aVar3, AbstractC4533a<AbstractC5843b> aVar4) {
        this.f16859a = aVar;
        this.f16860b = aVar2;
        this.f16861c = aVar3;
        this.f16862d = aVar4;
    }

    public static C4949r m24395a(AbstractC4533a<Executor> aVar, AbstractC4533a<AbstractC5179c> aVar2, AbstractC4533a<AbstractC4950s> aVar3, AbstractC4533a<AbstractC5843b> aVar4) {
        return new C4949r(aVar, aVar2, aVar3, aVar4);
    }

    public static C4948q m24393c(Executor executor, AbstractC5179c cVar, AbstractC4950s sVar, AbstractC5843b bVar) {
        return new C4948q(executor, cVar, sVar, bVar);
    }

    public C4948q get() {
        return m24393c(this.f16859a.get(), this.f16860b.get(), this.f16861c.get(), this.f16862d.get());
    }
}
