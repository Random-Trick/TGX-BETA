package e6;

public final class p7 {
    public static o7 f11026a;

    public static synchronized f7 a(z6 z6Var) {
        f7 b10;
        synchronized (p7.class) {
            if (f11026a == null) {
                f11026a = new o7(null);
            }
            b10 = f11026a.b(z6Var);
        }
        return b10;
    }

    public static synchronized f7 b(String str) {
        f7 a10;
        synchronized (p7.class) {
            a10 = a(z6.d("vision-common").c());
        }
        return a10;
    }
}
