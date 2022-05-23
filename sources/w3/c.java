package w3;

import c5.a;
import c5.b0;
import com.google.android.exoplayer2.extractor.g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t3.f;
import t3.h;
import t3.l;
import t3.q;

public final class c implements f {
    public static final l f25735q = b.f25734b;
    public h f25741f;
    public boolean f25743h;
    public long f25744i;
    public int f25745j;
    public int f25746k;
    public int f25747l;
    public long f25748m;
    public boolean f25749n;
    public a f25750o;
    public f f25751p;
    public final b0 f25736a = new b0(4);
    public final b0 f25737b = new b0(9);
    public final b0 f25738c = new b0(11);
    public final b0 f25739d = new b0();
    public final d f25740e = new d();
    public int f25742g = 1;

    public static f[] h() {
        return new f[]{new c()};
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f25742g = 1;
            this.f25743h = false;
        } else {
            this.f25742g = 3;
        }
        this.f25745j = 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void d() {
        if (!this.f25749n) {
            this.f25741f.a(new g.b(-9223372036854775807L));
            this.f25749n = true;
        }
    }

    @Override
    public int e(t3.g gVar, q qVar) {
        a.h(this.f25741f);
        while (true) {
            int i10 = this.f25742g;
            if (i10 != 1) {
                if (i10 == 2) {
                    n(gVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    } else if (l(gVar)) {
                        return 0;
                    }
                } else if (!m(gVar)) {
                    return -1;
                }
            } else if (!k(gVar)) {
                return -1;
            }
        }
    }

    @Override
    public void f(h hVar) {
        this.f25741f = hVar;
    }

    public final long g() {
        if (this.f25743h) {
            return this.f25744i + this.f25748m;
        }
        if (this.f25740e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f25748m;
    }

    public final b0 i(t3.g gVar) {
        if (this.f25747l > this.f25739d.b()) {
            b0 b0Var = this.f25739d;
            b0Var.N(new byte[Math.max(b0Var.b() * 2, this.f25747l)], 0);
        } else {
            this.f25739d.P(0);
        }
        this.f25739d.O(this.f25747l);
        gVar.readFully(this.f25739d.d(), 0, this.f25747l);
        return this.f25739d;
    }

    @Override
    public boolean j(t3.g gVar) {
        gVar.q(this.f25736a.d(), 0, 3);
        this.f25736a.P(0);
        if (this.f25736a.G() != 4607062) {
            return false;
        }
        gVar.q(this.f25736a.d(), 0, 2);
        this.f25736a.P(0);
        if ((this.f25736a.J() & 250) != 0) {
            return false;
        }
        gVar.q(this.f25736a.d(), 0, 4);
        this.f25736a.P(0);
        int n10 = this.f25736a.n();
        gVar.m();
        gVar.g(n10);
        gVar.q(this.f25736a.d(), 0, 4);
        this.f25736a.P(0);
        return this.f25736a.n() == 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final boolean k(t3.g gVar) {
        boolean z10 = false;
        if (!gVar.c(this.f25737b.d(), 0, 9, true)) {
            return false;
        }
        this.f25737b.P(0);
        this.f25737b.Q(4);
        int D = this.f25737b.D();
        boolean z11 = (D & 4) != 0;
        if ((D & 1) != 0) {
            z10 = true;
        }
        if (z11 && this.f25750o == null) {
            this.f25750o = new a(this.f25741f.q(8, 1));
        }
        if (z10 && this.f25751p == null) {
            this.f25751p = new f(this.f25741f.q(9, 2));
        }
        this.f25741f.k();
        this.f25745j = (this.f25737b.n() - 9) + 4;
        this.f25742g = 2;
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    public final boolean l(t3.g r10) {
        throw new UnsupportedOperationException("Method not decompiled: w3.c.l(t3.g):boolean");
    }

    public final boolean m(t3.g gVar) {
        if (!gVar.c(this.f25738c.d(), 0, 11, true)) {
            return false;
        }
        this.f25738c.P(0);
        this.f25746k = this.f25738c.D();
        this.f25747l = this.f25738c.G();
        this.f25748m = this.f25738c.G();
        this.f25748m = ((this.f25738c.D() << 24) | this.f25748m) * 1000;
        this.f25738c.Q(3);
        this.f25742g = 4;
        return true;
    }

    public final void n(t3.g gVar) {
        gVar.n(this.f25745j);
        this.f25745j = 0;
        this.f25742g = 3;
    }
}
