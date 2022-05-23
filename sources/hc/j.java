package hc;

import ra.k;

public abstract class j implements a0 {
    public final a0 f12650a;

    public j(a0 a0Var) {
        k.e(a0Var, "delegate");
        this.f12650a = a0Var;
    }

    @Override
    public b0 c() {
        return this.f12650a.c();
    }

    @Override
    public void close() {
        this.f12650a.close();
    }

    public final a0 m() {
        return this.f12650a;
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f12650a + ')';
    }
}
