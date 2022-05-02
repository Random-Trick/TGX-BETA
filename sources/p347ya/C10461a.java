package p347ya;

import java.util.Iterator;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;
import qa.C8298k;

public final class C10461a<T> implements AbstractC10466d<T>, AbstractC10463b<T> {
    public final AbstractC10466d<T> f33540a;
    public final int f33541b;

    public static final class C10462a implements Iterator<T>, AbstractC8415a, p126j$.util.Iterator {
        public final Iterator<T> f33542a;
        public int f33543b;
        public final C10461a<T> f33544c;

        public C10462a(C10461a<T> aVar) {
            this.f33544c = aVar;
            this.f33542a = aVar.f33540a.iterator();
            this.f33543b = aVar.f33541b;
        }

        public final void m5075e() {
            while (this.f33543b > 0 && this.f33542a.hasNext()) {
                this.f33542a.next();
                this.f33543b--;
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
            return this.f33542a.hasNext();
        }

        @Override
        public T next() {
            m5075e();
            return this.f33542a.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10461a(AbstractC10466d<? extends T> dVar, int i) {
        C8298k.m12934e(dVar, "sequence");
        this.f33540a = dVar;
        this.f33541b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override
    public AbstractC10466d<T> mo5074a(int i) {
        int i2 = this.f33541b + i;
        return i2 < 0 ? new C10461a(this, i) : new C10461a(this.f33540a, i2);
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new C10462a(this);
    }
}
