package za;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import qa.l;
import ra.k;

public final class j<T, R> implements d<R> {
    public final d<T> f27063a;
    public final l<T, R> f27064b;

    public static final class a implements Iterator<R>, sa.a, j$.util.Iterator {
        public final Iterator<T> f27065a;
        public final j<T, R> f27066b;

        public a(j<T, R> jVar) {
            this.f27066b = jVar;
            this.f27065a = jVar.f27063a.iterator();
        }

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override
        public boolean hasNext() {
            return this.f27065a.hasNext();
        }

        @Override
        public R next() {
            return (R) this.f27066b.f27064b.a(this.f27065a.next());
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        k.e(dVar, "sequence");
        k.e(lVar, "transformer");
        this.f27063a = dVar;
        this.f27064b = lVar;
    }

    @Override
    public java.util.Iterator<R> iterator() {
        return new a(this);
    }
}
