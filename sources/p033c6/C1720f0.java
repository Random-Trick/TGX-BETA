package p033c6;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

public class C1720f0 extends C1690d0 implements List {
    public final AbstractC1735g0 f6261O;

    public C1720f0(AbstractC1735g0 g0Var, Object obj, @CheckForNull List list, C1690d0 d0Var) {
        super(g0Var, obj, list, d0Var);
        this.f6261O = g0Var;
    }

    @Override
    public final void add(int i, Object obj) {
        int i2;
        m36088i();
        boolean isEmpty = this.f6181b.isEmpty();
        ((List) this.f6181b).add(i, obj);
        AbstractC1735g0 g0Var = this.f6261O;
        i2 = g0Var.f6289M;
        g0Var.f6289M = i2 + 1;
        if (isEmpty) {
            m36089h();
        }
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f6181b).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f6181b.size();
        AbstractC1735g0 g0Var = this.f6261O;
        i2 = g0Var.f6289M;
        g0Var.f6289M = i2 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        m36089h();
        return true;
    }

    @Override
    public final Object get(int i) {
        m36088i();
        return ((List) this.f6181b).get(i);
    }

    @Override
    public final int indexOf(@CheckForNull Object obj) {
        m36088i();
        return ((List) this.f6181b).indexOf(obj);
    }

    @Override
    public final int lastIndexOf(@CheckForNull Object obj) {
        m36088i();
        return ((List) this.f6181b).lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        m36088i();
        return new C1705e0(this);
    }

    @Override
    public final Object remove(int i) {
        int i2;
        m36088i();
        Object remove = ((List) this.f6181b).remove(i);
        AbstractC1735g0 g0Var = this.f6261O;
        i2 = g0Var.f6289M;
        g0Var.f6289M = i2 - 1;
        m36087m();
        return remove;
    }

    @Override
    public final Object set(int i, Object obj) {
        m36088i();
        return ((List) this.f6181b).set(i, obj);
    }

    @Override
    public final List subList(int i, int i2) {
        m36088i();
        AbstractC1735g0 g0Var = this.f6261O;
        Object obj = this.f6180a;
        List subList = ((List) this.f6181b).subList(i, i2);
        C1690d0 d0Var = this.f6182c;
        if (d0Var == null) {
            d0Var = this;
        }
        return g0Var.m36039k(obj, subList, d0Var);
    }

    @Override
    public final ListIterator listIterator(int i) {
        m36088i();
        return new C1705e0(this, i);
    }
}
