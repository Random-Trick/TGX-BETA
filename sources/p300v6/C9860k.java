package p300v6;

import java.util.concurrent.Executor;

public final class C9860k implements AbstractC9863n {
    public final Executor f32139a;
    public final Object f32140b = new Object();
    public final AbstractC9851b f32141c;

    public C9860k(Executor executor, AbstractC9851b bVar) {
        this.f32139a = executor;
        this.f32141c = bVar;
    }

    @Override
    public final void mo6738a(AbstractC9854e eVar) {
        if (!eVar.mo6721i()) {
            synchronized (this.f32140b) {
                if (this.f32141c != null) {
                    this.f32139a.execute(new RunnableC9859j(this, eVar));
                }
            }
        }
    }
}
