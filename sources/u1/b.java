package u1;

import x1.f;

public abstract class b<T> extends k {
    public b(e eVar) {
        super(eVar);
    }

    public abstract void g(f fVar, T t10);

    public final void h(T t10) {
        f a10 = a();
        try {
            g(a10, t10);
            a10.u0();
        } finally {
            f(a10);
        }
    }
}
