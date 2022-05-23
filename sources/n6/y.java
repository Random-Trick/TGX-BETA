package n6;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class y<TResult> implements h0<TResult> {
    public final Executor f17749a;
    public final Object f17750b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public e f17751c;

    public y(Executor executor, e eVar) {
        this.f17749a = executor;
        this.f17751c = eVar;
    }

    @Override
    public final void d(l<TResult> lVar) {
        if (lVar.n()) {
            synchronized (this.f17750b) {
                if (this.f17751c != null) {
                    this.f17749a.execute(new x(this));
                }
            }
        }
    }
}
