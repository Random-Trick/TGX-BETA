package p143k0;

public class C6038h<E> implements Cloneable {
    public static final Object f19217N = new Object();
    public int f19218M;
    public boolean f19219a;
    public int[] f19220b;
    public Object[] f19221c;

    public C6038h() {
        this(10);
    }

    public void m21476a(int i, E e) {
        int i2 = this.f19218M;
        if (i2 == 0 || i > this.f19220b[i2 - 1]) {
            if (this.f19219a && i2 >= this.f19220b.length) {
                m21473d();
            }
            int i3 = this.f19218M;
            if (i3 >= this.f19220b.length) {
                int e2 = C6033c.m21515e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f19220b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f19221c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f19220b = iArr;
                this.f19221c = objArr;
            }
            this.f19220b[i3] = i;
            this.f19221c[i3] = e;
            this.f19218M = i3 + 1;
            return;
        }
        m21467j(i, e);
    }

    public void m21475b() {
        int i = this.f19218M;
        Object[] objArr = this.f19221c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f19218M = 0;
        this.f19219a = false;
    }

    public C6038h<E> clone() {
        try {
            C6038h<E> hVar = (C6038h) super.clone();
            hVar.f19220b = (int[]) this.f19220b.clone();
            hVar.f19221c = (Object[]) this.f19221c.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void m21473d() {
        int i = this.f19218M;
        int[] iArr = this.f19220b;
        Object[] objArr = this.f19221c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f19217N) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f19219a = false;
        this.f19218M = i2;
    }

    public E m21472e(int i) {
        return m21471f(i, null);
    }

    public E m21471f(int i, E e) {
        int a = C6033c.m21519a(this.f19220b, this.f19218M, i);
        if (a >= 0) {
            Object[] objArr = this.f19221c;
            if (objArr[a] != f19217N) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    public int m21470g(int i) {
        if (this.f19219a) {
            m21473d();
        }
        return C6033c.m21519a(this.f19220b, this.f19218M, i);
    }

    public boolean m21469h() {
        return m21464n() == 0;
    }

    public int m21468i(int i) {
        if (this.f19219a) {
            m21473d();
        }
        return this.f19220b[i];
    }

    public void m21467j(int i, E e) {
        int a = C6033c.m21519a(this.f19220b, this.f19218M, i);
        if (a >= 0) {
            this.f19221c[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f19218M;
        if (i2 < i3) {
            Object[] objArr = this.f19221c;
            if (objArr[i2] == f19217N) {
                this.f19220b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f19219a && i3 >= this.f19220b.length) {
            m21473d();
            i2 = ~C6033c.m21519a(this.f19220b, this.f19218M, i);
        }
        int i4 = this.f19218M;
        if (i4 >= this.f19220b.length) {
            int e2 = C6033c.m21515e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f19220b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f19221c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f19220b = iArr;
            this.f19221c = objArr2;
        }
        int i5 = this.f19218M;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f19220b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f19221c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f19218M - i2);
        }
        this.f19220b[i2] = i;
        this.f19221c[i2] = e;
        this.f19218M++;
    }

    public void m21466k(int i) {
        int a = C6033c.m21519a(this.f19220b, this.f19218M, i);
        if (a >= 0) {
            Object[] objArr = this.f19221c;
            Object obj = objArr[a];
            Object obj2 = f19217N;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f19219a = true;
            }
        }
    }

    public void m21465l(int i) {
        Object[] objArr = this.f19221c;
        Object obj = objArr[i];
        Object obj2 = f19217N;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f19219a = true;
        }
    }

    public int m21464n() {
        if (this.f19219a) {
            m21473d();
        }
        return this.f19218M;
    }

    public E m21463o(int i) {
        if (this.f19219a) {
            m21473d();
        }
        return (E) this.f19221c[i];
    }

    public String toString() {
        if (m21464n() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f19218M * 28);
        sb2.append('{');
        for (int i = 0; i < this.f19218M; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m21468i(i));
            sb2.append('=');
            E o = m21463o(i);
            if (o != this) {
                sb2.append(o);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C6038h(int i) {
        this.f19219a = false;
        if (i == 0) {
            this.f19220b = C6033c.f19191a;
            this.f19221c = C6033c.f19193c;
            return;
        }
        int e = C6033c.m21515e(i);
        this.f19220b = new int[e];
        this.f19221c = new Object[e];
    }
}
