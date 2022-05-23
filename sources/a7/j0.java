package a7;

import java.util.Objects;
import z6.j;

public class j0<E> extends q<E> {
    public static final q<Object> N = new j0(new Object[0], 0);
    public final transient int M;
    public final transient Object[] f631c;

    public j0(Object[] objArr, int i10) {
        this.f631c = objArr;
        this.M = i10;
    }

    @Override
    public int g(Object[] objArr, int i10) {
        System.arraycopy(this.f631c, 0, objArr, i10, this.M);
        return i10 + this.M;
    }

    @Override
    public E get(int i10) {
        j.g(i10, this.M);
        E e10 = (E) this.f631c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override
    public Object[] m() {
        return this.f631c;
    }

    @Override
    public int r() {
        return this.M;
    }

    @Override
    public int s() {
        return 0;
    }

    @Override
    public int size() {
        return this.M;
    }

    @Override
    public boolean t() {
        return false;
    }
}
