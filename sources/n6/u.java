package n6;

import java.util.concurrent.Executor;

public final class u<TResult, TContinuationResult> implements h0<TResult> {
    public final Executor f17740a;
    public final c<TResult, TContinuationResult> f17741b;
    public final m0<TContinuationResult> f17742c;

    public u(Executor executor, c<TResult, TContinuationResult> cVar, m0<TContinuationResult> m0Var) {
        this.f17740a = executor;
        this.f17741b = cVar;
        this.f17742c = m0Var;
    }

    @Override
    public final void d(l<TResult> lVar) {
        this.f17740a.execute(new t(this, lVar));
    }
}
