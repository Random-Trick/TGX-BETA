package t9;

import fa.b;
import o9.d;
import ra.k;
import v9.c;
import v9.i;

public final class e extends c<d, c> {
    public final d f23008c;
    public final b f23009d;

    public e(d dVar, b bVar) {
        k.e(dVar, "track");
        k.e(bVar, "interpolator");
        this.f23008c = dVar;
        this.f23009d = bVar;
    }

    @Override
    public i<d> i(i.b<d> bVar, boolean z10) {
        k.e(bVar, "state");
        if (bVar instanceof i.a) {
            return bVar;
        }
        bVar.a().c().f5000c = this.f23009d.a(this.f23008c, bVar.a().c().f5000c);
        return bVar;
    }
}
