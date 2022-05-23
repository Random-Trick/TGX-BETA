package c6;

public final class h0 {
    public static g0 f4953a;

    public static synchronized z a(u uVar) {
        z b10;
        synchronized (h0.class) {
            if (f4953a == null) {
                f4953a = new g0(null);
            }
            b10 = f4953a.b(uVar);
        }
        return b10;
    }

    public static synchronized z b(String str) {
        z a10;
        synchronized (h0.class) {
            a10 = a(u.d("common").c());
        }
        return a10;
    }
}
