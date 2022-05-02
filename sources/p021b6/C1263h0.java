package p021b6;

public final class C1263h0 {
    public static C1261g0 f4626a;

    public static synchronized C1290z m37818a(AbstractC1285u uVar) {
        C1290z b;
        synchronized (C1263h0.class) {
            if (f4626a == null) {
                f4626a = new C1261g0(null);
            }
            b = f4626a.m42085b(uVar);
        }
        return b;
    }

    public static synchronized C1290z m37817b(String str) {
        C1290z a;
        synchronized (C1263h0.class) {
            a = m37818a(AbstractC1285u.m37791d("common").mo37795c());
        }
        return a;
    }
}
