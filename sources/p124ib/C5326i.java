package p124ib;

import p108hb.C5062b;

public final class C5326i implements Cloneable {
    public int[] f17508a;
    public long[] f17509b;
    public int f17510c;

    public C5326i() {
        this(10);
    }

    public C5326i clone() {
        C5326i iVar = null;
        try {
            C5326i iVar2 = (C5326i) super.clone();
            try {
                iVar2.f17508a = (int[]) this.f17508a.clone();
                iVar2.f17509b = (long[]) this.f17509b.clone();
                return iVar2;
            } catch (CloneNotSupportedException unused) {
                iVar = iVar2;
                return iVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public long m23237b(int i, long j) {
        int a = C5318a.m23300a(this.f17508a, this.f17510c, i);
        return a < 0 ? j : this.f17509b[a];
    }

    public final void m23236c(int i) {
        int e = C5318a.m23296e(i);
        int[] iArr = new int[e];
        long[] jArr = new long[e];
        int[] iArr2 = this.f17508a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        long[] jArr2 = this.f17509b;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.f17508a = iArr;
        this.f17509b = jArr;
    }

    public int m23235d(int i) {
        return C5318a.m23300a(this.f17508a, this.f17510c, i);
    }

    public int m23234e(int i) {
        return this.f17508a[i];
    }

    public void m23233f(int i, long j) {
        int a = C5318a.m23300a(this.f17508a, this.f17510c, i);
        if (a >= 0) {
            this.f17509b[a] = j;
            return;
        }
        int i2 = ~a;
        int i3 = this.f17510c;
        if (i3 >= this.f17508a.length) {
            m23236c(i3 + 1);
        }
        int i4 = this.f17510c;
        if (i4 - i2 != 0) {
            int[] iArr = this.f17508a;
            int i5 = i2 + 1;
            System.arraycopy(iArr, i2, iArr, i5, i4 - i2);
            long[] jArr = this.f17509b;
            System.arraycopy(jArr, i2, jArr, i5, this.f17510c - i2);
        }
        this.f17508a[i2] = i;
        this.f17509b[i2] = j;
        this.f17510c++;
    }

    public void m23232g(int i, long j) {
        this.f17509b[i] = j;
    }

    public int m23231h() {
        return this.f17510c;
    }

    public long m23230i(int i) {
        return this.f17509b[i];
    }

    public String toString() {
        if (m23231h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f17510c * 28);
        sb2.append('{');
        for (int i = 0; i < this.f17510c; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m23234e(i));
            sb2.append('=');
            sb2.append(m23230i(i));
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C5326i(int i) {
        if (i == 0) {
            this.f17508a = C5062b.f17068a;
            this.f17509b = C5062b.f17069b;
        } else {
            int e = C5318a.m23296e(i);
            this.f17508a = new int[e];
            this.f17509b = new long[e];
        }
        this.f17510c = 0;
    }
}
