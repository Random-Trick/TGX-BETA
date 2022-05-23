package za;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import ra.k;

public final class a<T> implements d<T>, b<T> {
    public final d<T> f27051a;
    public final int f27052b;

    public static final class C0261a implements Iterator<T>, sa.a, j$.util.Iterator {
        public final Iterator<T> f27053a;
        public int f27054b;

        public C0261a(a<T> aVar) {
            this.f27053a = aVar.f27051a.iterator();
            this.f27054b = aVar.f27052b;
        }

        public final void d() {
            while (this.f27054b > 0 && this.f27053a.hasNext()) {
                this.f27053a.next();
                this.f27054b--;
            }
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
            d();
            return this.f27053a.hasNext();
        }

        @Override
        public T next() {
            d();
            return this.f27053a.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d<? extends T> dVar, int i10) {
        k.e(dVar, "sequence");
        this.f27051a = dVar;
        this.f27052b = i10;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    @Override
    public d<T> a(int i10) {
        int i11 = this.f27052b + i10;
        return i11 < 0 ? new a(this, i10) : new a(this.f27051a, i11);
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new C0261a(this);
    }
}
