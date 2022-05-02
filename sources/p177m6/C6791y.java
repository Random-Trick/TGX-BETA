package p177m6;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class C6791y<TResult> implements AbstractC6768h0<TResult> {
    public final Executor f21274a;
    public final Object f21275b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public AbstractC6761e f21276c;

    public C6791y(Executor executor, AbstractC6761e eVar) {
        this.f21274a = executor;
        this.f21276c = eVar;
    }

    @Override
    public final void mo19034d(AbstractC6775l<TResult> lVar) {
        if (lVar.mo19067n()) {
            synchronized (this.f21275b) {
                if (this.f21276c != null) {
                    this.f21274a.execute(new RunnableC6790x(this));
                }
            }
        }
    }
}
