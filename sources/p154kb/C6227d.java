package p154kb;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;

public final class C6227d<T> implements Iterable<T>, AbstractC6225b<T> {
    public final List<Reference<T>> f19645M;
    public boolean f19646N;
    public final Semaphore f19647O;
    public boolean f19648P;
    public final AbstractC6228a f19649Q;
    public C6227d<T> f19650R;
    public C6227d<T>.C6229b f19651S;
    public final boolean f19652a;
    public final List<Reference<T>> f19653b;
    public final List<Reference<T>> f19654c;

    public interface AbstractC6228a {
        void mo4374b(C6227d<?> dVar, boolean z);
    }

    public final class C6229b implements Iterator<T> {
        public int f19655a;
        public T f19656b;

        public C6229b() {
            this.f19655a = C6227d.this.f19653b.size();
        }

        @Override
        public final boolean hasNext() {
            synchronized (C6227d.this.f19653b) {
                this.f19656b = null;
                while (true) {
                    if (this.f19656b != null || this.f19655a <= 0) {
                        break;
                    }
                    List list = C6227d.this.f19653b;
                    int i = this.f19655a - 1;
                    this.f19655a = i;
                    Reference reference = (Reference) list.get(i);
                    T t = (T) reference.get();
                    if (t != null && !C6227d.this.f19654c.contains(reference)) {
                        this.f19656b = t;
                        break;
                    }
                }
                if (this.f19656b == null && C6227d.this.f19652a) {
                    C6227d.this.m21023x();
                }
            }
            if (this.f19656b != null) {
                return true;
            }
            if (C6227d.this.f19647O == null) {
                return false;
            }
            C6227d.this.f19647O.release();
            return false;
        }

        @Override
        public final T next() {
            T t = this.f19656b;
            if (t != null) {
                return t;
            }
            throw new NoSuchElementException();
        }
    }

    public C6227d() {
        this(false, true, null);
    }

    public final boolean add(T t) {
        synchronized (this.f19653b) {
            if (indexOf(t) != -1) {
                return false;
            }
            if (this.f19646N) {
                boolean c = C6235i.m21013c(this, this.f19645M, t);
                C6235i.m21011e(this.f19654c, t);
                return c;
            }
            this.f19653b.add(mo21032h(t));
            m21025v();
            return true;
        }
    }

    public final void clear() {
        synchronized (this.f19653b) {
            if (this.f19646N) {
                for (Reference<T> reference : this.f19653b) {
                    if (!this.f19654c.contains(reference)) {
                        this.f19654c.add(reference);
                    }
                    C6235i.m21011e(this.f19645M, reference.get());
                }
            } else {
                this.f19653b.clear();
                m21025v();
            }
        }
    }

    @Override
    public Reference mo21032h(Object obj) {
        return C6224a.m21033a(this, obj);
    }

    public final int indexOf(T t) {
        if (t == null) {
            return -1;
        }
        for (int size = this.f19653b.size() - 1; size >= 0; size--) {
            if (this.f19653b.get(size).get() == t) {
                return size;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        synchronized (this.f19653b) {
            if (this.f19646N) {
                return this.f19653b.isEmpty() && this.f19645M.isEmpty();
            }
            C6235i.m21012d(this.f19653b);
            return this.f19653b.isEmpty();
        }
    }

    @Override
    public final Iterator<T> iterator() {
        Semaphore semaphore = this.f19647O;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f19653b) {
            if (this.f19652a) {
                m21024w();
                C6227d<T>.C6229b bVar = this.f19651S;
                if (bVar == null) {
                    this.f19651S = new C6229b();
                } else {
                    bVar.f19655a = this.f19653b.size();
                    this.f19651S.f19656b = null;
                }
                return this.f19651S;
            }
            return new C6229b();
        }
    }

    public final boolean remove(T t) {
        synchronized (this.f19653b) {
            int indexOf = indexOf(t);
            if (indexOf == -1) {
                return false;
            }
            if (this.f19646N) {
                Reference<T> reference = this.f19653b.get(indexOf);
                if (!this.f19654c.contains(reference)) {
                    this.f19654c.add(reference);
                }
                C6235i.m21011e(this.f19645M, reference.get());
            } else {
                this.f19653b.remove(indexOf);
                m21025v();
            }
            return true;
        }
    }

    public final int m21026u(C6227d<T> dVar) {
        Iterator<T> it = dVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (add(it.next())) {
                i++;
            }
        }
        return i;
    }

    public final void m21025v() {
        boolean z;
        if (this.f19649Q != null && this.f19648P != (!this.f19653b.isEmpty())) {
            this.f19648P = z;
            this.f19649Q.mo4374b(this, z);
        }
    }

    public final void m21024w() {
        if (!this.f19646N) {
            this.f19646N = true;
            return;
        }
        throw new IllegalStateException();
    }

    public final void m21023x() {
        if (this.f19646N) {
            this.f19646N = false;
            if (!this.f19654c.isEmpty()) {
                this.f19653b.removeAll(this.f19654c);
                this.f19654c.clear();
            }
            if (!this.f19645M.isEmpty()) {
                this.f19653b.addAll(this.f19645M);
                this.f19645M.clear();
            }
            m21025v();
            return;
        }
        throw new IllegalStateException();
    }

    public C6227d(boolean z) {
        this(z, true, null);
    }

    public C6227d(boolean z, boolean z2, AbstractC6228a aVar) {
        this.f19654c = new ArrayList();
        this.f19645M = new ArrayList();
        this.f19647O = z ? new Semaphore(1) : null;
        this.f19652a = z2;
        this.f19653b = new ArrayList();
        this.f19649Q = aVar;
    }
}
