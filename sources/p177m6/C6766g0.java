package p177m6;

import java.util.concurrent.Executor;

public final class C6766g0<TResult, TContinuationResult> implements AbstractC6767h<TContinuationResult>, AbstractC6765g, AbstractC6761e, AbstractC6768h0 {
    public final Executor f21241a;
    public final AbstractC6773k<TResult, TContinuationResult> f21242b;
    public final C6778m0<TContinuationResult> f21243c;

    public C6766g0(Executor executor, AbstractC6773k<TResult, TContinuationResult> kVar, C6778m0<TContinuationResult> m0Var) {
        this.f21241a = executor;
        this.f21242b = kVar;
        this.f21243c = m0Var;
    }

    @Override
    public final void mo3951a(TContinuationResult tcontinuationresult) {
        this.f21243c.m19063r(tcontinuationresult);
    }

    @Override
    public final void mo19039b() {
        this.f21243c.m19059v();
    }

    @Override
    public final void mo4157c(Exception exc) {
        this.f21243c.m19061t(exc);
    }

    @Override
    public final void mo19034d(AbstractC6775l<TResult> lVar) {
        this.f21241a.execute(new RunnableC6764f0(this, lVar));
    }
}
