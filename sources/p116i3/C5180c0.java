package p116i3;

import ga.AbstractC4533a;
import p043d3.AbstractC3589b;
import p146k3.AbstractC6045a;

public final class C5180c0 implements AbstractC3589b<C5174b0> {
    public final AbstractC4533a<AbstractC6045a> f17304a;
    public final AbstractC4533a<AbstractC6045a> f17305b;
    public final AbstractC4533a<AbstractC5181d> f17306c;
    public final AbstractC4533a<C5194h0> f17307d;

    public C5180c0(AbstractC4533a<AbstractC6045a> aVar, AbstractC4533a<AbstractC6045a> aVar2, AbstractC4533a<AbstractC5181d> aVar3, AbstractC4533a<C5194h0> aVar4) {
        this.f17304a = aVar;
        this.f17305b = aVar2;
        this.f17306c = aVar3;
        this.f17307d = aVar4;
    }

    public static C5180c0 m23668a(AbstractC4533a<AbstractC6045a> aVar, AbstractC4533a<AbstractC6045a> aVar2, AbstractC4533a<AbstractC5181d> aVar3, AbstractC4533a<C5194h0> aVar4) {
        return new C5180c0(aVar, aVar2, aVar3, aVar4);
    }

    public static C5174b0 m23666c(AbstractC6045a aVar, AbstractC6045a aVar2, Object obj, Object obj2) {
        return new C5174b0(aVar, aVar2, (AbstractC5181d) obj, (C5194h0) obj2);
    }

    public C5174b0 get() {
        return m23666c(this.f17304a.get(), this.f17305b.get(), this.f17306c.get(), this.f17307d.get());
    }
}
