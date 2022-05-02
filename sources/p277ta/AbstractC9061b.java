package p277ta;

import p332xa.AbstractC10175g;
import qa.C8298k;

public abstract class AbstractC9061b<V> implements AbstractC9062c<Object, V> {
    public V f29039a;

    public AbstractC9061b(V v) {
        this.f29039a = v;
    }

    @Override
    public V mo10583a(Object obj, AbstractC10175g<?> gVar) {
        C8298k.m12934e(gVar, "property");
        return this.f29039a;
    }

    @Override
    public void mo10582b(Object obj, AbstractC10175g<?> gVar, V v) {
        C8298k.m12934e(gVar, "property");
        V v2 = this.f29039a;
        if (m10584d(gVar, v2, v)) {
            this.f29039a = v;
            mo10585c(gVar, v2, v);
        }
    }

    public abstract void mo10585c(AbstractC10175g<?> gVar, V v, V v2);

    public boolean m10584d(AbstractC10175g<?> gVar, V v, V v2) {
        C8298k.m12934e(gVar, "property");
        return true;
    }
}
