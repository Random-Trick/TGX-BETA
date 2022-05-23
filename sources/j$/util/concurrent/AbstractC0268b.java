package j$.util.concurrent;

public abstract class AbstractC0268b extends q {
    final ConcurrentHashMap f14400i;
    m f14401j;

    public AbstractC0268b(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, 0, i11);
        this.f14400i = concurrentHashMap;
        b();
    }

    public final boolean hasMoreElements() {
        return this.f14421b != null;
    }

    public final boolean hasNext() {
        return this.f14421b != null;
    }

    public final void remove() {
        m mVar = this.f14401j;
        if (mVar != null) {
            this.f14401j = null;
            this.f14400i.i(mVar.f14413b, null, null);
            return;
        }
        throw new IllegalStateException();
    }
}
