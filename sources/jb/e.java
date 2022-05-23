package jb;

import ib.b;

public class e {
    public long[] f15186a;
    public int f15187b;

    public e(int i10) {
        this.f15186a = new long[i10];
    }

    public void a(long j10) {
        e(this.f15187b + 1, 10);
        long[] jArr = this.f15186a;
        int i10 = this.f15187b;
        this.f15187b = i10 + 1;
        jArr[i10] = j10;
    }

    public void b(long[] jArr) {
        if (jArr.length > 0) {
            e(this.f15187b + jArr.length, 10);
            System.arraycopy(jArr, 0, this.f15186a, this.f15187b, jArr.length);
            this.f15187b += jArr.length;
        }
    }

    public void c() {
        this.f15187b = 0;
    }

    public boolean d(long j10) {
        long[] jArr;
        int i10 = 0;
        for (long j11 : this.f15186a) {
            i10++;
            if (i10 == this.f15187b) {
                break;
            } else if (j11 == j10) {
                return true;
            }
        }
        return false;
    }

    public void e(int i10, int i11) {
        long[] jArr = this.f15186a;
        if (jArr.length < i10) {
            long[] jArr2 = new long[Math.max(i10, jArr.length + i11)];
            long[] jArr3 = this.f15186a;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f15186a = jArr2;
        }
    }

    public long f(int i10) {
        return this.f15186a[i10];
    }

    public long[] g() {
        m();
        return this.f15186a;
    }

    public int h(long j10) {
        for (int i10 = 0; i10 < this.f15187b; i10++) {
            if (this.f15186a[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    public boolean i() {
        return this.f15187b == 0;
    }

    public boolean j(long j10) {
        int h10 = h(j10);
        if (h10 == -1) {
            return false;
        }
        k(h10);
        return true;
    }

    public void k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f15187b)) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = i10 + 1;
        if (i12 < i11) {
            long[] jArr = this.f15186a;
            System.arraycopy(jArr, i12, jArr, i10, (i11 - i10) - 1);
        }
        this.f15187b--;
    }

    public int l() {
        return this.f15187b;
    }

    public final void m() {
        int i10 = this.f15187b;
        long[] jArr = this.f15186a;
        if (i10 < jArr.length) {
            long[] jArr2 = new long[i10];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f15186a = jArr2;
        }
    }

    public String toString() {
        return b.I(this.f15186a, this.f15187b);
    }

    public e(long[] jArr) {
        this.f15186a = jArr;
        this.f15187b = jArr.length;
    }
}
