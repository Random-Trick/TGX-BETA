package t6;

import w6.p;

public abstract class b implements Runnable {
    public final p f22939a;

    public b() {
        this.f22939a = null;
    }

    public b(p pVar) {
        this.f22939a = pVar;
    }

    public abstract void a();

    public final p b() {
        return this.f22939a;
    }

    public final void c(Exception exc) {
        p pVar = this.f22939a;
        if (pVar != null) {
            pVar.d(exc);
        }
    }

    @Override
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }
}
