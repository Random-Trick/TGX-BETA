package p030c3;

import android.content.Context;
import ga.AbstractC4533a;
import p043d3.AbstractC3589b;

public final class C1548l implements AbstractC3589b<C1546k> {
    public final AbstractC4533a<Context> f5506a;
    public final AbstractC4533a<C1544i> f5507b;

    public C1548l(AbstractC4533a<Context> aVar, AbstractC4533a<C1544i> aVar2) {
        this.f5506a = aVar;
        this.f5507b = aVar2;
    }

    public static C1548l m36489a(AbstractC4533a<Context> aVar, AbstractC4533a<C1544i> aVar2) {
        return new C1548l(aVar, aVar2);
    }

    public static C1546k m36487c(Context context, Object obj) {
        return new C1546k(context, (C1544i) obj);
    }

    public C1546k get() {
        return m36487c(this.f5506a.get(), this.f5507b.get());
    }
}
