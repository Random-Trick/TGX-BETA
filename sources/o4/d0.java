package o4;

import a5.r;
import android.net.Uri;
import android.os.Handler;
import b5.b0;
import b5.c0;
import b5.h0;
import b5.k;
import b5.n;
import b5.o;
import c5.l0;
import com.google.android.exoplayer2.extractor.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m3.g3;
import m3.k2;
import m3.q1;
import m3.r1;
import o4.i0;
import o4.j;
import o4.p;
import o4.y;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import q3.w;
import t3.h;
import t3.q;
import t3.t;

public final class d0 implements p, h, c0.b<a>, c0.f, i0.d {
    public static final Map<String, String> f18984v0 = K();
    public static final q1 f18985w0 = new q1.b().S("icy").e0("application/x-icy").E();
    public final b0 M;
    public final y.a N;
    public final w.a O;
    public final b P;
    public final b5.b Q;
    public final String R;
    public final long S;
    public final z U;
    public p.a Z;
    public final Uri f18986a;
    public j4.b f18987a0;
    public final k f18988b;
    public final q3.y f18990c;
    public boolean f18992d0;
    public boolean f18993e0;
    public boolean f18994f0;
    public e f18995g0;
    public g f18996h0;
    public boolean f18998j0;
    public boolean f19000l0;
    public boolean f19001m0;
    public int f19002n0;
    public long f19004p0;
    public boolean f19006r0;
    public int f19007s0;
    public boolean f19008t0;
    public boolean f19009u0;
    public final c0 T = new c0("ProgressiveMediaPeriod");
    public final c5.g V = new c5.g();
    public final Runnable W = new Runnable() {
        @Override
        public final void run() {
            d0.this.S();
        }
    };
    public final Runnable X = new Runnable() {
        @Override
        public final void run() {
            d0.this.Q();
        }
    };
    public final Handler Y = l0.u();
    public d[] f18991c0 = new d[0];
    public i0[] f18989b0 = new i0[0];
    public long f19005q0 = -9223372036854775807L;
    public long f19003o0 = -1;
    public long f18997i0 = -9223372036854775807L;
    public int f18999k0 = 1;

    public final class a implements c0.e, j.a {
        public final Uri f19011b;
        public final h0 f19012c;
        public final z f19013d;
        public final h f19014e;
        public final c5.g f19015f;
        public volatile boolean f19017h;
        public long f19019j;
        public t f19022m;
        public boolean f19023n;
        public final q f19016g = new q();
        public boolean f19018i = true;
        public long f19021l = -1;
        public final long f19010a = k.a();
        public o f19020k = j(0);

        public a(Uri uri, k kVar, z zVar, h hVar, c5.g gVar) {
            this.f19011b = uri;
            this.f19012c = new h0(kVar);
            this.f19013d = zVar;
            this.f19014e = hVar;
            this.f19015f = gVar;
        }

        @Override
        public void a(c5.b0 b0Var) {
            long max = !this.f19023n ? this.f19019j : Math.max(d0.this.M(), this.f19019j);
            int a10 = b0Var.a();
            t tVar = (t) c5.a.e(this.f19022m);
            tVar.d(b0Var, a10);
            tVar.f(max, 1, a10, 0, null);
            this.f19023n = true;
        }

        @Override
        public void b() {
            int i10 = 0;
            while (i10 == 0 && !this.f19017h) {
                try {
                    long j10 = this.f19016g.f22899a;
                    o j11 = j(j10);
                    this.f19020k = j11;
                    long d10 = this.f19012c.d(j11);
                    this.f19021l = d10;
                    if (d10 != -1) {
                        this.f19021l = d10 + j10;
                    }
                    d0.this.f18987a0 = j4.b.a(this.f19012c.l());
                    b5.h hVar = this.f19012c;
                    if (!(d0.this.f18987a0 == null || d0.this.f18987a0.O == -1)) {
                        hVar = new j(this.f19012c, d0.this.f18987a0.O, this);
                        t N = d0.this.N();
                        this.f19022m = N;
                        N.a(d0.f18985w0);
                    }
                    long j12 = j10;
                    this.f19013d.f(hVar, this.f19011b, this.f19012c.l(), j10, this.f19021l, this.f19014e);
                    if (d0.this.f18987a0 != null) {
                        this.f19013d.e();
                    }
                    if (this.f19018i) {
                        this.f19013d.b(j12, this.f19019j);
                        this.f19018i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f19017h) {
                            try {
                                this.f19015f.a();
                                i10 = this.f19013d.c(this.f19016g);
                                j12 = this.f19013d.d();
                                if (j12 > d0.this.S + j13) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f19015f.c();
                        d0.this.Y.post(d0.this.X);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f19013d.d() != -1) {
                        this.f19016g.f22899a = this.f19013d.d();
                    }
                    n.a(this.f19012c);
                } catch (Throwable th) {
                    if (!(i10 == 1 || this.f19013d.d() == -1)) {
                        this.f19016g.f22899a = this.f19013d.d();
                    }
                    n.a(this.f19012c);
                    throw th;
                }
            }
        }

        @Override
        public void c() {
            this.f19017h = true;
        }

        public final o j(long j10) {
            return new o.b().h(this.f19011b).g(j10).f(d0.this.R).b(6).e(d0.f18984v0).a();
        }

        public final void k(long j10, long j11) {
            this.f19016g.f22899a = j10;
            this.f19019j = j11;
            this.f19018i = true;
            this.f19023n = false;
        }
    }

    public interface b {
        void g(long j10, boolean z10, boolean z11);
    }

    public final class c implements j0 {
        public final int f19025a;

        public c(int i10) {
            this.f19025a = i10;
        }

        @Override
        public int a(r1 r1Var, p3.g gVar, int i10) {
            return d0.this.b0(this.f19025a, r1Var, gVar, i10);
        }

        @Override
        public void b() {
            d0.this.W(this.f19025a);
        }

        @Override
        public int c(long j10) {
            return d0.this.f0(this.f19025a, j10);
        }

        @Override
        public boolean f() {
            return d0.this.P(this.f19025a);
        }
    }

    public static final class d {
        public final int f19027a;
        public final boolean f19028b;

        public d(int i10, boolean z10) {
            this.f19027a = i10;
            this.f19028b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f19027a == dVar.f19027a && this.f19028b == dVar.f19028b;
        }

        public int hashCode() {
            return (this.f19027a * 31) + (this.f19028b ? 1 : 0);
        }
    }

    public static final class e {
        public final r0 f19029a;
        public final boolean[] f19030b;
        public final boolean[] f19031c;
        public final boolean[] f19032d;

        public e(r0 r0Var, boolean[] zArr) {
            this.f19029a = r0Var;
            this.f19030b = zArr;
            int i10 = r0Var.f19175a;
            this.f19031c = new boolean[i10];
            this.f19032d = new boolean[i10];
        }
    }

    public d0(Uri uri, k kVar, z zVar, q3.y yVar, w.a aVar, b0 b0Var, y.a aVar2, b bVar, b5.b bVar2, String str, int i10) {
        this.f18986a = uri;
        this.f18988b = kVar;
        this.f18990c = yVar;
        this.O = aVar;
        this.M = b0Var;
        this.N = aVar2;
        this.P = bVar;
        this.Q = bVar2;
        this.R = str;
        this.S = i10;
        this.U = zVar;
    }

    public static Map<String, String> K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    public void Q() {
        if (!this.f19009u0) {
            ((p.a) c5.a.e(this.Z)).f(this);
        }
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void H() {
        c5.a.f(this.f18993e0);
        c5.a.e(this.f18995g0);
        c5.a.e(this.f18996h0);
    }

    public final boolean I(a aVar, int i10) {
        g gVar;
        if (this.f19003o0 == -1 && ((gVar = this.f18996h0) == null || gVar.d() == -9223372036854775807L)) {
            if (!this.f18993e0 || h0()) {
                this.f19001m0 = this.f18993e0;
                this.f19004p0 = 0L;
                this.f19007s0 = 0;
                for (i0 i0Var : this.f18989b0) {
                    i0Var.N();
                }
                aVar.k(0L, 0L);
                return true;
            }
            this.f19006r0 = true;
            return false;
        }
        this.f19007s0 = i10;
        return true;
    }

    public final void J(a aVar) {
        if (this.f19003o0 == -1) {
            this.f19003o0 = aVar.f19021l;
        }
    }

    public final int L() {
        int i10 = 0;
        for (i0 i0Var : this.f18989b0) {
            i10 += i0Var.A();
        }
        return i10;
    }

    public final long M() {
        long j10 = Long.MIN_VALUE;
        for (i0 i0Var : this.f18989b0) {
            j10 = Math.max(j10, i0Var.t());
        }
        return j10;
    }

    public t N() {
        return a0(new d(0, true));
    }

    public final boolean O() {
        return this.f19005q0 != -9223372036854775807L;
    }

    public boolean P(int i10) {
        return !h0() && this.f18989b0[i10].D(this.f19008t0);
    }

    public final void S() {
        f4.a aVar;
        if (!(this.f19009u0 || this.f18993e0 || !this.f18992d0 || this.f18996h0 == null)) {
            for (i0 i0Var : this.f18989b0) {
                if (i0Var.z() == null) {
                    return;
                }
            }
            this.V.c();
            int length = this.f18989b0.length;
            p0[] p0VarArr = new p0[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                q1 q1Var = (q1) c5.a.e(this.f18989b0[i10].z());
                String str = q1Var.U;
                boolean h10 = c5.w.h(str);
                boolean z10 = h10 || c5.w.k(str);
                zArr[i10] = z10;
                this.f18994f0 = z10 | this.f18994f0;
                j4.b bVar = this.f18987a0;
                if (bVar != null) {
                    if (h10 || this.f18991c0[i10].f19028b) {
                        f4.a aVar2 = q1Var.S;
                        if (aVar2 == null) {
                            aVar = new f4.a(bVar);
                        } else {
                            aVar = aVar2.a(bVar);
                        }
                        q1Var = q1Var.b().X(aVar).E();
                    }
                    if (h10 && q1Var.O == -1 && q1Var.P == -1 && bVar.f15055a != -1) {
                        q1Var = q1Var.b().G(bVar.f15055a).E();
                    }
                }
                p0VarArr[i10] = new p0(Integer.toString(i10), q1Var.c(this.f18990c.d(q1Var)));
            }
            this.f18995g0 = new e(new r0(p0VarArr), zArr);
            this.f18993e0 = true;
            ((p.a) c5.a.e(this.Z)).b(this);
        }
    }

    public final void T(int i10) {
        H();
        e eVar = this.f18995g0;
        boolean[] zArr = eVar.f19032d;
        if (!zArr[i10]) {
            q1 b10 = eVar.f19029a.b(i10).b(0);
            this.N.h(c5.w.f(b10.U), b10, 0, null, this.f19004p0);
            zArr[i10] = true;
        }
    }

    public final void U(int i10) {
        H();
        boolean[] zArr = this.f18995g0.f19030b;
        if (this.f19006r0 && zArr[i10]) {
            if (!this.f18989b0[i10].D(false)) {
                this.f19005q0 = 0L;
                this.f19006r0 = false;
                this.f19001m0 = true;
                this.f19004p0 = 0L;
                this.f19007s0 = 0;
                for (i0 i0Var : this.f18989b0) {
                    i0Var.N();
                }
                ((p.a) c5.a.e(this.Z)).f(this);
            }
        }
    }

    public void V() {
        this.T.j(this.M.c(this.f18999k0));
    }

    public void W(int i10) {
        this.f18989b0[i10].G();
        V();
    }

    public void f(a aVar, long j10, long j11, boolean z10) {
        h0 h0Var = aVar.f19012c;
        k kVar = new k(aVar.f19010a, aVar.f19020k, h0Var.t(), h0Var.u(), j10, j11, h0Var.s());
        this.M.b(aVar.f19010a);
        this.N.o(kVar, 1, -1, null, 0, null, aVar.f19019j, this.f18997i0);
        if (!z10) {
            J(aVar);
            for (i0 i0Var : this.f18989b0) {
                i0Var.N();
            }
            if (this.f19002n0 > 0) {
                ((p.a) c5.a.e(this.Z)).f(this);
            }
        }
    }

    public void t(a aVar, long j10, long j11) {
        g gVar;
        if (this.f18997i0 == -9223372036854775807L && (gVar = this.f18996h0) != null) {
            boolean g10 = gVar.g();
            long M = M();
            long j12 = M == Long.MIN_VALUE ? 0L : M + 10000;
            this.f18997i0 = j12;
            this.P.g(j12, g10, this.f18998j0);
        }
        h0 h0Var = aVar.f19012c;
        k kVar = new k(aVar.f19010a, aVar.f19020k, h0Var.t(), h0Var.u(), j10, j11, h0Var.s());
        this.M.b(aVar.f19010a);
        this.N.q(kVar, 1, -1, null, 0, null, aVar.f19019j, this.f18997i0);
        J(aVar);
        this.f19008t0 = true;
        ((p.a) c5.a.e(this.Z)).f(this);
    }

    public c0.c l(a aVar, long j10, long j11, IOException iOException, int i10) {
        c0.c cVar;
        a aVar2;
        boolean z10;
        J(aVar);
        h0 h0Var = aVar.f19012c;
        k kVar = new k(aVar.f19010a, aVar.f19020k, h0Var.t(), h0Var.u(), j10, j11, h0Var.s());
        long a10 = this.M.a(new b0.a(kVar, new o(1, -1, null, 0, null, l0.I0(aVar.f19019j), l0.I0(this.f18997i0)), iOException, i10));
        if (a10 == -9223372036854775807L) {
            cVar = c0.f3835g;
        } else {
            int L = L();
            if (L > this.f19007s0) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            if (I(aVar2, L)) {
                cVar = c0.g(z10, a10);
            } else {
                cVar = c0.f3834f;
            }
        }
        boolean z11 = !cVar.c();
        this.N.s(kVar, 1, -1, null, 0, null, aVar.f19019j, this.f18997i0, iOException, z11);
        if (z11) {
            this.M.b(aVar.f19010a);
        }
        return cVar;
    }

    @Override
    public void a(final g gVar) {
        this.Y.post(new Runnable() {
            @Override
            public final void run() {
                d0.this.R(gVar);
            }
        });
    }

    public final t a0(d dVar) {
        int length = this.f18989b0.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f18991c0[i10])) {
                return this.f18989b0[i10];
            }
        }
        i0 k10 = i0.k(this.Q, this.f18990c, this.O);
        k10.T(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f18991c0, i11);
        dVarArr[length] = dVar;
        this.f18991c0 = (d[]) l0.k(dVarArr);
        i0[] i0VarArr = (i0[]) Arrays.copyOf(this.f18989b0, i11);
        i0VarArr[length] = k10;
        this.f18989b0 = (i0[]) l0.k(i0VarArr);
        return k10;
    }

    @Override
    public void b() {
        for (i0 i0Var : this.f18989b0) {
            i0Var.L();
        }
        this.U.a();
    }

    public int b0(int i10, r1 r1Var, p3.g gVar, int i11) {
        if (h0()) {
            return -3;
        }
        T(i10);
        int K = this.f18989b0[i10].K(r1Var, gVar, i11, this.f19008t0);
        if (K == -3) {
            U(i10);
        }
        return K;
    }

    @Override
    public long c() {
        if (this.f19002n0 == 0) {
            return Long.MIN_VALUE;
        }
        return r();
    }

    public void c0() {
        if (this.f18993e0) {
            for (i0 i0Var : this.f18989b0) {
                i0Var.J();
            }
        }
        this.T.k(this);
        this.Y.removeCallbacksAndMessages(null);
        this.Z = null;
        this.f19009u0 = true;
    }

    @Override
    public void d(p.a aVar, long j10) {
        this.Z = aVar;
        this.V.e();
        g0();
    }

    public final boolean d0(boolean[] zArr, long j10) {
        int length = this.f18989b0.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f18989b0[i10].Q(j10, false) && (zArr[i10] || !this.f18994f0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long e(long j10, g3 g3Var) {
        H();
        if (!this.f18996h0.g()) {
            return 0L;
        }
        g.a i10 = this.f18996h0.i(j10);
        return g3Var.a(j10, i10.f5580a.f22901a, i10.f5581b.f22901a);
    }

    public final void R(g gVar) {
        this.f18996h0 = this.f18987a0 == null ? gVar : new g.b(-9223372036854775807L);
        this.f18997i0 = gVar.d();
        int i10 = 1;
        boolean z10 = this.f19003o0 == -1 && gVar.d() == -9223372036854775807L;
        this.f18998j0 = z10;
        if (z10) {
            i10 = 7;
        }
        this.f18999k0 = i10;
        this.P.g(this.f18997i0, gVar.g(), this.f18998j0);
        if (!this.f18993e0) {
            S();
        }
    }

    public int f0(int i10, long j10) {
        if (h0()) {
            return 0;
        }
        T(i10);
        i0 i0Var = this.f18989b0[i10];
        int y10 = i0Var.y(j10, this.f19008t0);
        i0Var.U(y10);
        if (y10 == 0) {
            U(i10);
        }
        return y10;
    }

    @Override
    public void g() {
        V();
        if (this.f19008t0 && !this.f18993e0) {
            throw k2.a("Loading finished before preparation is complete.", null);
        }
    }

    public final void g0() {
        a aVar = new a(this.f18986a, this.f18988b, this.U, this, this.V);
        if (this.f18993e0) {
            c5.a.f(O());
            long j10 = this.f18997i0;
            if (j10 == -9223372036854775807L || this.f19005q0 <= j10) {
                aVar.k(((g) c5.a.e(this.f18996h0)).i(this.f19005q0).f5580a.f22902b, this.f19005q0);
                for (i0 i0Var : this.f18989b0) {
                    i0Var.R(this.f19005q0);
                }
                this.f19005q0 = -9223372036854775807L;
            } else {
                this.f19008t0 = true;
                this.f19005q0 = -9223372036854775807L;
                return;
            }
        }
        this.f19007s0 = L();
        this.N.u(new k(aVar.f19010a, aVar.f19020k, this.T.l(aVar, this, this.M.c(this.f18999k0))), 1, -1, null, 0, null, aVar.f19019j, this.f18997i0);
    }

    @Override
    public long h(long j10) {
        H();
        boolean[] zArr = this.f18995g0.f19030b;
        if (!this.f18996h0.g()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f19001m0 = false;
        this.f19004p0 = j10;
        if (O()) {
            this.f19005q0 = j10;
            return j10;
        } else if (this.f18999k0 != 7 && d0(zArr, j10)) {
            return j10;
        } else {
            this.f19006r0 = false;
            this.f19005q0 = j10;
            this.f19008t0 = false;
            if (this.T.i()) {
                i0[] i0VarArr = this.f18989b0;
                int length = i0VarArr.length;
                while (i10 < length) {
                    i0VarArr[i10].p();
                    i10++;
                }
                this.T.e();
            } else {
                this.T.f();
                i0[] i0VarArr2 = this.f18989b0;
                int length2 = i0VarArr2.length;
                while (i10 < length2) {
                    i0VarArr2[i10].N();
                    i10++;
                }
            }
            return j10;
        }
    }

    public final boolean h0() {
        return this.f19001m0 || O();
    }

    @Override
    public boolean i(long j10) {
        if (this.f19008t0 || this.T.h() || this.f19006r0) {
            return false;
        }
        if (this.f18993e0 && this.f19002n0 == 0) {
            return false;
        }
        boolean e10 = this.V.e();
        if (this.T.i()) {
            return e10;
        }
        g0();
        return true;
    }

    @Override
    public boolean j() {
        return this.T.i() && this.V.d();
    }

    @Override
    public void k() {
        this.f18992d0 = true;
        this.Y.post(this.W);
    }

    @Override
    public void m(q1 q1Var) {
        this.Y.post(this.W);
    }

    @Override
    public long n() {
        if (!this.f19001m0) {
            return -9223372036854775807L;
        }
        if (!this.f19008t0 && L() <= this.f19007s0) {
            return -9223372036854775807L;
        }
        this.f19001m0 = false;
        return this.f19004p0;
    }

    @Override
    public long o(r[] rVarArr, boolean[] zArr, j0[] j0VarArr, boolean[] zArr2, long j10) {
        H();
        e eVar = this.f18995g0;
        r0 r0Var = eVar.f19029a;
        boolean[] zArr3 = eVar.f19031c;
        int i10 = this.f19002n0;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            if (j0VarArr[i12] != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) j0VarArr[i12]).f19025a;
                c5.a.f(zArr3[i13]);
                this.f19002n0--;
                zArr3[i13] = false;
                j0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.f19000l0 ? j10 != 0 : i10 == 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (j0VarArr[i14] == null && rVarArr[i14] != null) {
                r rVar = rVarArr[i14];
                c5.a.f(rVar.length() == 1);
                c5.a.f(rVar.c(0) == 0);
                int c10 = r0Var.c(rVar.a());
                c5.a.f(!zArr3[c10]);
                this.f19002n0++;
                zArr3[c10] = true;
                j0VarArr[i14] = new c(c10);
                zArr2[i14] = true;
                if (!z10) {
                    i0 i0Var = this.f18989b0[c10];
                    z10 = !i0Var.Q(j10, true) && i0Var.w() != 0;
                }
            }
        }
        if (this.f19002n0 == 0) {
            this.f19006r0 = false;
            this.f19001m0 = false;
            if (this.T.i()) {
                i0[] i0VarArr = this.f18989b0;
                int length = i0VarArr.length;
                while (i11 < length) {
                    i0VarArr[i11].p();
                    i11++;
                }
                this.T.e();
            } else {
                i0[] i0VarArr2 = this.f18989b0;
                int length2 = i0VarArr2.length;
                while (i11 < length2) {
                    i0VarArr2[i11].N();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = h(j10);
            while (i11 < j0VarArr.length) {
                if (j0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f19000l0 = true;
        return j10;
    }

    @Override
    public r0 p() {
        H();
        return this.f18995g0.f19029a;
    }

    @Override
    public t q(int i10, int i11) {
        return a0(new d(i10, false));
    }

    @Override
    public long r() {
        long j10;
        H();
        boolean[] zArr = this.f18995g0.f19030b;
        if (this.f19008t0) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.f19005q0;
        }
        if (this.f18994f0) {
            int length = this.f18989b0.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f18989b0[i10].C()) {
                    j10 = Math.min(j10, this.f18989b0[i10].t());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = M();
        }
        return j10 == Long.MIN_VALUE ? this.f19004p0 : j10;
    }

    @Override
    public void s(long j10, boolean z10) {
        H();
        if (!O()) {
            boolean[] zArr = this.f18995g0.f19031c;
            int length = this.f18989b0.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f18989b0[i10].o(j10, z10, zArr[i10]);
            }
        }
    }

    @Override
    public void u(long j10) {
    }
}
