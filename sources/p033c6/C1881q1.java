package p033c6;

public final class C1881q1<E> extends AbstractC1721f1<E> {
    public static final AbstractC1721f1<Object> f6818N = new C1881q1(new Object[0], 0);
    public final transient int f6819M;
    public final transient Object[] f6820c;

    public C1881q1(Object[] objArr, int i) {
        this.f6820c = objArr;
        this.f6819M = i;
    }

    @Override
    public final E get(int i) {
        C1893r.m35935a(i, this.f6819M, "index");
        E e = (E) this.f6820c[i];
        e.getClass();
        return e;
    }

    @Override
    public final int mo35829h(Object[] objArr, int i) {
        System.arraycopy(this.f6820c, 0, objArr, i, this.f6819M);
        return i + this.f6819M;
    }

    @Override
    public final int mo35828i() {
        return this.f6819M;
    }

    @Override
    public final int mo35827m() {
        return 0;
    }

    @Override
    public final Object[] mo35825s() {
        return this.f6820c;
    }

    @Override
    public final int size() {
        return this.f6819M;
    }
}
