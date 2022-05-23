package ac;

import ab.n;
import hc.f;
import hc.o;
import java.net.ProtocolException;
import ra.k;
import ub.b0;
import ub.c0;
import ub.d0;
import ub.e0;
import ub.x;
import zb.c;

public final class b implements x {
    public final boolean f718a;

    public b(boolean z10) {
        this.f718a = z10;
    }

    @Override
    public d0 a(x.a aVar) {
        boolean z10;
        d0.a aVar2;
        d0 d0Var;
        k.e(aVar, "chain");
        g gVar = (g) aVar;
        c g10 = gVar.g();
        k.c(g10);
        b0 i10 = gVar.i();
        c0 a10 = i10.a();
        long currentTimeMillis = System.currentTimeMillis();
        g10.t(i10);
        Long l10 = null;
        if (!f.a(i10.g()) || a10 == null) {
            g10.n();
            aVar2 = null;
            z10 = true;
        } else {
            if (n.l("100-continue", i10.d("Expect"), true)) {
                g10.f();
                aVar2 = g10.p(true);
                g10.r();
                z10 = false;
            } else {
                aVar2 = null;
                z10 = true;
            }
            if (aVar2 != null) {
                g10.n();
                if (!g10.h().v()) {
                    g10.m();
                }
            } else if (a10.c()) {
                g10.f();
                a10.e(o.a(g10.c(i10, true)));
            } else {
                f a11 = o.a(g10.c(i10, false));
                a10.e(a11);
                a11.close();
            }
        }
        if (a10 == null || !a10.c()) {
            g10.e();
        }
        if (aVar2 == null) {
            aVar2 = g10.p(false);
            k.c(aVar2);
            if (z10) {
                g10.r();
                z10 = false;
            }
        }
        d0 c10 = aVar2.r(i10).i(g10.h().r()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
        int A0 = c10.A0();
        if (A0 == 100) {
            d0.a p10 = g10.p(false);
            k.c(p10);
            if (z10) {
                g10.r();
            }
            c10 = p10.r(i10).i(g10.h().r()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
            A0 = c10.A0();
        }
        g10.q(c10);
        if (!this.f718a || A0 != 101) {
            d0Var = c10.J0().b(g10.o(c10)).c();
        } else {
            d0Var = c10.J0().b(vb.b.f24811c).c();
        }
        if (n.l("close", d0Var.N0().d("Connection"), true) || n.l("close", d0.E0(d0Var, "Connection", null, 2, null), true)) {
            g10.m();
        }
        if (A0 == 204 || A0 == 205) {
            e0 m10 = d0Var.m();
            if ((m10 != null ? m10.m() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(A0);
                sb2.append(" had non-zero Content-Length: ");
                e0 m11 = d0Var.m();
                if (m11 != null) {
                    l10 = Long.valueOf(m11.m());
                }
                sb2.append(l10);
                throw new ProtocolException(sb2.toString());
            }
        }
        return d0Var;
    }
}
