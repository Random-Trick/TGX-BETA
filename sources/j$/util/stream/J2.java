package j$.util.stream;

import j$.util.H;
import j$.util.function.o;
import java.util.Arrays;
import java.util.Objects;

final class J2 extends E {
    public J2(AbstractC0301c cVar) {
        super(cVar, EnumC0325g3.f14762q | EnumC0325g3.f14760o);
    }

    @Override
    public final Q0 F0(E0 e02, H h10, o oVar) {
        if (EnumC0325g3.SORTED.d(e02.e0())) {
            return e02.W(h10, false, oVar);
        }
        double[] dArr = (double[]) ((K0) e02.W(h10, true, oVar)).m();
        Arrays.sort(dArr);
        return new C0303c1(dArr);
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        Objects.requireNonNull(r2Var);
        return EnumC0325g3.SORTED.d(i10) ? r2Var : EnumC0325g3.SIZED.d(i10) ? new O2(r2Var) : new G2(r2Var);
    }
}
