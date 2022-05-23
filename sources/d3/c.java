package d3;

public final class c<T> implements b<T> {
    public static final c<Object> f6152b = new c<>(null);
    public final T f6153a;

    public c(T t10) {
        this.f6153a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override
    public T get() {
        return this.f6153a;
    }
}
