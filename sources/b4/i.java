package b4;

import c5.b0;
import c5.l0;
import com.google.android.exoplayer2.extractor.g;
import m3.q1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t3.g;
import t3.h;
import t3.q;
import t3.t;

public abstract class i {
    public t f3797b;
    public h f3798c;
    public g f3799d;
    public long f3800e;
    public long f3801f;
    public long f3802g;
    public int f3803h;
    public int f3804i;
    public long f3806k;
    public boolean f3807l;
    public boolean f3808m;
    public final e f3796a = new e();
    public b f3805j = new b();

    public static class b {
        public q1 f3809a;
        public g f3810b;
    }

    public static final class c implements g {
        public c() {
        }

        @Override
        public long a(g gVar) {
            return -1L;
        }

        @Override
        public com.google.android.exoplayer2.extractor.g b() {
            return new g.b(-9223372036854775807L);
        }

        @Override
        public void c(long j10) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    public final void a() {
        c5.a.h(this.f3797b);
        l0.j(this.f3798c);
    }

    public long b(long j10) {
        return (j10 * 1000000) / this.f3804i;
    }

    public long c(long j10) {
        return (this.f3804i * j10) / 1000000;
    }

    public void d(h hVar, t tVar) {
        this.f3798c = hVar;
        this.f3797b = tVar;
        l(true);
    }

    public void e(long j10) {
        this.f3802g = j10;
    }

    public abstract long f(b0 b0Var);

    public final int g(t3.g gVar, q qVar) {
        a();
        int i10 = this.f3803h;
        if (i10 == 0) {
            return j(gVar);
        }
        if (i10 == 1) {
            gVar.n((int) this.f3801f);
            this.f3803h = 2;
            return 0;
        } else if (i10 == 2) {
            l0.j(this.f3799d);
            return k(gVar, qVar);
        } else if (i10 == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean h(b0 b0Var, long j10, b bVar);

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    public final boolean i(t3.g gVar) {
        while (this.f3796a.d(gVar)) {
            this.f3806k = gVar.r() - this.f3801f;
            if (!h(this.f3796a.c(), this.f3801f, this.f3805j)) {
                return true;
            }
            this.f3801f = gVar.r();
        }
        this.f3803h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    public final int j(t3.g gVar) {
        if (!i(gVar)) {
            return -1;
        }
        q1 q1Var = this.f3805j.f3809a;
        this.f3804i = q1Var.f16909i0;
        if (!this.f3808m) {
            this.f3797b.a(q1Var);
            this.f3808m = true;
        }
        g gVar2 = this.f3805j.f3810b;
        if (gVar2 != null) {
            this.f3799d = gVar2;
        } else if (gVar.a() == -1) {
            this.f3799d = new c();
        } else {
            f b10 = this.f3796a.b();
            this.f3799d = new b4.a(this, this.f3801f, gVar.a(), b10.f3790h + b10.f3791i, b10.f3785c, (b10.f3784b & 4) != 0);
        }
        this.f3803h = 2;
        this.f3796a.f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    public final int k(t3.g gVar, q qVar) {
        long a10 = this.f3799d.a(gVar);
        if (a10 >= 0) {
            qVar.f22899a = a10;
            return 1;
        }
        if (a10 < -1) {
            e(-(a10 + 2));
        }
        if (!this.f3807l) {
            this.f3798c.a((com.google.android.exoplayer2.extractor.g) c5.a.h(this.f3799d.b()));
            this.f3807l = true;
        }
        if (this.f3806k > 0 || this.f3796a.d(gVar)) {
            this.f3806k = 0L;
            b0 c10 = this.f3796a.c();
            long f10 = f(c10);
            if (f10 >= 0) {
                long j10 = this.f3802g;
                if (j10 + f10 >= this.f3800e) {
                    long b10 = b(j10);
                    this.f3797b.d(c10, c10.f());
                    this.f3797b.f(b10, 1, c10.f(), 0, null);
                    this.f3800e = -1L;
                }
            }
            this.f3802g += f10;
            return 0;
        }
        this.f3803h = 3;
        return -1;
    }

    public void l(boolean z10) {
        if (z10) {
            this.f3805j = new b();
            this.f3801f = 0L;
            this.f3803h = 0;
        } else {
            this.f3803h = 1;
        }
        this.f3800e = -1L;
        this.f3802g = 0L;
    }

    public final void m(long j10, long j11) {
        this.f3796a.e();
        if (j10 == 0) {
            l(!this.f3807l);
        } else if (this.f3803h != 0) {
            this.f3800e = c(j11);
            ((g) l0.j(this.f3799d)).c(this.f3800e);
            this.f3803h = 2;
        }
    }
}
