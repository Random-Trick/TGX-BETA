package j$.util.stream;

import java.util.Objects;

public abstract class AbstractC0349l2 implements AbstractC0369p2 {
    protected final AbstractC0378r2 f14807a;

    public AbstractC0349l2(AbstractC0378r2 r2Var) {
        Objects.requireNonNull(r2Var);
        this.f14807a = r2Var;
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public void h() {
        this.f14807a.h();
    }

    @Override
    public final void l(Object obj) {
        p((Integer) obj);
    }

    @Override
    public final void p(Integer num) {
        E0.l(this, num);
    }

    @Override
    public boolean u() {
        return this.f14807a.u();
    }
}
