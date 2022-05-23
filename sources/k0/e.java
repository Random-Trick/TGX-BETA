package k0;

public class e<E> implements Cloneable {
    public static final Object N = new Object();
    public int M;
    public boolean f15577a;
    public long[] f15578b;
    public Object[] f15579c;

    public e() {
        this(10);
    }

    public void a(long j10, E e10) {
        int i10 = this.M;
        if (i10 == 0 || j10 > this.f15578b[i10 - 1]) {
            if (this.f15577a && i10 >= this.f15578b.length) {
                e();
            }
            int i11 = this.M;
            if (i11 >= this.f15578b.length) {
                int f10 = c.f(i11 + 1);
                long[] jArr = new long[f10];
                Object[] objArr = new Object[f10];
                long[] jArr2 = this.f15578b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f15579c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f15578b = jArr;
                this.f15579c = objArr;
            }
            this.f15578b[i11] = j10;
            this.f15579c[i11] = e10;
            this.M = i11 + 1;
            return;
        }
        k(j10, e10);
    }

    public void b() {
        int i10 = this.M;
        Object[] objArr = this.f15579c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.M = 0;
        this.f15577a = false;
    }

    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f15578b = (long[]) this.f15578b.clone();
            eVar.f15579c = (Object[]) this.f15579c.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Deprecated
    public void d(long j10) {
        l(j10);
    }

    public final void e() {
        int i10 = this.M;
        long[] jArr = this.f15578b;
        Object[] objArr = this.f15579c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != N) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f15577a = false;
        this.M = i11;
    }

    public E f(long j10) {
        return g(j10, null);
    }

    public E g(long j10, E e10) {
        int b10 = c.b(this.f15578b, this.M, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f15579c;
            if (objArr[b10] != N) {
                return (E) objArr[b10];
            }
        }
        return e10;
    }

    public int h(long j10) {
        if (this.f15577a) {
            e();
        }
        return c.b(this.f15578b, this.M, j10);
    }

    public boolean i() {
        return p() == 0;
    }

    public long j(int i10) {
        if (this.f15577a) {
            e();
        }
        return this.f15578b[i10];
    }

    public void k(long j10, E e10) {
        int b10 = c.b(this.f15578b, this.M, j10);
        if (b10 >= 0) {
            this.f15579c[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.M;
        if (i10 < i11) {
            Object[] objArr = this.f15579c;
            if (objArr[i10] == N) {
                this.f15578b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f15577a && i11 >= this.f15578b.length) {
            e();
            i10 = ~c.b(this.f15578b, this.M, j10);
        }
        int i12 = this.M;
        if (i12 >= this.f15578b.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f15578b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f15579c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f15578b = jArr;
            this.f15579c = objArr2;
        }
        int i13 = this.M;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f15578b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f15579c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.M - i10);
        }
        this.f15578b[i10] = j10;
        this.f15579c[i10] = e10;
        this.M++;
    }

    public void l(long j10) {
        int b10 = c.b(this.f15578b, this.M, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f15579c;
            Object obj = objArr[b10];
            Object obj2 = N;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f15577a = true;
            }
        }
    }

    public void n(int i10) {
        Object[] objArr = this.f15579c;
        Object obj = objArr[i10];
        Object obj2 = N;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f15577a = true;
        }
    }

    public void o(int i10, E e10) {
        if (this.f15577a) {
            e();
        }
        this.f15579c[i10] = e10;
    }

    public int p() {
        if (this.f15577a) {
            e();
        }
        return this.M;
    }

    public E q(int i10) {
        if (this.f15577a) {
            e();
        }
        return (E) this.f15579c[i10];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.M * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.M; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            E q10 = q(i10);
            if (q10 != this) {
                sb2.append(q10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public e(int i10) {
        this.f15577a = false;
        if (i10 == 0) {
            this.f15578b = c.f15572b;
            this.f15579c = c.f15573c;
            return;
        }
        int f10 = c.f(i10);
        this.f15578b = new long[f10];
        this.f15579c = new Object[f10];
    }
}
