package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.List$EL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

final class N2 extends F2 {
    private ArrayList f14589d;

    public N2(AbstractC0378r2 r2Var, Comparator comparator) {
        super(r2Var, comparator);
    }

    @Override
    public final void h() {
        List$EL.sort(this.f14589d, this.f14528b);
        this.f14822a.k(this.f14589d.size());
        if (!this.f14529c) {
            ArrayList arrayList = this.f14589d;
            AbstractC0378r2 r2Var = this.f14822a;
            Objects.requireNonNull(r2Var);
            AbstractC0264a.x(arrayList, new C0296b(r2Var, 3));
        } else {
            Iterator it = this.f14589d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f14822a.u()) {
                    break;
                }
                this.f14822a.l(next);
            }
        }
        this.f14822a.h();
        this.f14589d = null;
    }

    @Override
    public final void k(long j10) {
        if (j10 < 2147483639) {
            this.f14589d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public final void l(Object obj) {
        this.f14589d.add(obj);
    }
}
