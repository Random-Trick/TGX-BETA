package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class e extends AbstractC0268b implements Iterator, j$.util.Iterator {
    public e(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, i11, concurrentHashMap);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final Object next() {
        m mVar = this.f14421b;
        if (mVar != null) {
            Object obj = mVar.f14413b;
            Object obj2 = mVar.f14414c;
            this.f14401j = mVar;
            b();
            return new l(obj, obj2, this.f14400i);
        }
        throw new NoSuchElementException();
    }
}
