package p126j$.util.concurrent;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.Consumer;

public final class C5496g extends C5506q implements AbstractC5468G {
    final ConcurrentHashMap f18011i;
    long f18012j;

    public C5496g(C5502m[] mVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, i3);
        this.f18011i = concurrentHashMap;
        this.f18012j = j;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C5502m b = m22521b();
        if (b == null) {
            return false;
        }
        consumer.mo22128k(new C5501l(b.f18021b, b.f18022c, this.f18011i));
        return true;
    }

    @Override
    public int characteristics() {
        return 4353;
    }

    @Override
    public long estimateSize() {
        return this.f18012j;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (true) {
            C5502m b = m22521b();
            if (b != null) {
                consumer.mo22128k(new C5501l(b.f18021b, b.f18022c, this.f18011i));
            } else {
                return;
            }
        }
    }

    @Override
    public Comparator getComparator() {
        throw new IllegalStateException();
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
    public AbstractC5468G trySplit() {
        int i = this.f18033f;
        int i2 = this.f18034g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C5502m[] mVarArr = this.f18028a;
        int i4 = this.f18035h;
        this.f18034g = i3;
        long j = this.f18012j >>> 1;
        this.f18012j = j;
        return new C5496g(mVarArr, i4, i3, i2, j, this.f18011i);
    }
}
