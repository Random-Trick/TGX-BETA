package b3;

import d3.b;
import d3.d;
import java.util.concurrent.Executor;

public final class j implements b<Executor> {

    public static final class a {
        public static final j f3732a = new j();
    }

    public static j a() {
        return a.f3732a;
    }

    public static Executor b() {
        return (Executor) d.c(i.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Executor get() {
        return b();
    }
}
