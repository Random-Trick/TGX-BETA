package j$.util;

import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;

public final class N implements z {
    private final double[] f14338a;
    private int f14339b;
    private final int f14340c;
    private final int f14341d;

    public N(double[] dArr, int i10, int i11, int i12) {
        this.f14338a = dArr;
        this.f14339b = i10;
        this.f14340c = i11;
        this.f14341d = i12 | 64 | Log.TAG_VIDEO;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.q(this, consumer);
    }

    @Override
    public final int characteristics() {
        return this.f14341d;
    }

    @Override
    public final long estimateSize() {
        return this.f14340c - this.f14339b;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.c(this, consumer);
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
    public final boolean tryAdvance(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
        int i10 = this.f14339b;
        if (i10 < 0 || i10 >= this.f14340c) {
            return false;
        }
        double[] dArr = this.f14338a;
        this.f14339b = i10 + 1;
        fVar.c(dArr[i10]);
        return true;
    }

    @Override
    public final void forEachRemaining(AbstractC0278f fVar) {
        int i10;
        Objects.requireNonNull(fVar);
        double[] dArr = this.f14338a;
        int length = dArr.length;
        int i11 = this.f14340c;
        if (length >= i11 && (i10 = this.f14339b) >= 0) {
            this.f14339b = i11;
            if (i10 < i11) {
                do {
                    fVar.c(dArr[i10]);
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override
    public final z trySplit() {
        int i10 = this.f14339b;
        int i11 = (this.f14340c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        double[] dArr = this.f14338a;
        this.f14339b = i11;
        return new N(dArr, i10, i11, this.f14341d);
    }
}
