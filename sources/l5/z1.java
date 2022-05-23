package l5;

import l6.l;

public final class z1 implements Runnable {
    public final l f16277a;
    public final b2 f16278b;

    public z1(b2 b2Var, l lVar) {
        this.f16278b = b2Var;
        this.f16277a = lVar;
    }

    @Override
    public final void run() {
        b2.I1(this.f16278b, this.f16277a);
    }
}
