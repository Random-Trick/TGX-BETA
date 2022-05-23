package j$.util.stream;

import j$.util.H;
import j$.util.function.o;
import java.util.Arrays;
import java.util.Objects;

final class L2 extends AbstractC0376r0 {
    public L2(AbstractC0301c cVar) {
        super(cVar, EnumC0325g3.f14762q | EnumC0325g3.f14760o);
    }

    @Override
    public final Q0 F0(E0 e02, H h10, o oVar) {
        if (EnumC0325g3.SORTED.d(e02.e0())) {
            return e02.W(h10, false, oVar);
        }
        long[] jArr = (long[]) ((O0) e02.W(h10, true, oVar)).m();
        Arrays.sort(jArr);
        return new C0390u1(jArr);
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        Objects.requireNonNull(r2Var);
        return EnumC0325g3.SORTED.d(i10) ? r2Var : EnumC0325g3.SIZED.d(i10) ? new Q2(r2Var) : new I2(r2Var);
    }
}
