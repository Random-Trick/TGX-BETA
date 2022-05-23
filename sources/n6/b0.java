package n6;

import m5.r;

public final class b0 implements Runnable {
    public final l f17704a;
    public final c0 f17705b;

    public b0(c0 c0Var, l lVar) {
        this.f17705b = c0Var;
        this.f17704a = lVar;
    }

    @Override
    public final void run() {
        Object obj;
        g gVar;
        g gVar2;
        obj = this.f17705b.f17707b;
        synchronized (obj) {
            gVar = this.f17705b.f17708c;
            if (gVar != null) {
                gVar2 = this.f17705b.f17708c;
                gVar2.c((Exception) r.k(this.f17704a.k()));
            }
        }
    }
}
