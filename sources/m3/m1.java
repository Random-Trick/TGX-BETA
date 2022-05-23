package m3;

import a5.b0;
import a5.c0;
import a5.r;
import a7.p0;
import a7.q;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import c5.n;
import d.j;
import f4.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.b3;
import m3.j2;
import m3.l;
import m3.o3;
import m3.w2;
import m3.y1;
import n3.p1;
import o4.j0;
import o4.l0;
import o4.p;
import o4.r0;
import o4.s;
import q3.o;
import q4.m;

public final class m1 implements Handler.Callback, p.a, b0.a, j2.d, l.a, w2.a {
    public final b0 M;
    public final c0 N;
    public final w1 O;
    public final b5.e P;
    public final n Q;
    public final HandlerThread R;
    public final Looper S;
    public final o3.d T;
    public final o3.b U;
    public final long V;
    public final boolean W;
    public final l X;
    public final ArrayList<d> Y;
    public final c5.d Z;
    public final b3[] f16783a;
    public final f f16784a0;
    public final Set<b3> f16785b;
    public final g2 f16786b0;
    public final d3[] f16787c;
    public final j2 f16788c0;
    public final v1 f16789d0;
    public final long f16790e0;
    public g3 f16791f0;
    public p2 f16792g0;
    public e f16793h0;
    public boolean f16794i0;
    public boolean f16795j0;
    public boolean f16796k0;
    public boolean f16797l0;
    public boolean f16798m0;
    public int f16799n0;
    public boolean f16800o0;
    public boolean f16801p0;
    public boolean f16802q0;
    public boolean f16803r0;
    public int f16804s0;
    public h f16805t0;
    public long f16806u0;
    public int f16807v0;
    public boolean f16808w0;
    public q f16809x0;
    public long f16810y0;
    public long f16811z0 = -9223372036854775807L;

    public class a implements b3.a {
        public a() {
        }

        @Override
        public void a() {
            m1.this.Q.f(2);
        }

        @Override
        public void b(long j10) {
            if (j10 >= 2000) {
                m1.this.f16802q0 = true;
            }
        }
    }

    public static final class b {
        public final List<j2.c> f16813a;
        public final l0 f16814b;
        public final int f16815c;
        public final long f16816d;

        public b(List list, l0 l0Var, int i10, long j10, a aVar) {
            this(list, l0Var, i10, j10);
        }

        public b(List<j2.c> list, l0 l0Var, int i10, long j10) {
            this.f16813a = list;
            this.f16814b = l0Var;
            this.f16815c = i10;
            this.f16816d = j10;
        }
    }

    public static class c {
        public final int f16817a;
        public final int f16818b;
        public final int f16819c;
        public final l0 f16820d;

        public c(int i10, int i11, int i12, l0 l0Var) {
            this.f16817a = i10;
            this.f16818b = i11;
            this.f16819c = i12;
            this.f16820d = l0Var;
        }
    }

    public static final class d implements Comparable<d> {
        public Object M;
        public final w2 f16821a;
        public int f16822b;
        public long f16823c;

        public d(w2 w2Var) {
            this.f16821a = w2Var;
        }

        public int compareTo(d dVar) {
            Object obj = this.M;
            if ((obj == null) != (dVar.M == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f16822b - dVar.f16822b;
            return i10 != 0 ? i10 : c5.l0.n(this.f16823c, dVar.f16823c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f16822b = i10;
            this.f16823c = j10;
            this.M = obj;
        }
    }

    public static final class e {
        public boolean f16824a;
        public p2 f16825b;
        public int f16826c;
        public boolean f16827d;
        public int f16828e;
        public boolean f16829f;
        public int f16830g;

        public e(p2 p2Var) {
            this.f16825b = p2Var;
        }

        public void b(int i10) {
            this.f16824a |= i10 > 0;
            this.f16826c += i10;
        }

        public void c(int i10) {
            this.f16824a = true;
            this.f16829f = true;
            this.f16830g = i10;
        }

        public void d(p2 p2Var) {
            this.f16824a |= this.f16825b != p2Var;
            this.f16825b = p2Var;
        }

        public void e(int i10) {
            boolean z10 = true;
            if (!this.f16827d || this.f16828e == 5) {
                this.f16824a = true;
                this.f16827d = true;
                this.f16828e = i10;
                return;
            }
            if (i10 != 5) {
                z10 = false;
            }
            c5.a.a(z10);
        }
    }

    public interface f {
        void a(e eVar);
    }

    public static final class g {
        public final s.b f16831a;
        public final long f16832b;
        public final long f16833c;
        public final boolean f16834d;
        public final boolean f16835e;
        public final boolean f16836f;

        public g(s.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f16831a = bVar;
            this.f16832b = j10;
            this.f16833c = j11;
            this.f16834d = z10;
            this.f16835e = z11;
            this.f16836f = z12;
        }
    }

    public static final class h {
        public final o3 f16837a;
        public final int f16838b;
        public final long f16839c;

        public h(o3 o3Var, int i10, long j10) {
            this.f16837a = o3Var;
            this.f16838b = i10;
            this.f16839c = j10;
        }
    }

    public m1(b3[] b3VarArr, b0 b0Var, c0 c0Var, w1 w1Var, b5.e eVar, int i10, boolean z10, n3.a aVar, g3 g3Var, v1 v1Var, long j10, boolean z11, Looper looper, c5.d dVar, f fVar, p1 p1Var) {
        this.f16784a0 = fVar;
        this.f16783a = b3VarArr;
        this.M = b0Var;
        this.N = c0Var;
        this.O = w1Var;
        this.P = eVar;
        this.f16799n0 = i10;
        this.f16800o0 = z10;
        this.f16791f0 = g3Var;
        this.f16789d0 = v1Var;
        this.f16790e0 = j10;
        this.f16810y0 = j10;
        this.f16795j0 = z11;
        this.Z = dVar;
        this.V = w1Var.d();
        this.W = w1Var.b();
        p2 k10 = p2.k(c0Var);
        this.f16792g0 = k10;
        this.f16793h0 = new e(k10);
        this.f16787c = new d3[b3VarArr.length];
        for (int i11 = 0; i11 < b3VarArr.length; i11++) {
            b3VarArr[i11].n(i11, p1Var);
            this.f16787c[i11] = b3VarArr[i11].o();
        }
        this.X = new l(this, dVar);
        this.Y = new ArrayList<>();
        this.f16785b = p0.h();
        this.T = new o3.d();
        this.U = new o3.b();
        b0Var.b(this, eVar);
        this.f16808w0 = true;
        Handler handler = new Handler(looper);
        this.f16786b0 = new g2(aVar, handler);
        this.f16788c0 = new j2(this, aVar, handler, p1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.R = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.S = looper2;
        this.Q = dVar.b(looper2, this);
    }

    public static boolean N(boolean z10, s.b bVar, long j10, s.b bVar2, o3.b bVar3, long j11) {
        if (z10 || j10 != j11 || !bVar.f19169a.equals(bVar2.f19169a)) {
            return false;
        }
        return (!bVar.b() || !bVar3.t(bVar.f19170b)) ? bVar2.b() && bVar3.t(bVar2.f19170b) : (bVar3.k(bVar.f19170b, bVar.f19171c) == 4 || bVar3.k(bVar.f19170b, bVar.f19171c) == 2) ? false : true;
    }

    public static boolean P(b3 b3Var) {
        return b3Var.i() != 0;
    }

    public static boolean R(p2 p2Var, o3.b bVar) {
        s.b bVar2 = p2Var.f16876b;
        o3 o3Var = p2Var.f16875a;
        return o3Var.u() || o3Var.l(bVar2.f19169a, bVar).O;
    }

    public Boolean S() {
        return Boolean.valueOf(this.f16794i0);
    }

    public void T(w2 w2Var) {
        try {
            m(w2Var);
        } catch (q e10) {
            c5.s.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public static void u0(o3 o3Var, d dVar, o3.d dVar2, o3.b bVar) {
        int i10 = o3Var.r(o3Var.l(dVar.M, bVar).f16862c, dVar2).Y;
        Object obj = o3Var.k(i10, bVar, true).f16861b;
        long j10 = bVar.M;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean v0(d dVar, o3 o3Var, o3 o3Var2, int i10, boolean z10, o3.d dVar2, o3.b bVar) {
        Object obj = dVar.M;
        if (obj == null) {
            Pair<Object, Long> y02 = y0(o3Var, new h(dVar.f16821a.h(), dVar.f16821a.d(), dVar.f16821a.f() == Long.MIN_VALUE ? -9223372036854775807L : c5.l0.r0(dVar.f16821a.f())), false, i10, z10, dVar2, bVar);
            if (y02 == null) {
                return false;
            }
            dVar.b(o3Var.f(y02.first), ((Long) y02.second).longValue(), y02.first);
            if (dVar.f16821a.f() == Long.MIN_VALUE) {
                u0(o3Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int f10 = o3Var.f(obj);
        if (f10 == -1) {
            return false;
        }
        if (dVar.f16821a.f() == Long.MIN_VALUE) {
            u0(o3Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f16822b = f10;
        o3Var2.l(dVar.M, bVar);
        if (bVar.O && o3Var2.r(bVar.f16862c, dVar2).X == o3Var2.f(dVar.M)) {
            Pair<Object, Long> n10 = o3Var.n(dVar2, bVar, o3Var.l(dVar.M, bVar).f16862c, dVar.f16823c + bVar.q());
            dVar.b(o3Var.f(n10.first), ((Long) n10.second).longValue(), n10.first);
        }
        return true;
    }

    public static q1[] w(r rVar) {
        int length = rVar != null ? rVar.length() : 0;
        q1[] q1VarArr = new q1[length];
        for (int i10 = 0; i10 < length; i10++) {
            q1VarArr[i10] = rVar.b(i10);
        }
        return q1VarArr;
    }

    public static g x0(o3 o3Var, p2 p2Var, h hVar, g2 g2Var, int i10, boolean z10, o3.d dVar, o3.b bVar) {
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        s.b bVar2;
        int i12;
        long j11;
        long j12;
        g2 g2Var2;
        int i13;
        int i14;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        if (o3Var.u()) {
            return new g(p2.l(), 0L, -9223372036854775807L, false, true, false);
        }
        s.b bVar3 = p2Var.f16876b;
        Object obj = bVar3.f19169a;
        boolean R = R(p2Var, bVar);
        if (p2Var.f16876b.b() || R) {
            j10 = p2Var.f16877c;
        } else {
            j10 = p2Var.f16893s;
        }
        long j13 = j10;
        boolean z18 = true;
        if (hVar != null) {
            i11 = -1;
            Pair<Object, Long> y02 = y0(o3Var, hVar, true, i10, z10, dVar, bVar);
            if (y02 == null) {
                i16 = o3Var.e(z10);
                j11 = j13;
                z17 = false;
                z16 = false;
                z15 = true;
            } else {
                if (hVar.f16839c == -9223372036854775807L) {
                    i16 = o3Var.l(y02.first, bVar).f16862c;
                    j11 = j13;
                    z17 = false;
                } else {
                    obj = y02.first;
                    j11 = ((Long) y02.second).longValue();
                    z17 = true;
                    i16 = -1;
                }
                z16 = p2Var.f16879e == 4;
                z15 = false;
            }
            z11 = z17;
            z13 = z16;
            z12 = z15;
            i12 = i16;
            bVar2 = bVar3;
        } else {
            i11 = -1;
            if (p2Var.f16875a.u()) {
                i14 = o3Var.e(z10);
            } else if (o3Var.f(obj) == -1) {
                Object z02 = z0(dVar, bVar, i10, z10, obj, p2Var.f16875a, o3Var);
                if (z02 == null) {
                    i15 = o3Var.e(z10);
                    z14 = true;
                } else {
                    i15 = o3Var.l(z02, bVar).f16862c;
                    z14 = false;
                }
                i12 = i15;
                z12 = z14;
                j11 = j13;
                bVar2 = bVar3;
                z13 = false;
                z11 = false;
            } else if (j13 == -9223372036854775807L) {
                i14 = o3Var.l(obj, bVar).f16862c;
            } else if (R) {
                bVar2 = bVar3;
                p2Var.f16875a.l(bVar2.f19169a, bVar);
                if (p2Var.f16875a.r(bVar.f16862c, dVar).X == p2Var.f16875a.f(bVar2.f19169a)) {
                    Pair<Object, Long> n10 = o3Var.n(dVar, bVar, o3Var.l(obj, bVar).f16862c, j13 + bVar.q());
                    Object obj2 = n10.first;
                    j11 = ((Long) n10.second).longValue();
                    obj = obj2;
                } else {
                    j11 = j13;
                }
                i12 = -1;
                z13 = false;
                z12 = false;
                z11 = true;
            } else {
                bVar2 = bVar3;
                j11 = j13;
                i12 = -1;
                z13 = false;
                z12 = false;
                z11 = false;
            }
            i12 = i14;
            j11 = j13;
            bVar2 = bVar3;
            z13 = false;
            z12 = false;
            z11 = false;
        }
        if (i12 != i11) {
            Pair<Object, Long> n11 = o3Var.n(dVar, bVar, i12, -9223372036854775807L);
            obj = n11.first;
            j11 = ((Long) n11.second).longValue();
            g2Var2 = g2Var;
            j12 = -9223372036854775807L;
        } else {
            g2Var2 = g2Var;
            j12 = j11;
        }
        s.b B = g2Var2.B(o3Var, obj, j11);
        int i17 = B.f19173e;
        boolean z19 = i17 == i11 || ((i13 = bVar2.f19173e) != i11 && i17 >= i13);
        if (!bVar2.f19169a.equals(obj) || bVar2.b() || B.b() || !z19) {
            z18 = false;
        }
        s.b bVar4 = bVar2;
        boolean N = N(R, bVar2, j13, B, o3Var.l(obj, bVar), j12);
        if (z18 || N) {
            B = bVar4;
        }
        if (B.b()) {
            if (B.equals(bVar4)) {
                j11 = p2Var.f16893s;
            } else {
                o3Var.l(B.f19169a, bVar);
                j11 = B.f19171c == bVar.n(B.f19170b) ? bVar.j() : 0L;
            }
        }
        return new g(B, j11, j12, z13, z12, z11);
    }

    public static Pair<Object, Long> y0(o3 o3Var, h hVar, boolean z10, int i10, boolean z11, o3.d dVar, o3.b bVar) {
        Pair<Object, Long> n10;
        Object z02;
        o3 o3Var2 = hVar.f16837a;
        if (o3Var.u()) {
            return null;
        }
        o3 o3Var3 = o3Var2.u() ? o3Var : o3Var2;
        try {
            n10 = o3Var3.n(dVar, bVar, hVar.f16838b, hVar.f16839c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (o3Var.equals(o3Var3)) {
            return n10;
        }
        if (o3Var.f(n10.first) != -1) {
            return (!o3Var3.l(n10.first, bVar).O || o3Var3.r(bVar.f16862c, dVar).X != o3Var3.f(n10.first)) ? n10 : o3Var.n(dVar, bVar, o3Var.l(n10.first, bVar).f16862c, hVar.f16839c);
        }
        if (z10 && (z02 = z0(dVar, bVar, i10, z11, n10.first, o3Var3, o3Var)) != null) {
            return o3Var.n(dVar, bVar, o3Var.l(z02, bVar).f16862c, -9223372036854775807L);
        }
        return null;
    }

    public static Object z0(o3.d dVar, o3.b bVar, int i10, boolean z10, Object obj, o3 o3Var, o3 o3Var2) {
        int f10 = o3Var.f(obj);
        int m10 = o3Var.m();
        int i11 = f10;
        int i12 = -1;
        for (int i13 = 0; i13 < m10 && i12 == -1; i13++) {
            i11 = o3Var.h(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = o3Var2.f(o3Var.q(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return o3Var2.q(i12);
    }

    public Looper A() {
        return this.S;
    }

    public final void A0(long j10, long j11) {
        this.Q.i(2);
        this.Q.h(2, j10 + j11);
    }

    public final long B() {
        return C(this.f16792g0.f16891q);
    }

    public void B0(o3 o3Var, int i10, long j10) {
        this.Q.j(3, new h(o3Var, i10, j10)).a();
    }

    public final long C(long j10) {
        d2 j11 = this.f16786b0.j();
        if (j11 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - j11.y(this.f16806u0));
    }

    public final void C0(boolean z10) {
        s.b bVar = this.f16786b0.p().f16618f.f16631a;
        long F0 = F0(bVar, this.f16792g0.f16893s, true, false);
        if (F0 != this.f16792g0.f16893s) {
            p2 p2Var = this.f16792g0;
            this.f16792g0 = K(bVar, F0, p2Var.f16877c, p2Var.f16878d, z10, 5);
        }
    }

    public final void D(p pVar) {
        if (this.f16786b0.v(pVar)) {
            this.f16786b0.y(this.f16806u0);
            U();
        }
    }

    public final void D0(m3.m1.h r20) {
        throw new UnsupportedOperationException("Method not decompiled: m3.m1.D0(m3.m1$h):void");
    }

    public final void E(IOException iOException, int i10) {
        q h10 = q.h(iOException, i10);
        d2 p10 = this.f16786b0.p();
        if (p10 != null) {
            h10 = h10.f(p10.f16618f.f16631a);
        }
        c5.s.d("ExoPlayerImplInternal", "Playback error", h10);
        i1(false, false);
        this.f16792g0 = this.f16792g0.f(h10);
    }

    public final long E0(s.b bVar, long j10, boolean z10) {
        return F0(bVar, j10, this.f16786b0.p() != this.f16786b0.q(), z10);
    }

    public final void F(boolean z10) {
        long j10;
        d2 j11 = this.f16786b0.j();
        s.b bVar = j11 == null ? this.f16792g0.f16876b : j11.f16618f.f16631a;
        boolean z11 = !this.f16792g0.f16885k.equals(bVar);
        if (z11) {
            this.f16792g0 = this.f16792g0.b(bVar);
        }
        p2 p2Var = this.f16792g0;
        if (j11 == null) {
            j10 = p2Var.f16893s;
        } else {
            j10 = j11.i();
        }
        p2Var.f16891q = j10;
        this.f16792g0.f16892r = B();
        if ((z11 || z10) && j11 != null && j11.f16616d) {
            l1(j11.n(), j11.o());
        }
    }

    public final long F0(s.b bVar, long j10, boolean z10, boolean z11) {
        j1();
        this.f16797l0 = false;
        if (z11 || this.f16792g0.f16879e == 3) {
            a1(2);
        }
        d2 p10 = this.f16786b0.p();
        d2 d2Var = p10;
        while (d2Var != null && !bVar.equals(d2Var.f16618f.f16631a)) {
            d2Var = d2Var.j();
        }
        if (z10 || p10 != d2Var || (d2Var != null && d2Var.z(j10) < 0)) {
            for (b3 b3Var : this.f16783a) {
                n(b3Var);
            }
            if (d2Var != null) {
                while (this.f16786b0.p() != d2Var) {
                    this.f16786b0.b();
                }
                this.f16786b0.z(d2Var);
                d2Var.x(1000000000000L);
                q();
            }
        }
        if (d2Var != null) {
            this.f16786b0.z(d2Var);
            if (!d2Var.f16616d) {
                d2Var.f16618f = d2Var.f16618f.b(j10);
            } else if (d2Var.f16617e) {
                long h10 = d2Var.f16613a.h(j10);
                d2Var.f16613a.s(h10 - this.V, this.W);
                j10 = h10;
            }
            t0(j10);
            U();
        } else {
            this.f16786b0.f();
            t0(j10);
        }
        F(false);
        this.Q.f(2);
        return j10;
    }

    public final void G(o3 o3Var, boolean z10) {
        Throwable th;
        boolean z11;
        g x02 = x0(o3Var, this.f16792g0, this.f16805t0, this.f16786b0, this.f16799n0, this.f16800o0, this.T, this.U);
        s.b bVar = x02.f16831a;
        long j10 = x02.f16833c;
        boolean z12 = x02.f16834d;
        long j11 = x02.f16832b;
        boolean z13 = !this.f16792g0.f16876b.equals(bVar) || j11 != this.f16792g0.f16893s;
        int i10 = 3;
        h hVar = null;
        long j12 = -9223372036854775807L;
        try {
            if (x02.f16835e) {
                if (this.f16792g0.f16879e != 1) {
                    a1(4);
                }
                r0(false, false, false, true);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (!z13) {
                z11 = false;
                if (!this.f16786b0.F(o3Var, this.f16806u0, y())) {
                    C0(false);
                }
            } else {
                z11 = false;
                if (!o3Var.u()) {
                    for (d2 p10 = this.f16786b0.p(); p10 != null; p10 = p10.j()) {
                        if (p10.f16618f.f16631a.equals(bVar)) {
                            p10.f16618f = this.f16786b0.r(o3Var, p10.f16618f);
                            p10.A();
                        }
                    }
                    j11 = E0(bVar, j11, z12);
                }
            }
            p2 p2Var = this.f16792g0;
            o1(o3Var, bVar, p2Var.f16875a, p2Var.f16876b, x02.f16836f ? j11 : -9223372036854775807L);
            if (z13 || j10 != this.f16792g0.f16877c) {
                p2 p2Var2 = this.f16792g0;
                Object obj = p2Var2.f16876b.f19169a;
                o3 o3Var2 = p2Var2.f16875a;
                boolean z14 = z13 && z10 && !o3Var2.u() && !o3Var2.l(obj, this.U).O;
                long j13 = this.f16792g0.f16878d;
                if (o3Var.f(obj) == -1) {
                    i10 = 4;
                }
                this.f16792g0 = K(bVar, j11, j10, j13, z14, i10);
            }
            s0();
            w0(o3Var, this.f16792g0.f16875a);
            this.f16792g0 = this.f16792g0.j(o3Var);
            if (!o3Var.u()) {
                this.f16805t0 = null;
            }
            F(z11);
        } catch (Throwable th3) {
            th = th3;
            hVar = null;
            p2 p2Var3 = this.f16792g0;
            o3 o3Var3 = p2Var3.f16875a;
            s.b bVar2 = p2Var3.f16876b;
            if (x02.f16836f) {
                j12 = j11;
            }
            h hVar2 = hVar;
            o1(o3Var, bVar, o3Var3, bVar2, j12);
            if (z13 || j10 != this.f16792g0.f16877c) {
                p2 p2Var4 = this.f16792g0;
                Object obj2 = p2Var4.f16876b.f19169a;
                o3 o3Var4 = p2Var4.f16875a;
                boolean z15 = z13 && z10 && !o3Var4.u() && !o3Var4.l(obj2, this.U).O;
                long j14 = this.f16792g0.f16878d;
                if (o3Var.f(obj2) == -1) {
                    i10 = 4;
                }
                this.f16792g0 = K(bVar, j11, j10, j14, z15, i10);
            }
            s0();
            w0(o3Var, this.f16792g0.f16875a);
            this.f16792g0 = this.f16792g0.j(o3Var);
            if (!o3Var.u()) {
                this.f16805t0 = hVar2;
            }
            F(false);
            throw th;
        }
    }

    public final void G0(w2 w2Var) {
        if (w2Var.f() == -9223372036854775807L) {
            H0(w2Var);
        } else if (this.f16792g0.f16875a.u()) {
            this.Y.add(new d(w2Var));
        } else {
            d dVar = new d(w2Var);
            o3 o3Var = this.f16792g0.f16875a;
            if (v0(dVar, o3Var, o3Var, this.f16799n0, this.f16800o0, this.T, this.U)) {
                this.Y.add(dVar);
                Collections.sort(this.Y);
                return;
            }
            w2Var.k(false);
        }
    }

    public final void H(p pVar) {
        if (this.f16786b0.v(pVar)) {
            d2 j10 = this.f16786b0.j();
            j10.p(this.X.j().f16948a, this.f16792g0.f16875a);
            l1(j10.n(), j10.o());
            if (j10 == this.f16786b0.p()) {
                t0(j10.f16618f.f16632b);
                q();
                p2 p2Var = this.f16792g0;
                s.b bVar = p2Var.f16876b;
                long j11 = j10.f16618f.f16632b;
                this.f16792g0 = K(bVar, j11, p2Var.f16877c, j11, false, 5);
            }
            U();
        }
    }

    public final void H0(w2 w2Var) {
        if (w2Var.c() == this.S) {
            m(w2Var);
            int i10 = this.f16792g0.f16879e;
            if (i10 == 3 || i10 == 2) {
                this.Q.f(2);
                return;
            }
            return;
        }
        this.Q.j(15, w2Var).a();
    }

    public final void I(r2 r2Var, float f10, boolean z10, boolean z11) {
        b3[] b3VarArr;
        if (z10) {
            if (z11) {
                this.f16793h0.b(1);
            }
            this.f16792g0 = this.f16792g0.g(r2Var);
        }
        p1(r2Var.f16948a);
        for (b3 b3Var : this.f16783a) {
            if (b3Var != null) {
                b3Var.p(f10, r2Var.f16948a);
            }
        }
    }

    public final void I0(final w2 w2Var) {
        Looper c10 = w2Var.c();
        if (!c10.getThread().isAlive()) {
            c5.s.i("TAG", "Trying to send message on a dead thread.");
            w2Var.k(false);
            return;
        }
        this.Z.b(c10, null).c(new Runnable() {
            @Override
            public final void run() {
                m1.this.T(w2Var);
            }
        });
    }

    public final void J(r2 r2Var, boolean z10) {
        I(r2Var, r2Var.f16948a, true, z10);
    }

    public final void J0(long j10) {
        b3[] b3VarArr;
        for (b3 b3Var : this.f16783a) {
            if (b3Var.v() != null) {
                K0(b3Var, j10);
            }
        }
    }

    public final p2 K(s.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        c0 c0Var;
        r0 r0Var;
        c0 c0Var2;
        this.f16808w0 = this.f16808w0 || j10 != this.f16792g0.f16893s || !bVar.equals(this.f16792g0.f16876b);
        s0();
        p2 p2Var = this.f16792g0;
        r0 r0Var2 = p2Var.f16882h;
        c0 c0Var3 = p2Var.f16883i;
        List list2 = p2Var.f16884j;
        if (this.f16788c0.s()) {
            d2 p10 = this.f16786b0.p();
            if (p10 == null) {
                r0Var = r0.M;
            } else {
                r0Var = p10.n();
            }
            if (p10 == null) {
                c0Var2 = this.N;
            } else {
                c0Var2 = p10.o();
            }
            list = u(c0Var2.f475c);
            if (p10 != null) {
                e2 e2Var = p10.f16618f;
                if (e2Var.f16633c != j11) {
                    p10.f16618f = e2Var.a(j11);
                }
            }
            r0Var2 = r0Var;
            c0Var = c0Var2;
        } else if (!bVar.equals(this.f16792g0.f16876b)) {
            r0Var2 = r0.M;
            c0Var = this.N;
            list = q.D();
        } else {
            list = list2;
            c0Var = c0Var3;
        }
        if (z10) {
            this.f16793h0.e(i10);
        }
        return this.f16792g0.c(bVar, j10, j11, j12, B(), r0Var2, c0Var, list);
    }

    public final void K0(b3 b3Var, long j10) {
        b3Var.m();
        if (b3Var instanceof m) {
            ((m) b3Var).b0(j10);
        }
    }

    public final boolean L(b3 b3Var, d2 d2Var) {
        d2 j10 = d2Var.j();
        return d2Var.f16618f.f16636f && j10.f16616d && ((b3Var instanceof m) || (b3Var instanceof f4.g) || b3Var.x() >= j10.m());
    }

    public final void L0(boolean z10, AtomicBoolean atomicBoolean) {
        b3[] b3VarArr;
        if (this.f16801p0 != z10) {
            this.f16801p0 = z10;
            if (!z10) {
                for (b3 b3Var : this.f16783a) {
                    if (!P(b3Var) && this.f16785b.remove(b3Var)) {
                        b3Var.c();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final boolean M() {
        d2 q10 = this.f16786b0.q();
        if (!q10.f16616d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            b3[] b3VarArr = this.f16783a;
            if (i10 >= b3VarArr.length) {
                return true;
            }
            b3 b3Var = b3VarArr[i10];
            j0 j0Var = q10.f16615c[i10];
            if (b3Var.v() != j0Var || (j0Var != null && !b3Var.l() && !L(b3Var, q10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public final void M0(b bVar) {
        this.f16793h0.b(1);
        if (bVar.f16815c != -1) {
            this.f16805t0 = new h(new x2(bVar.f16813a, bVar.f16814b), bVar.f16815c, bVar.f16816d);
        }
        G(this.f16788c0.C(bVar.f16813a, bVar.f16814b), false);
    }

    public void N0(List<j2.c> list, int i10, long j10, l0 l0Var) {
        this.Q.j(17, new b(list, l0Var, i10, j10, null)).a();
    }

    public final boolean O() {
        d2 j10 = this.f16786b0.j();
        return (j10 == null || j10.k() == Long.MIN_VALUE) ? false : true;
    }

    public final void O0(boolean z10) {
        if (z10 != this.f16803r0) {
            this.f16803r0 = z10;
            p2 p2Var = this.f16792g0;
            int i10 = p2Var.f16879e;
            if (z10 || i10 == 4 || i10 == 1) {
                this.f16792g0 = p2Var.d(z10);
            } else {
                this.Q.f(2);
            }
        }
    }

    public final void P0(boolean z10) {
        this.f16795j0 = z10;
        s0();
        if (this.f16796k0 && this.f16786b0.q() != this.f16786b0.p()) {
            C0(true);
            F(false);
        }
    }

    public final boolean Q() {
        d2 p10 = this.f16786b0.p();
        long j10 = p10.f16618f.f16635e;
        return p10.f16616d && (j10 == -9223372036854775807L || this.f16792g0.f16893s < j10 || !d1());
    }

    public void Q0(boolean z10, int i10) {
        this.Q.a(1, z10 ? 1 : 0, i10).a();
    }

    public final void R0(boolean z10, int i10, boolean z11, int i11) {
        this.f16793h0.b(z11 ? 1 : 0);
        this.f16793h0.c(i11);
        this.f16792g0 = this.f16792g0.e(z10, i10);
        this.f16797l0 = false;
        g0(z10);
        if (!d1()) {
            j1();
            n1();
            return;
        }
        int i12 = this.f16792g0.f16879e;
        if (i12 == 3) {
            g1();
            this.Q.f(2);
        } else if (i12 == 2) {
            this.Q.f(2);
        }
    }

    public void S0(r2 r2Var) {
        this.Q.j(4, r2Var).a();
    }

    public final void T0(r2 r2Var) {
        this.X.d(r2Var);
        J(this.X.j(), true);
    }

    public final void U() {
        boolean c12 = c1();
        this.f16798m0 = c12;
        if (c12) {
            this.f16786b0.j().d(this.f16806u0);
        }
        k1();
    }

    public void U0(int i10) {
        this.Q.a(11, i10, 0).a();
    }

    public final void V() {
        this.f16793h0.d(this.f16792g0);
        if (this.f16793h0.f16824a) {
            this.f16784a0.a(this.f16793h0);
            this.f16793h0 = new e(this.f16792g0);
        }
    }

    public final void V0(int i10) {
        this.f16799n0 = i10;
        if (!this.f16786b0.G(this.f16792g0.f16875a, i10)) {
            C0(true);
        }
        F(false);
    }

    public final boolean W(long j10, long j11) {
        if (this.f16803r0 && this.f16802q0) {
            return false;
        }
        A0(j10, j11);
        return true;
    }

    public final void W0(g3 g3Var) {
        this.f16791f0 = g3Var;
    }

    public final void X(long r8, long r10) {
        throw new UnsupportedOperationException("Method not decompiled: m3.m1.X(long, long):void");
    }

    public void X0(boolean z10) {
        this.Q.a(12, z10 ? 1 : 0, 0).a();
    }

    public final void Y() {
        e2 o10;
        this.f16786b0.y(this.f16806u0);
        if (this.f16786b0.D() && (o10 = this.f16786b0.o(this.f16806u0, this.f16792g0)) != null) {
            d2 g10 = this.f16786b0.g(this.f16787c, this.M, this.O.i(), this.f16788c0, o10, this.N);
            g10.f16613a.d(this, o10.f16632b);
            if (this.f16786b0.p() == g10) {
                t0(o10.f16632b);
            }
            F(false);
        }
        if (this.f16798m0) {
            this.f16798m0 = O();
            k1();
            return;
        }
        U();
    }

    public final void Y0(boolean z10) {
        this.f16800o0 = z10;
        if (!this.f16786b0.H(this.f16792g0.f16875a, z10)) {
            C0(true);
        }
        F(false);
    }

    public final void Z() {
        boolean z10;
        boolean z11 = false;
        while (b1()) {
            if (z11) {
                V();
            }
            d2 d2Var = (d2) c5.a.e(this.f16786b0.b());
            if (this.f16792g0.f16876b.f19169a.equals(d2Var.f16618f.f16631a.f19169a)) {
                s.b bVar = this.f16792g0.f16876b;
                if (bVar.f19170b == -1) {
                    s.b bVar2 = d2Var.f16618f.f16631a;
                    if (bVar2.f19170b == -1 && bVar.f19173e != bVar2.f19173e) {
                        z10 = true;
                        e2 e2Var = d2Var.f16618f;
                        s.b bVar3 = e2Var.f16631a;
                        long j10 = e2Var.f16632b;
                        this.f16792g0 = K(bVar3, j10, e2Var.f16633c, j10, !z10, 0);
                        s0();
                        n1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            e2 e2Var2 = d2Var.f16618f;
            s.b bVar32 = e2Var2.f16631a;
            long j102 = e2Var2.f16632b;
            this.f16792g0 = K(bVar32, j102, e2Var2.f16633c, j102, !z10, 0);
            s0();
            n1();
            z11 = true;
        }
    }

    public final void Z0(l0 l0Var) {
        this.f16793h0.b(1);
        G(this.f16788c0.D(l0Var), false);
    }

    @Override
    public void a() {
        this.Q.f(22);
    }

    public final void a0() {
        d2 q10 = this.f16786b0.q();
        if (q10 != null) {
            int i10 = 0;
            if (q10.j() == null || this.f16796k0) {
                if (q10.f16618f.f16639i || this.f16796k0) {
                    while (true) {
                        b3[] b3VarArr = this.f16783a;
                        if (i10 < b3VarArr.length) {
                            b3 b3Var = b3VarArr[i10];
                            j0 j0Var = q10.f16615c[i10];
                            if (j0Var != null && b3Var.v() == j0Var && b3Var.l()) {
                                long j10 = q10.f16618f.f16635e;
                                K0(b3Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : q10.l() + q10.f16618f.f16635e);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (M()) {
                if (q10.j().f16616d || this.f16806u0 >= q10.j().m()) {
                    c0 o10 = q10.o();
                    d2 c10 = this.f16786b0.c();
                    c0 o11 = c10.o();
                    o3 o3Var = this.f16792g0.f16875a;
                    o1(o3Var, c10.f16618f.f16631a, o3Var, q10.f16618f.f16631a, -9223372036854775807L);
                    if (!c10.f16616d || c10.f16613a.n() == -9223372036854775807L) {
                        for (int i11 = 0; i11 < this.f16783a.length; i11++) {
                            boolean c11 = o10.c(i11);
                            boolean c12 = o11.c(i11);
                            if (c11 && !this.f16783a[i11].z()) {
                                boolean z10 = this.f16787c[i11].k() == -2;
                                e3 e3Var = o10.f474b[i11];
                                e3 e3Var2 = o11.f474b[i11];
                                if (!c12 || !e3Var2.equals(e3Var) || z10) {
                                    K0(this.f16783a[i11], c10.m());
                                }
                            }
                        }
                        return;
                    }
                    J0(c10.m());
                }
            }
        }
    }

    public final void a1(int i10) {
        p2 p2Var = this.f16792g0;
        if (p2Var.f16879e != i10) {
            if (i10 != 2) {
                this.f16811z0 = -9223372036854775807L;
            }
            this.f16792g0 = p2Var.h(i10);
        }
    }

    @Override
    public void b(p pVar) {
        this.Q.j(8, pVar).a();
    }

    public final void b0() {
        d2 q10 = this.f16786b0.q();
        if (q10 != null && this.f16786b0.p() != q10 && !q10.f16619g && p0()) {
            q();
        }
    }

    public final boolean b1() {
        d2 p10;
        d2 j10;
        return d1() && !this.f16796k0 && (p10 = this.f16786b0.p()) != null && (j10 = p10.j()) != null && this.f16806u0 >= j10.m() && j10.f16619g;
    }

    @Override
    public synchronized void c(w2 w2Var) {
        if (!this.f16794i0 && this.R.isAlive()) {
            this.Q.j(14, w2Var).a();
            return;
        }
        c5.s.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        w2Var.k(false);
    }

    public final void c0() {
        G(this.f16788c0.i(), true);
    }

    public final boolean c1() {
        long j10;
        if (!O()) {
            return false;
        }
        d2 j11 = this.f16786b0.j();
        long C = C(j11.k());
        if (j11 == this.f16786b0.p()) {
            j10 = j11.y(this.f16806u0);
        } else {
            j10 = j11.y(this.f16806u0) - j11.f16618f.f16632b;
        }
        return this.O.h(j10, C, this.X.j().f16948a);
    }

    public final void d0(c cVar) {
        this.f16793h0.b(1);
        G(this.f16788c0.v(cVar.f16817a, cVar.f16818b, cVar.f16819c, cVar.f16820d), false);
    }

    public final boolean d1() {
        p2 p2Var = this.f16792g0;
        return p2Var.f16886l && p2Var.f16887m == 0;
    }

    public void e0(int i10, int i11, int i12, l0 l0Var) {
        this.Q.j(19, new c(i10, i11, i12, l0Var)).a();
    }

    public final boolean e1(boolean z10) {
        if (this.f16804s0 == 0) {
            return Q();
        }
        if (!z10) {
            return false;
        }
        p2 p2Var = this.f16792g0;
        if (!p2Var.f16881g) {
            return true;
        }
        long c10 = f1(p2Var.f16875a, this.f16786b0.p().f16618f.f16631a) ? this.f16789d0.c() : -9223372036854775807L;
        d2 j10 = this.f16786b0.j();
        return (j10.q() && j10.f16618f.f16639i) || (j10.f16618f.f16631a.b() && !j10.f16616d) || this.O.g(B(), this.X.j().f16948a, this.f16797l0, c10);
    }

    public final void f0() {
        r[] rVarArr;
        for (d2 p10 = this.f16786b0.p(); p10 != null; p10 = p10.j()) {
            for (r rVar : p10.o().f475c) {
                if (rVar != null) {
                    rVar.n();
                }
            }
        }
    }

    public final boolean f1(o3 o3Var, s.b bVar) {
        if (bVar.b() || o3Var.u()) {
            return false;
        }
        o3Var.r(o3Var.l(bVar.f19169a, this.U).f16862c, this.T);
        if (!this.T.h()) {
            return false;
        }
        o3.d dVar = this.T;
        return dVar.R && dVar.O != -9223372036854775807L;
    }

    @Override
    public void g(r2 r2Var) {
        this.Q.j(16, r2Var).a();
    }

    public final void g0(boolean z10) {
        r[] rVarArr;
        for (d2 p10 = this.f16786b0.p(); p10 != null; p10 = p10.j()) {
            for (r rVar : p10.o().f475c) {
                if (rVar != null) {
                    rVar.j(z10);
                }
            }
        }
    }

    public final void g1() {
        b3[] b3VarArr;
        this.f16797l0 = false;
        this.X.f();
        for (b3 b3Var : this.f16783a) {
            if (P(b3Var)) {
                b3Var.start();
            }
        }
    }

    public final void h0() {
        r[] rVarArr;
        for (d2 p10 = this.f16786b0.p(); p10 != null; p10 = p10.j()) {
            for (r rVar : p10.o().f475c) {
                if (rVar != null) {
                    rVar.o();
                }
            }
        }
    }

    public void h1() {
        this.Q.d(6).a();
    }

    @Override
    public boolean handleMessage(Message message) {
        d2 q10;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    k0();
                    break;
                case 1:
                    R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    o();
                    break;
                case 3:
                    D0((h) message.obj);
                    break;
                case 4:
                    T0((r2) message.obj);
                    break;
                case 5:
                    W0((g3) message.obj);
                    break;
                case 6:
                    i1(false, true);
                    break;
                case 7:
                    m0();
                    return true;
                case 8:
                    H((p) message.obj);
                    break;
                case 9:
                    D((p) message.obj);
                    break;
                case 10:
                    q0();
                    break;
                case 11:
                    V0(message.arg1);
                    break;
                case 12:
                    Y0(message.arg1 != 0);
                    break;
                case 13:
                    L0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    G0((w2) message.obj);
                    break;
                case 15:
                    I0((w2) message.obj);
                    break;
                case 16:
                    J((r2) message.obj, false);
                    break;
                case 17:
                    M0((b) message.obj);
                    break;
                case 18:
                    j((b) message.obj, message.arg1);
                    break;
                case 19:
                    d0((c) message.obj);
                    break;
                case 20:
                    n0(message.arg1, message.arg2, (l0) message.obj);
                    break;
                case 21:
                    Z0((l0) message.obj);
                    break;
                case 22:
                    c0();
                    break;
                case 23:
                    P0(message.arg1 != 0);
                    break;
                case j.K3:
                    O0(message.arg1 == 1);
                    break;
                case 25:
                    l();
                    break;
                default:
                    return false;
            }
        } catch (b5.l e10) {
            E(e10, e10.f3900a);
        } catch (k2 e11) {
            int i11 = e11.f16764b;
            if (i11 == 1) {
                i10 = e11.f16763a ? 3001 : 3003;
            } else if (i11 == 4) {
                i10 = e11.f16763a ? 3002 : 3004;
            }
            E(e11, i10);
        } catch (IOException e12) {
            E(e12, 2000);
        } catch (RuntimeException e13) {
            if ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            q j10 = q.j(e13, i10);
            c5.s.d("ExoPlayerImplInternal", "Playback error", j10);
            i1(true, false);
            this.f16792g0 = this.f16792g0.f(j10);
        } catch (q e14) {
            e = e14;
            if (e.M == 1 && (q10 = this.f16786b0.q()) != null) {
                e = e.f(q10.f16618f.f16631a);
            }
            if (!e.S || this.f16809x0 != null) {
                q qVar = this.f16809x0;
                if (qVar != null) {
                    qVar.addSuppressed(e);
                    e = this.f16809x0;
                }
                c5.s.d("ExoPlayerImplInternal", "Playback error", e);
                i1(true, false);
                this.f16792g0 = this.f16792g0.f(e);
            } else {
                c5.s.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f16809x0 = e;
                n nVar = this.Q;
                nVar.b(nVar.j(25, e));
            }
        } catch (o.a e15) {
            E(e15, e15.f21348a);
        }
        V();
        return true;
    }

    public void f(p pVar) {
        this.Q.j(9, pVar).a();
    }

    public final void i1(boolean z10, boolean z11) {
        r0(z10 || !this.f16801p0, false, true, false);
        this.f16793h0.b(z11 ? 1 : 0);
        this.O.a();
        a1(1);
    }

    public final void j(b bVar, int i10) {
        this.f16793h0.b(1);
        j2 j2Var = this.f16788c0;
        if (i10 == -1) {
            i10 = j2Var.q();
        }
        G(j2Var.f(i10, bVar.f16813a, bVar.f16814b), false);
    }

    public void j0() {
        this.Q.d(0).a();
    }

    public final void j1() {
        b3[] b3VarArr;
        this.X.h();
        for (b3 b3Var : this.f16783a) {
            if (P(b3Var)) {
                s(b3Var);
            }
        }
    }

    public void k(int i10, List<j2.c> list, l0 l0Var) {
        this.Q.g(18, i10, 0, new b(list, l0Var, -1, -9223372036854775807L, null)).a();
    }

    public final void k0() {
        this.f16793h0.b(1);
        r0(false, false, false, true);
        this.O.e();
        a1(this.f16792g0.f16875a.u() ? 4 : 2);
        this.f16788c0.w(this.P.f());
        this.Q.f(2);
    }

    public final void k1() {
        d2 j10 = this.f16786b0.j();
        boolean z10 = this.f16798m0 || (j10 != null && j10.f16613a.j());
        p2 p2Var = this.f16792g0;
        if (z10 != p2Var.f16881g) {
            this.f16792g0 = p2Var.a(z10);
        }
    }

    public final void l() {
        C0(true);
    }

    public synchronized boolean l0() {
        if (!this.f16794i0 && this.R.isAlive()) {
            this.Q.f(7);
            q1(new z6.o() {
                @Override
                public final Object get() {
                    Boolean S;
                    S = m1.this.S();
                    return S;
                }
            }, this.f16790e0);
            return this.f16794i0;
        }
        return true;
    }

    public final void l1(r0 r0Var, c0 c0Var) {
        this.O.c(this.f16783a, r0Var, c0Var.f475c);
    }

    public final void m(w2 w2Var) {
        if (!w2Var.j()) {
            try {
                w2Var.g().t(w2Var.i(), w2Var.e());
            } finally {
                w2Var.k(true);
            }
        }
    }

    public final void m0() {
        r0(true, false, true, false);
        this.O.f();
        a1(1);
        this.R.quit();
        synchronized (this) {
            this.f16794i0 = true;
            notifyAll();
        }
    }

    public final void m1() {
        if (!this.f16792g0.f16875a.u() && this.f16788c0.s()) {
            Y();
            a0();
            b0();
            Z();
        }
    }

    public final void n(b3 b3Var) {
        if (P(b3Var)) {
            this.X.a(b3Var);
            s(b3Var);
            b3Var.h();
            this.f16804s0--;
        }
    }

    public final void n0(int i10, int i11, l0 l0Var) {
        this.f16793h0.b(1);
        G(this.f16788c0.A(i10, i11, l0Var), false);
    }

    public final void n1() {
        d2 p10 = this.f16786b0.p();
        if (p10 != null) {
            long n10 = p10.f16616d ? p10.f16613a.n() : -9223372036854775807L;
            if (n10 != -9223372036854775807L) {
                t0(n10);
                if (n10 != this.f16792g0.f16893s) {
                    p2 p2Var = this.f16792g0;
                    this.f16792g0 = K(p2Var.f16876b, n10, p2Var.f16877c, n10, true, 5);
                }
            } else {
                long i10 = this.X.i(p10 != this.f16786b0.q());
                this.f16806u0 = i10;
                long y10 = p10.y(i10);
                X(this.f16792g0.f16893s, y10);
                this.f16792g0.f16893s = y10;
            }
            this.f16792g0.f16891q = this.f16786b0.j().i();
            this.f16792g0.f16892r = B();
            p2 p2Var2 = this.f16792g0;
            if (p2Var2.f16886l && p2Var2.f16879e == 3 && f1(p2Var2.f16875a, p2Var2.f16876b) && this.f16792g0.f16888n.f16948a == 1.0f) {
                float b10 = this.f16789d0.b(v(), B());
                if (this.X.j().f16948a != b10) {
                    this.X.d(this.f16792g0.f16888n.e(b10));
                    I(this.f16792g0.f16888n, this.X.j().f16948a, false, false);
                }
            }
        }
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: m3.m1.o():void");
    }

    public void o0(int i10, int i11, l0 l0Var) {
        this.Q.g(20, i10, i11, l0Var).a();
    }

    public final void o1(o3 o3Var, s.b bVar, o3 o3Var2, s.b bVar2, long j10) {
        if (!f1(o3Var, bVar)) {
            r2 r2Var = bVar.b() ? r2.M : this.f16792g0.f16888n;
            if (!this.X.j().equals(r2Var)) {
                this.X.d(r2Var);
                return;
            }
            return;
        }
        o3Var.r(o3Var.l(bVar.f19169a, this.U).f16862c, this.T);
        this.f16789d0.a((y1.g) c5.l0.j(this.T.T));
        if (j10 != -9223372036854775807L) {
            this.f16789d0.e(x(o3Var, bVar.f19169a, j10));
            return;
        }
        Object obj = this.T.f16868a;
        Object obj2 = null;
        if (!o3Var2.u()) {
            obj2 = o3Var2.r(o3Var2.l(bVar2.f19169a, this.U).f16862c, this.T).f16868a;
        }
        if (!c5.l0.c(obj2, obj)) {
            this.f16789d0.e(-9223372036854775807L);
        }
    }

    public final void p(int i10, boolean z10) {
        b3 b3Var = this.f16783a[i10];
        if (!P(b3Var)) {
            d2 q10 = this.f16786b0.q();
            boolean z11 = q10 == this.f16786b0.p();
            c0 o10 = q10.o();
            e3 e3Var = o10.f474b[i10];
            q1[] w10 = w(o10.f475c[i10]);
            boolean z12 = d1() && this.f16792g0.f16879e == 3;
            boolean z13 = !z10 && z12;
            this.f16804s0++;
            this.f16785b.add(b3Var);
            b3Var.u(e3Var, w10, q10.f16615c[i10], this.f16806u0, z13, z11, q10.m(), q10.l());
            b3Var.t(11, new a());
            this.X.b(b3Var);
            if (z12) {
                b3Var.start();
            }
        }
    }

    public final boolean p0() {
        d2 q10 = this.f16786b0.q();
        c0 o10 = q10.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            b3[] b3VarArr = this.f16783a;
            if (i10 >= b3VarArr.length) {
                return !z10;
            }
            b3 b3Var = b3VarArr[i10];
            if (P(b3Var)) {
                boolean z11 = b3Var.v() != q10.f16615c[i10];
                if (!o10.c(i10) || z11) {
                    if (!b3Var.z()) {
                        b3Var.s(w(o10.f475c[i10]), q10.f16615c[i10], q10.m(), q10.l());
                    } else if (b3Var.e()) {
                        n(b3Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    public final void p1(float f10) {
        r[] rVarArr;
        for (d2 p10 = this.f16786b0.p(); p10 != null; p10 = p10.j()) {
            for (r rVar : p10.o().f475c) {
                if (rVar != null) {
                    rVar.m(f10);
                }
            }
        }
    }

    public final void q() {
        r(new boolean[this.f16783a.length]);
    }

    public final void q0() {
        float f10 = this.X.j().f16948a;
        d2 q10 = this.f16786b0.q();
        boolean z10 = true;
        for (d2 p10 = this.f16786b0.p(); p10 != null && p10.f16616d; p10 = p10.j()) {
            c0 v10 = p10.v(f10, this.f16792g0.f16875a);
            if (!v10.a(p10.o())) {
                if (z10) {
                    d2 p11 = this.f16786b0.p();
                    boolean z11 = this.f16786b0.z(p11);
                    boolean[] zArr = new boolean[this.f16783a.length];
                    long b10 = p11.b(v10, this.f16792g0.f16893s, z11, zArr);
                    p2 p2Var = this.f16792g0;
                    boolean z12 = (p2Var.f16879e == 4 || b10 == p2Var.f16893s) ? false : true;
                    p2 p2Var2 = this.f16792g0;
                    this.f16792g0 = K(p2Var2.f16876b, b10, p2Var2.f16877c, p2Var2.f16878d, z12, 5);
                    if (z12) {
                        t0(b10);
                    }
                    boolean[] zArr2 = new boolean[this.f16783a.length];
                    int i10 = 0;
                    while (true) {
                        b3[] b3VarArr = this.f16783a;
                        if (i10 >= b3VarArr.length) {
                            break;
                        }
                        b3 b3Var = b3VarArr[i10];
                        zArr2[i10] = P(b3Var);
                        j0 j0Var = p11.f16615c[i10];
                        if (zArr2[i10]) {
                            if (j0Var != b3Var.v()) {
                                n(b3Var);
                            } else if (zArr[i10]) {
                                b3Var.y(this.f16806u0);
                            }
                        }
                        i10++;
                    }
                    r(zArr2);
                } else {
                    this.f16786b0.z(p10);
                    if (p10.f16616d) {
                        p10.a(v10, Math.max(p10.f16618f.f16632b, p10.y(this.f16806u0)), false);
                    }
                }
                F(true);
                if (this.f16792g0.f16879e != 4) {
                    U();
                    n1();
                    this.Q.f(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z10 = false;
            }
        }
    }

    public final synchronized void q1(z6.o<Boolean> oVar, long j10) {
        long d10 = this.Z.d() + j10;
        boolean z10 = false;
        while (!oVar.get().booleanValue() && j10 > 0) {
            try {
                this.Z.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = d10 - this.Z.d();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final void r(boolean[] zArr) {
        d2 q10 = this.f16786b0.q();
        c0 o10 = q10.o();
        for (int i10 = 0; i10 < this.f16783a.length; i10++) {
            if (!o10.c(i10) && this.f16785b.remove(this.f16783a[i10])) {
                this.f16783a[i10].c();
            }
        }
        for (int i11 = 0; i11 < this.f16783a.length; i11++) {
            if (o10.c(i11)) {
                p(i11, zArr[i11]);
            }
        }
        q10.f16619g = true;
    }

    public final void r0(boolean r30, boolean r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: m3.m1.r0(boolean, boolean, boolean, boolean):void");
    }

    public final void s(b3 b3Var) {
        if (b3Var.i() == 2) {
            b3Var.stop();
        }
    }

    public final void s0() {
        d2 p10 = this.f16786b0.p();
        this.f16796k0 = p10 != null && p10.f16618f.f16638h && this.f16795j0;
    }

    public void t(long j10) {
        this.f16810y0 = j10;
    }

    public final void t0(long j10) {
        b3[] b3VarArr;
        d2 p10 = this.f16786b0.p();
        long z10 = p10 == null ? j10 + 1000000000000L : p10.z(j10);
        this.f16806u0 = z10;
        this.X.c(z10);
        for (b3 b3Var : this.f16783a) {
            if (P(b3Var)) {
                b3Var.y(this.f16806u0);
            }
        }
        f0();
    }

    public final q<f4.a> u(r[] rVarArr) {
        q.a aVar = new q.a();
        boolean z10 = false;
        for (r rVar : rVarArr) {
            if (rVar != null) {
                f4.a aVar2 = rVar.b(0).S;
                if (aVar2 == null) {
                    aVar.a(new f4.a(new a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.h() : q.D();
    }

    public final long v() {
        p2 p2Var = this.f16792g0;
        return x(p2Var.f16875a, p2Var.f16876b.f19169a, p2Var.f16893s);
    }

    public final void w0(o3 o3Var, o3 o3Var2) {
        if (!o3Var.u() || !o3Var2.u()) {
            for (int size = this.Y.size() - 1; size >= 0; size--) {
                if (!v0(this.Y.get(size), o3Var, o3Var2, this.f16799n0, this.f16800o0, this.T, this.U)) {
                    this.Y.get(size).f16821a.k(false);
                    this.Y.remove(size);
                }
            }
            Collections.sort(this.Y);
        }
    }

    public final long x(o3 o3Var, Object obj, long j10) {
        o3Var.r(o3Var.l(obj, this.U).f16862c, this.T);
        o3.d dVar = this.T;
        if (dVar.O != -9223372036854775807L && dVar.h()) {
            o3.d dVar2 = this.T;
            if (dVar2.R) {
                return c5.l0.r0(dVar2.c() - this.T.O) - (j10 + this.U.q());
            }
        }
        return -9223372036854775807L;
    }

    public final long y() {
        d2 q10 = this.f16786b0.q();
        if (q10 == null) {
            return 0L;
        }
        long l10 = q10.l();
        if (!q10.f16616d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            b3[] b3VarArr = this.f16783a;
            if (i10 >= b3VarArr.length) {
                return l10;
            }
            if (P(b3VarArr[i10]) && this.f16783a[i10].v() == q10.f16615c[i10]) {
                long x10 = this.f16783a[i10].x();
                if (x10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(x10, l10);
            }
            i10++;
        }
    }

    public final Pair<s.b, Long> z(o3 o3Var) {
        long j10 = 0;
        if (o3Var.u()) {
            return Pair.create(p2.l(), 0L);
        }
        Pair<Object, Long> n10 = o3Var.n(this.T, this.U, o3Var.e(this.f16800o0), -9223372036854775807L);
        s.b B = this.f16786b0.B(o3Var, n10.first, 0L);
        long longValue = ((Long) n10.second).longValue();
        if (B.b()) {
            o3Var.l(B.f19169a, this.U);
            if (B.f19171c == this.U.n(B.f19170b)) {
                j10 = this.U.j();
            }
            longValue = j10;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }
}
