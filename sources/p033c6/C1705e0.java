package p033c6;

import java.util.List;
import java.util.ListIterator;

public final class C1705e0 extends C1675c0 implements ListIterator {
    public final C1720f0 f6234M;

    public C1705e0(C1720f0 f0Var) {
        super(f0Var);
        this.f6234M = f0Var;
    }

    @Override
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.f6234M.isEmpty();
        m36104a();
        ((ListIterator) this.f6146a).add(obj);
        AbstractC1735g0 g0Var = this.f6234M.f6261O;
        i = g0Var.f6289M;
        g0Var.f6289M = i + 1;
        if (isEmpty) {
            this.f6234M.m36092h();
        }
    }

    @Override
    public final boolean hasPrevious() {
        m36104a();
        return ((ListIterator) this.f6146a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        m36104a();
        return ((ListIterator) this.f6146a).nextIndex();
    }

    @Override
    public final Object previous() {
        m36104a();
        return ((ListIterator) this.f6146a).previous();
    }

    @Override
    public final int previousIndex() {
        m36104a();
        return ((ListIterator) this.f6146a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        m36104a();
        ((ListIterator) this.f6146a).set(obj);
    }

    public C1705e0(C1720f0 f0Var, int i) {
        super(f0Var, ((List) f0Var.f6181b).listIterator(i));
        this.f6234M = f0Var;
    }
}
