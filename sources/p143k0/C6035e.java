package p143k0;

public class C6035e<E> implements Cloneable {
    public static final Object f19197N = new Object();
    public int f19198M;
    public boolean f19199a;
    public long[] f19200b;
    public Object[] f19201c;

    public C6035e() {
        this(10);
    }

    public void m21510a(long j, E e) {
        int i = this.f19198M;
        if (i == 0 || j > this.f19200b[i - 1]) {
            if (this.f19199a && i >= this.f19200b.length) {
                m21506e();
            }
            int i2 = this.f19198M;
            if (i2 >= this.f19200b.length) {
                int f = C6033c.m21513f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f19200b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f19201c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f19200b = jArr;
                this.f19201c = objArr;
            }
            this.f19200b[i2] = j;
            this.f19201c[i2] = e;
            this.f19198M = i2 + 1;
            return;
        }
        m21500k(j, e);
    }

    public void m21509b() {
        int i = this.f19198M;
        Object[] objArr = this.f19201c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f19198M = 0;
        this.f19199a = false;
    }

    public C6035e<E> clone() {
        try {
            C6035e<E> eVar = (C6035e) super.clone();
            eVar.f19200b = (long[]) this.f19200b.clone();
            eVar.f19201c = (Object[]) this.f19201c.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Deprecated
    public void m21507d(long j) {
        m21499l(j);
    }

    public final void m21506e() {
        int i = this.f19198M;
        long[] jArr = this.f19200b;
        Object[] objArr = this.f19201c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f19197N) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f19199a = false;
        this.f19198M = i2;
    }

    public E m21505f(long j) {
        return m21504g(j, null);
    }

    public E m21504g(long j, E e) {
        int b = C6033c.m21517b(this.f19200b, this.f19198M, j);
        if (b >= 0) {
            Object[] objArr = this.f19201c;
            if (objArr[b] != f19197N) {
                return (E) objArr[b];
            }
        }
        return e;
    }

    public int m21503h(long j) {
        if (this.f19199a) {
            m21506e();
        }
        return C6033c.m21517b(this.f19200b, this.f19198M, j);
    }

    public boolean m21502i() {
        return m21496p() == 0;
    }

    public long m21501j(int i) {
        if (this.f19199a) {
            m21506e();
        }
        return this.f19200b[i];
    }

    public void m21500k(long j, E e) {
        int b = C6033c.m21517b(this.f19200b, this.f19198M, j);
        if (b >= 0) {
            this.f19201c[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f19198M;
        if (i < i2) {
            Object[] objArr = this.f19201c;
            if (objArr[i] == f19197N) {
                this.f19200b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f19199a && i2 >= this.f19200b.length) {
            m21506e();
            i = ~C6033c.m21517b(this.f19200b, this.f19198M, j);
        }
        int i3 = this.f19198M;
        if (i3 >= this.f19200b.length) {
            int f = C6033c.m21513f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f19200b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f19201c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f19200b = jArr;
            this.f19201c = objArr2;
        }
        int i4 = this.f19198M;
        if (i4 - i != 0) {
            long[] jArr3 = this.f19200b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f19201c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f19198M - i);
        }
        this.f19200b[i] = j;
        this.f19201c[i] = e;
        this.f19198M++;
    }

    public void m21499l(long j) {
        int b = C6033c.m21517b(this.f19200b, this.f19198M, j);
        if (b >= 0) {
            Object[] objArr = this.f19201c;
            Object obj = objArr[b];
            Object obj2 = f19197N;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.f19199a = true;
            }
        }
    }

    public void m21498n(int i) {
        Object[] objArr = this.f19201c;
        Object obj = objArr[i];
        Object obj2 = f19197N;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f19199a = true;
        }
    }

    public void m21497o(int i, E e) {
        if (this.f19199a) {
            m21506e();
        }
        this.f19201c[i] = e;
    }

    public int m21496p() {
        if (this.f19199a) {
            m21506e();
        }
        return this.f19198M;
    }

    public E m21495q(int i) {
        if (this.f19199a) {
            m21506e();
        }
        return (E) this.f19201c[i];
    }

    public String toString() {
        if (m21496p() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f19198M * 28);
        sb2.append('{');
        for (int i = 0; i < this.f19198M; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m21501j(i));
            sb2.append('=');
            E q = m21495q(i);
            if (q != this) {
                sb2.append(q);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C6035e(int i) {
        this.f19199a = false;
        if (i == 0) {
            this.f19200b = C6033c.f19192b;
            this.f19201c = C6033c.f19193c;
            return;
        }
        int f = C6033c.m21513f(i);
        this.f19200b = new long[f];
        this.f19201c = new Object[f];
    }
}
