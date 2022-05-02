package p177m6;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class C6758c0<TResult> implements AbstractC6768h0<TResult> {
    public final Executor f21231a;
    public final Object f21232b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public AbstractC6765g f21233c;

    public C6758c0(Executor executor, AbstractC6765g gVar) {
        this.f21231a = executor;
        this.f21233c = gVar;
    }

    @Override
    public final void mo19035d(AbstractC6775l<TResult> lVar) {
        if (!lVar.mo19066p() && !lVar.mo19068n()) {
            synchronized (this.f21232b) {
                if (this.f21233c != null) {
                    this.f21231a.execute(new RunnableC6756b0(this, lVar));
                }
            }
        }
    }
}
