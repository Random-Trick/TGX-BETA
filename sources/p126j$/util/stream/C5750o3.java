package p126j$.util.stream;

import java.util.Comparator;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.concurrent.ConcurrentHashMap;
import p126j$.util.function.Consumer;

final class C5750o3 implements AbstractC5468G, Consumer {
    private static final Object f18444d = new Object();
    private final AbstractC5468G f18445a;
    private final ConcurrentHashMap f18446b;
    private Object f18447c;

    public C5750o3(AbstractC5468G g) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f18445a = g;
        this.f18446b = concurrentHashMap;
    }

    private C5750o3(AbstractC5468G g, ConcurrentHashMap concurrentHashMap) {
        this.f18445a = g;
        this.f18446b = concurrentHashMap;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        while (this.f18445a.mo22124a(this)) {
            ConcurrentHashMap concurrentHashMap = this.f18446b;
            Object obj = this.f18447c;
            if (obj == null) {
                obj = f18444d;
            }
            if (concurrentHashMap.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.mo22128k(this.f18447c);
                this.f18447c = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int characteristics() {
        return (this.f18445a.characteristics() & (-16469)) | 1;
    }

    @Override
    public long estimateSize() {
        return this.f18445a.estimateSize();
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        this.f18445a.forEachRemaining(new C5741n(this, consumer, 6));
    }

    @Override
    public Comparator getComparator() {
        return this.f18445a.getComparator();
    }

    @Override
    public long getExactSizeIfKnown() {
        return AbstractC5485a.m22569h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22568j(this, i);
    }

    @Override
    public void mo22128k(Object obj) {
        this.f18447c = obj;
    }

    public void m22208o(Consumer consumer, Object obj) {
        if (this.f18446b.putIfAbsent(obj != null ? obj : f18444d, Boolean.TRUE) == null) {
            consumer.mo22128k(obj);
        }
    }

    @Override
    public AbstractC5468G trySplit() {
        AbstractC5468G trySplit = this.f18445a.trySplit();
        if (trySplit != null) {
            return new C5750o3(trySplit, this.f18446b);
        }
        return null;
    }
}
