package p126j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

final class C5494e extends AbstractC5491b implements Iterator, p126j$.util.Iterator {
    public C5494e(C5502m[] mVarArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, i3, concurrentHashMap);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public Object next() {
        C5502m mVar = this.f18029b;
        if (mVar != null) {
            Object obj = mVar.f18021b;
            Object obj2 = mVar.f18022c;
            this.f18009j = mVar;
            m22522b();
            return new C5501l(obj, obj2, this.f18008i);
        }
        throw new NoSuchElementException();
    }
}
