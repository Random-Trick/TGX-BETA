package p347ya;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;
import pa.AbstractC8088l;
import qa.C8298k;

public final class C10464c<T> implements AbstractC10466d<T> {
    public final AbstractC10466d<T> f33545a;
    public final boolean f33546b;
    public final AbstractC8088l<T, Boolean> f33547c;

    public static final class C10465a implements Iterator<T>, AbstractC8415a, p126j$.util.Iterator {
        public final C10464c<T> f33548M;
        public final Iterator<T> f33549a;
        public int f33550b = -1;
        public T f33551c;

        public C10465a(C10464c<T> cVar) {
            this.f33548M = cVar;
            this.f33549a = cVar.f33545a.iterator();
        }

        public final void m5070e() {
            while (this.f33549a.hasNext()) {
                T next = this.f33549a.next();
                if (((Boolean) this.f33548M.f33547c.mo568a(next)).booleanValue() == this.f33548M.f33546b) {
                    this.f33551c = next;
                    this.f33550b = 1;
                    return;
                }
            }
            this.f33550b = 0;
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
            if (this.f33550b == -1) {
                m5070e();
            }
            return this.f33550b == 1;
        }

        @Override
        public T next() {
            if (this.f33550b == -1) {
                m5070e();
            }
            if (this.f33550b != 0) {
                T t = this.f33551c;
                this.f33551c = null;
                this.f33550b = -1;
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
        C8298k.m12934e(dVar, "sequence");
        C8298k.m12934e(lVar, "predicate");
        this.f33545a = dVar;
        this.f33546b = z;
        this.f33547c = lVar;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new C10465a(this);
    }
}
