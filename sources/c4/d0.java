package c4;

import c4.i0;
import c5.a;
import c5.b0;
import java.util.List;
import m3.q1;
import t3.b;
import t3.h;
import t3.t;

public final class d0 {
    public final List<q1> f4469a;
    public final t[] f4470b;

    public d0(List<q1> list) {
        this.f4469a = list;
        this.f4470b = new t[list.size()];
    }

    public void a(long j10, b0 b0Var) {
        b.a(j10, b0Var, this.f4470b);
    }

    public void b(h hVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f4470b.length; i10++) {
            dVar.a();
            t q10 = hVar.q(dVar.c(), 3);
            q1 q1Var = this.f4469a.get(i10);
            String str = q1Var.U;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            a.b(z10, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = q1Var.f16898a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            q10.a(new q1.b().S(str2).e0(str).g0(q1Var.M).V(q1Var.f16902c).F(q1Var.f16913m0).T(q1Var.W).E());
            this.f4470b[i10] = q10;
        }
    }
}
