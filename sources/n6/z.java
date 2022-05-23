package n6;

public final class z implements Runnable {
    public final l f17752a;
    public final a0 f17753b;

    public z(a0 a0Var, l lVar) {
        this.f17753b = a0Var;
        this.f17752a = lVar;
    }

    @Override
    public final void run() {
        Object obj;
        f fVar;
        f fVar2;
        obj = this.f17753b.f17701b;
        synchronized (obj) {
            fVar = this.f17753b.f17702c;
            if (fVar != null) {
                fVar2 = this.f17753b.f17702c;
                fVar2.a(this.f17752a);
            }
        }
    }
}
