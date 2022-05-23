package w6;

import java.util.ArrayDeque;
import java.util.Queue;

public final class o {
    public final Object f25792a = new Object();
    public Queue f25793b;
    public boolean f25794c;

    public final void a(n nVar) {
        synchronized (this.f25792a) {
            if (this.f25793b == null) {
                this.f25793b = new ArrayDeque();
            }
            this.f25793b.add(nVar);
        }
    }

    public final void b(e eVar) {
        n nVar;
        synchronized (this.f25792a) {
            if (this.f25793b != null && !this.f25794c) {
                this.f25794c = true;
                while (true) {
                    synchronized (this.f25792a) {
                        nVar = (n) this.f25793b.poll();
                        if (nVar == null) {
                            this.f25794c = false;
                            return;
                        }
                    }
                    nVar.a(eVar);
                }
            }
        }
    }
}
