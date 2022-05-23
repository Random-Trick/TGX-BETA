package j$.util.stream;

import j$.util.H;
import java.util.concurrent.CountedCompleter;

final class C0297b0 extends CountedCompleter {
    private H f14701a;
    private final AbstractC0378r2 f14702b;
    private final E0 f14703c;
    private long f14704d;

    public C0297b0(E0 e02, H h10, AbstractC0378r2 r2Var) {
        super(null);
        this.f14702b = r2Var;
        this.f14703c = e02;
        this.f14701a = h10;
        this.f14704d = 0L;
    }

    C0297b0(C0297b0 b0Var, H h10) {
        super(b0Var);
        this.f14701a = h10;
        this.f14702b = b0Var.f14702b;
        this.f14704d = b0Var.f14704d;
        this.f14703c = b0Var.f14703c;
    }

    @Override
    public final void compute() {
        H trySplit;
        H h10 = this.f14701a;
        long estimateSize = h10.estimateSize();
        long j10 = this.f14704d;
        if (j10 == 0) {
            j10 = AbstractC0316f.h(estimateSize);
            this.f14704d = j10;
        }
        boolean d10 = EnumC0325g3.SHORT_CIRCUIT.d(this.f14703c.e0());
        boolean z10 = false;
        AbstractC0378r2 r2Var = this.f14702b;
        C0297b0 b0Var = this;
        while (true) {
            if (d10 && r2Var.u()) {
                break;
            } else if (estimateSize <= j10 || (trySplit = h10.trySplit()) == null) {
                break;
            } else {
                C0297b0 b0Var2 = new C0297b0(b0Var, trySplit);
                b0Var.addToPendingCount(1);
                if (z10) {
                    h10 = trySplit;
                } else {
                    b0Var2 = b0Var;
                    b0Var = b0Var2;
                }
                z10 = !z10;
                b0Var.fork();
                estimateSize = h10.estimateSize();
                b0Var = b0Var2;
            }
        }
        b0Var.f14703c.R(r2Var, h10);
        b0Var.f14701a = null;
        b0Var.propagateCompletion();
    }
}
