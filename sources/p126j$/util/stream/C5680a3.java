package p126j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.function.Consumer;

class C5680a3 extends AbstractC5696e implements Consumer, Iterable {
    protected Object[] f18309e = new Object[16];
    protected Object[][] f18310f;

    private void m22316w() {
        if (this.f18310f == null) {
            Object[][] objArr = new Object[8];
            this.f18310f = objArr;
            this.f18343d = new long[8];
            objArr[0] = this.f18309e;
        }
    }

    public void mo22177a(Consumer consumer) {
        for (int i = 0; i < this.f18342c; i++) {
            for (Object obj : this.f18310f[i]) {
                consumer.mo22129k(obj);
            }
        }
        for (int i2 = 0; i2 < this.f18341b; i2++) {
            consumer.mo22129k(this.f18309e[i2]);
        }
    }

    @Override
    public void clear() {
        Object[][] objArr = this.f18310f;
        if (objArr != null) {
            this.f18309e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f18309e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f18310f = null;
            this.f18343d = null;
        } else {
            for (int i2 = 0; i2 < this.f18341b; i2++) {
                this.f18309e[i2] = null;
            }
        }
        this.f18341b = 0;
        this.f18342c = 0;
    }

    @Override
    public void forEach(java.util.function.Consumer consumer) {
        mo22177a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public Iterator iterator() {
        return AbstractC5482V.m22592i(mo42632spliterator());
    }

    public void mo22129k(Object obj) {
        if (this.f18341b == this.f18309e.length) {
            m22316w();
            int i = this.f18342c;
            int i2 = i + 1;
            Object[][] objArr = this.f18310f;
            if (i2 >= objArr.length || objArr[i + 1] == null) {
                m22317v(m22318u() + 1);
            }
            this.f18341b = 0;
            int i3 = this.f18342c + 1;
            this.f18342c = i3;
            this.f18309e = this.f18310f[i3];
        }
        Object[] objArr2 = this.f18309e;
        int i4 = this.f18341b;
        this.f18341b = i4 + 1;
        objArr2[i4] = obj;
    }

    public void mo22155n(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f18342c == 0) {
            System.arraycopy(this.f18309e, 0, objArr, i, this.f18341b);
        } else {
            for (int i2 = 0; i2 < this.f18342c; i2++) {
                Object[][] objArr2 = this.f18310f;
                System.arraycopy(objArr2[i2], 0, objArr, i, objArr2[i2].length);
                i += this.f18310f[i2].length;
            }
            int i3 = this.f18341b;
            if (i3 > 0) {
                System.arraycopy(this.f18309e, 0, objArr, i, i3);
            }
        }
    }

    public AbstractC5468G mo42632spliterator() {
        return new C5643R2(this, 0, this.f18342c, 0, this.f18341b);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        mo22177a(new C5681b(arrayList, 8));
        return "SpinedBuffer:" + arrayList.toString();
    }

    protected long m22318u() {
        int i = this.f18342c;
        if (i == 0) {
            return this.f18309e.length;
        }
        return this.f18310f[i].length + this.f18343d[i];
    }

    public final void m22317v(long j) {
        Object[][] objArr;
        int i;
        long u = m22318u();
        if (j > u) {
            m22316w();
            int i2 = this.f18342c;
            while (true) {
                i2++;
                if (j > u) {
                    Object[][] objArr2 = this.f18310f;
                    if (i2 >= objArr2.length) {
                        int length = objArr2.length * 2;
                        this.f18310f = (Object[][]) Arrays.copyOf(objArr2, length);
                        this.f18343d = Arrays.copyOf(this.f18343d, length);
                    }
                    int r = m22282r(i2);
                    this.f18310f[i2] = new Object[r];
                    long[] jArr = this.f18343d;
                    jArr[i2] = jArr[i2 - 1] + objArr[i].length;
                    u += r;
                } else {
                    return;
                }
            }
        }
    }
}
