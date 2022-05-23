package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.F;
import java.util.Comparator;
import java.util.Objects;

public abstract class Z2 implements F {
    int f14662a;
    final int f14663b;
    int f14664c;
    final int f14665d;
    Object f14666e;
    final AbstractC0295a3 f14667f;

    public Z2(AbstractC0295a3 a3Var, int i10, int i11, int i12, int i13) {
        this.f14667f = a3Var;
        this.f14662a = i10;
        this.f14663b = i11;
        this.f14664c = i12;
        this.f14665d = i13;
        Object[] objArr = a3Var.f14698f;
        this.f14666e = objArr == null ? a3Var.f14697e : objArr[i10];
    }

    abstract void b(Object obj, int i10, Object obj2);

    abstract F c(Object obj, int i10, int i11);

    @Override
    public final int characteristics() {
        return 16464;
    }

    abstract F d(int i10, int i11, int i12, int i13);

    @Override
    public final long estimateSize() {
        int i10 = this.f14662a;
        int i11 = this.f14663b;
        if (i10 == i11) {
            return this.f14665d - this.f14664c;
        }
        long[] jArr = this.f14667f.f14735d;
        return ((jArr[i11] + this.f14665d) - jArr[i10]) - this.f14664c;
    }

    @Override
    public final void n(Object obj) {
        int i10;
        Objects.requireNonNull(obj);
        int i11 = this.f14662a;
        int i12 = this.f14663b;
        if (i11 < i12 || (i11 == i12 && this.f14664c < this.f14665d)) {
            int i13 = this.f14664c;
            while (true) {
                i10 = this.f14663b;
                if (i11 >= i10) {
                    break;
                }
                AbstractC0295a3 a3Var = this.f14667f;
                Object obj2 = a3Var.f14698f[i11];
                a3Var.A(obj2, i13, a3Var.B(obj2), obj);
                i13 = 0;
                i11++;
            }
            this.f14667f.A(this.f14662a == i10 ? this.f14666e : this.f14667f.f14698f[i10], i13, this.f14665d, obj);
            this.f14662a = this.f14663b;
            this.f14664c = this.f14665d;
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
    public final boolean j(Object obj) {
        Objects.requireNonNull(obj);
        int i10 = this.f14662a;
        int i11 = this.f14663b;
        if (i10 >= i11 && (i10 != i11 || this.f14664c >= this.f14665d)) {
            return false;
        }
        Object obj2 = this.f14666e;
        int i12 = this.f14664c;
        this.f14664c = i12 + 1;
        b(obj2, i12, obj);
        if (this.f14664c == this.f14667f.B(this.f14666e)) {
            this.f14664c = 0;
            int i13 = this.f14662a + 1;
            this.f14662a = i13;
            Object[] objArr = this.f14667f.f14698f;
            if (objArr != null && i13 <= this.f14663b) {
                this.f14666e = objArr[i13];
            }
        }
        return true;
    }

    @Override
    public final F trySplit() {
        int i10 = this.f14662a;
        int i11 = this.f14663b;
        if (i10 < i11) {
            int i12 = this.f14664c;
            AbstractC0295a3 a3Var = this.f14667f;
            F d10 = d(i10, i11 - 1, i12, a3Var.B(a3Var.f14698f[i11 - 1]));
            int i13 = this.f14663b;
            this.f14662a = i13;
            this.f14664c = 0;
            this.f14666e = this.f14667f.f14698f[i13];
            return d10;
        } else if (i10 != i11) {
            return null;
        } else {
            int i14 = this.f14665d;
            int i15 = this.f14664c;
            int i16 = (i14 - i15) / 2;
            if (i16 == 0) {
                return null;
            }
            F c10 = c(this.f14666e, i15, i16);
            this.f14664c += i16;
            return c10;
        }
    }
}
