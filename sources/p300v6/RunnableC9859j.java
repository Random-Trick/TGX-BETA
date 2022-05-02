package p300v6;

public final class RunnableC9859j implements Runnable {
    public final AbstractC9854e f32134a;
    public final C9860k f32135b;

    public RunnableC9859j(C9860k kVar, AbstractC9854e eVar) {
        this.f32135b = kVar;
        this.f32134a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC9851b bVar;
        AbstractC9851b bVar2;
        obj = this.f32135b.f32137b;
        synchronized (obj) {
            C9860k kVar = this.f32135b;
            bVar = kVar.f32138c;
            if (bVar != null) {
                bVar2 = kVar.f32138c;
                bVar2.mo6711c(this.f32134a.mo6724f());
            }
        }
    }
}
