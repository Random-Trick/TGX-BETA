package p177m6;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class C6754a0<TResult> implements AbstractC6768h0<TResult> {
    public final Executor f21225a;
    public final Object f21226b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public AbstractC6763f<TResult> f21227c;

    public C6754a0(Executor executor, AbstractC6763f<TResult> fVar) {
        this.f21225a = executor;
        this.f21227c = fVar;
    }

    @Override
    public final void mo19035d(AbstractC6775l<TResult> lVar) {
        synchronized (this.f21226b) {
            if (this.f21227c != null) {
                this.f21225a.execute(new RunnableC6792z(this, lVar));
            }
        }
    }
}
