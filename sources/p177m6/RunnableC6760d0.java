package p177m6;

public final class RunnableC6760d0 implements Runnable {
    public final AbstractC6775l f21234a;
    public final C6762e0 f21235b;

    public RunnableC6760d0(C6762e0 e0Var, AbstractC6775l lVar) {
        this.f21235b = e0Var;
        this.f21234a = lVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC6767h hVar;
        AbstractC6767h hVar2;
        obj = this.f21235b.f21237b;
        synchronized (obj) {
            hVar = this.f21235b.f21238c;
            if (hVar != null) {
                hVar2 = this.f21235b.f21238c;
                hVar2.mo3951a(this.f21234a.mo19069l());
            }
        }
    }
}
