package j$.util;

import j$.util.function.Consumer;
import j$.util.function.n;
import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;

public final class T implements B {
    private final int[] f14342a;
    private int f14343b;
    private final int f14344c;
    private final int f14345d;

    public T(int[] iArr, int i10, int i11, int i12) {
        this.f14342a = iArr;
        this.f14343b = i10;
        this.f14344c = i11;
        this.f14345d = i12 | 64 | Log.TAG_VIDEO;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.r(this, consumer);
    }

    @Override
    public final int characteristics() {
        return this.f14345d;
    }

    @Override
    public final long estimateSize() {
        return this.f14344c - this.f14343b;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.d(this, consumer);
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
    public final boolean tryAdvance(n nVar) {
        Objects.requireNonNull(nVar);
        int i10 = this.f14343b;
        if (i10 < 0 || i10 >= this.f14344c) {
            return false;
        }
        int[] iArr = this.f14342a;
        this.f14343b = i10 + 1;
        nVar.d(iArr[i10]);
        return true;
    }

    @Override
    public final void forEachRemaining(n nVar) {
        int i10;
        Objects.requireNonNull(nVar);
        int[] iArr = this.f14342a;
        int length = iArr.length;
        int i11 = this.f14344c;
        if (length >= i11 && (i10 = this.f14343b) >= 0) {
            this.f14343b = i11;
            if (i10 < i11) {
                do {
                    nVar.d(iArr[i10]);
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override
    public final B trySplit() {
        int i10 = this.f14343b;
        int i11 = (this.f14344c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        int[] iArr = this.f14342a;
        this.f14343b = i11;
        return new T(iArr, i10, i11, this.f14345d);
    }
}
