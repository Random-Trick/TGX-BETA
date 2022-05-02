package p046d6;

public final class C3623a8<E> extends AbstractC3858z7<E> {
    public static final AbstractC3858z7<Object> f12350N = new C3623a8(new Object[0], 0);
    public final transient int f12351M;
    public final transient Object[] f12352c;

    public C3623a8(Object[] objArr, int i) {
        this.f12352c = objArr;
        this.f12351M = i;
    }

    @Override
    public final E get(int i) {
        C3669f4.m29841a(i, this.f12351M, "index");
        E e = (E) this.f12352c[i];
        e.getClass();
        return e;
    }

    @Override
    public final int mo29726h(Object[] objArr, int i) {
        System.arraycopy(this.f12352c, 0, objArr, 0, this.f12351M);
        return this.f12351M;
    }

    @Override
    public final int mo29733i() {
        return this.f12351M;
    }

    @Override
    public final int mo29732m() {
        return 0;
    }

    @Override
    public final Object[] mo29731r() {
        return this.f12352c;
    }

    @Override
    public final int size() {
        return this.f12351M;
    }
}
