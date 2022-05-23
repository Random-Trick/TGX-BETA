package j$.util.stream;

import j$.util.Comparator;
import j$.util.H;
import j$.util.function.o;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

final class M2 extends AbstractC0329h2 {
    private final boolean f14578u;
    private final Comparator f14579v;

    public M2(AbstractC0301c cVar) {
        super(cVar, EnumC0325g3.f14762q | EnumC0325g3.f14760o);
        this.f14578u = true;
        this.f14579v = Comparator.CC.a();
    }

    public M2(AbstractC0301c cVar, java.util.Comparator comparator) {
        super(cVar, EnumC0325g3.f14762q | EnumC0325g3.f14761p);
        this.f14578u = false;
        Objects.requireNonNull(comparator);
        this.f14579v = comparator;
    }

    @Override
    public final Q0 F0(E0 e02, H h10, o oVar) {
        if (EnumC0325g3.SORTED.d(e02.e0()) && this.f14578u) {
            return e02.W(h10, false, oVar);
        }
        Object[] v10 = e02.W(h10, true, oVar).v(oVar);
        Arrays.sort(v10, this.f14579v);
        return new T0(v10);
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        Objects.requireNonNull(r2Var);
        return (!EnumC0325g3.SORTED.d(i10) || !this.f14578u) ? EnumC0325g3.SIZED.d(i10) ? new R2(r2Var, this.f14579v) : new N2(r2Var, this.f14579v) : r2Var;
    }
}
