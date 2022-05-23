package j$.util;

import j$.util.function.Consumer;
import j$.util.function.v;
import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;

public final class V implements D {
    private final long[] f14351a;
    private int f14352b;
    private final int f14353c;
    private final int f14354d;

    public V(long[] jArr, int i10, int i11, int i12) {
        this.f14351a = jArr;
        this.f14352b = i10;
        this.f14353c = i11;
        this.f14354d = i12 | 64 | Log.TAG_VIDEO;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.s(this, consumer);
    }

    @Override
    public final int characteristics() {
        return this.f14354d;
    }

    @Override
    public final long estimateSize() {
        return this.f14353c - this.f14352b;
    }

    @Override
    public final void forEachRemaining(v vVar) {
        int i10;
        Objects.requireNonNull(vVar);
        long[] jArr = this.f14351a;
        int length = jArr.length;
        int i11 = this.f14353c;
        if (length >= i11 && (i10 = this.f14352b) >= 0) {
            this.f14352b = i11;
            if (i10 < i11) {
                do {
                    vVar.e(jArr[i10]);
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.e(this, consumer);
    }

    @Override
    public final boolean tryAdvance(v vVar) {
        Objects.requireNonNull(vVar);
        int i10 = this.f14352b;
        if (i10 < 0 || i10 >= this.f14353c) {
            return false;
        }
        long[] jArr = this.f14351a;
        this.f14352b = i10 + 1;
        vVar.e(jArr[i10]);
        return true;
    }

    @Override
    public final Comparator getComparator() {
        if (AbstractC0264a.k(this, 4)) {
            return null;
        }
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
    public final D trySplit() {
        int i10 = this.f14352b;
        int i11 = (this.f14353c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        long[] jArr = this.f14351a;
        this.f14352b = i11;
        return new V(jArr, i10, i11, this.f14354d);
    }
}
