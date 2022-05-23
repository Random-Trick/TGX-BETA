package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.W;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

public final class S2 implements H {
    int f14621a;
    final int f14622b;
    int f14623c;
    final int f14624d;
    Object[] f14625e;
    final C0300b3 f14626f;

    public S2(C0300b3 b3Var, int i10, int i11, int i12, int i13) {
        this.f14626f = b3Var;
        this.f14621a = i10;
        this.f14622b = i11;
        this.f14623c = i12;
        this.f14624d = i13;
        Object[][] objArr = b3Var.f14707f;
        this.f14625e = objArr == null ? b3Var.f14706e : objArr[i10];
    }

    @Override
    public final boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f14621a;
        int i11 = this.f14622b;
        if (i10 >= i11 && (i10 != i11 || this.f14623c >= this.f14624d)) {
            return false;
        }
        Object[] objArr = this.f14625e;
        int i12 = this.f14623c;
        this.f14623c = i12 + 1;
        consumer.l(objArr[i12]);
        if (this.f14623c == this.f14625e.length) {
            this.f14623c = 0;
            int i13 = this.f14621a + 1;
            this.f14621a = i13;
            Object[][] objArr2 = this.f14626f.f14707f;
            if (objArr2 != null && i13 <= this.f14622b) {
                this.f14625e = objArr2[i13];
            }
        }
        return true;
    }

    @Override
    public final int characteristics() {
        return 16464;
    }

    @Override
    public final long estimateSize() {
        int i10 = this.f14621a;
        int i11 = this.f14622b;
        if (i10 == i11) {
            return this.f14624d - this.f14623c;
        }
        long[] jArr = this.f14626f.f14735d;
        return ((jArr[i11] + this.f14624d) - jArr[i10]) - this.f14623c;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        Objects.requireNonNull(consumer);
        int i11 = this.f14621a;
        int i12 = this.f14622b;
        if (i11 < i12 || (i11 == i12 && this.f14623c < this.f14624d)) {
            int i13 = this.f14623c;
            while (true) {
                i10 = this.f14622b;
                if (i11 >= i10) {
                    break;
                }
                Object[] objArr = this.f14626f.f14707f[i11];
                while (i13 < objArr.length) {
                    consumer.l(objArr[i13]);
                    i13++;
                }
                i13 = 0;
                i11++;
            }
            Object[] objArr2 = this.f14621a == i10 ? this.f14625e : this.f14626f.f14707f[i10];
            int i14 = this.f14624d;
            while (i13 < i14) {
                consumer.l(objArr2[i13]);
                i13++;
            }
            this.f14621a = this.f14622b;
            this.f14623c = this.f14624d;
        }
    }

    @Override
    public final Comparator getComparator() {
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
        int i10 = this.f14621a;
        int i11 = this.f14622b;
        if (i10 < i11) {
            C0300b3 b3Var = this.f14626f;
            int i12 = i11 - 1;
            S2 s22 = new S2(b3Var, i10, i12, this.f14623c, b3Var.f14707f[i12].length);
            int i13 = this.f14622b;
            this.f14621a = i13;
            this.f14623c = 0;
            this.f14625e = this.f14626f.f14707f[i13];
            return s22;
        } else if (i10 != i11) {
            return null;
        } else {
            int i14 = this.f14624d;
            int i15 = this.f14623c;
            int i16 = (i14 - i15) / 2;
            if (i16 == 0) {
                return null;
            }
            H m10 = W.m(this.f14625e, i15, i15 + i16);
            this.f14623c += i16;
            return m10;
        }
    }
}
