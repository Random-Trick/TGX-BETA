package n6;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class a0<TResult> implements h0<TResult> {
    public final Executor f17700a;
    public final Object f17701b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public f<TResult> f17702c;

    public a0(Executor executor, f<TResult> fVar) {
        this.f17700a = executor;
        this.f17702c = fVar;
    }

    @Override
    public final void d(l<TResult> lVar) {
        synchronized (this.f17701b) {
            if (this.f17702c != null) {
                this.f17700a.execute(new z(this, lVar));
            }
        }
    }
}
