package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.E;
import j$.util.function.F;
import j$.util.function.h;
import j$.util.function.p;
import j$.util.function.x;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C0361o implements Consumer, F {
    public final int f14824a;
    public final Object f14825b;
    public final Object f14826c;

    public C0361o(Object obj, Object obj2, int i10) {
        this.f14824a = i10;
        this.f14825b = obj;
        this.f14826c = obj2;
    }

    @Override
    public final Object get() {
        switch (this.f14824a) {
            case 1:
                return new C0409z0((B0) this.f14825b, (h) this.f14826c);
            case 2:
                return new C0401x0((B0) this.f14825b, (p) this.f14826c);
            case 3:
                return new C0405y0((B0) this.f14825b, (x) this.f14826c);
            default:
                return new C0397w0((B0) this.f14825b, (E) this.f14826c);
        }
    }

    @Override
    public final void l(Object obj) {
        switch (this.f14824a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f14825b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f14826c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) this.f14825b).q(this.f14826c, obj);
                return;
            default:
                ((C0370p3) this.f14825b).o((Consumer) this.f14826c, obj);
                return;
        }
    }
}
