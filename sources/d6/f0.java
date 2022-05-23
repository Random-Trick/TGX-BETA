package d6;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

public class f0 extends d0 implements List {
    public final g0 O;

    public f0(g0 g0Var, Object obj, @CheckForNull List list, d0 d0Var) {
        super(g0Var, obj, list, d0Var);
        this.O = g0Var;
    }

    @Override
    public final void add(int i10, Object obj) {
        int i11;
        g();
        boolean isEmpty = this.f6427b.isEmpty();
        ((List) this.f6427b).add(i10, obj);
        g0 g0Var = this.O;
        i11 = g0Var.M;
        g0Var.M = i11 + 1;
        if (isEmpty) {
            f();
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        int i11;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f6427b).addAll(i10, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f6427b.size();
        g0 g0Var = this.O;
        i11 = g0Var.M;
        g0Var.M = i11 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        f();
        return true;
    }

    @Override
    public final Object get(int i10) {
        g();
        return ((List) this.f6427b).get(i10);
    }

    @Override
    public final int indexOf(@CheckForNull Object obj) {
        g();
        return ((List) this.f6427b).indexOf(obj);
    }

    @Override
    public final int lastIndexOf(@CheckForNull Object obj) {
        g();
        return ((List) this.f6427b).lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        g();
        return new e0(this);
    }

    @Override
    public final Object remove(int i10) {
        int i11;
        g();
        Object remove = ((List) this.f6427b).remove(i10);
        g0 g0Var = this.O;
        i11 = g0Var.M;
        g0Var.M = i11 - 1;
        m();
        return remove;
    }

    @Override
    public final Object set(int i10, Object obj) {
        g();
        return ((List) this.f6427b).set(i10, obj);
    }

    @Override
    public final List subList(int i10, int i11) {
        g();
        g0 g0Var = this.O;
        Object obj = this.f6426a;
        List subList = ((List) this.f6427b).subList(i10, i11);
        d0 d0Var = this.f6428c;
        if (d0Var == null) {
            d0Var = this;
        }
        return g0Var.k(obj, subList, d0Var);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        g();
        return new e0(this, i10);
    }
}
