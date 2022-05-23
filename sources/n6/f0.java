package n6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class f0 implements Runnable {
    public final l f17714a;
    public final g0 f17715b;

    public f0(g0 g0Var, l lVar) {
        this.f17715b = g0Var;
        this.f17714a = lVar;
    }

    @Override
    public final void run() {
        k kVar;
        try {
            kVar = this.f17715b.f17717b;
            l a10 = kVar.a(this.f17714a.l());
            if (a10 == null) {
                this.f17715b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = n.f17732b;
            a10.f(executor, this.f17715b);
            a10.d(executor, this.f17715b);
            a10.a(executor, this.f17715b);
        } catch (CancellationException unused) {
            this.f17715b.b();
        } catch (j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f17715b.c((Exception) e10.getCause());
            } else {
                this.f17715b.c(e10);
            }
        } catch (Exception e11) {
            this.f17715b.c(e11);
        }
    }
}
