package n6;

import java.util.concurrent.Executor;

public final class g0<TResult, TContinuationResult> implements h<TContinuationResult>, g, e, h0 {
    public final Executor f17716a;
    public final k<TResult, TContinuationResult> f17717b;
    public final m0<TContinuationResult> f17718c;

    public g0(Executor executor, k<TResult, TContinuationResult> kVar, m0<TContinuationResult> m0Var) {
        this.f17716a = executor;
        this.f17717b = kVar;
        this.f17718c = m0Var;
    }

    @Override
    public final void a(TContinuationResult tcontinuationresult) {
        this.f17718c.r(tcontinuationresult);
    }

    @Override
    public final void b() {
        this.f17718c.v();
    }

    @Override
    public final void c(Exception exc) {
        this.f17718c.t(exc);
    }

    @Override
    public final void d(l<TResult> lVar) {
        this.f17716a.execute(new f0(this, lVar));
    }
}
