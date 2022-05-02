package p043d3;

public final class C3590c<T> implements AbstractC3589b<T> {
    public static final C3590c<Object> f12231b = new C3590c<>(null);
    public final T f12232a;

    public C3590c(T t) {
        this.f12232a = t;
    }

    public static <T> AbstractC3589b<T> m29920a(T t) {
        return new C3590c(C3591d.m29917c(t, "instance cannot be null"));
    }

    @Override
    public T get() {
        return this.f12232a;
    }
}
