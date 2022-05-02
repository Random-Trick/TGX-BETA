package p116i3;

import p043d3.AbstractC3589b;
import p043d3.C3591d;

public final class C5186f implements AbstractC3589b<String> {

    public static final class C5187a {
        public static final C5186f f17311a = new C5186f();
    }

    public static C5186f m23649a() {
        return C5187a.f17311a;
    }

    public static String m23648b() {
        return (String) C3591d.m29915c(AbstractC5184e.m23652a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public String get() {
        return m23648b();
    }
}
