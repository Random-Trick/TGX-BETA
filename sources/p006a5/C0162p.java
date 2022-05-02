package p006a5;

import java.util.Arrays;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C0162p implements AbstractC0117b {
    public final boolean f574a;
    public final int f575b;
    public final byte[] f576c;
    public final C0115a[] f577d;
    public int f578e;
    public int f579f;
    public int f580g;
    public C0115a[] f581h;

    public C0162p(boolean z, int i) {
        this(z, i, 0);
    }

    @Override
    public synchronized void mo42194a(C0115a aVar) {
        C0115a[] aVarArr = this.f577d;
        aVarArr[0] = aVar;
        mo42192c(aVarArr);
    }

    @Override
    public synchronized C0115a mo42193b() {
        C0115a aVar;
        this.f579f++;
        int i = this.f580g;
        if (i > 0) {
            C0115a[] aVarArr = this.f581h;
            int i2 = i - 1;
            this.f580g = i2;
            aVar = (C0115a) C1186a.m38188e(aVarArr[i2]);
            this.f581h[this.f580g] = null;
        } else {
            aVar = new C0115a(new byte[this.f575b], 0);
        }
        return aVar;
    }

    @Override
    public synchronized void mo42192c(C0115a[] aVarArr) {
        int i = this.f580g;
        int length = aVarArr.length + i;
        C0115a[] aVarArr2 = this.f581h;
        if (length >= aVarArr2.length) {
            this.f581h = (C0115a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (C0115a aVar : aVarArr) {
            C0115a[] aVarArr3 = this.f581h;
            int i2 = this.f580g;
            this.f580g = i2 + 1;
            aVarArr3[i2] = aVar;
        }
        this.f579f -= aVarArr.length;
        notifyAll();
    }

    @Override
    public synchronized void mo42191d() {
        int i = 0;
        int max = Math.max(0, C1216l0.m37967l(this.f578e, this.f575b) - this.f579f);
        int i2 = this.f580g;
        if (max < i2) {
            if (this.f576c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C0115a aVar = (C0115a) C1186a.m38188e(this.f581h[i]);
                    if (aVar.f459a == this.f576c) {
                        i++;
                    } else {
                        C0115a aVar2 = (C0115a) C1186a.m38188e(this.f581h[i3]);
                        if (aVar2.f459a != this.f576c) {
                            i3--;
                        } else {
                            C0115a[] aVarArr = this.f581h;
                            i++;
                            aVarArr[i] = aVar2;
                            i3--;
                            aVarArr[i3] = aVar;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f580g) {
                    return;
                }
            }
            Arrays.fill(this.f581h, max, this.f580g, (Object) null);
            this.f580g = max;
        }
    }

    @Override
    public int mo42190e() {
        return this.f575b;
    }

    public synchronized int m42189f() {
        return this.f579f * this.f575b;
    }

    public synchronized void m42188g() {
        if (this.f574a) {
            m42187h(0);
        }
    }

    public synchronized void m42187h(int i) {
        boolean z = i < this.f578e;
        this.f578e = i;
        if (z) {
            mo42191d();
        }
    }

    public C0162p(boolean z, int i, int i2) {
        C1186a.m38192a(i > 0);
        C1186a.m38192a(i2 >= 0);
        this.f574a = z;
        this.f575b = i;
        this.f580g = i2;
        this.f581h = new C0115a[i2 + 100];
        if (i2 > 0) {
            this.f576c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f581h[i3] = new C0115a(this.f576c, i3 * i);
            }
        } else {
            this.f576c = null;
        }
        this.f577d = new C0115a[1];
    }
}
