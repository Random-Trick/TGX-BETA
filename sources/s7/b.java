package s7;

public class b implements a {
    public static b f22536a;

    public static b b() {
        if (f22536a == null) {
            f22536a = new b();
        }
        return f22536a;
    }

    @Override
    public long a() {
        return System.currentTimeMillis();
    }
}
