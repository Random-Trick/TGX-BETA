package p177m6;

import p163l5.C6378r;

public final class RunnableC6756b0 implements Runnable {
    public final AbstractC6775l f21229a;
    public final C6758c0 f21230b;

    public RunnableC6756b0(C6758c0 c0Var, AbstractC6775l lVar) {
        this.f21230b = c0Var;
        this.f21229a = lVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC6765g gVar;
        AbstractC6765g gVar2;
        obj = this.f21230b.f21232b;
        synchronized (obj) {
            gVar = this.f21230b.f21233c;
            if (gVar != null) {
                gVar2 = this.f21230b.f21233c;
                gVar2.mo4157c((Exception) C6378r.m20506k(this.f21229a.mo19070k()));
            }
        }
    }
}
