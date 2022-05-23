package d3;

public final class a<T> implements ha.a<T> {
    public static final Object f6149c = new Object();
    public volatile ha.a<T> f6150a;
    public volatile Object f6151b = f6149c;

    public a(ha.a<T> aVar) {
        this.f6150a = aVar;
    }

    public static <P extends ha.a<T>, T> ha.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f6149c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override
    public T get() {
        T t10 = (T) this.f6151b;
        Object obj = f6149c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f6151b;
                if (t10 == obj) {
                    t10 = this.f6150a.get();
                    this.f6151b = b(this.f6151b, t10);
                    this.f6150a = null;
                }
            }
        }
        return t10;
    }
}
