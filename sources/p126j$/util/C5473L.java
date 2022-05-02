package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p126j$.util.function.Consumer;

final class C5473L implements AbstractC5468G {
    private final Object[] f17946a;
    private int f17947b;
    private final int f17948c;
    private final int f17949d;

    public C5473L(Object[] objArr, int i, int i2, int i3) {
        this.f17946a = objArr;
        this.f17947b = i;
        this.f17948c = i2;
        this.f17949d = i3 | 64 | Log.TAG_VIDEO;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i = this.f17947b;
        if (i < 0 || i >= this.f17948c) {
            return false;
        }
        Object[] objArr = this.f17946a;
        this.f17947b = i + 1;
        consumer.mo22128k(objArr[i]);
        return true;
    }

    @Override
    public int characteristics() {
        return this.f17949d;
    }

    @Override
    public long estimateSize() {
        return this.f17948c - this.f17947b;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        int i;
        Objects.requireNonNull(consumer);
        Object[] objArr = this.f17946a;
        int length = objArr.length;
        int i2 = this.f17948c;
        if (length >= i2 && (i = this.f17947b) >= 0) {
            this.f17947b = i2;
            if (i < i2) {
                do {
                    consumer.mo22128k(objArr[i]);
                    i++;
                } while (i < i2);
            }
        }
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
    public AbstractC5468G trySplit() {
        int i = this.f17947b;
        int i2 = (this.f17948c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        Object[] objArr = this.f17946a;
        this.f17947b = i2;
        return new C5473L(objArr, i, i2, this.f17949d);
    }
}
