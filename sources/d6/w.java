package d6;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

public final class w implements Iterator<Map.Entry>, j$.util.Iterator {
    public final Iterator<Map.Entry> f7075a;
    @CheckForNull
    public Collection f7076b;
    public final x f7077c;

    public w(x xVar) {
        this.f7077c = xVar;
        this.f7075a = xVar.f7099c.entrySet().iterator();
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer<? super Map.Entry> consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final boolean hasNext() {
        return this.f7075a.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry next = this.f7075a.next();
        this.f7076b = (Collection) next.getValue();
        x xVar = this.f7077c;
        Object key = next.getKey();
        return new a1(key, xVar.M.h(key, (Collection) next.getValue()));
    }

    @Override
    public final void remove() {
        int i10;
        r.d(this.f7076b != null, "no calls to next() since the last call to remove()");
        this.f7075a.remove();
        g0 g0Var = this.f7077c.M;
        i10 = g0Var.M;
        g0Var.M = i10 - this.f7076b.size();
        this.f7076b.clear();
        this.f7076b = null;
    }
}
