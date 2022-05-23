package d6;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class c0 implements Iterator, j$.util.Iterator {
    public final Iterator f6394a;
    public final Collection f6395b;
    public final d0 f6396c;

    public c0(d0 d0Var) {
        Iterator it;
        this.f6396c = d0Var;
        Collection collection = d0Var.f6427b;
        this.f6395b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f6394a = it;
    }

    public c0(d0 d0Var, Iterator it) {
        this.f6396c = d0Var;
        this.f6395b = d0Var.f6427b;
        this.f6394a = it;
    }

    public final void a() {
        this.f6396c.g();
        if (this.f6396c.f6427b != this.f6395b) {
            throw new ConcurrentModificationException();
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
    public final boolean hasNext() {
        a();
        return this.f6394a.hasNext();
    }

    @Override
    public final Object next() {
        a();
        return this.f6394a.next();
    }

    @Override
    public final void remove() {
        int i10;
        this.f6394a.remove();
        g0 g0Var = this.f6396c.N;
        i10 = g0Var.M;
        g0Var.M = i10 - 1;
        this.f6396c.m();
    }
}
