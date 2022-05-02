package p300v6;

public final class RunnableC9861l implements Runnable {
    public final AbstractC9854e f32142a;
    public final C9862m f32143b;

    public RunnableC9861l(C9862m mVar, AbstractC9854e eVar) {
        this.f32143b = mVar;
        this.f32142a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        AbstractC9852c cVar;
        AbstractC9852c cVar2;
        obj = this.f32143b.f32145b;
        synchronized (obj) {
            C9862m mVar = this.f32143b;
            cVar = mVar.f32146c;
            if (cVar != null) {
                cVar2 = mVar.f32146c;
                cVar2.mo6713a(this.f32142a.mo6723g());
            }
        }
    }
}
