package p124ib;

import p108hb.C5062b;

public final class C5325h implements Cloneable {
    public long[] f17505a;
    public long[] f17506b;
    public int f17507c;

    public C5325h() {
        this(10);
    }

    public void m23248a() {
        this.f17507c = 0;
    }

    public C5325h clone() {
        C5325h hVar = null;
        try {
            C5325h hVar2 = (C5325h) super.clone();
            try {
                hVar2.f17505a = (long[]) this.f17505a.clone();
                hVar2.f17506b = (long[]) this.f17506b.clone();
                return hVar2;
            } catch (CloneNotSupportedException unused) {
                hVar = hVar2;
                return hVar;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public void m23246c(long j) {
        int b = C5318a.m23299b(this.f17505a, this.f17507c, j);
        if (b >= 0) {
            m23241h(b);
        }
    }

    public long m23245d(long j) {
        return m23244e(j, 0L);
    }

    public long m23244e(long j, long j2) {
        int b = C5318a.m23299b(this.f17505a, this.f17507c, j);
        return b < 0 ? j2 : this.f17506b[b];
    }

    public long m23243f(int i) {
        return this.f17505a[i];
    }

    public void m23242g(long j, long j2) {
        int b = C5318a.m23299b(this.f17505a, this.f17507c, j);
        if (b >= 0) {
            this.f17506b[b] = j2;
            return;
        }
        int i = ~b;
        this.f17505a = C5318a.m23294g(this.f17505a, this.f17507c, i, j);
        this.f17506b = C5318a.m23294g(this.f17506b, this.f17507c, i, j2);
        this.f17507c++;
    }

    public void m23241h(int i) {
        long[] jArr = this.f17505a;
        int i2 = i + 1;
        System.arraycopy(jArr, i2, jArr, i, this.f17507c - i2);
        long[] jArr2 = this.f17506b;
        System.arraycopy(jArr2, i2, jArr2, i, this.f17507c - i2);
        this.f17507c--;
    }

    public int m23240i() {
        return this.f17507c;
    }

    public long m23239j(int i) {
        return this.f17506b[i];
    }

    public String toString() {
        if (m23240i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f17507c * 28);
        sb2.append('{');
        for (int i = 0; i < this.f17507c; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m23243f(i));
            sb2.append('=');
            sb2.append(m23239j(i));
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C5325h(int i) {
        if (i == 0) {
            long[] jArr = C5062b.f17069b;
            this.f17505a = jArr;
            this.f17506b = jArr;
        } else {
            int e = C5318a.m23296e(i);
            this.f17505a = new long[e];
            this.f17506b = new long[e];
        }
        this.f17507c = 0;
    }
}
