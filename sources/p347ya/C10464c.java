package p347ya;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;
import pa.AbstractC8088l;
import qa.C8298k;

public final class C10464c<T> implements AbstractC10466d<T> {
    public final AbstractC10466d<T> f33548a;
    public final boolean f33549b;
    public final AbstractC8088l<T, Boolean> f33550c;

    public static final class C10465a implements Iterator<T>, AbstractC8415a, p126j$.util.Iterator {
        public final C10464c<T> f33551M;
        public final Iterator<T> f33552a;
        public int f33553b = -1;
        public T f33554c;

        public C10465a(C10464c<T> cVar) {
            this.f33551M = cVar;
            this.f33552a = cVar.f33548a.iterator();
        }

        public final void m5070e() {
            while (this.f33552a.hasNext()) {
                T next = this.f33552a.next();
                if (((Boolean) this.f33551M.f33550c.mo568a(next)).booleanValue() == this.f33551M.f33549b) {
                    this.f33554c = next;
                    this.f33553b = 1;
                    return;
                }
            }
            this.f33553b = 0;
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
            if (this.f33553b == -1) {
                m5070e();
            }
            return this.f33553b == 1;
        }

        @Override
        public T next() {
            if (this.f33553b == -1) {
                m5070e();
            }
            if (this.f33553b != 0) {
                T t = this.f33554c;
                this.f33554c = null;
                this.f33553b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10464c(AbstractC10466d<? extends T> dVar, boolean z, AbstractC8088l<? super T, Boolean> lVar) {
        C8298k.m12933e(dVar, "sequence");
        C8298k.m12933e(lVar, "predicate");
        this.f33548a = dVar;
        this.f33549b = z;
        this.f33550c = lVar;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new C10465a(this);
    }
}
