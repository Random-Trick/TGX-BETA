package p123ia;

import java.util.Iterator;
import p251ra.AbstractC8415a;
import pa.AbstractC8077a;
import qa.C8298k;

public final class C5282b0<T> implements Iterable<C5276a0<? extends T>>, AbstractC8415a {
    public final AbstractC8077a<Iterator<T>> f17476a;

    public C5282b0(AbstractC8077a<? extends Iterator<? extends T>> aVar) {
        C8298k.m12933e(aVar, "iteratorFactory");
        this.f17476a = aVar;
    }

    @Override
    public Iterator<C5276a0<T>> iterator() {
        return new C5284c0(this.f17476a.mo4925b());
    }
}
