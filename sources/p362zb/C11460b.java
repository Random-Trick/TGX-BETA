package p362zb;

import java.net.ProtocolException;
import p095gc.AbstractC4550f;
import p095gc.C4560o;
import p278tb.AbstractC9072c0;
import p278tb.AbstractC9081e0;
import p278tb.AbstractC9129x;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p290ub.C9489b;
import p348yb.C10478c;
import qa.C8298k;
import za.C11451n;

public final class C11460b implements AbstractC9129x {
    public final boolean f36422a;

    public C11460b(boolean z) {
        this.f36422a = z;
    }

    @Override
    public C9078d0 mo523a(AbstractC9129x.AbstractC9130a aVar) {
        boolean z;
        C9078d0.C9079a aVar2;
        C9078d0 d0Var;
        C8298k.m12934e(aVar, "chain");
        C11466g gVar = (C11466g) aVar;
        C10478c g = gVar.m533g();
        C8298k.m12936c(g);
        C9069b0 i = gVar.m531i();
        AbstractC9072c0 a = i.m10567a();
        long currentTimeMillis = System.currentTimeMillis();
        g.m5031t(i);
        Long l = null;
        if (!C11465f.m543a(i.m10561g()) || a == null) {
            g.m5037n();
            aVar2 = null;
            z = true;
        } else {
            if (C11451n.m633l("100-continue", i.m10564d("Expect"), true)) {
                g.m5045f();
                aVar2 = g.m5035p(true);
                g.m5033r();
                z = false;
            } else {
                aVar2 = null;
                z = true;
            }
            if (aVar2 != null) {
                g.m5037n();
                if (!g.m5043h().m4955v()) {
                    g.m5038m();
                }
            } else if (a.m10551c()) {
                g.m5045f();
                a.mo10545e(C4560o.m27379a(g.m5048c(i, true)));
            } else {
                AbstractC4550f a2 = C4560o.m27379a(g.m5048c(i, false));
                a.mo10545e(a2);
                a2.close();
            }
        }
        if (a == null || !a.m10551c()) {
            g.m5046e();
        }
        if (aVar2 == null) {
            aVar2 = g.m5035p(false);
            C8298k.m12936c(aVar2);
            if (z) {
                g.m5033r();
                z = false;
            }
        }
        C9078d0 c = aVar2.m10492r(i).m10501i(g.m5043h().m4959r()).m10491s(currentTimeMillis).m10493q(System.currentTimeMillis()).m10507c();
        int A0 = c.m10528A0();
        if (A0 == 100) {
            C9078d0.C9079a p = g.m5035p(false);
            C8298k.m12936c(p);
            if (z) {
                g.m5033r();
            }
            c = p.m10492r(i).m10501i(g.m5043h().m4959r()).m10491s(currentTimeMillis).m10493q(System.currentTimeMillis()).m10507c();
            A0 = c.m10528A0();
        }
        g.m5034q(c);
        if (!this.f36422a || A0 != 101) {
            d0Var = c.m10519J0().m10508b(g.m5036o(c)).m10507c();
        } else {
            d0Var = c.m10519J0().m10508b(C9489b.f30721c).m10507c();
        }
        if (C11451n.m633l("close", d0Var.m10515N0().m10564d("Connection"), true) || C11451n.m633l("close", C9078d0.m10524E0(d0Var, "Connection", null, 2, null), true)) {
            g.m5038m();
        }
        if (A0 == 204 || A0 == 205) {
            AbstractC9081e0 m = d0Var.m10513m();
            if ((m != null ? m.mo528m() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(A0);
                sb2.append(" had non-zero Content-Length: ");
                AbstractC9081e0 m2 = d0Var.m10513m();
                if (m2 != null) {
                    l = Long.valueOf(m2.mo528m());
                }
                sb2.append(l);
                throw new ProtocolException(sb2.toString());
            }
        }
        return d0Var;
    }
}
