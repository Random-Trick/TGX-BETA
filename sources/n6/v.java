package n6;

import java.util.concurrent.Executor;

public final class v implements Runnable {
    public final l f17743a;
    public final w f17744b;

    public v(w wVar, l lVar) {
        this.f17744b = wVar;
        this.f17743a = lVar;
    }

    @Override
    public final void run() {
        m0 m0Var;
        m0 m0Var2;
        m0 m0Var3;
        c cVar;
        try {
            cVar = this.f17744b.f17746b;
            l lVar = (l) cVar.a(this.f17743a);
            if (lVar == null) {
                this.f17744b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = n.f17732b;
            lVar.f(executor, this.f17744b);
            lVar.d(executor, this.f17744b);
            lVar.a(executor, this.f17744b);
        } catch (j e10) {
            if (e10.getCause() instanceof Exception) {
                m0Var2 = this.f17744b.f17747c;
                m0Var2.t((Exception) e10.getCause());
                return;
            }
            m0Var = this.f17744b.f17747c;
            m0Var.t(e10);
        } catch (Exception e11) {
            m0Var3 = this.f17744b.f17747c;
            m0Var3.t(e11);
        }
    }
}
