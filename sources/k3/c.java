package k3;

import d3.b;
import d3.d;

public final class c implements b<k3.a> {

    public static final class a {
        public static final c f15628a = new c();
    }

    public static c a() {
        return a.f15628a;
    }

    public static k3.a b() {
        return (k3.a) d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public k3.a get() {
        return b();
    }
}
