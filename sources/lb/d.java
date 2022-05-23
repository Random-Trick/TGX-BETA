package lb;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;

public final class d<T> implements Iterable<T>, lb.b<T> {
    public final List<Reference<T>> M;
    public boolean N;
    public final Semaphore O;
    public boolean P;
    public final a Q;
    public d<T> R;
    public d<T>.b S;
    public final boolean f16326a;
    public final List<Reference<T>> f16327b;
    public final List<Reference<T>> f16328c;

    public interface a {
        void b(d<?> dVar, boolean z10);
    }

    public final class b implements Iterator<T> {
        public int f16329a;
        public T f16330b;

        public b() {
            this.f16329a = d.this.f16327b.size();
        }

        @Override
        public final boolean hasNext() {
            synchronized (d.this.f16327b) {
                this.f16330b = null;
                while (true) {
                    if (this.f16330b != null || this.f16329a <= 0) {
                        break;
                    }
                    List list = d.this.f16327b;
                    int i10 = this.f16329a - 1;
                    this.f16329a = i10;
                    Reference reference = (Reference) list.get(i10);
                    T t10 = (T) reference.get();
                    if (t10 != null && !d.this.f16328c.contains(reference)) {
                        this.f16330b = t10;
                        break;
                    }
                }
                if (this.f16330b == null && d.this.f16326a) {
                    d.this.x();
                }
            }
            if (this.f16330b != null) {
                return true;
            }
            if (d.this.O == null) {
                return false;
            }
            d.this.O.release();
            return false;
        }

        @Override
        public final T next() {
            T t10 = this.f16330b;
            if (t10 != null) {
                return t10;
            }
            throw new NoSuchElementException();
        }
    }

    public d() {
        this(false, true, null);
    }

    public final boolean add(T t10) {
        synchronized (this.f16327b) {
            if (indexOf(t10) != -1) {
                return false;
            }
            if (this.N) {
                boolean c10 = i.c(this, this.M, t10);
                i.e(this.f16328c, t10);
                return c10;
            }
            this.f16327b.add(f(t10));
            v();
            return true;
        }
    }

    public final void clear() {
        synchronized (this.f16327b) {
            if (this.N) {
                for (Reference<T> reference : this.f16327b) {
                    if (!this.f16328c.contains(reference)) {
                        this.f16328c.add(reference);
                    }
                    i.e(this.M, reference.get());
                }
            } else {
                this.f16327b.clear();
                v();
            }
        }
    }

    @Override
    public Reference f(Object obj) {
        return lb.a.a(this, obj);
    }

    public final int indexOf(T t10) {
        if (t10 == null) {
            return -1;
        }
        for (int size = this.f16327b.size() - 1; size >= 0; size--) {
            if (this.f16327b.get(size).get() == t10) {
                return size;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        synchronized (this.f16327b) {
            if (this.N) {
                return this.f16327b.isEmpty() && this.M.isEmpty();
            }
            i.d(this.f16327b);
            return this.f16327b.isEmpty();
        }
    }

    @Override
    public final Iterator<T> iterator() {
        Semaphore semaphore = this.O;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f16327b) {
            if (this.f16326a) {
                w();
                d<T>.b bVar = this.S;
                if (bVar == null) {
                    this.S = new b();
                } else {
                    bVar.f16329a = this.f16327b.size();
                    this.S.f16330b = null;
                }
                return this.S;
            }
            return new b();
        }
    }

    public final boolean remove(T t10) {
        synchronized (this.f16327b) {
            int indexOf = indexOf(t10);
            if (indexOf == -1) {
                return false;
            }
            if (this.N) {
                Reference<T> reference = this.f16327b.get(indexOf);
                if (!this.f16328c.contains(reference)) {
                    this.f16328c.add(reference);
                }
                i.e(this.M, reference.get());
            } else {
                this.f16327b.remove(indexOf);
                v();
            }
            return true;
        }
    }

    public final int u(d<T> dVar) {
        Iterator<T> it = dVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (add(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    public final void v() {
        boolean z10;
        if (this.Q != null && this.P != (!this.f16327b.isEmpty())) {
            this.P = z10;
            this.Q.b(this, z10);
        }
    }

    public final void w() {
        if (!this.N) {
            this.N = true;
            return;
        }
        throw new IllegalStateException();
    }

    public final void x() {
        if (this.N) {
            this.N = false;
            if (!this.f16328c.isEmpty()) {
                this.f16327b.removeAll(this.f16328c);
                this.f16328c.clear();
            }
            if (!this.M.isEmpty()) {
                this.f16327b.addAll(this.M);
                this.M.clear();
            }
            v();
            return;
        }
        throw new IllegalStateException();
    }

    public d(boolean z10) {
        this(z10, true, null);
    }

    public d(boolean z10, boolean z11, a aVar) {
        this.f16328c = new ArrayList();
        this.M = new ArrayList();
        this.O = z10 ? new Semaphore(1) : null;
        this.f16326a = z11;
        this.f16327b = new ArrayList();
        this.Q = aVar;
    }
}
