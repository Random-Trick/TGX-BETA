package w6;

import java.util.concurrent.Executor;

public final class i implements n {
    public final Executor f25779a;
    public final Object f25780b = new Object();
    public final a f25781c;

    public i(Executor executor, a aVar) {
        this.f25779a = executor;
        this.f25781c = aVar;
    }

    @Override
    public final void a(e eVar) {
        synchronized (this.f25780b) {
            if (this.f25781c != null) {
                this.f25779a.execute(new h(this, eVar));
            }
        }
    }
}
