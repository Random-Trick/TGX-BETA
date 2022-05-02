package p300v6;

public final class RunnableC9861l implements Runnable {
    public final AbstractC9854e f32139a;
    public final C9862m f32140b;

    public RunnableC9861l(C9862m mVar, AbstractC9854e eVar) {
        this.f32140b = mVar;
        this.f32139a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC9852c cVar;
        AbstractC9852c cVar2;
        obj = this.f32140b.f32142b;
        synchronized (obj) {
            C9862m mVar = this.f32140b;
            cVar = mVar.f32143c;
            if (cVar != null) {
                cVar2 = mVar.f32143c;
                cVar2.mo6713a(this.f32139a.mo6723g());
            }
        }
    }
}
