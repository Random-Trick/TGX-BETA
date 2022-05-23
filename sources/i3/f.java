package i3;

import d3.b;
import d3.d;

public final class f implements b<String> {

    public static final class a {
        public static final f f13953a = new f();
    }

    public static f a() {
        return a.f13953a;
    }

    public static String b() {
        return (String) d.c(e.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public String get() {
        return b();
    }
}
