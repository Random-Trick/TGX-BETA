package p300v6;

import java.util.concurrent.Executor;

public final class C9858i implements AbstractC9863n {
    public final Executor f32134a;
    public final Object f32135b = new Object();
    public final AbstractC9850a f32136c;

    public C9858i(Executor executor, AbstractC9850a aVar) {
        this.f32134a = executor;
        this.f32136c = aVar;
    }

    @Override
    public final void mo6738a(AbstractC9854e eVar) {
        synchronized (this.f32135b) {
            if (this.f32136c != null) {
                this.f32134a.execute(new RunnableC9857h(this, eVar));
            }
        }
    }
}
