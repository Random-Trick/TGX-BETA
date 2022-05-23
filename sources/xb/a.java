package xb;

import ab.n;
import ra.g;
import ra.k;
import ub.a0;
import ub.b0;
import ub.c;
import ub.d0;
import ub.e;
import ub.e0;
import ub.t;
import ub.v;
import ub.x;
import xb.b;

public final class a implements x {
    public static final C0243a f26203a = new C0243a(null);

    public static final class C0243a {
        public C0243a() {
        }

        public C0243a(g gVar) {
            this();
        }

        public final v c(v vVar, v vVar2) {
            v.a aVar = new v.a();
            int size = vVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = vVar.g(i10);
                String r10 = vVar.r(i10);
                if ((!n.l("Warning", g10, true) || !n.x(r10, "1", false, 2, null)) && (d(g10) || !e(g10) || vVar2.f(g10) == null)) {
                    aVar.c(g10, r10);
                }
            }
            int size2 = vVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String g11 = vVar2.g(i11);
                if (!d(g11) && e(g11)) {
                    aVar.c(g11, vVar2.r(i11));
                }
            }
            return aVar.d();
        }

        public final boolean d(String str) {
            return n.l("Content-Length", str, true) || n.l("Content-Encoding", str, true) || n.l("Content-Type", str, true);
        }

        public final boolean e(String str) {
            return !n.l("Connection", str, true) && !n.l("Keep-Alive", str, true) && !n.l("Proxy-Authenticate", str, true) && !n.l("Proxy-Authorization", str, true) && !n.l("TE", str, true) && !n.l("Trailers", str, true) && !n.l("Transfer-Encoding", str, true) && !n.l("Upgrade", str, true);
        }

        public final d0 f(d0 d0Var) {
            return (d0Var != null ? d0Var.m() : null) != null ? d0Var.J0().b(null).c() : d0Var;
        }
    }

    public a(c cVar) {
    }

    @Override
    public d0 a(x.a aVar) {
        t tVar;
        k.e(aVar, "chain");
        e call = aVar.call();
        b b10 = new b.C0244b(System.currentTimeMillis(), aVar.b(), null).b();
        b0 b11 = b10.b();
        d0 a10 = b10.a();
        zb.e eVar = (zb.e) (!(call instanceof zb.e) ? null : call);
        if (eVar == null || (tVar = eVar.l()) == null) {
            tVar = t.f23927a;
        }
        if (b11 == null && a10 == null) {
            d0 c10 = new d0.a().r(aVar.b()).p(a0.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(vb.b.f24811c).s(-1L).q(System.currentTimeMillis()).c();
            tVar.z(call, c10);
            return c10;
        } else if (b11 == null) {
            k.c(a10);
            d0 c11 = a10.J0().d(f26203a.f(a10)).c();
            tVar.b(call, c11);
            return c11;
        } else {
            if (a10 != null) {
                tVar.a(call, a10);
            }
            d0 a11 = aVar.a(b11);
            if (a10 != null) {
                if (a11 == null || a11.A0() != 304) {
                    e0 m10 = a10.m();
                    if (m10 != null) {
                        vb.b.j(m10);
                    }
                } else {
                    d0.a J0 = a10.J0();
                    C0243a aVar2 = f26203a;
                    J0.k(aVar2.c(a10.F0(), a11.F0())).s(a11.O0()).q(a11.M0()).d(aVar2.f(a10)).n(aVar2.f(a11)).c();
                    e0 m11 = a11.m();
                    k.c(m11);
                    m11.close();
                    k.c(null);
                    throw null;
                }
            }
            k.c(a11);
            d0.a J02 = a11.J0();
            C0243a aVar3 = f26203a;
            return J02.d(aVar3.f(a10)).n(aVar3.f(a11)).c();
        }
    }
}
