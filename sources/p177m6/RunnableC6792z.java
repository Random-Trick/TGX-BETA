package p177m6;

public final class RunnableC6792z implements Runnable {
    public final AbstractC6775l f21277a;
    public final C6754a0 f21278b;

    public RunnableC6792z(C6754a0 a0Var, AbstractC6775l lVar) {
        this.f21278b = a0Var;
        this.f21277a = lVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC6763f fVar;
        AbstractC6763f fVar2;
        obj = this.f21278b.f21226b;
        synchronized (obj) {
            fVar = this.f21278b.f21227c;
            if (fVar != null) {
                fVar2 = this.f21278b.f21227c;
                fVar2.mo10607a(this.f21277a);
            }
        }
    }
}
