package w6;

import java.util.concurrent.Executor;

public final class m implements n {
    public final Executor f25789a;
    public final Object f25790b = new Object();
    public final c f25791c;

    public m(Executor executor, c cVar) {
        this.f25789a = executor;
        this.f25791c = cVar;
    }

    @Override
    public final void a(e eVar) {
        if (eVar.i()) {
            synchronized (this.f25790b) {
                if (this.f25791c != null) {
                    this.f25789a.execute(new l(this, eVar));
                }
            }
        }
    }
}
