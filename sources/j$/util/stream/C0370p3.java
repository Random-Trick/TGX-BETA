package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.util.Comparator;

final class C0370p3 implements H, Consumer {
    private static final Object f14838d = new Object();
    private final H f14839a;
    private final ConcurrentHashMap f14840b;
    private Object f14841c;

    public C0370p3(H h10) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f14839a = h10;
        this.f14840b = concurrentHashMap;
    }

    private C0370p3(H h10, ConcurrentHashMap concurrentHashMap) {
        this.f14839a = h10;
        this.f14840b = concurrentHashMap;
    }

    @Override
    public final boolean a(Consumer consumer) {
        while (this.f14839a.a(this)) {
            ConcurrentHashMap concurrentHashMap = this.f14840b;
            Object obj = this.f14841c;
            if (obj == null) {
                obj = f14838d;
            }
            if (concurrentHashMap.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.l(this.f14841c);
                this.f14841c = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public final int characteristics() {
        return (this.f14839a.characteristics() & (-16469)) | 1;
    }

    @Override
    public final long estimateSize() {
        return this.f14839a.estimateSize();
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        this.f14839a.forEachRemaining(new C0361o(this, consumer, 6));
    }

    @Override
    public final Comparator getComparator() {
        return this.f14839a.getComparator();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return AbstractC0264a.h(this);
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return AbstractC0264a.k(this, i10);
    }

    @Override
    public final void l(Object obj) {
        this.f14841c = obj;
    }

    public final void o(Consumer consumer, Object obj) {
        if (this.f14840b.putIfAbsent(obj != null ? obj : f14838d, Boolean.TRUE) == null) {
            consumer.l(obj);
        }
    }

    @Override
    public final H trySplit() {
        H trySplit = this.f14839a.trySplit();
        if (trySplit != null) {
            return new C0370p3(trySplit, this.f14840b);
        }
        return null;
    }
}
