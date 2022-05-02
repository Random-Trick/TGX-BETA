package p126j$.util.stream;

import java.util.Collection;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.AbstractC5486b;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

final class C5649T0 implements AbstractC5632P0 {
    private final Collection f18241a;

    public C5649T0(Collection collection) {
        this.f18241a = collection;
    }

    @Override
    public void mo22177a(Consumer consumer) {
        AbstractC5485a.m22585B(this.f18241a, consumer);
    }

    @Override
    public long count() {
        return this.f18241a.size();
    }

    @Override
    public AbstractC5632P0 mo22159f(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void mo22155n(Object[] objArr, int i) {
        for (Object obj : this.f18241a) {
            i++;
            objArr[i] = obj;
        }
    }

    @Override
    public int mo22154o() {
        return 0;
    }

    @Override
    public Object[] mo22153p(AbstractC5531m mVar) {
        Collection collection = this.f18241a;
        return collection.toArray((Object[]) mVar.mo22179w(collection.size()));
    }

    @Override
    public AbstractC5632P0 mo22152q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22399y(this, j, j2, mVar);
    }

    @Override
    public AbstractC5468G mo42632spliterator() {
        Collection collection = this.f18241a;
        return ((AbstractC5686c) (collection instanceof AbstractC5486b ? ((AbstractC5486b) collection).stream() : AbstractC5485a.m22566p(collection))).spliterator();
    }

    public String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f18241a.size()), this.f18241a);
    }
}
