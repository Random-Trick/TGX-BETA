package ia;

import java.io.Serializable;
import qa.a;
import ra.g;

public final class k<T> implements d<T>, Serializable {
    public a<? extends T> f14154a;
    public volatile Object f14155b;
    public final Object f14156c;

    public k(a<? extends T> aVar, Object obj) {
        ra.k.e(aVar, "initializer");
        this.f14154a = aVar;
        this.f14155b = o.f14158a;
        this.f14156c = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f14155b != o.f14158a;
    }

    @Override
    public T getValue() {
        T t10;
        T t11 = (T) this.f14155b;
        o oVar = o.f14158a;
        if (t11 != oVar) {
            return t11;
        }
        synchronized (this.f14156c) {
            t10 = (T) this.f14155b;
            if (t10 == oVar) {
                a<? extends T> aVar = this.f14154a;
                ra.k.c(aVar);
                t10 = aVar.b();
                this.f14155b = t10;
                this.f14154a = null;
            }
        }
        return t10;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public k(a aVar, Object obj, int i10, g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
