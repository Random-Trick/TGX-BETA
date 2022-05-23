package y2;

public abstract class c<T> {
    public static <T> c<T> d(T t10) {
        return new a(null, t10, d.DEFAULT);
    }

    public static <T> c<T> e(T t10) {
        return new a(null, t10, d.VERY_LOW);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}
