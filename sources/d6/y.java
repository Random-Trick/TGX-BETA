package d6;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

public final class y implements Iterator, j$.util.Iterator {
    @CheckForNull
    public Map.Entry f7126a;
    public final Iterator f7127b;
    public final z f7128c;

    public y(z zVar, Iterator it) {
        this.f7128c = zVar;
        this.f7127b = it;
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
        return this.f7127b.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f7127b.next();
        this.f7126a = entry;
        return entry.getKey();
    }

    @Override
    public final void remove() {
        int i10;
        r.d(this.f7126a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f7126a.getValue();
        this.f7127b.remove();
        g0 g0Var = this.f7128c.f7170b;
        i10 = g0Var.M;
        g0Var.M = i10 - collection.size();
        collection.clear();
        this.f7126a = null;
    }
}
