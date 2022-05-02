package p177m6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class RunnableC6764f0 implements Runnable {
    public final AbstractC6775l f21239a;
    public final C6766g0 f21240b;

    public RunnableC6764f0(C6766g0 g0Var, AbstractC6775l lVar) {
        this.f21240b = g0Var;
        this.f21239a = lVar;
    }

    @Override
    public final void run() {
        AbstractC6773k kVar;
        try {
            kVar = this.f21240b.f21242b;
            AbstractC6775l a = kVar.mo19087a(this.f21239a.mo19069l());
            if (a == null) {
                this.f21240b.mo4157c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C6779n.f21257b;
            a.mo19075f(executor, this.f21240b);
            a.mo19077d(executor, this.f21240b);
            a.mo19080a(executor, this.f21240b);
        } catch (CancellationException unused) {
            this.f21240b.mo19039b();
        } catch (C6771j e) {
            if (e.getCause() instanceof Exception) {
                this.f21240b.mo4157c((Exception) e.getCause());
            } else {
                this.f21240b.mo4157c(e);
            }
        } catch (Exception e2) {
            this.f21240b.mo4157c(e2);
        }
    }
}
