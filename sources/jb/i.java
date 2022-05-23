package jb;

import ib.b;

public final class i implements Cloneable {
    public int[] f15195a;
    public long[] f15196b;
    public int f15197c;

    public i() {
        this(10);
    }

    public i clone() {
        i iVar = null;
        try {
            i iVar2 = (i) super.clone();
            try {
                iVar2.f15195a = (int[]) this.f15195a.clone();
                iVar2.f15196b = (long[]) this.f15196b.clone();
                return iVar2;
            } catch (CloneNotSupportedException unused) {
                iVar = iVar2;
                return iVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public long b(int i10, long j10) {
        int a10 = a.a(this.f15195a, this.f15197c, i10);
        return a10 < 0 ? j10 : this.f15196b[a10];
    }

    public final void c(int i10) {
        int e10 = a.e(i10);
        int[] iArr = new int[e10];
        long[] jArr = new long[e10];
        int[] iArr2 = this.f15195a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        long[] jArr2 = this.f15196b;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.f15195a = iArr;
        this.f15196b = jArr;
    }

    public int d(int i10) {
        return a.a(this.f15195a, this.f15197c, i10);
    }

    public int e(int i10) {
        return this.f15195a[i10];
    }

    public void f(int i10, long j10) {
        int a10 = a.a(this.f15195a, this.f15197c, i10);
        if (a10 >= 0) {
            this.f15196b[a10] = j10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f15197c;
        if (i12 >= this.f15195a.length) {
            c(i12 + 1);
        }
        int i13 = this.f15197c;
        if (i13 - i11 != 0) {
            int[] iArr = this.f15195a;
            int i14 = i11 + 1;
            System.arraycopy(iArr, i11, iArr, i14, i13 - i11);
            long[] jArr = this.f15196b;
            System.arraycopy(jArr, i11, jArr, i14, this.f15197c - i11);
        }
        this.f15195a[i11] = i10;
        this.f15196b[i11] = j10;
        this.f15197c++;
    }

    public void g(int i10, long j10) {
        this.f15196b[i10] = j10;
    }

    public int h() {
        return this.f15197c;
    }

    public long i(int i10) {
        return this.f15196b[i10];
    }

    public String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f15197c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f15197c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i10));
            sb2.append('=');
            sb2.append(i(i10));
        }
        sb2.append('}');
        return sb2.toString();
    }

    public i(int i10) {
        if (i10 == 0) {
            this.f15195a = b.f14161a;
            this.f15196b = b.f14162b;
        } else {
            int e10 = a.e(i10);
            this.f15195a = new int[e10];
            this.f15196b = new long[e10];
        }
        this.f15197c = 0;
    }
}
