package p124ib;

import p108hb.C5062b;

public class C5322e {
    public long[] f17499a;
    public int f17500b;

    public C5322e(int i) {
        this.f17499a = new long[i];
    }

    public void m23276a(long j) {
        m23272e(this.f17500b + 1, 10);
        long[] jArr = this.f17499a;
        int i = this.f17500b;
        this.f17500b = i + 1;
        jArr[i] = j;
    }

    public void m23275b(long[] jArr) {
        if (jArr.length > 0) {
            m23272e(this.f17500b + jArr.length, 10);
            System.arraycopy(jArr, 0, this.f17499a, this.f17500b, jArr.length);
            this.f17500b += jArr.length;
        }
    }

    public void m23274c() {
        this.f17500b = 0;
    }

    public boolean m23273d(long j) {
        long[] jArr;
        int i = 0;
        for (long j2 : this.f17499a) {
            i++;
            if (i == this.f17500b) {
                break;
            } else if (j2 == j) {
                return true;
            }
        }
        return false;
    }

    public void m23272e(int i, int i2) {
        long[] jArr = this.f17499a;
        if (jArr.length < i) {
            long[] jArr2 = new long[Math.max(i, jArr.length + i2)];
            long[] jArr3 = this.f17499a;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f17499a = jArr2;
        }
    }

    public long m23271f(int i) {
        return this.f17499a[i];
    }

    public long[] m23270g() {
        m23264m();
        return this.f17499a;
    }

    public int m23269h(long j) {
        for (int i = 0; i < this.f17500b; i++) {
            if (this.f17499a[i] == j) {
                return i;
            }
        }
        return -1;
    }

    public boolean m23268i() {
        return this.f17500b == 0;
    }

    public boolean m23267j(long j) {
        int h = m23269h(j);
        if (h == -1) {
            return false;
        }
        m23266k(h);
        return true;
    }

    public void m23266k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f17500b)) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i + 1;
        if (i3 < i2) {
            long[] jArr = this.f17499a;
            System.arraycopy(jArr, i3, jArr, i, (i2 - i) - 1);
        }
        this.f17500b--;
    }

    public int m23265l() {
        return this.f17500b;
    }

    public final void m23264m() {
        int i = this.f17500b;
        long[] jArr = this.f17499a;
        if (i < jArr.length) {
            long[] jArr2 = new long[i];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f17499a = jArr2;
        }
    }

    public String toString() {
        return C5062b.m24174I(this.f17499a, this.f17500b);
    }

    public C5322e(long[] jArr) {
        this.f17499a = jArr;
        this.f17500b = jArr.length;
    }
}
