package nb;

import java.util.Iterator;

public class d<T> implements Iterator<T>, Iterable<T> {
    public final Iterator<T> f17818a;
    public final kb.d<T> f17819b;
    public T f17820c;

    public d(Iterator<T> it, kb.d<T> dVar) {
        this.f17818a = it;
        this.f17819b = dVar;
    }

    @Override
    public boolean hasNext() {
        if (this.f17818a == null) {
            return false;
        }
        this.f17820c = null;
        while (this.f17818a.hasNext()) {
            T next = this.f17818a.next();
            if (this.f17819b.a(next)) {
                this.f17820c = next;
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public T next() {
        return this.f17820c;
    }

    public d(Iterable<T> iterable, kb.d<T> dVar) {
        this(iterable != null ? iterable.iterator() : null, dVar);
    }
}
