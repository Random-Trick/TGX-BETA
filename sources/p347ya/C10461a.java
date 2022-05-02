package p347ya;

import java.util.Iterator;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;
import qa.C8298k;

public final class C10461a<T> implements AbstractC10466d<T>, AbstractC10463b<T> {
    public final AbstractC10466d<T> f33543a;
    public final int f33544b;

    public static final class C10462a implements Iterator<T>, AbstractC8415a, p126j$.util.Iterator {
        public final Iterator<T> f33545a;
        public int f33546b;
        public final C10461a<T> f33547c;

        public C10462a(C10461a<T> aVar) {
            this.f33547c = aVar;
            this.f33545a = aVar.f33543a.iterator();
            this.f33546b = aVar.f33544b;
        }

        public final void m5075e() {
            while (this.f33546b > 0 && this.f33545a.hasNext()) {
                this.f33545a.next();
                this.f33546b--;
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
            m5075e();
            return this.f33545a.hasNext();
        }

        @Override
        public T next() {
            m5075e();
            return this.f33545a.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10461a(AbstractC10466d<? extends T> dVar, int i) {
        C8298k.m12933e(dVar, "sequence");
        this.f33543a = dVar;
        this.f33544b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override
    public AbstractC10466d<T> mo5074a(int i) {
        int i2 = this.f33544b + i;
        return i2 < 0 ? new C10461a(this, i) : new C10461a(this.f33543a, i2);
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new C10462a(this);
    }
}
