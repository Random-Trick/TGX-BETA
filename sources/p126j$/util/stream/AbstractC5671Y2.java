package p126j$.util.stream;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5485a;

public abstract class AbstractC5671Y2 implements AbstractC5466E {
    int f18267a;
    final int f18268b;
    int f18269c;
    final int f18270d;
    Object f18271e;
    final AbstractC5675Z2 f18272f;

    public AbstractC5671Y2(AbstractC5675Z2 z2, int i, int i2, int i3, int i4) {
        this.f18272f = z2;
        this.f18267a = i;
        this.f18268b = i2;
        this.f18269c = i3;
        this.f18270d = i4;
        Object[] objArr = z2.f18283f;
        this.f18271e = objArr == null ? z2.f18282e : objArr[i];
    }

    abstract void mo22345b(Object obj, int i, Object obj2);

    abstract AbstractC5466E mo22344c(Object obj, int i, int i2);

    @Override
    public int characteristics() {
        return 16464;
    }

    abstract AbstractC5466E mo22343d(int i, int i2, int i3, int i4);

    @Override
    public long estimateSize() {
        int i = this.f18267a;
        int i2 = this.f18268b;
        if (i == i2) {
            return this.f18270d - this.f18269c;
        }
        long[] jArr = this.f18272f.f18343d;
        return ((jArr[i2] + this.f18270d) - jArr[i]) - this.f18269c;
    }

    @Override
    public void m22337n(Object obj) {
        int i;
        Objects.requireNonNull(obj);
        int i2 = this.f18267a;
        int i3 = this.f18268b;
        if (i2 < i3 || (i2 == i3 && this.f18269c < this.f18270d)) {
            int i4 = this.f18269c;
            while (true) {
                i = this.f18268b;
                if (i2 >= i) {
                    break;
                }
                AbstractC5675Z2 z2 = this.f18272f;
                Object obj2 = z2.f18283f[i2];
                z2.mo22333u(obj2, i4, z2.mo22332v(obj2), obj);
                i4 = 0;
                i2++;
            }
            this.f18272f.mo22333u(this.f18267a == i ? this.f18271e : this.f18272f.f18283f[i], i4, this.f18270d, obj);
            this.f18267a = this.f18268b;
            this.f18269c = this.f18270d;
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
    public boolean m22339l(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.f18267a;
        int i2 = this.f18268b;
        if (i >= i2 && (i != i2 || this.f18269c >= this.f18270d)) {
            return false;
        }
        Object obj2 = this.f18271e;
        int i3 = this.f18269c;
        this.f18269c = i3 + 1;
        mo22345b(obj2, i3, obj);
        if (this.f18269c == this.f18272f.mo22332v(this.f18271e)) {
            this.f18269c = 0;
            int i4 = this.f18267a + 1;
            this.f18267a = i4;
            Object[] objArr = this.f18272f.f18283f;
            if (objArr != null && i4 <= this.f18268b) {
                this.f18271e = objArr[i4];
            }
        }
        return true;
    }

    @Override
    public AbstractC5466E trySplit() {
        int i = this.f18267a;
        int i2 = this.f18268b;
        if (i < i2) {
            int i3 = this.f18269c;
            AbstractC5675Z2 z2 = this.f18272f;
            AbstractC5466E d = mo22343d(i, i2 - 1, i3, z2.mo22332v(z2.f18283f[i2 - 1]));
            int i4 = this.f18268b;
            this.f18267a = i4;
            this.f18269c = 0;
            this.f18271e = this.f18272f.f18283f[i4];
            return d;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.f18270d;
            int i6 = this.f18269c;
            int i7 = (i5 - i6) / 2;
            if (i7 == 0) {
                return null;
            }
            AbstractC5466E c = mo22344c(this.f18271e, i6, i7);
            this.f18269c += i7;
            return c;
        }
    }
}
