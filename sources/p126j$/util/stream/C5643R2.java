package p126j$.util.stream;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.Consumer;

public class C5643R2 implements AbstractC5468G {
    int f18226a;
    final int f18227b;
    int f18228c;
    final int f18229d;
    Object[] f18230e;
    final C5680a3 f18231f;

    public C5643R2(C5680a3 a3Var, int i, int i2, int i3, int i4) {
        this.f18231f = a3Var;
        this.f18226a = i;
        this.f18227b = i2;
        this.f18228c = i3;
        this.f18229d = i4;
        Object[][] objArr = a3Var.f18310f;
        this.f18230e = objArr == null ? a3Var.f18309e : objArr[i];
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i = this.f18226a;
        int i2 = this.f18227b;
        if (i >= i2 && (i != i2 || this.f18228c >= this.f18229d)) {
            return false;
        }
        Object[] objArr = this.f18230e;
        int i3 = this.f18228c;
        this.f18228c = i3 + 1;
        consumer.mo22129k(objArr[i3]);
        if (this.f18228c == this.f18230e.length) {
            this.f18228c = 0;
            int i4 = this.f18226a + 1;
            this.f18226a = i4;
            Object[][] objArr2 = this.f18231f.f18310f;
            if (objArr2 != null && i4 <= this.f18227b) {
                this.f18230e = objArr2[i4];
            }
        }
        return true;
    }

    @Override
    public int characteristics() {
        return 16464;
    }

    @Override
    public long estimateSize() {
        int i = this.f18226a;
        int i2 = this.f18227b;
        if (i == i2) {
            return this.f18229d - this.f18228c;
        }
        long[] jArr = this.f18231f.f18343d;
        return ((jArr[i2] + this.f18229d) - jArr[i]) - this.f18228c;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        int i;
        Objects.requireNonNull(consumer);
        int i2 = this.f18226a;
        int i3 = this.f18227b;
        if (i2 < i3 || (i2 == i3 && this.f18228c < this.f18229d)) {
            int i4 = this.f18228c;
            while (true) {
                i = this.f18227b;
                if (i2 >= i) {
                    break;
                }
                Object[] objArr = this.f18231f.f18310f[i2];
                while (i4 < objArr.length) {
                    consumer.mo22129k(objArr[i4]);
                    i4++;
                }
                i4 = 0;
                i2++;
            }
            Object[] objArr2 = this.f18226a == i ? this.f18230e : this.f18231f.f18310f[i];
            int i5 = this.f18229d;
            while (i4 < i5) {
                consumer.mo22129k(objArr2[i4]);
                i4++;
            }
            this.f18226a = this.f18227b;
            this.f18228c = this.f18229d;
        }
    }

    @Override
    public Comparator getComparator() {
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
    public AbstractC5468G trySplit() {
        int i = this.f18226a;
        int i2 = this.f18227b;
        if (i < i2) {
            C5680a3 a3Var = this.f18231f;
            int i3 = i2 - 1;
            C5643R2 r2 = new C5643R2(a3Var, i, i3, this.f18228c, a3Var.f18310f[i3].length);
            int i4 = this.f18227b;
            this.f18226a = i4;
            this.f18228c = 0;
            this.f18230e = this.f18231f.f18310f[i4];
            return r2;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.f18229d;
            int i6 = this.f18228c;
            int i7 = (i5 - i6) / 2;
            if (i7 == 0) {
                return null;
            }
            AbstractC5468G m = AbstractC5482V.m22588m(this.f18230e, i6, i6 + i7, 1040);
            this.f18228c += i7;
            return m;
        }
    }
}
