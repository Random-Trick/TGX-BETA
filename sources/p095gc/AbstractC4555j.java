package p095gc;

import qa.C8298k;

public abstract class AbstractC4555j implements AbstractC4537a0 {
    public final AbstractC4537a0 f14978a;

    public AbstractC4555j(AbstractC4537a0 a0Var) {
        C8298k.m12933e(a0Var, "delegate");
        this.f14978a = a0Var;
    }

    @Override
    public C4539b0 mo27336c() {
        return this.f14978a.mo27336c();
    }

    @Override
    public void close() {
        this.f14978a.close();
    }

    public final AbstractC4537a0 m27398m() {
        return this.f14978a;
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f14978a + ')';
    }
}
