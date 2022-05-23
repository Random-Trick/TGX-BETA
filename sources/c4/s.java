package c4;

import c4.i0;
import c5.a;
import c5.a0;
import c5.b0;
import java.util.Collections;
import m3.k2;
import m3.q1;
import o3.a;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.h;
import t3.t;

public final class s implements m {
    public final String f4728a;
    public final b0 f4729b;
    public final a0 f4730c;
    public t f4731d;
    public String f4732e;
    public q1 f4733f;
    public int f4734g;
    public int f4735h;
    public int f4736i;
    public int f4737j;
    public long f4738k = -9223372036854775807L;
    public boolean f4739l;
    public int f4740m;
    public int f4741n;
    public int f4742o;
    public boolean f4743p;
    public long f4744q;
    public int f4745r;
    public long f4746s;
    public int f4747t;
    public String f4748u;

    public s(String str) {
        this.f4728a = str;
        b0 b0Var = new b0((int) Log.TAG_CAMERA);
        this.f4729b = b0Var;
        this.f4730c = new a0(b0Var.d());
    }

    public static long b(a0 a0Var) {
        return a0Var.h((a0Var.h(2) + 1) * 8);
    }

    @Override
    public void a(b0 b0Var) {
        a.h(this.f4731d);
        while (b0Var.a() > 0) {
            int i10 = this.f4734g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int D = b0Var.D();
                    if ((D & 224) == 224) {
                        this.f4737j = D;
                        this.f4734g = 2;
                    } else if (D != 86) {
                        this.f4734g = 0;
                    }
                } else if (i10 == 2) {
                    int D2 = ((this.f4737j & (-225)) << 8) | b0Var.D();
                    this.f4736i = D2;
                    if (D2 > this.f4729b.d().length) {
                        m(this.f4736i);
                    }
                    this.f4735h = 0;
                    this.f4734g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(b0Var.a(), this.f4736i - this.f4735h);
                    b0Var.j(this.f4730c.f4792a, this.f4735h, min);
                    int i11 = this.f4735h + min;
                    this.f4735h = i11;
                    if (i11 == this.f4736i) {
                        this.f4730c.p(0);
                        g(this.f4730c);
                        this.f4734g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (b0Var.D() == 86) {
                this.f4734g = 1;
            }
        }
    }

    @Override
    public void c() {
        this.f4734g = 0;
        this.f4738k = -9223372036854775807L;
        this.f4739l = false;
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4731d = hVar.q(dVar.c(), 1);
        this.f4732e = dVar.b();
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4738k = j10;
        }
    }

    @RequiresNonNull({"output"})
    public final void g(a0 a0Var) {
        if (!a0Var.g()) {
            this.f4739l = true;
            l(a0Var);
        } else if (!this.f4739l) {
            return;
        }
        if (this.f4740m != 0) {
            throw k2.a(null, null);
        } else if (this.f4741n == 0) {
            k(a0Var, j(a0Var));
            if (this.f4743p) {
                a0Var.r((int) this.f4744q);
            }
        } else {
            throw k2.a(null, null);
        }
    }

    public final int h(a0 a0Var) {
        int b10 = a0Var.b();
        a.b d10 = o3.a.d(a0Var, true);
        this.f4748u = d10.f18650c;
        this.f4745r = d10.f18648a;
        this.f4747t = d10.f18649b;
        return b10 - a0Var.b();
    }

    public final void i(a0 a0Var) {
        int h10 = a0Var.h(3);
        this.f4742o = h10;
        if (h10 == 0) {
            a0Var.r(8);
        } else if (h10 == 1) {
            a0Var.r(9);
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            a0Var.r(6);
        } else if (h10 == 6 || h10 == 7) {
            a0Var.r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final int j(a0 a0Var) {
        int h10;
        if (this.f4742o == 0) {
            int i10 = 0;
            do {
                h10 = a0Var.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw k2.a(null, null);
    }

    @RequiresNonNull({"output"})
    public final void k(a0 a0Var, int i10) {
        int e10 = a0Var.e();
        if ((e10 & 7) == 0) {
            this.f4729b.P(e10 >> 3);
        } else {
            a0Var.i(this.f4729b.d(), 0, i10 * 8);
            this.f4729b.P(0);
        }
        this.f4731d.d(this.f4729b, i10);
        long j10 = this.f4738k;
        if (j10 != -9223372036854775807L) {
            this.f4731d.f(j10, 1, i10, 0, null);
            this.f4738k += this.f4746s;
        }
    }

    @RequiresNonNull({"output"})
    public final void l(a0 a0Var) {
        boolean g10;
        int h10 = a0Var.h(1);
        int h11 = h10 == 1 ? a0Var.h(1) : 0;
        this.f4740m = h11;
        if (h11 == 0) {
            if (h10 == 1) {
                b(a0Var);
            }
            if (a0Var.g()) {
                this.f4741n = a0Var.h(6);
                int h12 = a0Var.h(4);
                int h13 = a0Var.h(3);
                if (h12 == 0 && h13 == 0) {
                    if (h10 == 0) {
                        int e10 = a0Var.e();
                        int h14 = h(a0Var);
                        a0Var.p(e10);
                        byte[] bArr = new byte[(h14 + 7) / 8];
                        a0Var.i(bArr, 0, h14);
                        q1 E = new q1.b().S(this.f4732e).e0("audio/mp4a-latm").I(this.f4748u).H(this.f4747t).f0(this.f4745r).T(Collections.singletonList(bArr)).V(this.f4728a).E();
                        if (!E.equals(this.f4733f)) {
                            this.f4733f = E;
                            this.f4746s = 1024000000 / E.f16909i0;
                            this.f4731d.a(E);
                        }
                    } else {
                        a0Var.r(((int) b(a0Var)) - h(a0Var));
                    }
                    i(a0Var);
                    boolean g11 = a0Var.g();
                    this.f4743p = g11;
                    this.f4744q = 0L;
                    if (g11) {
                        if (h10 == 1) {
                            this.f4744q = b(a0Var);
                        } else {
                            do {
                                g10 = a0Var.g();
                                this.f4744q = (this.f4744q << 8) + a0Var.h(8);
                            } while (g10);
                        }
                    }
                    if (a0Var.g()) {
                        a0Var.r(8);
                        return;
                    }
                    return;
                }
                throw k2.a(null, null);
            }
            throw k2.a(null, null);
        }
        throw k2.a(null, null);
    }

    public final void m(int i10) {
        this.f4729b.L(i10);
        this.f4730c.n(this.f4729b.d());
    }
}
