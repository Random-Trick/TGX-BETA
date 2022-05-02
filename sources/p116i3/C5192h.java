package p116i3;

import p043d3.AbstractC3589b;
import p043d3.C3591d;

public final class C5192h implements AbstractC3589b<AbstractC5181d> {

    public static final class C5193a {
        public static final C5192h f17315a = new C5192h();
    }

    public static C5192h m23641a() {
        return C5193a.f17315a;
    }

    public static AbstractC5181d m23639c() {
        return (AbstractC5181d) C3591d.m29915c(AbstractC5184e.m23650c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public AbstractC5181d get() {
        return m23639c();
    }
}
