package e7;

import n7.b;

public class w<T> implements b<T> {
    public static final Object f11347c = new Object();
    public volatile Object f11348a = f11347c;
    public volatile b<T> f11349b;

    public w(b<T> bVar) {
        this.f11349b = bVar;
    }

    @Override
    public T get() {
        T t10 = (T) this.f11348a;
        Object obj = f11347c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f11348a;
                if (t10 == obj) {
                    t10 = this.f11349b.get();
                    this.f11348a = t10;
                    this.f11349b = null;
                }
            }
        }
        return t10;
    }
}
