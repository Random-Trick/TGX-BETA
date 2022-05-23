package z8;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class e<E> extends AbstractList<E> {
    public static final f f27029c = f.a(e.class);
    public List<E> f27030a;
    public Iterator<E> f27031b;

    public class a implements Iterator<E>, j$.util.Iterator {
        public int f27032a = 0;

        public a() {
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
            return this.f27032a < e.this.f27030a.size() || e.this.f27031b.hasNext();
        }

        @Override
        public E next() {
            if (this.f27032a < e.this.f27030a.size()) {
                List<E> list = e.this.f27030a;
                int i10 = this.f27032a;
                this.f27032a = i10 + 1;
                return list.get(i10);
            }
            e eVar = e.this;
            eVar.f27030a.add(eVar.f27031b.next());
            return (E) next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public e(List<E> list, java.util.Iterator<E> it) {
        this.f27030a = list;
        this.f27031b = it;
    }

    public final void f() {
        f27029c.b("blowup running");
        while (this.f27031b.hasNext()) {
            this.f27030a.add(this.f27031b.next());
        }
    }

    @Override
    public E get(int i10) {
        if (this.f27030a.size() > i10) {
            return this.f27030a.get(i10);
        }
        if (this.f27031b.hasNext()) {
            this.f27030a.add(this.f27031b.next());
            return get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new a();
    }

    @Override
    public int size() {
        f27029c.b("potentially expensive size() call");
        f();
        return this.f27030a.size();
    }
}
