package j$.util.stream;

import j$.util.G;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

public final class C0321g implements BaseStream {
    final AbstractC0326h f14750a;

    private C0321g(AbstractC0326h hVar) {
        this.f14750a = hVar;
    }

    public static BaseStream i(AbstractC0326h hVar) {
        if (hVar == null) {
            return null;
        }
        return new C0321g(hVar);
    }

    @Override
    public final void close() {
        ((AbstractC0301c) this.f14750a).close();
    }

    @Override
    public final boolean isParallel() {
        return ((AbstractC0301c) this.f14750a).isParallel();
    }

    @Override
    public final Iterator iterator() {
        return this.f14750a.iterator();
    }

    @Override
    public final BaseStream onClose(Runnable runnable) {
        AbstractC0301c cVar = (AbstractC0301c) this.f14750a;
        cVar.E0(runnable);
        return i(cVar);
    }

    @Override
    public final BaseStream parallel() {
        AbstractC0301c cVar = (AbstractC0301c) this.f14750a;
        cVar.J0();
        return i(cVar);
    }

    @Override
    public final BaseStream sequential() {
        AbstractC0301c cVar = (AbstractC0301c) this.f14750a;
        cVar.K0();
        return i(cVar);
    }

    @Override
    public final Spliterator spliterator() {
        return G.a(this.f14750a.spliterator());
    }

    @Override
    public final BaseStream unordered() {
        return i(this.f14750a.unordered());
    }
}
