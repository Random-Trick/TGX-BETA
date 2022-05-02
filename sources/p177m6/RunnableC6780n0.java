package p177m6;

import java.util.concurrent.Callable;

public final class RunnableC6780n0 implements Runnable {
    public final C6778m0 f21258a;
    public final Callable f21259b;

    public RunnableC6780n0(C6778m0 m0Var, Callable callable) {
        this.f21258a = m0Var;
        this.f21259b = callable;
    }

    @Override
    public final void run() {
        try {
            this.f21258a.m19063r(this.f21259b.call());
        } catch (Exception e) {
            this.f21258a.m19061t(e);
        } catch (Throwable th) {
            this.f21258a.m19061t(new RuntimeException(th));
        }
    }
}
