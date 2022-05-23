package e6;

public final class a8<E> extends z7<E> {
    public static final z7<Object> N = new a8(new Object[0], 0);
    public final transient int M;
    public final transient Object[] f10641c;

    public a8(Object[] objArr, int i10) {
        this.f10641c = objArr;
        this.M = i10;
    }

    @Override
    public final int f(Object[] objArr, int i10) {
        System.arraycopy(this.f10641c, 0, objArr, 0, this.M);
        return this.M;
    }

    @Override
    public final int g() {
        return this.M;
    }

    @Override
    public final E get(int i10) {
        f4.a(i10, this.M, "index");
        E e10 = (E) this.f10641c[i10];
        e10.getClass();
        return e10;
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final Object[] r() {
        return this.f10641c;
    }

    @Override
    public final int size() {
        return this.M;
    }
}
