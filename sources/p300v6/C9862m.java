package p300v6;

import java.util.concurrent.Executor;

public final class C9862m implements AbstractC9863n {
    public final Executor f32144a;
    public final Object f32145b = new Object();
    public final AbstractC9852c f32146c;

    public C9862m(Executor executor, AbstractC9852c cVar) {
        this.f32144a = executor;
        this.f32146c = cVar;
    }

    @Override
    public final void mo6738a(AbstractC9854e eVar) {
        if (eVar.mo6721i()) {
            synchronized (this.f32145b) {
                if (this.f32146c != null) {
                    this.f32144a.execute(new RunnableC9861l(this, eVar));
                }
            }
        }
    }
}
