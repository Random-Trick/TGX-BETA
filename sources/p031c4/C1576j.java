package p031c4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p020b5.C1194e;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p358z6.AbstractC11396q;

public final class C1576j implements AbstractC1571i0.AbstractC1574c {
    public final int f5660a;
    public final List<C6600g1> f5661b;

    public C1576j(int i) {
        this(i, AbstractC11396q.m768D());
    }

    @Override
    public SparseArray<AbstractC1571i0> mo36405a() {
        return new SparseArray<>();
    }

    @Override
    public AbstractC1571i0 mo36404b(int i, AbstractC1571i0.C1573b bVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C1598w(new C1595t(bVar.f5652b));
            }
            if (i == 21) {
                return new C1598w(new C1593r());
            }
            if (i != 27) {
                if (i == 36) {
                    return new C1598w(new C1591q(m36403c(bVar)));
                }
                if (i == 89) {
                    return new C1598w(new C1580l(bVar.f5653c));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new C1598w(new C1562f(bVar.f5652b));
                    }
                    if (i == 257) {
                        return new C1556c0(new C1597v("application/vnd.dvb.ait"));
                    }
                    if (i != 134) {
                        if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (m36400f(2)) {
                                        return null;
                                    }
                                    return new C1598w(new C1570i(false, bVar.f5652b));
                                case 16:
                                    return new C1598w(new C1584o(m36402d(bVar)));
                                case 17:
                                    if (m36400f(2)) {
                                        return null;
                                    }
                                    return new C1598w(new C1594s(bVar.f5652b));
                                default:
                                    switch (i) {
                                        case Log.TAG_YOUTUBE:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!m36400f(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new C1598w(new C1555c(bVar.f5652b));
                    } else if (m36400f(16)) {
                        return null;
                    } else {
                        return new C1556c0(new C1597v("application/x-scte35"));
                    }
                }
                return new C1598w(new C1578k(bVar.f5652b));
            } else if (m36400f(4)) {
                return null;
            } else {
                return new C1598w(new C1587p(m36403c(bVar), m36400f(1), m36400f(8)));
            }
        }
        return new C1598w(new C1582n(m36402d(bVar)));
    }

    public final C1558d0 m36403c(AbstractC1571i0.C1573b bVar) {
        return new C1558d0(m36401e(bVar));
    }

    public final C1579k0 m36402d(AbstractC1571i0.C1573b bVar) {
        return new C1579k0(m36401e(bVar));
    }

    public final List<C6600g1> m36401e(AbstractC1571i0.C1573b bVar) {
        String str;
        int i;
        if (m36400f(32)) {
            return this.f5661b;
        }
        C1189b0 b0Var = new C1189b0(bVar.f5654d);
        List<C6600g1> list = this.f5661b;
        while (b0Var.m38145a() > 0) {
            int D = b0Var.m38159D();
            int e = b0Var.m38141e() + b0Var.m38159D();
            if (D == 134) {
                list = new ArrayList<>();
                int D2 = b0Var.m38159D() & 31;
                for (int i2 = 0; i2 < D2; i2++) {
                    String A = b0Var.m38162A(3);
                    int D3 = b0Var.m38159D();
                    boolean z = true;
                    boolean z2 = (D3 & Log.TAG_YOUTUBE) != 0;
                    if (z2) {
                        i = D3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte D4 = (byte) b0Var.m38159D();
                    b0Var.m38146Q(1);
                    List<byte[]> list2 = null;
                    if (z2) {
                        if ((D4 & 64) == 0) {
                            z = false;
                        }
                        list2 = C1194e.m38098b(z);
                    }
                    list.add(new C6600g1.C6602b().m19859e0(str).m19873V(A).m19889F(i).m19875T(list2).m19890E());
                }
            }
            b0Var.m38147P(e);
        }
        return list;
    }

    public final boolean m36400f(int i) {
        return (i & this.f5660a) != 0;
    }

    public C1576j(int i, List<C6600g1> list) {
        this.f5660a = i;
        this.f5661b = list;
    }
}
