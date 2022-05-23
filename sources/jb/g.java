package jb;

import ib.b;

public final class g implements Cloneable {
    public long[] f15189a;
    public int[] f15190b;
    public int f15191c;

    public g() {
        this(10);
    }

    public void a() {
        this.f15191c = 0;
    }

    public g clone() {
        g gVar = null;
        try {
            g gVar2 = (g) super.clone();
            try {
                gVar2.f15189a = (long[]) this.f15189a.clone();
                gVar2.f15190b = (int[]) this.f15190b.clone();
                return gVar2;
            } catch (CloneNotSupportedException unused) {
                gVar = gVar2;
                return gVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public void c(long j10) {
        int b10 = a.b(this.f15189a, this.f15191c, j10);
        if (b10 >= 0) {
            h(b10);
        }
    }

    public int d(long j10) {
        return e(j10, 0);
    }

    public int e(long j10, int i10) {
        int b10 = a.b(this.f15189a, this.f15191c, j10);
        return b10 < 0 ? i10 : this.f15190b[b10];
    }

    public long f(int i10) {
        return this.f15189a[i10];
    }

    public void g(long j10, int i10) {
        int b10 = a.b(this.f15189a, this.f15191c, j10);
        if (b10 >= 0) {
            this.f15190b[b10] = i10;
            return;
        }
        int i11 = ~b10;
        this.f15189a = a.g(this.f15189a, this.f15191c, i11, j10);
        this.f15190b = a.f(this.f15190b, this.f15191c, i11, i10);
        this.f15191c++;
    }

    public void h(int i10) {
        long[] jArr = this.f15189a;
        int i11 = i10 + 1;
        System.arraycopy(jArr, i11, jArr, i10, this.f15191c - i11);
        int[] iArr = this.f15190b;
        System.arraycopy(iArr, i11, iArr, i10, this.f15191c - i11);
        this.f15191c--;
    }

    public int i() {
        return this.f15191c;
    }

    public int j(int i10) {
        return this.f15190b[i10];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f15191c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f15191c; i10++) {
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

    public g(int i10) {
        if (i10 == 0) {
            this.f15189a = b.f14162b;
            this.f15190b = b.f14161a;
        } else {
            int e10 = a.e(i10);
            this.f15189a = new long[e10];
            this.f15190b = new int[e10];
        }
        this.f15191c = 0;
    }
}
