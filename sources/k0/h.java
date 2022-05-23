package k0;

public class h<E> implements Cloneable {
    public static final Object N = new Object();
    public int M;
    public boolean f15591a;
    public int[] f15592b;
    public Object[] f15593c;

    public h() {
        this(10);
    }

    public void a(int i10, E e10) {
        int i11 = this.M;
        if (i11 == 0 || i10 > this.f15592b[i11 - 1]) {
            if (this.f15591a && i11 >= this.f15592b.length) {
                d();
            }
            int i12 = this.M;
            if (i12 >= this.f15592b.length) {
                int e11 = c.e(i12 + 1);
                int[] iArr = new int[e11];
                Object[] objArr = new Object[e11];
                int[] iArr2 = this.f15592b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f15593c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f15592b = iArr;
                this.f15593c = objArr;
            }
            this.f15592b[i12] = i10;
            this.f15593c[i12] = e10;
            this.M = i12 + 1;
            return;
        }
        j(i10, e10);
    }

    public void b() {
        int i10 = this.M;
        Object[] objArr = this.f15593c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.M = 0;
        this.f15591a = false;
    }

    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f15592b = (int[]) this.f15592b.clone();
            hVar.f15593c = (Object[]) this.f15593c.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.M;
        int[] iArr = this.f15592b;
        Object[] objArr = this.f15593c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != N) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f15591a = false;
        this.M = i11;
    }

    public E e(int i10) {
        return f(i10, null);
    }

    public E f(int i10, E e10) {
        int a10 = c.a(this.f15592b, this.M, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f15593c;
            if (objArr[a10] != N) {
                return (E) objArr[a10];
            }
        }
        return e10;
    }

    public int g(int i10) {
        if (this.f15591a) {
            d();
        }
        return c.a(this.f15592b, this.M, i10);
    }

    public boolean h() {
        return n() == 0;
    }

    public int i(int i10) {
        if (this.f15591a) {
            d();
        }
        return this.f15592b[i10];
    }

    public void j(int i10, E e10) {
        int a10 = c.a(this.f15592b, this.M, i10);
        if (a10 >= 0) {
            this.f15593c[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.M;
        if (i11 < i12) {
            Object[] objArr = this.f15593c;
            if (objArr[i11] == N) {
                this.f15592b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f15591a && i12 >= this.f15592b.length) {
            d();
            i11 = ~c.a(this.f15592b, this.M, i10);
        }
        int i13 = this.M;
        if (i13 >= this.f15592b.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f15592b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f15593c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f15592b = iArr;
            this.f15593c = objArr2;
        }
        int i14 = this.M;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f15592b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f15593c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.M - i11);
        }
        this.f15592b[i11] = i10;
        this.f15593c[i11] = e10;
        this.M++;
    }

    public void k(int i10) {
        int a10 = c.a(this.f15592b, this.M, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f15593c;
            Object obj = objArr[a10];
            Object obj2 = N;
            if (obj != obj2) {
                objArr[a10] = obj2;
                this.f15591a = true;
            }
        }
    }

    public void l(int i10) {
        Object[] objArr = this.f15593c;
        Object obj = objArr[i10];
        Object obj2 = N;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f15591a = true;
        }
    }

    public int n() {
        if (this.f15591a) {
            d();
        }
        return this.M;
    }

    public E o(int i10) {
        if (this.f15591a) {
            d();
        }
        return (E) this.f15593c[i10];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.M * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.M; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i10));
            sb2.append('=');
            E o10 = o(i10);
            if (o10 != this) {
                sb2.append(o10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i10) {
        this.f15591a = false;
        if (i10 == 0) {
            this.f15592b = c.f15571a;
            this.f15593c = c.f15573c;
            return;
        }
        int e10 = c.e(i10);
        this.f15592b = new int[e10];
        this.f15593c = new Object[e10];
    }
}
