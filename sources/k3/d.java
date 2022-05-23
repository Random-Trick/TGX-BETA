package k3;

import d3.b;

public final class d implements b<k3.a> {

    public static final class a {
        public static final d f15629a = new d();
    }

    public static d a() {
        return a.f15629a;
    }

    public static k3.a c() {
        return (k3.a) d3.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public k3.a get() {
        return c();
    }
}
