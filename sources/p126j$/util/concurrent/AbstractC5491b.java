package p126j$.util.concurrent;

public abstract class AbstractC5491b extends C5506q {
    final ConcurrentHashMap f18008i;
    C5502m f18009j;

    public AbstractC5491b(C5502m[] mVarArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, i3);
        this.f18008i = concurrentHashMap;
        m22522b();
    }

    public final boolean hasMoreElements() {
        return this.f18029b != null;
    }

    public final boolean hasNext() {
        return this.f18029b != null;
    }

    public final void remove() {
        C5502m mVar = this.f18009j;
        if (mVar != null) {
            this.f18009j = null;
            this.f18008i.m22545i(mVar.f18021b, null, null);
            return;
        }
        throw new IllegalStateException();
    }
}
