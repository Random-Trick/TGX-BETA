package n6;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class e0<TResult> implements h0<TResult> {
    public final Executor f17711a;
    public final Object f17712b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public h<? super TResult> f17713c;

    public e0(Executor executor, h<? super TResult> hVar) {
        this.f17711a = executor;
        this.f17713c = hVar;
    }

    @Override
    public final void d(l<TResult> lVar) {
        if (lVar.p()) {
            synchronized (this.f17712b) {
                if (this.f17713c != null) {
                    this.f17711a.execute(new d0(this, lVar));
                }
            }
        }
    }
}
