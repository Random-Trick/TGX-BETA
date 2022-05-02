package p033c6;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public class C1675c0 implements Iterator, p126j$.util.Iterator {
    public final Iterator f6146a;
    public final Collection f6147b;
    public final C1690d0 f6148c;

    public C1675c0(C1690d0 d0Var) {
        Iterator it;
        this.f6148c = d0Var;
        Collection collection = d0Var.f6181b;
        this.f6147b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f6146a = it;
    }

    public C1675c0(C1690d0 d0Var, Iterator it) {
        this.f6148c = d0Var;
        this.f6147b = d0Var.f6181b;
        this.f6146a = it;
    }

    public final void m36104a() {
        this.f6148c.m36091i();
        if (this.f6148c.f6181b != this.f6147b) {
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
        m36104a();
        return this.f6146a.hasNext();
    }

    @Override
    public final Object next() {
        m36104a();
        return this.f6146a.next();
    }

    @Override
    public final void remove() {
        int i;
        this.f6146a.remove();
        AbstractC1735g0 g0Var = this.f6148c.f6179N;
        i = g0Var.f6289M;
        g0Var.f6289M = i - 1;
        this.f6148c.m36090m();
    }
}
