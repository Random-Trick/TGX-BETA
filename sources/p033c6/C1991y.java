package p033c6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public final class C1991y implements Iterator, p126j$.util.Iterator {
    @CheckForNull
    public Map.Entry f7093a;
    public final Iterator f7094b;
    public final C2005z f7095c;

    public C1991y(C2005z zVar, Iterator it) {
        this.f7095c = zVar;
        this.f7094b = it;
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
        return this.f7094b.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f7094b.next();
        this.f7093a = entry;
        return entry.getKey();
    }

    @Override
    public final void remove() {
        int i;
        C1893r.m35935d(this.f7093a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f7093a.getValue();
        this.f7094b.remove();
        AbstractC1735g0 g0Var = this.f7095c.f7141b;
        i = g0Var.f6289M;
        g0Var.f6289M = i - collection.size();
        collection.clear();
        this.f7093a = null;
    }
}
