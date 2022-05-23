package d6;

public final class d1<E> extends t<E> {
    public final f1<E> f6429c;

    public d1(f1<E> f1Var, int i10) {
        super(f1Var.size(), i10);
        this.f6429c = f1Var;
    }

    @Override
    public final E a(int i10) {
        return this.f6429c.get(i10);
    }
}
