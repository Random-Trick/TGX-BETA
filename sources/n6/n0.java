package n6;

import java.util.concurrent.Callable;

public final class n0 implements Runnable {
    public final m0 f17733a;
    public final Callable f17734b;

    public n0(m0 m0Var, Callable callable) {
        this.f17733a = m0Var;
        this.f17734b = callable;
    }

    @Override
    public final void run() {
        try {
            this.f17733a.r(this.f17734b.call());
        } catch (Exception e10) {
            this.f17733a.t(e10);
        } catch (Throwable th) {
            this.f17733a.t(new RuntimeException(th));
        }
    }
}
