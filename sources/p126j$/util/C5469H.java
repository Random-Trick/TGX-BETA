package p126j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p126j$.util.function.Consumer;

class C5469H implements Iterator, Consumer {
    boolean f17934a = false;
    Object f17935b;
    final AbstractC5468G f17936c;

    public C5469H(AbstractC5468G g) {
        this.f17936c = g;
    }

    @Override
    public boolean hasNext() {
        if (!this.f17934a) {
            this.f17936c.mo22125a(this);
        }
        return this.f17934a;
    }

    @Override
    public void mo22129k(Object obj) {
        this.f17934a = true;
        this.f17935b = obj;
    }

    @Override
    public Object next() {
        if (this.f17934a || hasNext()) {
            this.f17934a = false;
            return this.f17935b;
        }
        throw new NoSuchElementException();
    }
}
