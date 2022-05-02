package p300v6;

public final class RunnableC9859j implements Runnable {
    public final AbstractC9854e f32137a;
    public final C9860k f32138b;

    public RunnableC9859j(C9860k kVar, AbstractC9854e eVar) {
        this.f32138b = kVar;
        this.f32137a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC9851b bVar;
        AbstractC9851b bVar2;
        obj = this.f32138b.f32140b;
        synchronized (obj) {
            C9860k kVar = this.f32138b;
            bVar = kVar.f32141c;
            if (bVar != null) {
                bVar2 = kVar.f32141c;
                bVar2.mo6711c(this.f32137a.mo6724f());
            }
        }
    }
}
