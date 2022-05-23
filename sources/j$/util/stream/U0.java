package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.AbstractC0265b;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.o;
import java.util.Collection;

public final class U0 implements Q0 {
    private final Collection f14636a;

    public U0(Collection collection) {
        this.f14636a = collection;
    }

    @Override
    public final void a(Consumer consumer) {
        AbstractC0264a.x(this.f14636a, consumer);
    }

    @Override
    public final long count() {
        return this.f14636a.size();
    }

    @Override
    public final Q0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        for (Object obj : this.f14636a) {
            i10++;
            objArr[i10] = obj;
        }
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final H mo31spliterator() {
        Collection collection = this.f14636a;
        return ((AbstractC0301c) (collection instanceof AbstractC0265b ? ((AbstractC0265b) collection).stream() : AbstractC0264a.p(collection))).spliterator();
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f14636a.size()), this.f14636a);
    }

    @Override
    public final Object[] v(o oVar) {
        Collection collection = this.f14636a;
        return collection.toArray((Object[]) oVar.z(collection.size()));
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.E(this, j10, j11, oVar);
    }
}
