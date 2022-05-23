package c4;

import c4.i0;
import c5.a;
import c5.a0;
import c5.b0;
import m3.q1;
import o3.c;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t3.h;
import t3.t;

public final class f implements m {
    public final a0 f4479a;
    public final b0 f4480b;
    public final String f4481c;
    public String f4482d;
    public t f4483e;
    public int f4484f;
    public int f4485g;
    public boolean f4486h;
    public boolean f4487i;
    public long f4488j;
    public q1 f4489k;
    public int f4490l;
    public long f4491m;

    public f() {
        this(null);
    }

    @Override
    public void a(b0 b0Var) {
        a.h(this.f4483e);
        while (b0Var.a() > 0) {
            int i10 = this.f4484f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(b0Var.a(), this.f4490l - this.f4485g);
                        this.f4483e.d(b0Var, min);
                        int i11 = this.f4485g + min;
                        this.f4485g = i11;
                        int i12 = this.f4490l;
                        if (i11 == i12) {
                            long j10 = this.f4491m;
                            if (j10 != -9223372036854775807L) {
                                this.f4483e.f(j10, 1, i12, 0, null);
                                this.f4491m += this.f4488j;
                            }
                            this.f4484f = 0;
                        }
                    }
                } else if (b(b0Var, this.f4480b.d(), 16)) {
                    g();
                    this.f4480b.P(0);
                    this.f4483e.d(this.f4480b, 16);
                    this.f4484f = 2;
                }
            } else if (h(b0Var)) {
                this.f4484f = 1;
                this.f4480b.d()[0] = -84;
                this.f4480b.d()[1] = (byte) (this.f4487i ? 65 : 64);
                this.f4485g = 2;
            }
        }
    }

    public final boolean b(b0 b0Var, byte[] bArr, int i10) {
        int min = Math.min(b0Var.a(), i10 - this.f4485g);
        b0Var.j(bArr, this.f4485g, min);
        int i11 = this.f4485g + min;
        this.f4485g = i11;
        return i11 == i10;
    }

    @Override
    public void c() {
        this.f4484f = 0;
        this.f4485g = 0;
        this.f4486h = false;
        this.f4487i = false;
        this.f4491m = -9223372036854775807L;
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4482d = dVar.b();
        this.f4483e = hVar.q(dVar.c(), 1);
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4491m = j10;
        }
    }

    @RequiresNonNull({"output"})
    public final void g() {
        this.f4479a.p(0);
        c.b d10 = c.d(this.f4479a);
        q1 q1Var = this.f4489k;
        if (q1Var == null || d10.f18747c != q1Var.f16908h0 || d10.f18746b != q1Var.f16909i0 || !"audio/ac4".equals(q1Var.U)) {
            q1 E = new q1.b().S(this.f4482d).e0("audio/ac4").H(d10.f18747c).f0(d10.f18746b).V(this.f4481c).E();
            this.f4489k = E;
            this.f4483e.a(E);
        }
        this.f4490l = d10.f18748d;
        this.f4488j = (d10.f18749e * 1000000) / this.f4489k.f16909i0;
    }

    public final boolean h(b0 b0Var) {
        boolean z10;
        int D;
        while (true) {
            z10 = false;
            if (b0Var.a() <= 0) {
                return false;
            }
            if (!this.f4486h) {
                if (b0Var.D() == 172) {
                    z10 = true;
                }
                this.f4486h = z10;
            } else {
                D = b0Var.D();
                this.f4486h = D == 172;
                if (D == 64 || D == 65) {
                    break;
                }
            }
        }
        if (D == 65) {
            z10 = true;
        }
        this.f4487i = z10;
        return true;
    }

    public f(String str) {
        a0 a0Var = new a0(new byte[16]);
        this.f4479a = a0Var;
        this.f4480b = new b0(a0Var.f4792a);
        this.f4484f = 0;
        this.f4485g = 0;
        this.f4486h = false;
        this.f4487i = false;
        this.f4491m = -9223372036854775807L;
        this.f4481c = str;
    }
}
