package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.Consumer;

public final class C5479S implements AbstractC5462A {
    private final int[] f17954a;
    private int f17955b;
    private final int f17956c;
    private final int f17957d;

    public C5479S(int[] iArr, int i, int i2, int i3) {
        this.f17954a = iArr;
        this.f17955b = i;
        this.f17956c = i2;
        this.f17957d = i3 | 64 | Log.TAG_VIDEO;
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22564r(this, consumer);
    }

    @Override
    public int characteristics() {
        return this.f17957d;
    }

    @Override
    public long estimateSize() {
        return this.f17956c - this.f17955b;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22572d(this, consumer);
    }

    @Override
    public Comparator getComparator() {
        if (AbstractC5485a.m22569j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override
    public long getExactSizeIfKnown() {
        return AbstractC5485a.m22570h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22569j(this, i);
    }

    @Override
    public boolean tryAdvance(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        int i = this.f17955b;
        if (i < 0 || i >= this.f17956c) {
            return false;
        }
        int[] iArr = this.f17954a;
        this.f17955b = i + 1;
        lVar.mo22145d(iArr[i]);
        return true;
    }

    @Override
    public void forEachRemaining(AbstractC5530l lVar) {
        int i;
        Objects.requireNonNull(lVar);
        int[] iArr = this.f17954a;
        int length = iArr.length;
        int i2 = this.f17956c;
        if (length >= i2 && (i = this.f17955b) >= 0) {
            this.f17955b = i2;
            if (i < i2) {
                do {
                    lVar.mo22145d(iArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override
    public AbstractC5462A trySplit() {
        int i = this.f17955b;
        int i2 = (this.f17956c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        int[] iArr = this.f17954a;
        this.f17955b = i2;
        return new C5479S(iArr, i, i2, this.f17957d);
    }
}
