package p126j$.util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import p126j$.util.AbstractC5485a;
import p126j$.util.List$EL;

final class C5619M2 extends AbstractC5579E2 {
    private ArrayList f18194d;

    public C5619M2(AbstractC5759q2 q2Var, Comparator comparator) {
        super(q2Var, comparator);
    }

    @Override
    public void mo22132h() {
        List$EL.sort(this.f18194d, this.f18133b);
        this.f18428a.mo22131j(this.f18194d.size());
        if (!this.f18134c) {
            ArrayList arrayList = this.f18194d;
            AbstractC5759q2 q2Var = this.f18428a;
            Objects.requireNonNull(q2Var);
            AbstractC5485a.m22584B(arrayList, new C5681b(q2Var, 3));
        } else {
            Iterator it = this.f18194d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f18428a.mo22130t()) {
                    break;
                }
                this.f18428a.mo22128k(next);
            }
        }
        this.f18428a.mo22132h();
        this.f18194d = null;
    }

    @Override
    public void mo22131j(long j) {
        if (j < 2147483639) {
            this.f18194d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public void mo22128k(Object obj) {
        this.f18194d.add(obj);
    }
}
