package ac;

import ab.n;
import hc.h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import ra.k;
import ub.d0;
import ub.o;
import ub.p;
import ub.v;
import ub.w;
import vb.b;

public final class e {
    public static final h f722a;
    public static final h f723b;

    static {
        h.a aVar = h.N;
        f722a = aVar.c("\"\\");
        f723b = aVar.c("\t ,=");
    }

    public static final List<ub.h> a(v vVar, String str) {
        k.e(vVar, "$this$parseChallenges");
        k.e(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (n.l(str, vVar.g(i10), true)) {
                try {
                    c(new hc.e().P(vVar.r(i10)), arrayList);
                } catch (EOFException e10) {
                    dc.h.f7333c.g().j("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(d0 d0Var) {
        k.e(d0Var, "$this$promisesBody");
        if (k.b(d0Var.N0().g(), "HEAD")) {
            return false;
        }
        int A0 = d0Var.A0();
        return (((A0 >= 100 && A0 < 200) || A0 == 204 || A0 == 304) && b.s(d0Var) == -1 && !n.l("chunked", d0.E0(d0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    public static final void c(hc.e r7, java.util.List<ub.h> r8) {
        throw new UnsupportedOperationException("Method not decompiled: ac.e.c(hc.e, java.util.List):void");
    }

    public static final String d(hc.e eVar) {
        byte b10 = (byte) 34;
        if (eVar.readByte() == b10) {
            hc.e eVar2 = new hc.e();
            while (true) {
                long F0 = eVar.F0(f722a);
                if (F0 == -1) {
                    return null;
                }
                if (eVar.D0(F0) == b10) {
                    eVar2.c0(eVar, F0);
                    eVar.readByte();
                    return eVar2.O0();
                } else if (eVar.size() == F0 + 1) {
                    return null;
                } else {
                    eVar2.c0(eVar, F0);
                    eVar.readByte();
                    eVar2.c0(eVar, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static final String e(hc.e eVar) {
        long F0 = eVar.F0(f723b);
        if (F0 == -1) {
            F0 = eVar.size();
        }
        if (F0 != 0) {
            return eVar.P0(F0);
        }
        return null;
    }

    public static final void f(p pVar, w wVar, v vVar) {
        k.e(pVar, "$this$receiveHeaders");
        k.e(wVar, "url");
        k.e(vVar, "headers");
        if (pVar != p.f23915a) {
            List<o> e10 = o.f23905n.e(wVar, vVar);
            if (!e10.isEmpty()) {
                pVar.b(wVar, e10);
            }
        }
    }

    public static final boolean g(hc.e eVar) {
        boolean z10 = false;
        while (!eVar.C()) {
            byte D0 = eVar.D0(0L);
            if (D0 == 9 || D0 == 32) {
                eVar.readByte();
            } else if (D0 != 44) {
                break;
            } else {
                eVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    public static final boolean h(hc.e eVar, byte b10) {
        return !eVar.C() && eVar.D0(0L) == b10;
    }
}
