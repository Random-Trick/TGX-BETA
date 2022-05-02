package p177m6;

import java.util.concurrent.Executor;

public final class RunnableC6788v implements Runnable {
    public final AbstractC6775l f21268a;
    public final C6789w f21269b;

    public RunnableC6788v(C6789w wVar, AbstractC6775l lVar) {
        this.f21269b = wVar;
        this.f21268a = lVar;
    }

    @Override
    public final void run() {
        C6778m0 m0Var;
        C6778m0 m0Var2;
        C6778m0 m0Var3;
        AbstractC6757c cVar;
        try {
            cVar = this.f21269b.f21271b;
            AbstractC6775l lVar = (AbstractC6775l) cVar.mo10597a(this.f21268a);
            if (lVar == null) {
                this.f21269b.mo4157c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C6779n.f21257b;
            lVar.mo19076f(executor, this.f21269b);
            lVar.mo19078d(executor, this.f21269b);
            lVar.mo19081a(executor, this.f21269b);
        } catch (C6771j e) {
            if (e.getCause() instanceof Exception) {
                m0Var2 = this.f21269b.f21272c;
                m0Var2.m19062t((Exception) e.getCause());
                return;
            }
            m0Var = this.f21269b.f21272c;
            m0Var.m19062t(e);
        } catch (Exception e2) {
            m0Var3 = this.f21269b.f21272c;
            m0Var3.m19062t(e2);
        }
    }
}
