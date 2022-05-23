package j$.util.stream;

import j$.util.H;
import java.util.Arrays;

abstract class AbstractC0295a3 extends AbstractC0311e implements Iterable {
    Object f14697e = g(16);
    Object[] f14698f;

    public AbstractC0295a3() {
    }

    public AbstractC0295a3(int i10) {
        super(i10);
    }

    private void F() {
        if (this.f14698f == null) {
            Object[] G = G();
            this.f14698f = G;
            this.f14735d = new long[8];
            G[0] = this.f14697e;
        }
    }

    public abstract void A(Object obj, int i10, int i11, Object obj2);

    public abstract int B(Object obj);

    protected final long C() {
        int i10 = this.f14734c;
        if (i10 == 0) {
            return B(this.f14697e);
        }
        return B(this.f14698f[i10]) + this.f14735d[i10];
    }

    public final int D(long j10) {
        if (this.f14734c == 0) {
            if (j10 < this.f14733b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else if (j10 < count()) {
            for (int i10 = 0; i10 <= this.f14734c; i10++) {
                if (j10 < this.f14735d[i10] + B(this.f14698f[i10])) {
                    return i10;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
    }

    public final void E(long j10) {
        int i10;
        long C = C();
        if (j10 > C) {
            F();
            int i11 = this.f14734c;
            while (true) {
                i11++;
                if (j10 > C) {
                    Object[] objArr = this.f14698f;
                    if (i11 >= objArr.length) {
                        int length = objArr.length * 2;
                        this.f14698f = Arrays.copyOf(objArr, length);
                        this.f14735d = Arrays.copyOf(this.f14735d, length);
                    }
                    int z10 = z(i11);
                    this.f14698f[i11] = g(z10);
                    long[] jArr = this.f14735d;
                    jArr[i11] = jArr[i11 - 1] + B(this.f14698f[i10]);
                    C += z10;
                } else {
                    return;
                }
            }
        }
    }

    protected abstract Object[] G();

    public final void H() {
        if (this.f14733b == B(this.f14697e)) {
            F();
            int i10 = this.f14734c + 1;
            Object[] objArr = this.f14698f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                E(C() + 1);
            }
            this.f14733b = 0;
            int i11 = this.f14734c + 1;
            this.f14734c = i11;
            this.f14697e = this.f14698f[i11];
        }
    }

    @Override
    public final void clear() {
        Object[] objArr = this.f14698f;
        if (objArr != null) {
            this.f14697e = objArr[0];
            this.f14698f = null;
            this.f14735d = null;
        }
        this.f14733b = 0;
        this.f14734c = 0;
    }

    public abstract Object g(int i10);

    public void j(Object obj, int i10) {
        long j10 = i10;
        long count = count() + j10;
        if (count > B(obj) || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f14734c == 0) {
            System.arraycopy(this.f14697e, 0, obj, i10, this.f14733b);
        } else {
            for (int i11 = 0; i11 < this.f14734c; i11++) {
                Object[] objArr = this.f14698f;
                System.arraycopy(objArr[i11], 0, obj, i10, B(objArr[i11]));
                i10 += B(this.f14698f[i11]);
            }
            int i12 = this.f14733b;
            if (i12 > 0) {
                System.arraycopy(this.f14697e, 0, obj, i10, i12);
            }
        }
    }

    public Object m() {
        long count = count();
        if (count < 2147483639) {
            Object g10 = g((int) count);
            j(g10, 0);
            return g10;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void n(Object obj) {
        for (int i10 = 0; i10 < this.f14734c; i10++) {
            Object[] objArr = this.f14698f;
            A(objArr[i10], 0, B(objArr[i10]), obj);
        }
        A(this.f14697e, 0, this.f14733b, obj);
    }

    public abstract H mo33spliterator();
}
