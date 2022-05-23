package j$.util.stream;

import java.util.Objects;

public abstract class AbstractC0354m2 implements AbstractC0374q2 {
    protected final AbstractC0378r2 f14819a;

    public AbstractC0354m2(AbstractC0378r2 r2Var) {
        Objects.requireNonNull(r2Var);
        this.f14819a = r2Var;
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void d(int i10) {
        E0.p();
        throw null;
    }

    @Override
    public void h() {
        this.f14819a.h();
    }

    @Override
    public final void l(Object obj) {
        x((Long) obj);
    }

    @Override
    public boolean u() {
        return this.f14819a.u();
    }

    @Override
    public final void x(Long l10) {
        E0.n(this, l10);
    }
}
