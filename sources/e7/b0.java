package e7;

import n7.a;
import n7.b;

public class b0<T> implements b<T> {
    public static final a<Object> f11285c = z.f11352a;
    public static final b<Object> f11286d = a0.f11283a;
    public a<T> f11287a;
    public volatile b<T> f11288b;

    public b0(a<T> aVar, b<T> bVar) {
        this.f11287a = aVar;
        this.f11288b = bVar;
    }

    public static <T> b0<T> c() {
        return new b0<>(f11285c, f11286d);
    }

    public static void d(b bVar) {
    }

    public static Object e() {
        return null;
    }

    public void f(b<T> bVar) {
        a<T> aVar;
        if (this.f11288b == f11286d) {
            synchronized (this) {
                aVar = this.f11287a;
                this.f11287a = null;
                this.f11288b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override
    public T get() {
        return this.f11288b.get();
    }
}
