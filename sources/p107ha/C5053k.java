package p107ha;

import java.io.Serializable;
import pa.AbstractC8077a;
import qa.C8294g;
import qa.C8298k;

public final class C5053k<T> implements AbstractC5044d<T>, Serializable {
    public AbstractC8077a<? extends T> f17061a;
    public volatile Object f17062b;
    public final Object f17063c;

    public C5053k(AbstractC8077a<? extends T> aVar, Object obj) {
        C8298k.m12933e(aVar, "initializer");
        this.f17061a = aVar;
        this.f17062b = C5058o.f17065a;
        this.f17063c = obj == null ? this : obj;
    }

    public boolean m24190a() {
        return this.f17062b != C5058o.f17065a;
    }

    @Override
    public T getValue() {
        T t;
        T t2 = (T) this.f17062b;
        C5058o oVar = C5058o.f17065a;
        if (t2 != oVar) {
            return t2;
        }
        synchronized (this.f17063c) {
            t = (T) this.f17062b;
            if (t == oVar) {
                AbstractC8077a<? extends T> aVar = this.f17061a;
                C8298k.m12935c(aVar);
                t = aVar.mo4925b();
                this.f17062b = t;
                this.f17061a = null;
            }
        }
        return t;
    }

    public String toString() {
        return m24190a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public C5053k(AbstractC8077a aVar, Object obj, int i, C8294g gVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
