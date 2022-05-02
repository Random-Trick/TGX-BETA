package p318wb;

import p278tb.AbstractC9080e;
import p278tb.AbstractC9081e0;
import p278tb.AbstractC9114t;
import p278tb.AbstractC9129x;
import p278tb.C9069b0;
import p278tb.C9071c;
import p278tb.C9078d0;
import p278tb.C9122v;
import p278tb.EnumC9064a0;
import p290ub.C9489b;
import p318wb.C10033b;
import p348yb.C10482e;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;

public final class C10031a implements AbstractC9129x {
    public static final C10032a f32646b = new C10032a(null);
    public final C9071c f32647a;

    public static final class C10032a {
        public C10032a() {
        }

        public final C9122v m6184c(C9122v vVar, C9122v vVar2) {
            C9122v.C9123a aVar = new C9122v.C9123a();
            int size = vVar.size();
            for (int i = 0; i < size; i++) {
                String i2 = vVar.m10371i(i);
                String r = vVar.m10369r(i);
                if ((!C11451n.m633l("Warning", i2, true) || !C11451n.m621x(r, "1", false, 2, null)) && (m6183d(i2) || !m6182e(i2) || vVar2.m10372h(i2) == null)) {
                    aVar.m10365c(i2, r);
                }
            }
            int size2 = vVar2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String i4 = vVar2.m10371i(i3);
                if (!m6183d(i4) && m6182e(i4)) {
                    aVar.m10365c(i4, vVar2.m10369r(i3));
                }
            }
            return aVar.m10364d();
        }

        public final boolean m6183d(String str) {
            return C11451n.m633l("Content-Length", str, true) || C11451n.m633l("Content-Encoding", str, true) || C11451n.m633l("Content-Type", str, true);
        }

        public final boolean m6182e(String str) {
            return !C11451n.m633l("Connection", str, true) && !C11451n.m633l("Keep-Alive", str, true) && !C11451n.m633l("Proxy-Authenticate", str, true) && !C11451n.m633l("Proxy-Authorization", str, true) && !C11451n.m633l("TE", str, true) && !C11451n.m633l("Trailers", str, true) && !C11451n.m633l("Transfer-Encoding", str, true) && !C11451n.m633l("Upgrade", str, true);
        }

        public final C9078d0 m6181f(C9078d0 d0Var) {
            return (d0Var != null ? d0Var.m10512m() : null) != null ? d0Var.m10518J0().m10507b(null).m10506c() : d0Var;
        }

        public C10032a(C8294g gVar) {
            this();
        }
    }

    public C10031a(C9071c cVar) {
    }

    @Override
    public C9078d0 mo523a(AbstractC9129x.AbstractC9130a aVar) {
        AbstractC9114t tVar;
        C8298k.m12933e(aVar, "chain");
        AbstractC9080e call = aVar.call();
        C10033b b = new C10033b.C10035b(System.currentTimeMillis(), aVar.mo538b(), null).m6176b();
        C9069b0 b2 = b.m6179b();
        C9078d0 a = b.m6180a();
        C10482e eVar = (C10482e) (!(call instanceof C10482e) ? null : call);
        if (eVar == null || (tVar = eVar.m5005l()) == null) {
            tVar = AbstractC9114t.f29326a;
        }
        if (b2 == null && a == null) {
            C9078d0 c = new C9078d0.C9079a().m10491r(aVar.mo538b()).m10493p(EnumC9064a0.HTTP_1_1).m10502g(504).m10496m("Unsatisfiable Request (only-if-cached)").m10507b(C9489b.f30724c).m10490s(-1L).m10492q(System.currentTimeMillis()).m10506c();
            tVar.m10382z(call, c);
            return c;
        } else if (b2 == null) {
            C8298k.m12935c(a);
            C9078d0 c2 = a.m10518J0().m10505d(f32646b.m6181f(a)).m10506c();
            tVar.m10406b(call, c2);
            return c2;
        } else {
            if (a != null) {
                tVar.m10407a(call, a);
            }
            C9078d0 a2 = aVar.mo539a(b2);
            if (a != null) {
                if (a2 == null || a2.m10527A0() != 304) {
                    AbstractC9081e0 m = a.m10512m();
                    if (m != null) {
                        C9489b.m8514j(m);
                    }
                } else {
                    C9078d0.C9079a J0 = a.m10518J0();
                    C10032a aVar2 = f32646b;
                    J0.m10498k(aVar2.m6184c(a.m10522F0(), a2.m10522F0())).m10490s(a2.m10513O0()).m10492q(a2.m10515M0()).m10505d(aVar2.m6181f(a)).m10495n(aVar2.m6181f(a2)).m10506c();
                    AbstractC9081e0 m2 = a2.m10512m();
                    C8298k.m12935c(m2);
                    m2.close();
                    C8298k.m12935c(this.f32647a);
                    throw null;
                }
            }
            C8298k.m12935c(a2);
            C9078d0.C9079a J02 = a2.m10518J0();
            C10032a aVar3 = f32646b;
            return J02.m10505d(aVar3.m6181f(a)).m10495n(aVar3.m6181f(a2)).m10506c();
        }
    }
}
