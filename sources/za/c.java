package za;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qa.l;
import ra.k;

public final class c<T> implements d<T> {
    public final d<T> f27055a;
    public final boolean f27056b;
    public final l<T, Boolean> f27057c;

    public static final class a implements Iterator<T>, sa.a, j$.util.Iterator {
        public final c<T> M;
        public final Iterator<T> f27058a;
        public int f27059b = -1;
        public T f27060c;

        public a(c<T> cVar) {
            this.M = cVar;
            this.f27058a = cVar.f27055a.iterator();
        }

        public final void d() {
            while (this.f27058a.hasNext()) {
                T next = this.f27058a.next();
                if (((Boolean) this.M.f27057c.a(next)).booleanValue() == this.M.f27056b) {
                    this.f27060c = next;
                    this.f27059b = 1;
                    return;
                }
            }
            this.f27059b = 0;
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
            if (this.f27059b == -1) {
                d();
            }
            return this.f27059b == 1;
        }

        @Override
        public T next() {
            if (this.f27059b == -1) {
                d();
            }
            if (this.f27059b != 0) {
                T t10 = this.f27060c;
                this.f27060c = null;
                this.f27059b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(d<? extends T> dVar, boolean z10, l<? super T, Boolean> lVar) {
        k.e(dVar, "sequence");
        k.e(lVar, "predicate");
        this.f27055a = dVar;
        this.f27056b = z10;
        this.f27057c = lVar;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
