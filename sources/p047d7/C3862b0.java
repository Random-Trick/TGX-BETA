package p047d7;

import p178m7.AbstractC6793a;
import p178m7.AbstractC6794b;

public class C3862b0<T> implements AbstractC6794b<T> {
    public static final AbstractC6793a<Object> f13112c = C3899z.f13179a;
    public static final AbstractC6794b<Object> f13113d = C3860a0.f13110a;
    public AbstractC6793a<T> f13114a;
    public volatile AbstractC6794b<T> f13115b;

    public C3862b0(AbstractC6793a<T> aVar, AbstractC6794b<T> bVar) {
        this.f13114a = aVar;
        this.f13115b = bVar;
    }

    public static <T> C3862b0<T> m29719c() {
        return new C3862b0<>(f13112c, f13113d);
    }

    public static void m29718d(AbstractC6794b bVar) {
    }

    public static Object m29717e() {
        return null;
    }

    public void m29716f(AbstractC6794b<T> bVar) {
        AbstractC6793a<T> aVar;
        if (this.f13115b == f13113d) {
            synchronized (this) {
                aVar = this.f13114a;
                this.f13114a = null;
                this.f13115b = bVar;
            }
            aVar.mo19034a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override
    public T get() {
        return this.f13115b.get();
    }
}
