package x3;

import a4.k;
import c5.b0;
import com.google.android.exoplayer2.extractor.g;
import f4.a;
import l4.b;
import m3.q1;
import org.thunderdog.challegram.Log;
import t3.f;
import t3.g;
import t3.h;
import t3.q;

public final class a implements f {
    public h f25962b;
    public int f25963c;
    public int f25964d;
    public int f25965e;
    public b f25967g;
    public g f25968h;
    public c f25969i;
    public k f25970j;
    public final b0 f25961a = new b0(6);
    public long f25966f = -1;

    public static b g(String str, long j10) {
        b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    @Override
    public void a() {
        k kVar = this.f25970j;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f25963c = 0;
            this.f25970j = null;
        } else if (this.f25963c == 5) {
            ((k) c5.a.e(this.f25970j)).b(j10, j11);
        }
    }

    public final void c(g gVar) {
        this.f25961a.L(2);
        gVar.q(this.f25961a.d(), 0, 2);
        gVar.g(this.f25961a.J() - 2);
    }

    public final void d() {
        h(new a.b[0]);
        ((h) c5.a.e(this.f25962b)).k();
        this.f25962b.a(new g.b(-9223372036854775807L));
        this.f25963c = 6;
    }

    @Override
    public int e(t3.g gVar, q qVar) {
        int i10 = this.f25963c;
        if (i10 == 0) {
            k(gVar);
            return 0;
        } else if (i10 == 1) {
            m(gVar);
            return 0;
        } else if (i10 == 2) {
            l(gVar);
            return 0;
        } else if (i10 == 4) {
            long r10 = gVar.r();
            long j10 = this.f25966f;
            if (r10 != j10) {
                qVar.f22899a = j10;
                return 1;
            }
            n(gVar);
            return 0;
        } else if (i10 == 5) {
            if (this.f25969i == null || gVar != this.f25968h) {
                this.f25968h = gVar;
                this.f25969i = new c(gVar, this.f25966f);
            }
            int e10 = ((k) c5.a.e(this.f25970j)).e(this.f25969i, qVar);
            if (e10 == 1) {
                qVar.f22899a += this.f25966f;
            }
            return e10;
        } else if (i10 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void f(h hVar) {
        this.f25962b = hVar;
    }

    public final void h(a.b... bVarArr) {
        ((h) c5.a.e(this.f25962b)).q(Log.TAG_CAMERA, 4).a(new q1.b().K("image/jpeg").X(new f4.a(bVarArr)).E());
    }

    public final int i(t3.g gVar) {
        this.f25961a.L(2);
        gVar.q(this.f25961a.d(), 0, 2);
        return this.f25961a.J();
    }

    @Override
    public boolean j(t3.g gVar) {
        if (i(gVar) != 65496) {
            return false;
        }
        int i10 = i(gVar);
        this.f25964d = i10;
        if (i10 == 65504) {
            c(gVar);
            this.f25964d = i(gVar);
        }
        if (this.f25964d != 65505) {
            return false;
        }
        gVar.g(2);
        this.f25961a.L(6);
        gVar.q(this.f25961a.d(), 0, 6);
        return this.f25961a.F() == 1165519206 && this.f25961a.J() == 0;
    }

    public final void k(t3.g gVar) {
        this.f25961a.L(2);
        gVar.readFully(this.f25961a.d(), 0, 2);
        int J = this.f25961a.J();
        this.f25964d = J;
        if (J == 65498) {
            if (this.f25966f != -1) {
                this.f25963c = 4;
            } else {
                d();
            }
        } else if ((J < 65488 || J > 65497) && J != 65281) {
            this.f25963c = 1;
        }
    }

    public final void l(t3.g gVar) {
        String x10;
        if (this.f25964d == 65505) {
            b0 b0Var = new b0(this.f25965e);
            gVar.readFully(b0Var.d(), 0, this.f25965e);
            if (this.f25967g == null && "http://ns.adobe.com/xap/1.0/".equals(b0Var.x()) && (x10 = b0Var.x()) != null) {
                b g10 = g(x10, gVar.a());
                this.f25967g = g10;
                if (g10 != null) {
                    this.f25966f = g10.M;
                }
            }
        } else {
            gVar.n(this.f25965e);
        }
        this.f25963c = 0;
    }

    public final void m(t3.g gVar) {
        this.f25961a.L(2);
        gVar.readFully(this.f25961a.d(), 0, 2);
        this.f25965e = this.f25961a.J() - 2;
        this.f25963c = 2;
    }

    public final void n(t3.g gVar) {
        if (!gVar.e(this.f25961a.d(), 0, 1, true)) {
            d();
            return;
        }
        gVar.m();
        if (this.f25970j == null) {
            this.f25970j = new k();
        }
        c cVar = new c(gVar, this.f25966f);
        this.f25969i = cVar;
        if (this.f25970j.j(cVar)) {
            this.f25970j.f(new d(this.f25966f, (h) c5.a.e(this.f25962b)));
            o();
            return;
        }
        d();
    }

    public final void o() {
        h((a.b) c5.a.e(this.f25967g));
        this.f25963c = 5;
    }
}
