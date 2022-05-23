package c4;

import a7.q;
import android.util.SparseArray;
import c4.i0;
import c5.b0;
import c5.e;
import java.util.ArrayList;
import java.util.List;
import m3.q1;
import org.thunderdog.challegram.Log;

public final class j implements i0.c {
    public final int f4577a;
    public final List<q1> f4578b;

    public j(int i10) {
        this(i10, q.D());
    }

    @Override
    public SparseArray<i0> a() {
        return new SparseArray<>();
    }

    @Override
    public i0 b(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f4569b));
            }
            if (i10 == 21) {
                return new w(new r());
            }
            if (i10 != 27) {
                if (i10 == 36) {
                    return new w(new q(c(bVar)));
                }
                if (i10 == 89) {
                    return new w(new l(bVar.f4570c));
                }
                if (i10 != 138) {
                    if (i10 == 172) {
                        return new w(new f(bVar.f4569b));
                    }
                    if (i10 == 257) {
                        return new c0(new v("application/vnd.dvb.ait"));
                    }
                    if (i10 != 134) {
                        if (i10 != 135) {
                            switch (i10) {
                                case 15:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new w(new i(false, bVar.f4569b));
                                case 16:
                                    return new w(new o(d(bVar)));
                                case 17:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new w(new s(bVar.f4569b));
                                default:
                                    switch (i10) {
                                        case Log.TAG_YOUTUBE:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!f(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new w(new c(bVar.f4569b));
                    } else if (f(16)) {
                        return null;
                    } else {
                        return new c0(new v("application/x-scte35"));
                    }
                }
                return new w(new k(bVar.f4569b));
            } else if (f(4)) {
                return null;
            } else {
                return new w(new p(c(bVar), f(1), f(8)));
            }
        }
        return new w(new n(d(bVar)));
    }

    public final d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    public final k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    public final List<q1> e(i0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f4578b;
        }
        b0 b0Var = new b0(bVar.f4571d);
        List<q1> list = this.f4578b;
        while (b0Var.a() > 0) {
            int D = b0Var.D();
            int e10 = b0Var.e() + b0Var.D();
            if (D == 134) {
                list = new ArrayList<>();
                int D2 = b0Var.D() & 31;
                for (int i11 = 0; i11 < D2; i11++) {
                    String A = b0Var.A(3);
                    int D3 = b0Var.D();
                    boolean z10 = true;
                    boolean z11 = (D3 & Log.TAG_YOUTUBE) != 0;
                    if (z11) {
                        i10 = D3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte D4 = (byte) b0Var.D();
                    b0Var.Q(1);
                    List<byte[]> list2 = null;
                    if (z11) {
                        if ((D4 & 64) == 0) {
                            z10 = false;
                        }
                        list2 = e.b(z10);
                    }
                    list.add(new q1.b().e0(str).V(A).F(i10).T(list2).E());
                }
            }
            b0Var.P(e10);
        }
        return list;
    }

    public final boolean f(int i10) {
        return (i10 & this.f4577a) != 0;
    }

    public j(int i10, List<q1> list) {
        this.f4577a = i10;
        this.f4578b = list;
    }
}
