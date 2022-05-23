package zb;

import ac.g;
import cc.n;
import java.io.IOException;
import ub.a;
import ub.f0;
import ub.t;
import ub.w;
import ub.z;
import vb.b;
import z.e;
import zb.k;

public final class d {
    public k.b f27082a;
    public k f27083b;
    public int f27084c;
    public int f27085d;
    public int f27086e;
    public f0 f27087f;
    public final h f27088g;
    public final a f27089h;
    public final e f27090i;
    public final t f27091j;

    public d(h hVar, a aVar, e eVar, t tVar) {
        ra.k.e(hVar, "connectionPool");
        ra.k.e(aVar, "address");
        ra.k.e(eVar, "call");
        ra.k.e(tVar, "eventListener");
        this.f27088g = hVar;
        this.f27089h = aVar;
        this.f27090i = eVar;
        this.f27091j = tVar;
    }

    public final ac.d a(z zVar, g gVar) {
        ra.k.e(zVar, "client");
        ra.k.e(gVar, "chain");
        try {
            return c(gVar.f(), gVar.h(), gVar.j(), zVar.w(), zVar.C(), !ra.k.b(gVar.i().g(), "GET")).w(zVar, gVar);
        } catch (IOException e10) {
            h(e10);
            throw new j(e10);
        } catch (j e11) {
            h(e11.c());
            throw e11;
        }
    }

    public final zb.f b(int r15, int r16, int r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: zb.d.b(int, int, int, int, boolean):zb.f");
    }

    public final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        while (true) {
            f b10 = b(i10, i11, i12, i13, z10);
            if (b10.u(z11)) {
                return b10;
            }
            b10.y();
            if (this.f27087f == null) {
                k.b bVar = this.f27082a;
                boolean z12 = true;
                if (!(bVar != null ? bVar.b() : true)) {
                    k kVar = this.f27083b;
                    if (kVar != null) {
                        z12 = kVar.b();
                    }
                    if (!z12) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final a d() {
        return this.f27089h;
    }

    public final boolean e() {
        k kVar;
        if (this.f27084c == 0 && this.f27085d == 0 && this.f27086e == 0) {
            return false;
        }
        if (this.f27087f != null) {
            return true;
        }
        f0 f10 = f();
        if (f10 != null) {
            this.f27087f = f10;
            return true;
        }
        k.b bVar = this.f27082a;
        if ((bVar == null || !bVar.b()) && (kVar = this.f27083b) != null) {
            return kVar.b();
        }
        return true;
    }

    public final f0 f() {
        f k10;
        if (this.f27084c > 1 || this.f27085d > 1 || this.f27086e > 0 || (k10 = this.f27090i.k()) == null) {
            return null;
        }
        synchronized (k10) {
            if (k10.q() != 0) {
                return null;
            }
            if (!b.g(k10.z().a().l(), this.f27089h.l())) {
                return null;
            }
            return k10.z();
        }
    }

    public final boolean g(w wVar) {
        ra.k.e(wVar, "url");
        w l10 = this.f27089h.l();
        return wVar.l() == l10.l() && ra.k.b(wVar.h(), l10.h());
    }

    public final void h(IOException iOException) {
        ra.k.e(iOException, e.f26712c);
        this.f27087f = null;
        if ((iOException instanceof n) && ((n) iOException).f5213a == cc.b.REFUSED_STREAM) {
            this.f27084c++;
        } else if (iOException instanceof cc.a) {
            this.f27085d++;
        } else {
            this.f27086e++;
        }
    }
}
