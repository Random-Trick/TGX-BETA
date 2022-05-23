package n3;

import a5.v;
import a7.q;
import a7.r;
import a7.t;
import android.os.Looper;
import android.util.SparseArray;
import c5.d;
import c5.l;
import c5.l0;
import c5.n;
import c5.r;
import d5.b0;
import java.io.IOException;
import java.util.List;
import m3.c2;
import m3.o2;
import m3.o3;
import m3.q1;
import m3.r2;
import m3.s2;
import m3.t3;
import m3.y1;
import n3.c;
import o4.k;
import o4.o;
import o4.r0;
import o4.s;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p3.e;
import p3.h;
import q3.p;
import q4.b;
import z6.i;

public class o1 implements n3.a {
    public final a M;
    public r<c> O;
    public s2 P;
    public n Q;
    public boolean R;
    public final d f17636a;
    public final o3.b f17637b;
    public final o3.d f17638c = new o3.d();
    public final SparseArray<c.a> N = new SparseArray<>();

    public static final class a {
        public final o3.b f17639a;
        public q<s.b> f17640b = q.D();
        public a7.r<s.b, o3> f17641c = a7.r.j();
        public s.b f17642d;
        public s.b f17643e;
        public s.b f17644f;

        public a(o3.b bVar) {
            this.f17639a = bVar;
        }

        public static s.b c(s2 s2Var, q<s.b> qVar, s.b bVar, o3.b bVar2) {
            o3 R = s2Var.R();
            int m10 = s2Var.m();
            Object q10 = R.u() ? null : R.q(m10);
            int g10 = (s2Var.h() || R.u()) ? -1 : R.j(m10, bVar2).g(l0.r0(s2Var.V()) - bVar2.q());
            for (int i10 = 0; i10 < qVar.size(); i10++) {
                s.b bVar3 = qVar.get(i10);
                if (i(bVar3, q10, s2Var.h(), s2Var.H(), s2Var.o(), g10)) {
                    return bVar3;
                }
            }
            if (qVar.isEmpty() && bVar != null) {
                if (i(bVar, q10, s2Var.h(), s2Var.H(), s2Var.o(), g10)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean i(s.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f19169a.equals(obj)) {
                return false;
            }
            return (z10 && bVar.f19170b == i10 && bVar.f19171c == i11) || (!z10 && bVar.f19170b == -1 && bVar.f19173e == i12);
        }

        public final void b(r.a<s.b, o3> aVar, s.b bVar, o3 o3Var) {
            if (bVar != null) {
                if (o3Var.f(bVar.f19169a) != -1) {
                    aVar.d(bVar, o3Var);
                    return;
                }
                o3 o3Var2 = this.f17641c.get(bVar);
                if (o3Var2 != null) {
                    aVar.d(bVar, o3Var2);
                }
            }
        }

        public s.b d() {
            return this.f17642d;
        }

        public s.b e() {
            if (this.f17640b.isEmpty()) {
                return null;
            }
            return (s.b) t.c(this.f17640b);
        }

        public o3 f(s.b bVar) {
            return this.f17641c.get(bVar);
        }

        public s.b g() {
            return this.f17643e;
        }

        public s.b h() {
            return this.f17644f;
        }

        public void j(s2 s2Var) {
            this.f17642d = c(s2Var, this.f17640b, this.f17643e, this.f17639a);
        }

        public void k(List<s.b> list, s.b bVar, s2 s2Var) {
            this.f17640b = q.z(list);
            if (!list.isEmpty()) {
                this.f17643e = list.get(0);
                this.f17644f = (s.b) c5.a.e(bVar);
            }
            if (this.f17642d == null) {
                this.f17642d = c(s2Var, this.f17640b, this.f17643e, this.f17639a);
            }
            m(s2Var.R());
        }

        public void l(s2 s2Var) {
            this.f17642d = c(s2Var, this.f17640b, this.f17643e, this.f17639a);
            m(s2Var.R());
        }

        public final void m(o3 o3Var) {
            r.a<s.b, o3> a10 = a7.r.a();
            if (this.f17640b.isEmpty()) {
                b(a10, this.f17643e, o3Var);
                if (!i.a(this.f17644f, this.f17643e)) {
                    b(a10, this.f17644f, o3Var);
                }
                if (!i.a(this.f17642d, this.f17643e) && !i.a(this.f17642d, this.f17644f)) {
                    b(a10, this.f17642d, o3Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f17640b.size(); i10++) {
                    b(a10, this.f17640b.get(i10), o3Var);
                }
                if (!this.f17640b.contains(this.f17642d)) {
                    b(a10, this.f17642d, o3Var);
                }
            }
            this.f17641c = a10.b();
        }
    }

    public o1(d dVar) {
        this.f17636a = (d) c5.a.e(dVar);
        this.O = new c5.r<>(l0.K(), dVar, i1.f17598a);
        o3.b bVar = new o3.b();
        this.f17637b = bVar;
        this.M = new a(bVar);
    }

    public static void J1(c cVar, l lVar) {
    }

    public static void J2(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.n(aVar, str, j10);
        cVar.Y(aVar, str, j11, j10);
        cVar.k(aVar, 2, str, j10);
    }

    public static void L2(c.a aVar, e eVar, c cVar) {
        cVar.k0(aVar, eVar);
        cVar.N(aVar, 2, eVar);
    }

    public static void M2(c.a aVar, e eVar, c cVar) {
        cVar.c(aVar, eVar);
        cVar.m(aVar, 2, eVar);
    }

    public static void N1(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.t(aVar, str, j10);
        cVar.p(aVar, str, j11, j10);
        cVar.k(aVar, 1, str, j10);
    }

    public static void O2(c.a aVar, q1 q1Var, h hVar, c cVar) {
        cVar.s0(aVar, q1Var);
        cVar.L(aVar, q1Var, hVar);
        cVar.v(aVar, 2, q1Var);
    }

    public static void P1(c.a aVar, e eVar, c cVar) {
        cVar.D(aVar, eVar);
        cVar.N(aVar, 1, eVar);
    }

    public static void P2(c.a aVar, b0 b0Var, c cVar) {
        cVar.w(aVar, b0Var);
        cVar.I(aVar, b0Var.f6207a, b0Var.f6208b, b0Var.f6209c, b0Var.M);
    }

    public static void Q1(c.a aVar, e eVar, c cVar) {
        cVar.U(aVar, eVar);
        cVar.m(aVar, 1, eVar);
    }

    public static void R1(c.a aVar, q1 q1Var, h hVar, c cVar) {
        cVar.o0(aVar, q1Var);
        cVar.t0(aVar, q1Var, hVar);
        cVar.v(aVar, 1, q1Var);
    }

    public void S2(s2 s2Var, c cVar, l lVar) {
        cVar.q(s2Var, new c.b(lVar, this.N));
    }

    public static void e2(c.a aVar, int i10, c cVar) {
        cVar.e0(aVar);
        cVar.c0(aVar, i10);
    }

    public static void i2(c.a aVar, boolean z10, c cVar) {
        cVar.d(aVar, z10);
        cVar.i(aVar, z10);
    }

    public static void y2(c.a aVar, int i10, s2.e eVar, s2.e eVar2, c cVar) {
        cVar.b(aVar, i10);
        cVar.O(aVar, eVar, eVar2, i10);
    }

    @Override
    public final void A(int i10, s.b bVar, final k kVar, final o oVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1001, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).l0(c.a.this, kVar, oVar);
            }
        });
    }

    @Override
    public void B(boolean z10) {
    }

    public final c.a B1() {
        return D1(this.M.d());
    }

    @Override
    public final void C(int i10, s.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1026, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).n0(c.a.this);
            }
        });
    }

    @RequiresNonNull({"player"})
    public final c.a C1(o3 o3Var, int i10, s.b bVar) {
        long j10;
        s.b bVar2 = o3Var.u() ? null : bVar;
        long d10 = this.f17636a.d();
        boolean z10 = true;
        boolean z11 = o3Var.equals(this.P.R()) && i10 == this.P.I();
        long j11 = 0;
        if (bVar2 != null && bVar2.b()) {
            if (!(z11 && this.P.H() == bVar2.f19170b && this.P.o() == bVar2.f19171c)) {
                z10 = false;
            }
            if (z10) {
                j11 = this.P.V();
            }
        } else if (z11) {
            j10 = this.P.B();
            return new c.a(d10, o3Var, i10, bVar2, j10, this.P.R(), this.P.I(), this.M.d(), this.P.V(), this.P.i());
        } else if (!o3Var.u()) {
            j11 = o3Var.r(i10, this.f17638c).d();
        }
        j10 = j11;
        return new c.a(d10, o3Var, i10, bVar2, j10, this.P.R(), this.P.I(), this.M.d(), this.P.V(), this.P.i());
    }

    @Override
    public void D(int i10) {
    }

    public final c.a D1(s.b bVar) {
        c5.a.e(this.P);
        o3 f10 = bVar == null ? null : this.M.f(bVar);
        if (bVar != null && f10 != null) {
            return C1(f10, f10.l(bVar.f19169a, this.f17637b).f16862c, bVar);
        }
        int I = this.P.I();
        o3 R = this.P.R();
        if (!(I < R.t())) {
            R = o3.f16858a;
        }
        return C1(R, I, null);
    }

    @Override
    public final void E(int i10, s.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1023, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).Q(c.a.this);
            }
        });
    }

    public final c.a E1() {
        return D1(this.M.e());
    }

    @Override
    public final void F(int i10, s.b bVar, final int i11) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1022, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.e2(c.a.this, i11, (c) obj);
            }
        });
    }

    public final c.a F1(int i10, s.b bVar) {
        c5.a.e(this.P);
        boolean z10 = true;
        if (bVar != null) {
            if (this.M.f(bVar) == null) {
                z10 = false;
            }
            if (z10) {
                return D1(bVar);
            }
            return C1(o3.f16858a, i10, bVar);
        }
        o3 R = this.P.R();
        if (i10 >= R.t()) {
            z10 = false;
        }
        if (!z10) {
            R = o3.f16858a;
        }
        return C1(R, i10, null);
    }

    @Override
    public final void G(int i10, s.b bVar, final k kVar, final o oVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1002, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).e(c.a.this, kVar, oVar);
            }
        });
    }

    public final c.a G1() {
        return D1(this.M.g());
    }

    @Override
    public final void H(final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 3, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.i2(c.a.this, z10, (c) obj);
            }
        });
    }

    public final c.a H1() {
        return D1(this.M.h());
    }

    @Override
    public final void I() {
        final c.a B1 = B1();
        U2(B1, -1, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).H(c.a.this);
            }
        });
    }

    public final c.a I1(o2 o2Var) {
        o4.q qVar;
        if (!(o2Var instanceof m3.q) || (qVar = ((m3.q) o2Var).R) == null) {
            return B1();
        }
        return D1(new s.b(qVar));
    }

    @Override
    public final void J(int i10, s.b bVar, final Exception exc) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, Log.TAG_CAMERA, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).d0(c.a.this, exc);
            }
        });
    }

    @Override
    public void K(final t3 t3Var) {
        final c.a B1 = B1();
        U2(B1, 2, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).C(c.a.this, t3Var);
            }
        });
    }

    @Override
    public final void L(final s2.e eVar, final s2.e eVar2, final int i10) {
        if (i10 == 1) {
            this.R = false;
        }
        this.M.j((s2) c5.a.e(this.P));
        final c.a B1 = B1();
        U2(B1, 11, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.y2(c.a.this, i10, eVar, eVar2, (c) obj);
            }
        });
    }

    @Override
    public final void M(final float f10) {
        final c.a H1 = H1();
        U2(H1, 22, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).q0(c.a.this, f10);
            }
        });
    }

    @Override
    public final void N(final int i10) {
        final c.a B1 = B1();
        U2(B1, 4, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).f0(c.a.this, i10);
            }
        });
    }

    @Override
    public final void O(final int i10, final long j10, final long j11) {
        final c.a E1 = E1();
        U2(E1, 1006, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).r0(c.a.this, i10, j10, j11);
            }
        });
    }

    @Override
    public final void P() {
        if (!this.R) {
            final c.a B1 = B1();
            this.R = true;
            U2(B1, -1, new r.a() {
                @Override
                public final void a(Object obj) {
                    ((c) obj).Z(c.a.this);
                }
            });
        }
    }

    @Override
    public final void Q(final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 9, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).m0(c.a.this, z10);
            }
        });
    }

    @Override
    public void R(final s2 s2Var, Looper looper) {
        c5.a.f(this.P == null || this.M.f17640b.isEmpty());
        this.P = (s2) c5.a.e(s2Var);
        this.Q = this.f17636a.b(looper, null);
        this.O = this.O.e(looper, new r.b() {
            @Override
            public final void a(Object obj, l lVar) {
                o1.this.S2(s2Var, (c) obj, lVar);
            }
        });
    }

    @Override
    public final void S(o3 o3Var, final int i10) {
        this.M.l((s2) c5.a.e(this.P));
        final c.a B1 = B1();
        U2(B1, 0, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).M(c.a.this, i10);
            }
        });
    }

    @Override
    public void T(final int i10, final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 30, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).g0(c.a.this, i10, z10);
            }
        });
    }

    public final void T2() {
        final c.a B1 = B1();
        U2(B1, 1028, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).W(c.a.this);
            }
        });
        this.O.j();
    }

    @Override
    public final void U(final boolean z10, final int i10) {
        final c.a B1 = B1();
        U2(B1, -1, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).f(c.a.this, z10, i10);
            }
        });
    }

    public final void U2(c.a aVar, int i10, r.a<c> aVar2) {
        this.N.put(i10, aVar);
        this.O.l(i10, aVar2);
    }

    @Override
    public void V(final c2 c2Var) {
        final c.a B1 = B1();
        U2(B1, 14, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).P(c.a.this, c2Var);
            }
        });
    }

    @Override
    public final void W(List<s.b> list, s.b bVar) {
        this.M.k(list, bVar, (s2) c5.a.e(this.P));
    }

    @Override
    public final void X(final int i10) {
        final c.a B1 = B1();
        U2(B1, 8, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).S(c.a.this, i10);
            }
        });
    }

    @Override
    public final void Y(final o3.e eVar) {
        final c.a H1 = H1();
        U2(H1, 20, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).u0(c.a.this, eVar);
            }
        });
    }

    @Override
    public final void Z(int i10, s.b bVar, final o oVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1004, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).X(c.a.this, oVar);
            }
        });
    }

    @Override
    public void a() {
        ((n) c5.a.h(this.Q)).c(new Runnable() {
            @Override
            public final void run() {
                o1.this.T2();
            }
        });
    }

    @Override
    public final void a0(int i10, s.b bVar, final k kVar, final o oVar, final IOException iOException, final boolean z10) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1003, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).i0(c.a.this, kVar, oVar, iOException, z10);
            }
        });
    }

    @Override
    public final void b(final boolean z10) {
        final c.a H1 = H1();
        U2(H1, 23, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).A(c.a.this, z10);
            }
        });
    }

    @Override
    public final void b0(int i10, s.b bVar, final k kVar, final o oVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1000, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).b0(c.a.this, kVar, oVar);
            }
        });
    }

    @Override
    public final void c(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1014, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).h0(c.a.this, exc);
            }
        });
    }

    @Override
    public final void c0(final boolean z10, final int i10) {
        final c.a B1 = B1();
        U2(B1, 5, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).u(c.a.this, z10, i10);
            }
        });
    }

    @Override
    public final void d(final e eVar) {
        final c.a H1 = H1();
        U2(H1, 1015, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.M2(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override
    public final void d0(final y1 y1Var, final int i10) {
        final c.a B1 = B1();
        U2(B1, 1, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).K(c.a.this, y1Var, i10);
            }
        });
    }

    @Override
    public final void e(final String str) {
        final c.a H1 = H1();
        U2(H1, 1019, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).h(c.a.this, str);
            }
        });
    }

    @Override
    public void e0(s2 s2Var, s2.c cVar) {
    }

    @Override
    public final void f(final String str, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1016, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.J2(c.a.this, str, j11, j10, (c) obj);
            }
        });
    }

    @Override
    public void f0(c cVar) {
        c5.a.e(cVar);
        this.O.c(cVar);
    }

    @Override
    public final void g(final r2 r2Var) {
        final c.a B1 = B1();
        U2(B1, 12, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).y(c.a.this, r2Var);
            }
        });
    }

    @Override
    public final void g0(int i10, s.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1025, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).j(c.a.this);
            }
        });
    }

    @Override
    public final void h(final String str) {
        final c.a H1 = H1();
        U2(H1, 1012, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).j0(c.a.this, str);
            }
        });
    }

    @Override
    public final void h0(final o2 o2Var) {
        final c.a I1 = I1(o2Var);
        U2(I1, 10, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).s(c.a.this, o2Var);
            }
        });
    }

    @Override
    public final void i(final String str, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1008, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.N1(c.a.this, str, j11, j10, (c) obj);
            }
        });
    }

    @Override
    public final void i0(final int i10, final int i11) {
        final c.a H1 = H1();
        U2(H1, 24, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).B(c.a.this, i10, i11);
            }
        });
    }

    @Override
    public final void j(final e eVar) {
        final c.a G1 = G1();
        U2(G1, 1013, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.P1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override
    public final void j0(final r0 r0Var, final v vVar) {
        final c.a B1 = B1();
        U2(B1, 2, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).z(c.a.this, r0Var, vVar);
            }
        });
    }

    @Override
    public final void k(final q1 q1Var, final h hVar) {
        final c.a H1 = H1();
        U2(H1, 1009, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.R1(c.a.this, q1Var, hVar, (c) obj);
            }
        });
    }

    @Override
    public final void k0(int i10, s.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1027, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).r(c.a.this);
            }
        });
    }

    @Override
    public final void l(final e eVar) {
        final c.a G1 = G1();
        U2(G1, 1020, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.L2(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override
    public void l0(int i10, s.b bVar) {
        p.a(this, i10, bVar);
    }

    @Override
    public final void m(final int i10, final long j10) {
        final c.a G1 = G1();
        U2(G1, 1018, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).x(c.a.this, i10, j10);
            }
        });
    }

    @Override
    public void m0(final s2.b bVar) {
        final c.a B1 = B1();
        U2(B1, 13, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).o(c.a.this, bVar);
            }
        });
    }

    @Override
    public final void n(final q1 q1Var, final h hVar) {
        final c.a H1 = H1();
        U2(H1, 1017, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.O2(c.a.this, q1Var, hVar, (c) obj);
            }
        });
    }

    @Override
    public void n0(final m3.o oVar) {
        final c.a B1 = B1();
        U2(B1, 29, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).V(c.a.this, oVar);
            }
        });
    }

    @Override
    public final void o(final f4.a aVar) {
        final c.a B1 = B1();
        U2(B1, 28, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).R(c.a.this, aVar);
            }
        });
    }

    @Override
    public void o0(final o2 o2Var) {
        final c.a I1 = I1(o2Var);
        U2(I1, 10, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).a(c.a.this, o2Var);
            }
        });
    }

    @Override
    public final void p(final Object obj, final long j10) {
        final c.a H1 = H1();
        U2(H1, 26, new r.a() {
            @Override
            public final void a(Object obj2) {
                ((c) obj2).l(c.a.this, obj, j10);
            }
        });
    }

    @Override
    public void p0(final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 7, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).T(c.a.this, z10);
            }
        });
    }

    @Override
    public void q() {
    }

    @Override
    public void r(final List<b> list) {
        final c.a B1 = B1();
        U2(B1, 27, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).E(c.a.this, list);
            }
        });
    }

    @Override
    public final void s(final long j10) {
        final c.a H1 = H1();
        U2(H1, 1010, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).p0(c.a.this, j10);
            }
        });
    }

    @Override
    public final void t(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1029, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).G(c.a.this, exc);
            }
        });
    }

    @Override
    public final void u(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1030, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).a0(c.a.this, exc);
            }
        });
    }

    @Override
    public final void v(final e eVar) {
        final c.a H1 = H1();
        U2(H1, 1007, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.Q1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override
    public final void w(final int i10, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1011, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).J(c.a.this, i10, j10, j11);
            }
        });
    }

    @Override
    public final void x(final b0 b0Var) {
        final c.a H1 = H1();
        U2(H1, 25, new r.a() {
            @Override
            public final void a(Object obj) {
                o1.P2(c.a.this, b0Var, (c) obj);
            }
        });
    }

    @Override
    public final void y(final long j10, final int i10) {
        final c.a G1 = G1();
        U2(G1, 1021, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).F(c.a.this, j10, i10);
            }
        });
    }

    @Override
    public final void z(final int i10) {
        final c.a B1 = B1();
        U2(B1, 6, new r.a() {
            @Override
            public final void a(Object obj) {
                ((c) obj).g(c.a.this, i10);
            }
        });
    }
}
