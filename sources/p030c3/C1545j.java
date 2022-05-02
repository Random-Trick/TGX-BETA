package p030c3;

import android.content.Context;
import ga.AbstractC4533a;
import p043d3.AbstractC3589b;
import p146k3.AbstractC6045a;

public final class C1545j implements AbstractC3589b<C1544i> {
    public final AbstractC4533a<Context> f5498a;
    public final AbstractC4533a<AbstractC6045a> f5499b;
    public final AbstractC4533a<AbstractC6045a> f5500c;

    public C1545j(AbstractC4533a<Context> aVar, AbstractC4533a<AbstractC6045a> aVar2, AbstractC4533a<AbstractC6045a> aVar3) {
        this.f5498a = aVar;
        this.f5499b = aVar2;
        this.f5500c = aVar3;
    }

    public static C1545j m36497a(AbstractC4533a<Context> aVar, AbstractC4533a<AbstractC6045a> aVar2, AbstractC4533a<AbstractC6045a> aVar3) {
        return new C1545j(aVar, aVar2, aVar3);
    }

    public static C1544i m36495c(Context context, AbstractC6045a aVar, AbstractC6045a aVar2) {
        return new C1544i(context, aVar, aVar2);
    }

    public C1544i get() {
        return m36495c(this.f5498a.get(), this.f5499b.get(), this.f5500c.get());
    }
}
