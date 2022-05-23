package jb;

import ib.b;

public final class h implements Cloneable {
    public long[] f15192a;
    public long[] f15193b;
    public int f15194c;

    public h() {
        this(10);
    }

    public void a() {
        this.f15194c = 0;
    }

    public h clone() {
        h hVar = null;
        try {
            h hVar2 = (h) super.clone();
            try {
                hVar2.f15192a = (long[]) this.f15192a.clone();
                hVar2.f15193b = (long[]) this.f15193b.clone();
                return hVar2;
            } catch (CloneNotSupportedException unused) {
                hVar = hVar2;
                return hVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public void c(long j10) {
        int b10 = a.b(this.f15192a, this.f15194c, j10);
        if (b10 >= 0) {
            h(b10);
        }
    }

    public long d(long j10) {
        return e(j10, 0L);
    }

    public long e(long j10, long j11) {
        int b10 = a.b(this.f15192a, this.f15194c, j10);
        return b10 < 0 ? j11 : this.f15193b[b10];
    }

    public long f(int i10) {
        return this.f15192a[i10];
    }

    public void g(long j10, long j11) {
        int b10 = a.b(this.f15192a, this.f15194c, j10);
        if (b10 >= 0) {
            this.f15193b[b10] = j11;
            return;
        }
        int i10 = ~b10;
        this.f15192a = a.g(this.f15192a, this.f15194c, i10, j10);
        this.f15193b = a.g(this.f15193b, this.f15194c, i10, j11);
        this.f15194c++;
    }

    public void h(int i10) {
        long[] jArr = this.f15192a;
        int i11 = i10 + 1;
        System.arraycopy(jArr, i11, jArr, i10, this.f15194c - i11);
        long[] jArr2 = this.f15193b;
        System.arraycopy(jArr2, i11, jArr2, i10, this.f15194c - i11);
        this.f15194c--;
    }

    public int i() {
        return this.f15194c;
    }

    public long j(int i10) {
        return this.f15193b[i10];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f15194c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f15194c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i10));
            sb2.append('=');
            sb2.append(j(i10));
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i10) {
        if (i10 == 0) {
            long[] jArr = b.f14162b;
            this.f15192a = jArr;
            this.f15193b = jArr;
        } else {
            int e10 = a.e(i10);
            this.f15192a = new long[e10];
            this.f15193b = new long[e10];
        }
        this.f15194c = 0;
    }
}
