package p300v6;

import java.util.concurrent.Executor;

public final class C9860k implements AbstractC9863n {
    public final Executor f32136a;
    public final Object f32137b = new Object();
    public final AbstractC9851b f32138c;

    public C9860k(Executor executor, AbstractC9851b bVar) {
        this.f32136a = executor;
        this.f32138c = bVar;
    }

    @Override
    public final void mo6738a(AbstractC9854e eVar) {
        if (!eVar.mo6721i()) {
            synchronized (this.f32137b) {
                if (this.f32138c != null) {
                    this.f32136a.execute(new RunnableC9859j(this, eVar));
                }
            }
        }
    }
}
