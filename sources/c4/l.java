package c4;

import c4.i0;
import c5.b0;
import java.util.Collections;
import java.util.List;
import m3.q1;
import t3.h;
import t3.t;

public final class l implements m {
    public final List<i0.a> f4592a;
    public final t[] f4593b;
    public boolean f4594c;
    public int f4595d;
    public int f4596e;
    public long f4597f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f4592a = list;
        this.f4593b = new t[list.size()];
    }

    @Override
    public void a(b0 b0Var) {
        t[] tVarArr;
        if (!this.f4594c) {
            return;
        }
        if (this.f4595d != 2 || b(b0Var, 32)) {
            if (this.f4595d != 1 || b(b0Var, 0)) {
                int e10 = b0Var.e();
                int a10 = b0Var.a();
                for (t tVar : this.f4593b) {
                    b0Var.P(e10);
                    tVar.d(b0Var, a10);
                }
                this.f4596e += a10;
            }
        }
    }

    public final boolean b(b0 b0Var, int i10) {
        if (b0Var.a() == 0) {
            return false;
        }
        if (b0Var.D() != i10) {
            this.f4594c = false;
        }
        this.f4595d--;
        return this.f4594c;
    }

    @Override
    public void c() {
        this.f4594c = false;
        this.f4597f = -9223372036854775807L;
    }

    @Override
    public void d() {
        if (this.f4594c) {
            if (this.f4597f != -9223372036854775807L) {
                for (t tVar : this.f4593b) {
                    tVar.f(this.f4597f, 1, this.f4596e, 0, null);
                }
            }
            this.f4594c = false;
        }
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f4593b.length; i10++) {
            i0.a aVar = this.f4592a.get(i10);
            dVar.a();
            t q10 = hVar.q(dVar.c(), 3);
            q10.a(new q1.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f4567c)).V(aVar.f4565a).E());
            this.f4593b[i10] = q10;
        }
    }

    @Override
    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f4594c = true;
            if (j10 != -9223372036854775807L) {
                this.f4597f = j10;
            }
            this.f4596e = 0;
            this.f4595d = 2;
        }
    }
}
