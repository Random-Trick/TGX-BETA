package p262s6;

import p300v6.C9865p;

public abstract class AbstractRunnableC8648b implements Runnable {
    public final C9865p f27982a;

    public AbstractRunnableC8648b() {
        this.f27982a = null;
    }

    public AbstractRunnableC8648b(C9865p pVar) {
        this.f27982a = pVar;
    }

    public abstract void mo11796a();

    public final C9865p m11809b() {
        return this.f27982a;
    }

    public final void m11808c(Exception exc) {
        C9865p pVar = this.f27982a;
        if (pVar != null) {
            pVar.m6732d(exc);
        }
    }

    @Override
    public final void run() {
        try {
            mo11796a();
        } catch (Exception e) {
            m11808c(e);
        }
    }
}
