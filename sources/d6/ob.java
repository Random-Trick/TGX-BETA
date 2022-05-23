package d6;

public final class ob {
    public static nb f6855a;

    public static synchronized cb a(va vaVar) {
        cb b10;
        synchronized (ob.class) {
            if (f6855a == null) {
                f6855a = new nb(null);
            }
            b10 = f6855a.b(vaVar);
        }
        return b10;
    }

    public static synchronized cb b(String str) {
        cb a10;
        synchronized (ob.class) {
            a10 = a(va.d(str).c());
        }
        return a10;
    }
}
