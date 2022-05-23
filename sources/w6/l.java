package w6;

public final class l implements Runnable {
    public final e f25787a;
    public final m f25788b;

    public l(m mVar, e eVar) {
        this.f25788b = mVar;
        this.f25787a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f25788b.f25790b;
        synchronized (obj) {
            m mVar = this.f25788b;
            cVar = mVar.f25791c;
            if (cVar != null) {
                cVar2 = mVar.f25791c;
                cVar2.a(this.f25787a.g());
            }
        }
    }
}
