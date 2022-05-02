package p300v6;

public final class RunnableC9857h implements Runnable {
    public final AbstractC9854e f32129a;
    public final C9858i f32130b;

    public RunnableC9857h(C9858i iVar, AbstractC9854e eVar) {
        this.f32130b = iVar;
        this.f32129a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC9850a aVar;
        AbstractC9850a aVar2;
        obj = this.f32130b.f32132b;
        synchronized (obj) {
            C9858i iVar = this.f32130b;
            aVar = iVar.f32133c;
            if (aVar != null) {
                aVar2 = iVar.f32133c;
                aVar2.mo6750a(this.f32129a);
            }
        }
    }
}
