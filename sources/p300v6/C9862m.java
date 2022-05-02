package p300v6;

import java.util.concurrent.Executor;

public final class C9862m implements AbstractC9863n {
    public final Executor f32141a;
    public final Object f32142b = new Object();
    public final AbstractC9852c f32143c;

    public C9862m(Executor executor, AbstractC9852c cVar) {
        this.f32141a = executor;
        this.f32143c = cVar;
    }

    @Override
    public final void mo6738a(AbstractC9854e eVar) {
        if (eVar.mo6721i()) {
            synchronized (this.f32142b) {
                if (this.f32143c != null) {
                    this.f32141a.execute(new RunnableC9861l(this, eVar));
                }
            }
        }
    }
}
