package p021b6;

public final class C1268k<E> extends AbstractC1264i<E> {
    public static final AbstractC1264i<Object> f4629N = new C1268k(new Object[0], 0);
    public final transient int f4630M;
    public final transient Object[] f4631c;

    public C1268k(Object[] objArr, int i) {
        this.f4631c = objArr;
        this.f4630M = i;
    }

    @Override
    public final E get(int i) {
        C1250b.m37825a(i, this.f4630M, "index");
        E e = (E) this.f4631c[i];
        e.getClass();
        return e;
    }

    @Override
    public final int mo37808h(Object[] objArr, int i) {
        System.arraycopy(this.f4631c, 0, objArr, 0, this.f4630M);
        return this.f4630M;
    }

    @Override
    public final int mo37807i() {
        return this.f4630M;
    }

    @Override
    public final int mo37806m() {
        return 0;
    }

    @Override
    public final Object[] mo37805r() {
        return this.f4631c;
    }

    @Override
    public final int size() {
        return this.f4630M;
    }
}
