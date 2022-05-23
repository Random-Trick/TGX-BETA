package b1;

public class g<T> extends f<T> {
    public final Object f3695c = new Object();

    public g(int i10) {
        super(i10);
    }

    @Override
    public boolean a(T t10) {
        boolean a10;
        synchronized (this.f3695c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    @Override
    public T b() {
        T t10;
        synchronized (this.f3695c) {
            t10 = (T) super.b();
        }
        return t10;
    }
}
