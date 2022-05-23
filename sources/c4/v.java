package c4;

import c4.i0;
import c5.a;
import c5.b0;
import c5.i0;
import c5.l0;
import m3.q1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import t3.h;
import t3.t;

public final class v implements b0 {
    public q1 f4766a;
    public i0 f4767b;
    public t f4768c;

    public v(String str) {
        this.f4766a = new q1.b().e0(str).E();
    }

    @Override
    public void a(b0 b0Var) {
        c();
        long d10 = this.f4767b.d();
        long e10 = this.f4767b.e();
        if (d10 != -9223372036854775807L && e10 != -9223372036854775807L) {
            q1 q1Var = this.f4766a;
            if (e10 != q1Var.Y) {
                q1 E = q1Var.b().i0(e10).E();
                this.f4766a = E;
                this.f4768c.a(E);
            }
            int a10 = b0Var.a();
            this.f4768c.d(b0Var, a10);
            this.f4768c.f(d10, 1, a10, 0, null);
        }
    }

    @Override
    public void b(i0 i0Var, h hVar, i0.d dVar) {
        this.f4767b = i0Var;
        dVar.a();
        t q10 = hVar.q(dVar.c(), 5);
        this.f4768c = q10;
        q10.a(this.f4766a);
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    public final void c() {
        a.h(this.f4767b);
        l0.j(this.f4768c);
    }
}
