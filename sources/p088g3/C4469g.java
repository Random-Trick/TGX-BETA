package p088g3;

import ga.AbstractC4533a;
import p043d3.AbstractC3589b;
import p043d3.C3591d;
import p100h3.AbstractC4934g;
import p146k3.AbstractC6045a;

public final class C4469g implements AbstractC3589b<AbstractC4934g> {
    public final AbstractC4533a<AbstractC6045a> f14812a;

    public C4469g(AbstractC4533a<AbstractC6045a> aVar) {
        this.f14812a = aVar;
    }

    public static AbstractC4934g m27552a(AbstractC6045a aVar) {
        return (AbstractC4934g) C3591d.m29915c(AbstractC4468f.m27553a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static C4469g m27551b(AbstractC4533a<AbstractC6045a> aVar) {
        return new C4469g(aVar);
    }

    public AbstractC4934g get() {
        return m27552a(this.f14812a.get());
    }
}
