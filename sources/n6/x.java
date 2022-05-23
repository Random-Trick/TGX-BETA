package n6;

public final class x implements Runnable {
    public final y f17748a;

    public x(y yVar) {
        this.f17748a = yVar;
    }

    @Override
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f17748a.f17750b;
        synchronized (obj) {
            eVar = this.f17748a.f17751c;
            if (eVar != null) {
                eVar2 = this.f17748a.f17751c;
                eVar2.b();
            }
        }
    }
}
