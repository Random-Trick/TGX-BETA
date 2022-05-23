package b5;

import b5.b;
import c5.a;
import c5.l0;
import java.util.Arrays;

public final class p implements b {
    public final boolean f3925a;
    public final int f3926b;
    public final byte[] f3927c;
    public int f3928d;
    public int f3929e;
    public int f3930f;
    public a[] f3931g;

    public p(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override
    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f3931g;
            int i10 = this.f3930f;
            this.f3930f = i10 + 1;
            aVarArr[i10] = aVar.a();
            this.f3929e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override
    public synchronized a b() {
        a aVar;
        this.f3929e++;
        int i10 = this.f3930f;
        if (i10 > 0) {
            a[] aVarArr = this.f3931g;
            int i11 = i10 - 1;
            this.f3930f = i11;
            aVar = (a) a.e(aVarArr[i11]);
            this.f3931g[this.f3930f] = null;
        } else {
            aVar = new a(new byte[this.f3926b], 0);
            int i12 = this.f3929e;
            a[] aVarArr2 = this.f3931g;
            if (i12 > aVarArr2.length) {
                this.f3931g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override
    public synchronized void c() {
        int i10 = 0;
        int max = Math.max(0, l0.l(this.f3928d, this.f3926b) - this.f3929e);
        int i11 = this.f3930f;
        if (max < i11) {
            if (this.f3927c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) a.e(this.f3931g[i10]);
                    if (aVar.f3821a == this.f3927c) {
                        i10++;
                    } else {
                        a aVar2 = (a) a.e(this.f3931g[i12]);
                        if (aVar2.f3821a != this.f3927c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f3931g;
                            i10++;
                            aVarArr[i10] = aVar2;
                            i12--;
                            aVarArr[i12] = aVar;
                        }
                    }
                }
                max = Math.max(max, i10);
                if (max >= this.f3930f) {
                    return;
                }
            }
            Arrays.fill(this.f3931g, max, this.f3930f, (Object) null);
            this.f3930f = max;
        }
    }

    @Override
    public synchronized void d(a aVar) {
        a[] aVarArr = this.f3931g;
        int i10 = this.f3930f;
        this.f3930f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f3929e--;
        notifyAll();
    }

    @Override
    public int e() {
        return this.f3926b;
    }

    public synchronized int f() {
        return this.f3929e * this.f3926b;
    }

    public synchronized void g() {
        if (this.f3925a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f3928d;
        this.f3928d = i10;
        if (z10) {
            c();
        }
    }

    public p(boolean z10, int i10, int i11) {
        boolean z11 = true;
        a.a(i10 > 0);
        a.a(i11 < 0 ? false : z11);
        this.f3925a = z10;
        this.f3926b = i10;
        this.f3930f = i11;
        this.f3931g = new a[i11 + 100];
        if (i11 > 0) {
            this.f3927c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f3931g[i12] = new a(this.f3927c, i12 * i10);
            }
            return;
        }
        this.f3927c = null;
    }
}
