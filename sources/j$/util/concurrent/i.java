package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i extends AbstractC0268b implements Iterator, Enumeration, j$.util.Iterator {
    public final int f14406k;

    public i(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(mVarArr, i10, i11, concurrentHashMap);
        this.f14406k = i12;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f14406k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override
    public final Object next() {
        switch (this.f14406k) {
            case 0:
                m mVar = this.f14421b;
                if (mVar != null) {
                    Object obj = mVar.f14413b;
                    this.f14401j = mVar;
                    b();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                m mVar2 = this.f14421b;
                if (mVar2 != null) {
                    Object obj2 = mVar2.f14414c;
                    this.f14401j = mVar2;
                    b();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override
    public final Object nextElement() {
        switch (this.f14406k) {
            case 0:
                return next();
            default:
                return next();
        }
    }

    @Override
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f14406k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }
}
