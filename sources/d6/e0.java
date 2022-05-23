package d6;

import java.util.List;
import java.util.ListIterator;

public final class e0 extends c0 implements ListIterator {
    public final f0 M;

    public e0(f0 f0Var) {
        super(f0Var);
        this.M = f0Var;
    }

    @Override
    public final void add(Object obj) {
        int i10;
        boolean isEmpty = this.M.isEmpty();
        a();
        ((ListIterator) this.f6394a).add(obj);
        g0 g0Var = this.M.O;
        i10 = g0Var.M;
        g0Var.M = i10 + 1;
        if (isEmpty) {
            this.M.f();
        }
    }

    @Override
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f6394a).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f6394a).nextIndex();
    }

    @Override
    public final Object previous() {
        a();
        return ((ListIterator) this.f6394a).previous();
    }

    @Override
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f6394a).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f6394a).set(obj);
    }

    public e0(f0 f0Var, int i10) {
        super(f0Var, ((List) f0Var.f6427b).listIterator(i10));
        this.M = f0Var;
    }
}
