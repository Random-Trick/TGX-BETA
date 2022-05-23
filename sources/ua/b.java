package ua;

import ra.k;
import ya.g;

public abstract class b<V> implements c<Object, V> {
    public V f23719a;

    public b(V v10) {
        this.f23719a = v10;
    }

    @Override
    public void a(Object obj, g<?> gVar, V v10) {
        k.e(gVar, "property");
        V v11 = this.f23719a;
        if (d(gVar, v11, v10)) {
            this.f23719a = v10;
            c(gVar, v11, v10);
        }
    }

    @Override
    public V b(Object obj, g<?> gVar) {
        k.e(gVar, "property");
        return this.f23719a;
    }

    public abstract void c(g<?> gVar, V v10, V v11);

    public boolean d(g<?> gVar, V v10, V v11) {
        k.e(gVar, "property");
        return true;
    }
}
