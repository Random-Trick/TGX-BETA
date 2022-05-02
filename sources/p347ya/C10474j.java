package p347ya;

import java.util.Iterator;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;
import pa.AbstractC8088l;
import qa.C8298k;

public final class C10474j<T, R> implements AbstractC10466d<R> {
    public final AbstractC10466d<T> f33554a;
    public final AbstractC8088l<T, R> f33555b;

    public static final class C10475a implements Iterator<R>, AbstractC8415a, p126j$.util.Iterator {
        public final Iterator<T> f33556a;
        public final C10474j<T, R> f33557b;

        public C10475a(C10474j<T, R> jVar) {
            this.f33557b = jVar;
            this.f33556a = jVar.f33554a.iterator();
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
            return this.f33556a.hasNext();
        }

        @Override
        public R next() {
            return (R) this.f33557b.f33555b.mo568a(this.f33556a.next());
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10474j(AbstractC10466d<? extends T> dVar, AbstractC8088l<? super T, ? extends R> lVar) {
        C8298k.m12934e(dVar, "sequence");
        C8298k.m12934e(lVar, "transformer");
        this.f33554a = dVar;
        this.f33555b = lVar;
    }

    @Override
    public java.util.Iterator<R> iterator() {
        return new C10475a(this);
    }
}
