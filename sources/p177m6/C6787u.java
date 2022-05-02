package p177m6;

import java.util.concurrent.Executor;

public final class C6787u<TResult, TContinuationResult> implements AbstractC6768h0<TResult> {
    public final Executor f21265a;
    public final AbstractC6757c<TResult, TContinuationResult> f21266b;
    public final C6778m0<TContinuationResult> f21267c;

    public C6787u(Executor executor, AbstractC6757c<TResult, TContinuationResult> cVar, C6778m0<TContinuationResult> m0Var) {
        this.f21265a = executor;
        this.f21266b = cVar;
        this.f21267c = m0Var;
    }

    @Override
    public final void mo19035d(AbstractC6775l<TResult> lVar) {
        this.f21265a.execute(new RunnableC6786t(this, lVar));
    }
}
