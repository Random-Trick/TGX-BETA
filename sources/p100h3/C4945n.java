package p100h3;

import android.content.Context;
import ga.AbstractC4533a;
import java.util.concurrent.Executor;
import p030c3.AbstractC1538e;
import p043d3.AbstractC3589b;
import p116i3.AbstractC5179c;
import p131j3.AbstractC5843b;
import p146k3.AbstractC6045a;

public final class C4945n implements AbstractC3589b<C4944m> {
    public final AbstractC4533a<Context> f16846a;
    public final AbstractC4533a<AbstractC1538e> f16847b;
    public final AbstractC4533a<AbstractC5179c> f16848c;
    public final AbstractC4533a<AbstractC4950s> f16849d;
    public final AbstractC4533a<Executor> f16850e;
    public final AbstractC4533a<AbstractC5843b> f16851f;
    public final AbstractC4533a<AbstractC6045a> f16852g;

    public C4945n(AbstractC4533a<Context> aVar, AbstractC4533a<AbstractC1538e> aVar2, AbstractC4533a<AbstractC5179c> aVar3, AbstractC4533a<AbstractC4950s> aVar4, AbstractC4533a<Executor> aVar5, AbstractC4533a<AbstractC5843b> aVar6, AbstractC4533a<AbstractC6045a> aVar7) {
        this.f16846a = aVar;
        this.f16847b = aVar2;
        this.f16848c = aVar3;
        this.f16849d = aVar4;
        this.f16850e = aVar5;
        this.f16851f = aVar6;
        this.f16852g = aVar7;
    }

    public static C4945n m24404a(AbstractC4533a<Context> aVar, AbstractC4533a<AbstractC1538e> aVar2, AbstractC4533a<AbstractC5179c> aVar3, AbstractC4533a<AbstractC4950s> aVar4, AbstractC4533a<Executor> aVar5, AbstractC4533a<AbstractC5843b> aVar6, AbstractC4533a<AbstractC6045a> aVar7) {
        return new C4945n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static C4944m m24402c(Context context, AbstractC1538e eVar, AbstractC5179c cVar, AbstractC4950s sVar, Executor executor, AbstractC5843b bVar, AbstractC6045a aVar) {
        return new C4944m(context, eVar, cVar, sVar, executor, bVar, aVar);
    }

    public C4944m get() {
        return m24402c(this.f16846a.get(), this.f16847b.get(), this.f16848c.get(), this.f16849d.get(), this.f16850e.get(), this.f16851f.get(), this.f16852g.get());
    }
}
