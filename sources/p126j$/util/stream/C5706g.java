package p126j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import p126j$.util.C5467F;

public final class C5706g implements BaseStream {
    final AbstractC5711h f18378a;

    private C5706g(AbstractC5711h hVar) {
        this.f18378a = hVar;
    }

    public static BaseStream m22262i(AbstractC5711h hVar) {
        if (hVar == null) {
            return null;
        }
        return new C5706g(hVar);
    }

    @Override
    public void close() {
        ((AbstractC5686c) this.f18378a).close();
    }

    @Override
    public boolean isParallel() {
        return ((AbstractC5686c) this.f18378a).isParallel();
    }

    @Override
    public Iterator iterator() {
        return this.f18378a.iterator();
    }

    @Override
    public BaseStream onClose(Runnable runnable) {
        AbstractC5686c cVar = (AbstractC5686c) this.f18378a;
        cVar.m22312A0(runnable);
        return m22262i(cVar);
    }

    @Override
    public BaseStream parallel() {
        AbstractC5686c cVar = (AbstractC5686c) this.f18378a;
        cVar.m22311F0();
        return m22262i(cVar);
    }

    @Override
    public BaseStream sequential() {
        AbstractC5686c cVar = (AbstractC5686c) this.f18378a;
        cVar.m22310G0();
        return m22262i(cVar);
    }

    @Override
    public Spliterator spliterator() {
        return C5467F.m22605a(this.f18378a.spliterator());
    }

    @Override
    public BaseStream unordered() {
        return m22262i(this.f18378a.unordered());
    }
}
