package p116i3;

import android.content.Context;
import ga.AbstractC4533a;
import p043d3.AbstractC3589b;

public final class C5197i0 implements AbstractC3589b<C5194h0> {
    public final AbstractC4533a<Context> f17324a;
    public final AbstractC4533a<String> f17325b;
    public final AbstractC4533a<Integer> f17326c;

    public C5197i0(AbstractC4533a<Context> aVar, AbstractC4533a<String> aVar2, AbstractC4533a<Integer> aVar3) {
        this.f17324a = aVar;
        this.f17325b = aVar2;
        this.f17326c = aVar3;
    }

    public static C5197i0 m23622a(AbstractC4533a<Context> aVar, AbstractC4533a<String> aVar2, AbstractC4533a<Integer> aVar3) {
        return new C5197i0(aVar, aVar2, aVar3);
    }

    public static C5194h0 m23620c(Context context, String str, int i) {
        return new C5194h0(context, str, i);
    }

    public C5194h0 get() {
        return m23620c(this.f17324a.get(), this.f17325b.get(), this.f17326c.get().intValue());
    }
}
