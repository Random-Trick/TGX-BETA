package p177m6;

public final class RunnableC6790x implements Runnable {
    public final C6791y f21273a;

    public RunnableC6790x(C6791y yVar) {
        this.f21273a = yVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC6761e eVar;
        AbstractC6761e eVar2;
        obj = this.f21273a.f21275b;
        synchronized (obj) {
            eVar = this.f21273a.f21276c;
            if (eVar != null) {
                eVar2 = this.f21273a.f21276c;
                eVar2.mo19039b();
            }
        }
    }
}
