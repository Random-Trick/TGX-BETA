package n6;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public final class i0<TResult> {
    public final Object f17719a = new Object();
    @GuardedBy("mLock")
    public Queue<h0<TResult>> f17720b;
    @GuardedBy("mLock")
    public boolean f17721c;

    public final void a(h0<TResult> h0Var) {
        synchronized (this.f17719a) {
            if (this.f17720b == null) {
                this.f17720b = new ArrayDeque();
            }
            this.f17720b.add(h0Var);
        }
    }

    public final void b(l<TResult> lVar) {
        h0<TResult> poll;
        synchronized (this.f17719a) {
            if (this.f17720b != null && !this.f17721c) {
                this.f17721c = true;
                while (true) {
                    synchronized (this.f17719a) {
                        poll = this.f17720b.poll();
                        if (poll == null) {
                            this.f17721c = false;
                            return;
                        }
                    }
                    poll.d(lVar);
                }
            }
        }
    }
}
