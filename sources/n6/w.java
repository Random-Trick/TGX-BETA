package n6;

import java.util.concurrent.Executor;

public final class w<TResult, TContinuationResult> implements h<TContinuationResult>, g, e, h0 {
    public final Executor f17745a;
    public final c<TResult, l<TContinuationResult>> f17746b;
    public final m0<TContinuationResult> f17747c;

    public w(Executor executor, c<TResult, l<TContinuationResult>> cVar, m0<TContinuationResult> m0Var) {
        this.f17745a = executor;
        this.f17746b = cVar;
        this.f17747c = m0Var;
    }

    @Override
    public final void a(TContinuationResult tcontinuationresult) {
        this.f17747c.r(tcontinuationresult);
    }

    @Override
    public final void b() {
        this.f17747c.v();
    }

    @Override
    public final void c(Exception exc) {
        this.f17747c.t(exc);
    }

    @Override
    public final void d(l<TResult> lVar) {
        this.f17745a.execute(new v(this, lVar));
    }
}
