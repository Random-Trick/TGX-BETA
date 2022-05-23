package w6;

public final class j implements Runnable {
    public final e f25782a;
    public final k f25783b;

    public j(k kVar, e eVar) {
        this.f25783b = kVar;
        this.f25782a = eVar;
    }

    @Override
    public final void run() {
        Object obj;
        b bVar;
        b bVar2;
        obj = this.f25783b.f25785b;
        synchronized (obj) {
            k kVar = this.f25783b;
            bVar = kVar.f25786c;
            if (bVar != null) {
                bVar2 = kVar.f25786c;
                bVar2.c(this.f25782a.f());
            }
        }
    }
}
