package p177m6;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class C6762e0<TResult> implements AbstractC6768h0<TResult> {
    public final Executor f21236a;
    public final Object f21237b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public AbstractC6767h<? super TResult> f21238c;

    public C6762e0(Executor executor, AbstractC6767h<? super TResult> hVar) {
        this.f21236a = executor;
        this.f21238c = hVar;
    }

    @Override
    public final void mo19035d(AbstractC6775l<TResult> lVar) {
        if (lVar.mo19066p()) {
            synchronized (this.f21237b) {
                if (this.f21238c != null) {
                    this.f21236a.execute(new RunnableC6760d0(this, lVar));
                }
            }
        }
    }
}
