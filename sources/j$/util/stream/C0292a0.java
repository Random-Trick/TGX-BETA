package j$.util.stream;

import j$.util.H;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

final class C0292a0 extends CountedCompleter {
    public static final int f14688h = 0;
    private final E0 f14689a;
    private H f14690b;
    private final long f14691c;
    private final ConcurrentHashMap f14692d;
    private final AbstractC0378r2 f14693e;
    private final C0292a0 f14694f;
    private Q0 f14695g;

    public C0292a0(E0 e02, H h10, AbstractC0378r2 r2Var) {
        super(null);
        this.f14689a = e02;
        this.f14690b = h10;
        this.f14691c = AbstractC0316f.h(h10.estimateSize());
        this.f14692d = new ConcurrentHashMap(Math.max(16, AbstractC0316f.f14739g << 1));
        this.f14693e = r2Var;
        this.f14694f = null;
    }

    C0292a0(C0292a0 a0Var, H h10, C0292a0 a0Var2) {
        super(a0Var);
        this.f14689a = a0Var.f14689a;
        this.f14690b = h10;
        this.f14691c = a0Var.f14691c;
        this.f14692d = a0Var.f14692d;
        this.f14693e = a0Var.f14693e;
        this.f14694f = a0Var2;
    }

    @Override
    public final void compute() {
        H trySplit;
        H h10 = this.f14690b;
        long j10 = this.f14691c;
        boolean z10 = false;
        C0292a0 a0Var = this;
        while (h10.estimateSize() > j10 && (trySplit = h10.trySplit()) != null) {
            C0292a0 a0Var2 = new C0292a0(a0Var, trySplit, a0Var.f14694f);
            C0292a0 a0Var3 = new C0292a0(a0Var, h10, a0Var2);
            a0Var.addToPendingCount(1);
            a0Var3.addToPendingCount(1);
            a0Var.f14692d.put(a0Var2, a0Var3);
            if (a0Var.f14694f != null) {
                a0Var2.addToPendingCount(1);
                if (a0Var.f14692d.replace(a0Var.f14694f, a0Var, a0Var2)) {
                    a0Var.addToPendingCount(-1);
                } else {
                    a0Var2.addToPendingCount(-1);
                }
            }
            if (z10) {
                h10 = trySplit;
                a0Var = a0Var2;
                a0Var2 = a0Var3;
            } else {
                a0Var = a0Var3;
            }
            z10 = !z10;
            a0Var2.fork();
        }
        if (a0Var.getPendingCount() > 0) {
            C0351m mVar = C0351m.f14813e;
            E0 e02 = a0Var.f14689a;
            I0 p02 = e02.p0(e02.X(h10), mVar);
            a0Var.f14689a.u0(p02, h10);
            a0Var.f14695g = p02.mo32b();
            a0Var.f14690b = null;
        }
        a0Var.tryComplete();
    }

    @Override
    public final void onCompletion(CountedCompleter countedCompleter) {
        Q0 q02 = this.f14695g;
        if (q02 != null) {
            q02.a(this.f14693e);
            this.f14695g = null;
        } else {
            H h10 = this.f14690b;
            if (h10 != null) {
                this.f14689a.u0(this.f14693e, h10);
                this.f14690b = null;
            }
        }
        C0292a0 a0Var = (C0292a0) this.f14692d.remove(this);
        if (a0Var != null) {
            a0Var.tryComplete();
        }
    }
}
