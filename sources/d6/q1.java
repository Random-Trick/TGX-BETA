package d6;

public final class q1<E> extends f1<E> {
    public static final f1<Object> N = new q1(new Object[0], 0);
    public final transient int M;
    public final transient Object[] f6889c;

    public q1(Object[] objArr, int i10) {
        this.f6889c = objArr;
        this.M = i10;
    }

    @Override
    public final int f(Object[] objArr, int i10) {
        System.arraycopy(this.f6889c, 0, objArr, i10, this.M);
        return i10 + this.M;
    }

    @Override
    public final int g() {
        return this.M;
    }

    @Override
    public final E get(int i10) {
        r.a(i10, this.M, "index");
        E e10 = (E) this.f6889c[i10];
        e10.getClass();
        return e10;
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final Object[] s() {
        return this.f6889c;
    }

    @Override
    public final int size() {
        return this.M;
    }
}
