package l5;

public final class z0 implements Runnable {
    public final int f16275a;
    public final c1 f16276b;

    public z0(c1 c1Var, int i10) {
        this.f16276b = c1Var;
        this.f16275a = i10;
    }

    @Override
    public final void run() {
        this.f16276b.c(this.f16275a);
    }
}
