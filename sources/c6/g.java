package c6;

public final class g<E> extends d<E> {
    public final i<E> f4951c;

    public g(i<E> iVar, int i10) {
        super(iVar.size(), i10);
        this.f4951c = iVar;
    }

    @Override
    public final E a(int i10) {
        return this.f4951c.get(i10);
    }
}
