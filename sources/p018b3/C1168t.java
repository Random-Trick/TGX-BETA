package p018b3;

import ga.AbstractC4533a;
import p043d3.AbstractC3589b;
import p088g3.AbstractC4467e;
import p100h3.C4944m;
import p100h3.C4948q;
import p146k3.AbstractC6045a;

public final class C1168t implements AbstractC3589b<C1165r> {
    public final AbstractC4533a<AbstractC6045a> f4397a;
    public final AbstractC4533a<AbstractC6045a> f4398b;
    public final AbstractC4533a<AbstractC4467e> f4399c;
    public final AbstractC4533a<C4944m> f4400d;
    public final AbstractC4533a<C4948q> f4401e;

    public C1168t(AbstractC4533a<AbstractC6045a> aVar, AbstractC4533a<AbstractC6045a> aVar2, AbstractC4533a<AbstractC4467e> aVar3, AbstractC4533a<C4944m> aVar4, AbstractC4533a<C4948q> aVar5) {
        this.f4397a = aVar;
        this.f4398b = aVar2;
        this.f4399c = aVar3;
        this.f4400d = aVar4;
        this.f4401e = aVar5;
    }

    public static C1168t m38244a(AbstractC4533a<AbstractC6045a> aVar, AbstractC4533a<AbstractC6045a> aVar2, AbstractC4533a<AbstractC4467e> aVar3, AbstractC4533a<C4944m> aVar4, AbstractC4533a<C4948q> aVar5) {
        return new C1168t(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C1165r m38242c(AbstractC6045a aVar, AbstractC6045a aVar2, AbstractC4467e eVar, C4944m mVar, C4948q qVar) {
        return new C1165r(aVar, aVar2, eVar, mVar, qVar);
    }

    public C1165r get() {
        return m38242c(this.f4397a.get(), this.f4398b.get(), this.f4399c.get(), this.f4400d.get(), this.f4401e.get());
    }
}
