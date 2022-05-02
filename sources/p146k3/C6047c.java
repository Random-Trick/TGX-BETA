package p146k3;

import p043d3.AbstractC3589b;
import p043d3.C3591d;

public final class C6047c implements AbstractC3589b<AbstractC6045a> {

    public static final class C6048a {
        public static final C6047c f19258a = new C6047c();
    }

    public static C6047c m21451a() {
        return C6048a.f19258a;
    }

    public static AbstractC6045a m21450b() {
        return (AbstractC6045a) C3591d.m29917c(AbstractC6046b.m21453a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public AbstractC6045a get() {
        return m21450b();
    }
}
