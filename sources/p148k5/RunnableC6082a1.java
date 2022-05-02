package p148k5;

import p133j5.C5850a;

public final class RunnableC6082a1 implements Runnable {
    public final C6087b1 f19306a;

    public RunnableC6082a1(C6087b1 b1Var) {
        this.f19306a = b1Var;
    }

    @Override
    public final void run() {
        C5850a.AbstractC5859f fVar;
        C5850a.AbstractC5859f fVar2;
        fVar = this.f19306a.f19312a.f19330b;
        fVar2 = this.f19306a.f19312a.f19330b;
        fVar.mo21247e(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
