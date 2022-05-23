package q3;

import a7.s0;
import android.net.Uri;
import b5.t;
import b5.y;
import b7.d;
import c5.a;
import c5.l0;
import java.util.Map;
import m3.y1;
import q3.h;

public final class l implements b0 {
    public final Object f21333a = new Object();
    public y1.f f21334b;
    public y f21335c;
    public y.b f21336d;
    public String f21337e;

    @Override
    public y a(y1 y1Var) {
        y yVar;
        a.e(y1Var.f17043b);
        y1.f fVar = y1Var.f17043b.f17093c;
        if (fVar == null || l0.f4841a < 18) {
            return y.f21372a;
        }
        synchronized (this.f21333a) {
            if (!l0.c(fVar, this.f21334b)) {
                this.f21334b = fVar;
                this.f21335c = b(fVar);
            }
            yVar = (y) a.e(this.f21335c);
        }
        return yVar;
    }

    public final y b(y1.f fVar) {
        y.b bVar = this.f21336d;
        if (bVar == null) {
            bVar = new t.b().c(this.f21337e);
        }
        Uri uri = fVar.f17066c;
        l0 l0Var = new l0(uri == null ? null : uri.toString(), fVar.f17071h, bVar);
        s0<Map.Entry<String, String>> u10 = fVar.f17068e.entrySet().iterator();
        while (u10.hasNext()) {
            Map.Entry<String, String> next = u10.next();
            l0Var.e(next.getKey(), next.getValue());
        }
        h a10 = new h.b().e(fVar.f17064a, k0.f21329d).b(fVar.f17069f).c(fVar.f17070g).d(d.i(fVar.f17073j)).a(l0Var);
        a10.G(0, fVar.c());
        return a10;
    }
}
