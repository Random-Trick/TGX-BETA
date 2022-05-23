package w6;

import java.util.concurrent.Executor;

public final class k implements n {
    public final Executor f25784a;
    public final Object f25785b = new Object();
    public final b f25786c;

    public k(Executor executor, b bVar) {
        this.f25784a = executor;
        this.f25786c = bVar;
    }

    @Override
    public final void a(e eVar) {
        if (!eVar.i()) {
            synchronized (this.f25785b) {
                if (this.f25786c != null) {
                    this.f25784a.execute(new j(this, eVar));
                }
            }
        }
    }
}
