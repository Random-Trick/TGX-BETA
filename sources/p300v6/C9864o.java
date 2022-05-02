package p300v6;

import java.util.ArrayDeque;
import java.util.Queue;

public final class C9864o {
    public final Object f32144a = new Object();
    public Queue f32145b;
    public boolean f32146c;

    public final void m6737a(AbstractC9863n nVar) {
        synchronized (this.f32144a) {
            if (this.f32145b == null) {
                this.f32145b = new ArrayDeque();
            }
            this.f32145b.add(nVar);
        }
    }

    public final void m6736b(AbstractC9854e eVar) {
        AbstractC9863n nVar;
        synchronized (this.f32144a) {
            if (this.f32145b != null && !this.f32146c) {
                this.f32146c = true;
                while (true) {
                    synchronized (this.f32144a) {
                        nVar = (AbstractC9863n) this.f32145b.poll();
                        if (nVar == null) {
                            this.f32146c = false;
                            return;
                        }
                    }
                    nVar.mo6738a(eVar);
                }
            }
        }
    }
}
