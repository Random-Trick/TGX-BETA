package p177m6;

import java.util.concurrent.Executor;

public final class C6789w<TResult, TContinuationResult> implements AbstractC6767h<TContinuationResult>, AbstractC6765g, AbstractC6761e, AbstractC6768h0 {
    public final Executor f21270a;
    public final AbstractC6757c<TResult, AbstractC6775l<TContinuationResult>> f21271b;
    public final C6778m0<TContinuationResult> f21272c;

    public C6789w(Executor executor, AbstractC6757c<TResult, AbstractC6775l<TContinuationResult>> cVar, C6778m0<TContinuationResult> m0Var) {
        this.f21270a = executor;
        this.f21271b = cVar;
        this.f21272c = m0Var;
    }

    @Override
    public final void mo3951a(TContinuationResult tcontinuationresult) {
        this.f21272c.m19063r(tcontinuationresult);
    }

    @Override
    public final void mo19039b() {
        this.f21272c.m19059v();
    }

    @Override
    public final void mo4157c(Exception exc) {
        this.f21272c.m19061t(exc);
    }

    @Override
    public final void mo19034d(AbstractC6775l<TResult> lVar) {
        this.f21270a.execute(new RunnableC6788v(this, lVar));
    }
}
