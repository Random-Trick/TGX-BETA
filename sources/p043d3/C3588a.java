package p043d3;

import ga.AbstractC4533a;

public final class C3588a<T> implements AbstractC4533a<T> {
    public static final Object f12228c = new Object();
    public volatile AbstractC4533a<T> f12229a;
    public volatile Object f12230b = f12228c;

    public C3588a(AbstractC4533a<T> aVar) {
        this.f12229a = aVar;
    }

    public static <P extends AbstractC4533a<T>, T> AbstractC4533a<T> m29922a(P p) {
        C3591d.m29918b(p);
        return p instanceof C3588a ? p : new C3588a(p);
    }

    public static Object m29921b(Object obj, Object obj2) {
        if (!(obj != f12228c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override
    public T get() {
        T t = (T) this.f12230b;
        Object obj = f12228c;
        if (t == obj) {
            synchronized (this) {
                t = this.f12230b;
                if (t == obj) {
                    t = this.f12229a.get();
                    this.f12230b = m29921b(this.f12230b, t);
                    this.f12229a = null;
                }
            }
        }
        return t;
    }
}
