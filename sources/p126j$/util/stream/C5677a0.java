package p126j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p126j$.util.AbstractC5468G;

final class C5677a0 extends CountedCompleter {
    private AbstractC5468G f18304a;
    private final AbstractC5759q2 f18305b;
    private final AbstractC5572D0 f18306c;
    private long f18307d;

    public C5677a0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5759q2 q2Var) {
        super(null);
        this.f18305b = q2Var;
        this.f18306c = d0;
        this.f18304a = g;
        this.f18307d = 0L;
    }

    C5677a0(C5677a0 a0Var, AbstractC5468G g) {
        super(a0Var);
        this.f18304a = g;
        this.f18305b = a0Var.f18305b;
        this.f18307d = a0Var.f18307d;
        this.f18306c = a0Var.f18306c;
    }

    @Override
    public void compute() {
        AbstractC5468G trySplit;
        AbstractC5468G g = this.f18304a;
        long estimateSize = g.estimateSize();
        long j = this.f18307d;
        if (j == 0) {
            j = AbstractC5701f.m22272h(estimateSize);
            this.f18307d = j;
        }
        boolean d = EnumC5705f3.SHORT_CIRCUIT.m22266d(this.f18306c.mo22302Z());
        boolean z = false;
        AbstractC5759q2 q2Var = this.f18305b;
        C5677a0 a0Var = this;
        while (true) {
            if (d && q2Var.mo22131t()) {
                break;
            } else if (estimateSize <= j || (trySplit = g.trySplit()) == null) {
                break;
            } else {
                C5677a0 a0Var2 = new C5677a0(a0Var, trySplit);
                a0Var.addToPendingCount(1);
                if (z) {
                    g = trySplit;
                } else {
                    a0Var2 = a0Var;
                    a0Var = a0Var2;
                }
                z = !z;
                a0Var.fork();
                estimateSize = g.estimateSize();
                a0Var = a0Var2;
            }
        }
        a0Var.f18306c.mo22307M(q2Var, g);
        a0Var.f18304a = null;
        a0Var.propagateCompletion();
    }
}
