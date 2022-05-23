package j$.util.stream;

import java.util.concurrent.CountedCompleter;

public abstract class F1 extends CountedCompleter {
    protected final Q0 f14526a;
    protected final int f14527b;

    public F1(F1 f12, Q0 q02, int i10) {
        super(f12);
        this.f14526a = q02;
        this.f14527b = i10;
    }

    public F1(Q0 q02) {
        this.f14526a = q02;
        this.f14527b = 0;
    }

    abstract void a();

    abstract F1 b(int i10, int i11);

    @Override
    public final void compute() {
        F1 f12 = this;
        while (f12.f14526a.s() != 0) {
            f12.setPendingCount(f12.f14526a.s() - 1);
            int i10 = 0;
            int i11 = 0;
            while (i10 < f12.f14526a.s() - 1) {
                F1 b10 = f12.b(i10, f12.f14527b + i11);
                i11 = (int) (i11 + b10.f14526a.count());
                b10.fork();
                i10++;
            }
            f12 = f12.b(i10, f12.f14527b + i11);
        }
        f12.a();
        f12.propagateCompletion();
    }
}
