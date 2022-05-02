package p126j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import p126j$.util.concurrent.ConcurrentHashMap;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.C5520b;
import p126j$.util.function.Consumer;

public final class C5741n implements Consumer, AbstractC5542x {
    public final int f18430a;
    public final Object f18431b;
    public final Object f18432c;

    public C5741n(Object obj, Object obj2, int i) {
        this.f18430a = i;
        this.f18431b = obj;
        this.f18432c = obj2;
    }

    @Override
    public Object get() {
        switch (this.f18430a) {
            case 1:
                return new C5797y0((EnumC5557A0) this.f18431b, (C5520b) this.f18432c);
            case 2:
                return new C5787w0((EnumC5557A0) this.f18431b, (C5520b) this.f18432c);
            case 3:
                return new C5792x0((EnumC5557A0) this.f18431b, (C5520b) this.f18432c);
            default:
                return new C5782v0((EnumC5557A0) this.f18431b, (AbstractC5541w) this.f18432c);
        }
    }

    @Override
    public void mo22128k(Object obj) {
        switch (this.f18430a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18431b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18432c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) this.f18431b).mo22179p(this.f18432c, obj);
                return;
            default:
                ((C5750o3) this.f18431b).m22208o((Consumer) this.f18432c, obj);
                return;
        }
    }
}
