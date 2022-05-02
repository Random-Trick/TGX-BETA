package p181mb;

import java.util.Iterator;
import p139jb.AbstractC5912d;

public class C6813d<T> implements Iterator<T>, Iterable<T> {
    public final Iterator<T> f21341a;
    public final AbstractC5912d<T> f21342b;
    public T f21343c;

    public C6813d(Iterator<T> it, AbstractC5912d<T> dVar) {
        this.f21341a = it;
        this.f21342b = dVar;
    }

    @Override
    public boolean hasNext() {
        if (this.f21341a == null) {
            return false;
        }
        this.f21343c = null;
        while (this.f21341a.hasNext()) {
            T next = this.f21341a.next();
            if (this.f21342b.mo1511a(next)) {
                this.f21343c = next;
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
        return this.f21343c;
    }

    public C6813d(Iterable<T> iterable, AbstractC5912d<T> dVar) {
        this(iterable != null ? iterable.iterator() : null, dVar);
    }
}
