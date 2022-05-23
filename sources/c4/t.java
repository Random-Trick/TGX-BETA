package c4;

import c4.i0;
import c5.a;
import c5.b0;
import m3.q1;
import o3.h0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.h;

public final class t implements m {
    public final b0 f4749a;
    public final h0.a f4750b;
    public final String f4751c;
    public t3.t f4752d;
    public String f4753e;
    public int f4754f;
    public int f4755g;
    public boolean f4756h;
    public boolean f4757i;
    public long f4758j;
    public int f4759k;
    public long f4760l;

    public t() {
        this(null);
    }

    @Override
    public void a(b0 b0Var) {
        a.h(this.f4752d);
        while (b0Var.a() > 0) {
            int i10 = this.f4754f;
            if (i10 == 0) {
                b(b0Var);
            } else if (i10 == 1) {
                h(b0Var);
            } else if (i10 == 2) {
                g(b0Var);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void b(b0 b0Var) {
        byte[] d10 = b0Var.d();
        int f10 = b0Var.f();
        for (int e10 = b0Var.e(); e10 < f10; e10++) {
            boolean z10 = (d10[e10] & 255) == 255;
            boolean z11 = this.f4757i && (d10[e10] & 224) == 224;
            this.f4757i = z10;
            if (z11) {
                b0Var.P(e10 + 1);
                this.f4757i = false;
                this.f4749a.d()[1] = d10[e10];
                this.f4755g = 2;
                this.f4754f = 1;
                return;
            }
        }
        b0Var.P(f10);
    }

    @Override
    public void c() {
        this.f4754f = 0;
        this.f4755g = 0;
        this.f4757i = false;
        this.f4760l = -9223372036854775807L;
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4753e = dVar.b();
        this.f4752d = hVar.q(dVar.c(), 1);
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4760l = j10;
        }
    }

    @RequiresNonNull({"output"})
    public final void g(b0 b0Var) {
        int min = Math.min(b0Var.a(), this.f4759k - this.f4755g);
        this.f4752d.d(b0Var, min);
        int i10 = this.f4755g + min;
        this.f4755g = i10;
        int i11 = this.f4759k;
        if (i10 >= i11) {
            long j10 = this.f4760l;
            if (j10 != -9223372036854775807L) {
                this.f4752d.f(j10, 1, i11, 0, null);
                this.f4760l += this.f4758j;
            }
            this.f4755g = 0;
            this.f4754f = 0;
        }
    }

    @RequiresNonNull({"output"})
    public final void h(b0 b0Var) {
        int min = Math.min(b0Var.a(), 4 - this.f4755g);
        b0Var.j(this.f4749a.d(), this.f4755g, min);
        int i10 = this.f4755g + min;
        this.f4755g = i10;
        if (i10 >= 4) {
            this.f4749a.P(0);
            if (!this.f4750b.a(this.f4749a.n())) {
                this.f4755g = 0;
                this.f4754f = 1;
                return;
            }
            h0.a aVar = this.f4750b;
            this.f4759k = aVar.f18808c;
            if (!this.f4756h) {
                this.f4758j = (aVar.f18812g * 1000000) / aVar.f18809d;
                this.f4752d.a(new q1.b().S(this.f4753e).e0(this.f4750b.f18807b).W(Log.TAG_EMOJI).H(this.f4750b.f18810e).f0(this.f4750b.f18809d).V(this.f4751c).E());
                this.f4756h = true;
            }
            this.f4749a.P(0);
            this.f4752d.d(this.f4749a, 4);
            this.f4754f = 2;
        }
    }

    public t(String str) {
        this.f4754f = 0;
        b0 b0Var = new b0(4);
        this.f4749a = b0Var;
        b0Var.d()[0] = -1;
        this.f4750b = new h0.a();
        this.f4760l = -9223372036854775807L;
        this.f4751c = str;
    }
}
