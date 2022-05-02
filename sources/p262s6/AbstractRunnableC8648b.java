package p262s6;

import p300v6.C9865p;

public abstract class AbstractRunnableC8648b implements Runnable {
    public final C9865p f27979a;

    public AbstractRunnableC8648b() {
        this.f27979a = null;
    }

    public AbstractRunnableC8648b(C9865p pVar) {
        this.f27979a = pVar;
    }

    public abstract void mo11797a();

    public final C9865p m11810b() {
        return this.f27979a;
    }

    public final void m11809c(Exception exc) {
        C9865p pVar = this.f27979a;
        if (pVar != null) {
            pVar.m6732d(exc);
        }
    }

    @Override
    public final void run() {
        try {
            mo11797a();
        } catch (Exception e) {
            m11809c(e);
        }
    }
}
