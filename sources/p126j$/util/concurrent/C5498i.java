package p126j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public final class C5498i extends AbstractC5491b implements Iterator, Enumeration, p126j$.util.Iterator {
    public final int f18014k;

    public C5498i(C5502m[] mVarArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap, int i4) {
        super(mVarArr, i, i2, i3, concurrentHashMap);
        this.f18014k = i4;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        switch (this.f18014k) {
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
        switch (this.f18014k) {
            case 0:
                C5502m mVar = this.f18029b;
                if (mVar != null) {
                    Object obj = mVar.f18021b;
                    this.f18009j = mVar;
                    m22521b();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                C5502m mVar2 = this.f18029b;
                if (mVar2 != null) {
                    Object obj2 = mVar2.f18022c;
                    this.f18009j = mVar2;
                    m22521b();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override
    public final Object nextElement() {
        switch (this.f18014k) {
            case 0:
                return next();
            default:
                return next();
        }
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f18014k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }
}
