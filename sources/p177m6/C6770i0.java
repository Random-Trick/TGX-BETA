package p177m6;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public final class C6770i0<TResult> {
    public final Object f21244a = new Object();
    @GuardedBy("mLock")
    public Queue<AbstractC6768h0<TResult>> f21245b;
    @GuardedBy("mLock")
    public boolean f21246c;

    public final void m19091a(AbstractC6768h0<TResult> h0Var) {
        synchronized (this.f21244a) {
            if (this.f21245b == null) {
                this.f21245b = new ArrayDeque();
            }
            this.f21245b.add(h0Var);
        }
    }

    public final void m19090b(AbstractC6775l<TResult> lVar) {
        AbstractC6768h0<TResult> poll;
        synchronized (this.f21244a) {
            if (this.f21245b != null && !this.f21246c) {
                this.f21246c = true;
                while (true) {
                    synchronized (this.f21244a) {
                        poll = this.f21245b.poll();
                        if (poll == null) {
                            this.f21246c = false;
                            return;
                        }
                    }
                    poll.mo19035d(lVar);
                }
            }
        }
    }
}
