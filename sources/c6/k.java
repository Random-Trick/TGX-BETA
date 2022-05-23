package c6;

public final class k<E> extends i<E> {
    public static final i<Object> N = new k(new Object[0], 0);
    public final transient int M;
    public final transient Object[] f4956c;

    public k(Object[] objArr, int i10) {
        this.f4956c = objArr;
        this.M = i10;
    }

    @Override
    public final int f(Object[] objArr, int i10) {
        System.arraycopy(this.f4956c, 0, objArr, 0, this.M);
        return this.M;
    }

    @Override
    public final int g() {
        return this.M;
    }

    @Override
    public final E get(int i10) {
        b.a(i10, this.M, "index");
        E e10 = (E) this.f4956c[i10];
        e10.getClass();
        return e10;
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final Object[] r() {
        return this.f4956c;
    }

    @Override
    public final int size() {
        return this.M;
    }
}
