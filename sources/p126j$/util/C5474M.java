package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.Consumer;

public final class C5474M implements AbstractC5811y {
    private final double[] f17950a;
    private int f17951b;
    private final int f17952c;
    private final int f17953d;

    public C5474M(double[] dArr, int i, int i2, int i3) {
        this.f17950a = dArr;
        this.f17951b = i;
        this.f17952c = i2;
        this.f17953d = i3 | 64 | Log.TAG_VIDEO;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22564q(this, consumer);
    }

    @Override
    public int characteristics() {
        return this.f17953d;
    }

    @Override
    public long estimateSize() {
        return this.f17952c - this.f17951b;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22572c(this, consumer);
    }

    @Override
    public Comparator getComparator() {
        if (AbstractC5485a.m22568j(this, 4)) {
            return null;
        }
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
    public boolean tryAdvance(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        int i = this.f17951b;
        if (i < 0 || i >= this.f17952c) {
            return false;
        }
        double[] dArr = this.f17950a;
        this.f17951b = i + 1;
        gVar.mo22150c(dArr[i]);
        return true;
    }

    @Override
    public void forEachRemaining(AbstractC5525g gVar) {
        int i;
        Objects.requireNonNull(gVar);
        double[] dArr = this.f17950a;
        int length = dArr.length;
        int i2 = this.f17952c;
        if (length >= i2 && (i = this.f17951b) >= 0) {
            this.f17951b = i2;
            if (i < i2) {
                do {
                    gVar.mo22150c(dArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override
    public AbstractC5811y trySplit() {
        int i = this.f17951b;
        int i2 = (this.f17952c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        double[] dArr = this.f17950a;
        this.f17951b = i2;
        return new C5474M(dArr, i, i2, this.f17953d);
    }
}
