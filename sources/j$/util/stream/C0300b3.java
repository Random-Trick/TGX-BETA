package j$.util.stream;

import j$.util.H;
import j$.util.W;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class C0300b3 extends AbstractC0311e implements Consumer, Iterable {
    protected Object[] f14706e = new Object[1 << 4];
    protected Object[][] f14707f;

    protected final long A() {
        int i10 = this.f14734c;
        if (i10 == 0) {
            return this.f14706e.length;
        }
        return this.f14707f[i10].length + this.f14735d[i10];
    }

    public final void B(long j10) {
        Object[][] objArr;
        int i10;
        long A = A();
        if (j10 > A) {
            if (this.f14707f == null) {
                Object[][] objArr2 = new Object[8];
                this.f14707f = objArr2;
                this.f14735d = new long[8];
                objArr2[0] = this.f14706e;
            }
            int i11 = this.f14734c;
            while (true) {
                i11++;
                if (j10 > A) {
                    Object[][] objArr3 = this.f14707f;
                    if (i11 >= objArr3.length) {
                        int length = objArr3.length * 2;
                        this.f14707f = (Object[][]) Arrays.copyOf(objArr3, length);
                        this.f14735d = Arrays.copyOf(this.f14735d, length);
                    }
                    int z10 = z(i11);
                    this.f14707f[i11] = new Object[z10];
                    long[] jArr = this.f14735d;
                    jArr[i11] = jArr[i11 - 1] + objArr[i10].length;
                    A += z10;
                } else {
                    return;
                }
            }
        }
    }

    public void a(Consumer consumer) {
        for (int i10 = 0; i10 < this.f14734c; i10++) {
            for (Object obj : this.f14707f[i10]) {
                consumer.l(obj);
            }
        }
        for (int i11 = 0; i11 < this.f14733b; i11++) {
            consumer.l(this.f14706e[i11]);
        }
    }

    @Override
    public final void clear() {
        Object[][] objArr = this.f14707f;
        if (objArr != null) {
            this.f14706e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f14706e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f14707f = null;
            this.f14735d = null;
        } else {
            for (int i11 = 0; i11 < this.f14733b; i11++) {
                this.f14706e[i11] = null;
            }
        }
        this.f14733b = 0;
        this.f14734c = 0;
    }

    @Override
    public final void forEach(java.util.function.Consumer consumer) {
        a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final Iterator iterator() {
        return W.i(mo31spliterator());
    }

    public void l(Object obj) {
        int i10 = this.f14733b;
        Object[] objArr = this.f14706e;
        if (i10 == objArr.length) {
            if (this.f14707f == null) {
                Object[][] objArr2 = new Object[8];
                this.f14707f = objArr2;
                this.f14735d = new long[8];
                objArr2[0] = objArr;
            }
            int i11 = this.f14734c;
            int i12 = i11 + 1;
            Object[][] objArr3 = this.f14707f;
            if (i12 >= objArr3.length || objArr3[i11 + 1] == null) {
                B(A() + 1);
            }
            this.f14733b = 0;
            int i13 = this.f14734c + 1;
            this.f14734c = i13;
            this.f14706e = this.f14707f[i13];
        }
        Object[] objArr4 = this.f14706e;
        int i14 = this.f14733b;
        this.f14733b = i14 + 1;
        objArr4[i14] = obj;
    }

    public void q(Object[] objArr, int i10) {
        long j10 = i10;
        long count = count() + j10;
        if (count > objArr.length || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f14734c == 0) {
            System.arraycopy(this.f14706e, 0, objArr, i10, this.f14733b);
        } else {
            for (int i11 = 0; i11 < this.f14734c; i11++) {
                Object[][] objArr2 = this.f14707f;
                System.arraycopy(objArr2[i11], 0, objArr, i10, objArr2[i11].length);
                i10 += this.f14707f[i11].length;
            }
            int i12 = this.f14733b;
            if (i12 > 0) {
                System.arraycopy(this.f14706e, 0, objArr, i10, i12);
            }
        }
    }

    public H mo31spliterator() {
        return new S2(this, 0, this.f14734c, 0, this.f14733b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        a(new C0296b(arrayList, 8));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
