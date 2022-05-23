package w6;

public final class h implements Runnable {
    public final e f25777a;
    public final i f25778b;

    public h(i iVar, e eVar) {
        this.f25778b = iVar;
        this.f25777a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        a aVar;
        a aVar2;
        obj = this.f25778b.f25780b;
        synchronized (obj) {
            i iVar = this.f25778b;
            aVar = iVar.f25781c;
            if (aVar != null) {
                aVar2 = iVar.f25781c;
                aVar2.a(this.f25777a);
            }
        }
    }
}
