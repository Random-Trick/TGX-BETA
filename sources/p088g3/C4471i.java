package p088g3;

import android.content.Context;
import ga.AbstractC4533a;
import p043d3.AbstractC3589b;
import p043d3.C3591d;
import p100h3.AbstractC4934g;
import p100h3.AbstractC4950s;
import p116i3.AbstractC5179c;
import p146k3.AbstractC6045a;

public final class C4471i implements AbstractC3589b<AbstractC4950s> {
    public final AbstractC4533a<Context> f14813a;
    public final AbstractC4533a<AbstractC5179c> f14814b;
    public final AbstractC4533a<AbstractC4934g> f14815c;
    public final AbstractC4533a<AbstractC6045a> f14816d;

    public C4471i(AbstractC4533a<Context> aVar, AbstractC4533a<AbstractC5179c> aVar2, AbstractC4533a<AbstractC4934g> aVar3, AbstractC4533a<AbstractC6045a> aVar4) {
        this.f14813a = aVar;
        this.f14814b = aVar2;
        this.f14815c = aVar3;
        this.f14816d = aVar4;
    }

    public static C4471i m27550a(AbstractC4533a<Context> aVar, AbstractC4533a<AbstractC5179c> aVar2, AbstractC4533a<AbstractC4934g> aVar3, AbstractC4533a<AbstractC6045a> aVar4) {
        return new C4471i(aVar, aVar2, aVar3, aVar4);
    }

    public static AbstractC4950s m27548c(Context context, AbstractC5179c cVar, AbstractC4934g gVar, AbstractC6045a aVar) {
        return (AbstractC4950s) C3591d.m29917c(AbstractC4470h.m27551a(context, cVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public AbstractC4950s get() {
        return m27548c(this.f14813a.get(), this.f14814b.get(), this.f14815c.get(), this.f14816d.get());
    }
}
