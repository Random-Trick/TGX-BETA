package n6;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class c0<TResult> implements h0<TResult> {
    public final Executor f17706a;
    public final Object f17707b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public g f17708c;

    public c0(Executor executor, g gVar) {
        this.f17706a = executor;
        this.f17708c = gVar;
    }

    @Override
    public final void d(l<TResult> lVar) {
        if (!lVar.p() && !lVar.n()) {
            synchronized (this.f17707b) {
                if (this.f17708c != null) {
                    this.f17706a.execute(new b0(this, lVar));
                }
            }
        }
    }
}
