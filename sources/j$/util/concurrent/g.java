package j$.util.concurrent;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

public final class g extends q implements H {
    final ConcurrentHashMap f14403i;
    long f14404j;

    public g(m[] mVarArr, int i10, int i11, int i12, long j10, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, i11, i12);
        this.f14403i = concurrentHashMap;
        this.f14404j = j10;
    }

    @Override
    public final boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m b10 = b();
        if (b10 == null) {
            return false;
        }
        consumer.l(new l(b10.f14413b, b10.f14414c, this.f14403i));
        return true;
    }

    @Override
    public final int characteristics() {
        return 4353;
    }

    @Override
    public final long estimateSize() {
        return this.f14404j;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (true) {
            m b10 = b();
            if (b10 != null) {
                consumer.l(new l(b10.f14413b, b10.f14414c, this.f14403i));
            } else {
                return;
            }
        }
    }

    @Override
    public final Comparator getComparator() {
        throw new IllegalStateException();
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
    public final H trySplit() {
        int i10 = this.f14425f;
        int i11 = this.f14426g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        m[] mVarArr = this.f14420a;
        int i13 = this.f14427h;
        this.f14426g = i12;
        long j10 = this.f14404j >>> 1;
        this.f14404j = j10;
        return new g(mVarArr, i13, i12, i11, j10, this.f14403i);
    }
}
