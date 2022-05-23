package o4;

import android.os.Looper;
import b5.b0;
import b5.i0;
import b5.k;
import b5.w;
import m3.o3;
import m3.y1;
import n3.p1;
import o4.d0;
import o4.e0;
import o4.s;
import o4.z;
import org.thunderdog.challegram.Log;
import q3.y;
import t3.d;
import t3.l;

public final class e0 extends o4.a implements d0.b {
    public final y1 f19035h;
    public final y1.h f19036i;
    public final k.a f19037j;
    public final z.a f19038k;
    public final y f19039l;
    public final b0 f19040m;
    public final int f19041n;
    public boolean f19042o;
    public long f19043p;
    public boolean f19044q;
    public boolean f19045r;
    public i0 f19046s;

    public class a extends i {
        public a(e0 e0Var, o3 o3Var) {
            super(o3Var);
        }

        @Override
        public o3.b k(int i10, o3.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.O = true;
            return bVar;
        }

        @Override
        public o3.d s(int i10, o3.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.U = true;
            return dVar;
        }
    }

    public static final class b implements s.a {
        public final k.a f19047a;
        public z.a f19048b;
        public q3.b0 f19049c;
        public b0 f19050d;
        public int f19051e;
        public String f19052f;
        public Object f19053g;

        public b(k.a aVar) {
            this(aVar, new d());
        }

        public static z c(l lVar, p1 p1Var) {
            return new o4.b(lVar);
        }

        public e0 b(y1 y1Var) {
            c5.a.e(y1Var.f17043b);
            y1.h hVar = y1Var.f17043b;
            boolean z10 = true;
            boolean z11 = hVar.f17098h == null && this.f19053g != null;
            if (hVar.f17095e != null || this.f19052f == null) {
                z10 = false;
            }
            if (z11 && z10) {
                y1Var = y1Var.b().d(this.f19053g).b(this.f19052f).a();
            } else if (z11) {
                y1Var = y1Var.b().d(this.f19053g).a();
            } else if (z10) {
                y1Var = y1Var.b().b(this.f19052f).a();
            }
            y1 y1Var2 = y1Var;
            return new e0(y1Var2, this.f19047a, this.f19048b, this.f19049c.a(y1Var2), this.f19050d, this.f19051e, null);
        }

        public b(k.a aVar, final l lVar) {
            this(aVar, new z.a() {
                @Override
                public final z a(p1 p1Var) {
                    z c10;
                    c10 = e0.b.c(l.this, p1Var);
                    return c10;
                }
            });
        }

        public b(k.a aVar, z.a aVar2) {
            this(aVar, aVar2, new q3.l(), new w(), Log.TAG_NDK);
        }

        public b(k.a aVar, z.a aVar2, q3.b0 b0Var, b0 b0Var2, int i10) {
            this.f19047a = aVar;
            this.f19048b = aVar2;
            this.f19049c = b0Var;
            this.f19050d = b0Var2;
            this.f19051e = i10;
        }
    }

    public e0(y1 y1Var, k.a aVar, z.a aVar2, y yVar, b0 b0Var, int i10, a aVar3) {
        this(y1Var, aVar, aVar2, yVar, b0Var, i10);
    }

    public final void A() {
        o3 m0Var = new m0(this.f19043p, this.f19044q, false, this.f19045r, null, this.f19035h);
        if (this.f19042o) {
            m0Var = new a(this, m0Var);
        }
        y(m0Var);
    }

    @Override
    public p a(s.b bVar, b5.b bVar2, long j10) {
        k a10 = this.f19037j.a();
        i0 i0Var = this.f19046s;
        if (i0Var != null) {
            a10.i(i0Var);
        }
        return new d0(this.f19036i.f17091a, a10, this.f19038k.a(v()), this.f19039l, q(bVar), this.f19040m, s(bVar), this, bVar2, this.f19036i.f17095e, this.f19041n);
    }

    @Override
    public void d(p pVar) {
        ((d0) pVar).c0();
    }

    @Override
    public void g(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f19043p;
        }
        if (this.f19042o || this.f19043p != j10 || this.f19044q != z10 || this.f19045r != z11) {
            this.f19043p = j10;
            this.f19044q = z10;
            this.f19045r = z11;
            this.f19042o = false;
            A();
        }
    }

    @Override
    public y1 h() {
        return this.f19035h;
    }

    @Override
    public void j() {
    }

    @Override
    public void x(i0 i0Var) {
        this.f19046s = i0Var;
        this.f19039l.b();
        this.f19039l.c((Looper) c5.a.e(Looper.myLooper()), v());
        A();
    }

    @Override
    public void z() {
        this.f19039l.a();
    }

    public e0(y1 y1Var, k.a aVar, z.a aVar2, y yVar, b0 b0Var, int i10) {
        this.f19036i = (y1.h) c5.a.e(y1Var.f17043b);
        this.f19035h = y1Var;
        this.f19037j = aVar;
        this.f19038k = aVar2;
        this.f19039l = yVar;
        this.f19040m = b0Var;
        this.f19041n = i10;
        this.f19042o = true;
        this.f19043p = -9223372036854775807L;
    }
}
