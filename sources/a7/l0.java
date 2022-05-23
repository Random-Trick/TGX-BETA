package a7;

import javax.annotation.CheckForNull;

public final class l0<E> extends s<E> {
    public static final Object[] Q;
    public static final l0<Object> R;
    public final transient int M;
    public final transient Object[] N;
    public final transient int O;
    public final transient int P;
    public final transient Object[] f640c;

    static {
        Object[] objArr = new Object[0];
        Q = objArr;
        R = new l0<>(objArr, 0, objArr, 0, 0);
    }

    public l0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f640c = objArr;
        this.M = i10;
        this.N = objArr2;
        this.O = i11;
        this.P = i12;
    }

    @Override
    public boolean A() {
        return true;
    }

    @Override
    public boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.N;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b10 = n.b(obj);
        while (true) {
            int i10 = b10 & this.O;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    @Override
    public int g(Object[] objArr, int i10) {
        System.arraycopy(this.f640c, 0, objArr, i10, this.P);
        return i10 + this.P;
    }

    @Override
    public int hashCode() {
        return this.M;
    }

    @Override
    public Object[] m() {
        return this.f640c;
    }

    @Override
    public int r() {
        return this.P;
    }

    @Override
    public int s() {
        return 0;
    }

    @Override
    public int size() {
        return this.P;
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public s0<E> iterator() {
        return f().iterator();
    }

    @Override
    public q<E> z() {
        return q.w(this.f640c, this.P);
    }
}
