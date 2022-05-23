package e6;

public final class t7 {
    public static t7 f11112a;

    public static synchronized t7 a() {
        t7 t7Var;
        synchronized (t7.class) {
            if (f11112a == null) {
                f11112a = new t7();
            }
            t7Var = f11112a;
        }
        return t7Var;
    }

    public static final boolean b() {
        return s7.a("mlkit-dev-profiling");
    }
}
