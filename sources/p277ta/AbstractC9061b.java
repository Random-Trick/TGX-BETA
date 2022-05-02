package p277ta;

import p332xa.AbstractC10175g;
import qa.C8298k;

public abstract class AbstractC9061b<V> implements AbstractC9062c<Object, V> {
    public V f29042a;

    public AbstractC9061b(V v) {
        this.f29042a = v;
    }

    @Override
    public V mo10582a(Object obj, AbstractC10175g<?> gVar) {
        C8298k.m12933e(gVar, "property");
        return this.f29042a;
    }

    @Override
    public void mo10581b(Object obj, AbstractC10175g<?> gVar, V v) {
        C8298k.m12933e(gVar, "property");
        V v2 = this.f29042a;
        if (m10583d(gVar, v2, v)) {
            this.f29042a = v;
            mo10584c(gVar, v2, v);
        }
    }

    public abstract void mo10584c(AbstractC10175g<?> gVar, V v, V v2);

    public boolean m10583d(AbstractC10175g<?> gVar, V v, V v2) {
        C8298k.m12933e(gVar, "property");
        return true;
    }
}
