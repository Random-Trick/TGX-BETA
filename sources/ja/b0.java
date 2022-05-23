package ja;

import java.util.Iterator;
import ra.k;
import sa.a;

public final class b0<T> implements Iterable<a0<? extends T>>, a {
    public final qa.a<Iterator<T>> f15165a;

    public b0(qa.a<? extends Iterator<? extends T>> aVar) {
        k.e(aVar, "iteratorFactory");
        this.f15165a = aVar;
    }

    @Override
    public Iterator<a0<T>> iterator() {
        return new c0(this.f15165a.b());
    }
}
