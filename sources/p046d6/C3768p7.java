package p046d6;

public final class C3768p7 {
    public static C3759o7 f12774a;

    public static synchronized C3672f7 m29776a(AbstractC3857z6 z6Var) {
        C3672f7 b;
        synchronized (C3768p7.class) {
            if (f12774a == null) {
                f12774a = new C3759o7(null);
            }
            b = f12774a.m42088b(z6Var);
        }
        return b;
    }

    public static synchronized C3672f7 m29775b(String str) {
        C3672f7 a;
        synchronized (C3768p7.class) {
            a = m29776a(AbstractC3857z6.m29727d("vision-common").mo29734c());
        }
        return a;
    }
}
