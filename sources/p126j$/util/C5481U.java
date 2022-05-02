package p126j$.util;

import java.util.Comparator;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

public final class C5481U implements AbstractC5464C {
    private final long[] f17963a;
    private int f17964b;
    private final int f17965c;
    private final int f17966d;

    public C5481U(long[] jArr, int i, int i2, int i3) {
        this.f17963a = jArr;
        this.f17964b = i;
        this.f17965c = i2;
        this.f17966d = i3 | 64 | Log.TAG_VIDEO;
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22563s(this, consumer);
    }

    @Override
    public int characteristics() {
        return this.f17966d;
    }

    @Override
    public long estimateSize() {
        return this.f17965c - this.f17964b;
    }

    @Override
    public void forEachRemaining(AbstractC5535q qVar) {
        int i;
        Objects.requireNonNull(qVar);
        long[] jArr = this.f17963a;
        int length = jArr.length;
        int i2 = this.f17965c;
        if (length >= i2 && (i = this.f17964b) >= 0) {
            this.f17964b = i2;
            if (i < i2) {
                do {
                    qVar.mo22128e(jArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22571e(this, consumer);
    }

    @Override
    public boolean tryAdvance(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        int i = this.f17964b;
        if (i < 0 || i >= this.f17965c) {
            return false;
        }
        long[] jArr = this.f17963a;
        this.f17964b = i + 1;
        qVar.mo22128e(jArr[i]);
        return true;
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
    public AbstractC5464C trySplit() {
        int i = this.f17964b;
        int i2 = (this.f17965c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        long[] jArr = this.f17963a;
        this.f17964b = i2;
        return new C5481U(jArr, i, i2, this.f17966d);
    }
}
