package p300v6;

import java.util.concurrent.Executor;

public final class C9858i implements AbstractC9863n {
    public final Executor f32131a;
    public final Object f32132b = new Object();
    public final AbstractC9850a f32133c;

    public C9858i(Executor executor, AbstractC9850a aVar) {
        this.f32131a = executor;
        this.f32133c = aVar;
    }

    @Override
    public final void mo6738a(AbstractC9854e eVar) {
        synchronized (this.f32132b) {
            if (this.f32133c != null) {
                this.f32131a.execute(new RunnableC9857h(this, eVar));
            }
        }
    }
}
