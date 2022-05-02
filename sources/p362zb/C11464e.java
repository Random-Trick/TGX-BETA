package p362zb;

import cc.C2083h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import p095gc.C4549e;
import p095gc.C4552h;
import p278tb.AbstractC9106p;
import p278tb.C9078d0;
import p278tb.C9093h;
import p278tb.C9104o;
import p278tb.C9122v;
import p278tb.C9125w;
import p290ub.C9489b;
import qa.C8298k;
import za.C11451n;

public final class C11464e {
    public static final C4552h f36426a;
    public static final C4552h f36427b;

    static {
        C4552h.C4553a aVar = C4552h.f14973N;
        f36426a = aVar.m27399c("\"\\");
        f36427b = aVar.m27399c("\t ,=");
    }

    public static final List<C9093h> m551a(C9122v vVar, String str) {
        C8298k.m12934e(vVar, "$this$parseChallenges");
        C8298k.m12934e(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = vVar.size();
        for (int i = 0; i < size; i++) {
            if (C11451n.m633l(str, vVar.m10372i(i), true)) {
                try {
                    m549c(new C4549e().mo27348O(vVar.m10370r(i)), arrayList);
                } catch (EOFException e) {
                    C2083h.f7326c.m35674g().m35686j("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean m550b(C9078d0 d0Var) {
        C8298k.m12934e(d0Var, "$this$promisesBody");
        if (C8298k.m12937b(d0Var.m10515N0().m10561g(), "HEAD")) {
            return false;
        }
        int A0 = d0Var.m10528A0();
        return (((A0 >= 100 && A0 < 200) || A0 == 204 || A0 == 304) && C9489b.m8505s(d0Var) == -1 && !C11451n.m633l("chunked", C9078d0.m10524E0(d0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    public static final void m549c(p095gc.C4549e r7, java.util.List<p278tb.C9093h> r8) {
        throw new UnsupportedOperationException("Method not decompiled: p362zb.C11464e.m549c(gc.e, java.util.List):void");
    }

    public static final String m548d(C4549e eVar) {
        byte b = (byte) 34;
        if (eVar.readByte() == b) {
            C4549e eVar2 = new C4549e();
            while (true) {
                long F0 = eVar.m27442F0(f36426a);
                if (F0 == -1) {
                    return null;
                }
                if (eVar.m27444D0(F0) == b) {
                    eVar2.mo5030h0(eVar, F0);
                    eVar.readByte();
                    return eVar2.m27433O0();
                } else if (eVar.size() == F0 + 1) {
                    return null;
                } else {
                    eVar2.mo5030h0(eVar, F0);
                    eVar.readByte();
                    eVar2.mo5030h0(eVar, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static final String m547e(C4549e eVar) {
        long F0 = eVar.m27442F0(f36427b);
        if (F0 == -1) {
            F0 = eVar.size();
        }
        if (F0 != 0) {
            return eVar.m27432P0(F0);
        }
        return null;
    }

    public static final void m546f(AbstractC9106p pVar, C9125w wVar, C9122v vVar) {
        C8298k.m12934e(pVar, "$this$receiveHeaders");
        C8298k.m12934e(wVar, "url");
        C8298k.m12934e(vVar, "headers");
        if (pVar != AbstractC9106p.f29311a) {
            List<C9104o> e = C9104o.f29301n.m10425e(wVar, vVar);
            if (!e.isEmpty()) {
                pVar.mo10420b(wVar, e);
            }
        }
    }

    public static final boolean m545g(C4549e eVar) {
        boolean z = false;
        while (!eVar.mo27339B()) {
            byte D0 = eVar.m27444D0(0L);
            if (D0 == 9 || D0 == 32) {
                eVar.readByte();
            } else if (D0 != 44) {
                break;
            } else {
                eVar.readByte();
                z = true;
            }
        }
        return z;
    }

    public static final boolean m544h(C4549e eVar, byte b) {
        return !eVar.mo27339B() && eVar.m27444D0(0L) == b;
    }
}
