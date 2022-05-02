package p033c6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public final class C1963w implements Iterator<Map.Entry>, p126j$.util.Iterator {
    public final Iterator<Map.Entry> f7037a;
    @CheckForNull
    public Collection f7038b;
    public final C1977x f7039c;

    public C1963w(C1977x xVar) {
        this.f7039c = xVar;
        this.f7037a = xVar.f7063c.entrySet().iterator();
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
        return this.f7037a.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry next = this.f7037a.next();
        this.f7038b = (Collection) next.getValue();
        C1977x xVar = this.f7039c;
        Object key = next.getKey();
        return new C1646a1(key, xVar.f7062M.mo35888h(key, (Collection) next.getValue()));
    }

    @Override
    public final void remove() {
        int i;
        C1893r.m35935d(this.f7038b != null, "no calls to next() since the last call to remove()");
        this.f7037a.remove();
        AbstractC1735g0 g0Var = this.f7039c.f7062M;
        i = g0Var.f6289M;
        g0Var.f6289M = i - this.f7038b.size();
        this.f7038b.clear();
        this.f7038b = null;
    }
}
