package p016b1;

public class C1131g<T> extends C1130f<T> {
    public final Object f4334c = new Object();

    public C1131g(int i) {
        super(i);
    }

    @Override
    public boolean mo38331a(T t) {
        boolean a;
        synchronized (this.f4334c) {
            a = super.mo38331a(t);
        }
        return a;
    }

    @Override
    public T mo38330b() {
        T t;
        synchronized (this.f4334c) {
            t = (T) super.mo38330b();
        }
        return t;
    }
}
