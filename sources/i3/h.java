package i3;

import d3.b;
import d3.d;

public final class h implements b<d> {

    public static final class a {
        public static final h f13957a = new h();
    }

    public static h a() {
        return a.f13957a;
    }

    public static d c() {
        return (d) d.c(e.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public d get() {
        return c();
    }
}
