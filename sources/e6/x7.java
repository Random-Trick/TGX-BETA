package e6;

public final class x7<E> extends h6<E> {
    public final z7<E> f11180c;

    public x7(z7<E> z7Var, int i10) {
        super(z7Var.size(), i10);
        this.f11180c = z7Var;
    }

    @Override
    public final E a(int i10) {
        return this.f11180c.get(i10);
    }
}
