package p300v6;

public final class RunnableC9857h implements Runnable {
    public final AbstractC9854e f32132a;
    public final C9858i f32133b;

    public RunnableC9857h(C9858i iVar, AbstractC9854e eVar) {
        this.f32133b = iVar;
        this.f32132a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC9850a aVar;
        AbstractC9850a aVar2;
        obj = this.f32133b.f32135b;
        synchronized (obj) {
            C9858i iVar = this.f32133b;
            aVar = iVar.f32136c;
            if (aVar != null) {
                aVar2 = iVar.f32136c;
                aVar2.mo6750a(this.f32132a);
            }
        }
    }
}
