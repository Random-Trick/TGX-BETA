package p046d6;

public final class C3804t7 {
    public static C3804t7 f12866a;

    public static synchronized C3804t7 m29748a() {
        C3804t7 t7Var;
        synchronized (C3804t7.class) {
            if (f12866a == null) {
                f12866a = new C3804t7();
            }
            t7Var = f12866a;
        }
        return t7Var;
    }

    public static final boolean m29747b() {
        return C3795s7.m29757a("mlkit-dev-profiling");
    }
}
