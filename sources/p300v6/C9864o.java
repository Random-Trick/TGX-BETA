package p300v6;

import java.util.ArrayDeque;
import java.util.Queue;

public final class C9864o {
    public final Object f32147a = new Object();
    public Queue f32148b;
    public boolean f32149c;

    public final void m6737a(AbstractC9863n nVar) {
        synchronized (this.f32147a) {
            if (this.f32148b == null) {
                this.f32148b = new ArrayDeque();
            }
            this.f32148b.add(nVar);
        }
    }

    public final void m6736b(AbstractC9854e eVar) {
        AbstractC9863n nVar;
        synchronized (this.f32147a) {
            if (this.f32148b != null && !this.f32149c) {
                this.f32149c = true;
                while (true) {
                    synchronized (this.f32147a) {
                        nVar = (AbstractC9863n) this.f32148b.poll();
                        if (nVar == null) {
                            this.f32149c = false;
                            return;
                        }
                    }
                    nVar.mo6738a(eVar);
                }
            }
        }
    }
}
