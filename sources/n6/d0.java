package n6;

public final class d0 implements Runnable {
    public final l f17709a;
    public final e0 f17710b;

    public d0(e0 e0Var, l lVar) {
        this.f17710b = e0Var;
        this.f17709a = lVar;
    }

    @Override
    public final void run() {
        Object obj;
        h hVar;
        h hVar2;
        obj = this.f17710b.f17712b;
        synchronized (obj) {
            hVar = this.f17710b.f17713c;
            if (hVar != null) {
                hVar2 = this.f17710b.f17713c;
                hVar2.a(this.f17709a.l());
            }
        }
    }
}
