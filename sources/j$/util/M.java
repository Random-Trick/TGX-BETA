package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;

final class M implements H {
    private final Object[] f14334a;
    private int f14335b;
    private final int f14336c;
    private final int f14337d;

    public M(Object[] objArr, int i10, int i11, int i12) {
        this.f14334a = objArr;
        this.f14335b = i10;
        this.f14336c = i11;
        this.f14337d = i12 | 64 | Log.TAG_VIDEO;
    }

    @Override
    public final boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f14335b;
        if (i10 < 0 || i10 >= this.f14336c) {
            return false;
        }
        Object[] objArr = this.f14334a;
        this.f14335b = i10 + 1;
        consumer.l(objArr[i10]);
        return true;
    }

    @Override
    public final int characteristics() {
        return this.f14337d;
    }

    @Override
    public final long estimateSize() {
        return this.f14336c - this.f14335b;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        Objects.requireNonNull(consumer);
        Object[] objArr = this.f14334a;
        int length = objArr.length;
        int i11 = this.f14336c;
        if (length >= i11 && (i10 = this.f14335b) >= 0) {
            this.f14335b = i11;
            if (i10 < i11) {
                do {
                    consumer.l(objArr[i10]);
                    i10++;
                } while (i10 < i11);
            }
        }
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
    public final H trySplit() {
        int i10 = this.f14335b;
        int i11 = (this.f14336c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        Object[] objArr = this.f14334a;
        this.f14335b = i11;
        return new M(objArr, i10, i11, this.f14337d);
    }
}
