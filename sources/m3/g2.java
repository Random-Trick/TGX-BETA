package m3;

import a5.b0;
import a5.c0;
import a7.q;
import android.os.Handler;
import b5.b;
import m3.o3;
import n3.a;
import o4.p;
import o4.s;

public final class g2 {
    public final o3.b f16653a = new o3.b();
    public final o3.d f16654b = new o3.d();
    public final a f16655c;
    public final Handler f16656d;
    public long f16657e;
    public int f16658f;
    public boolean f16659g;
    public d2 f16660h;
    public d2 f16661i;
    public d2 f16662j;
    public int f16663k;
    public Object f16664l;
    public long f16665m;

    public g2(a aVar, Handler handler) {
        this.f16655c = aVar;
        this.f16656d = handler;
    }

    public static s.b A(o3 o3Var, Object obj, long j10, long j11, o3.d dVar, o3.b bVar) {
        o3Var.l(obj, bVar);
        o3Var.r(bVar.f16862c, dVar);
        int f10 = o3Var.f(obj);
        Object obj2 = obj;
        while (bVar.M == 0 && bVar.f() > 0 && bVar.t(bVar.r()) && bVar.h(0L) == -1) {
            int i10 = f10 + 1;
            if (f10 >= dVar.Y) {
                break;
            }
            o3Var.k(i10, bVar, true);
            obj2 = c5.a.e(bVar.f16861b);
            f10 = i10;
        }
        o3Var.l(obj2, bVar);
        int h10 = bVar.h(j10);
        if (h10 == -1) {
            return new s.b(obj2, j11, bVar.g(j10));
        }
        return new s.b(obj2, h10, bVar.n(h10), j11);
    }

    public void w(q.a aVar, s.b bVar) {
        this.f16655c.W(aVar.h(), bVar);
    }

    public s.b B(o3 o3Var, Object obj, long j10) {
        long C = C(o3Var, obj);
        o3Var.l(obj, this.f16653a);
        o3Var.r(this.f16653a.f16862c, this.f16654b);
        boolean z10 = false;
        for (int f10 = o3Var.f(obj); f10 >= this.f16654b.X; f10--) {
            boolean z11 = true;
            o3Var.k(f10, this.f16653a, true);
            if (this.f16653a.f() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            o3.b bVar = this.f16653a;
            if (bVar.h(bVar.M) != -1) {
                obj = c5.a.e(this.f16653a.f16861b);
            }
            if (z10 && !(z11 && this.f16653a.M == 0)) {
                break;
            }
        }
        return A(o3Var, obj, j10, C, this.f16654b, this.f16653a);
    }

    public final long C(o3 o3Var, Object obj) {
        int f10;
        int i10 = o3Var.l(obj, this.f16653a).f16862c;
        Object obj2 = this.f16664l;
        if (!(obj2 == null || (f10 = o3Var.f(obj2)) == -1 || o3Var.j(f10, this.f16653a).f16862c != i10)) {
            return this.f16665m;
        }
        for (d2 d2Var = this.f16660h; d2Var != null; d2Var = d2Var.j()) {
            if (d2Var.f16614b.equals(obj)) {
                return d2Var.f16618f.f16631a.f19172d;
            }
        }
        for (d2 d2Var2 = this.f16660h; d2Var2 != null; d2Var2 = d2Var2.j()) {
            int f11 = o3Var.f(d2Var2.f16614b);
            if (f11 != -1 && o3Var.j(f11, this.f16653a).f16862c == i10) {
                return d2Var2.f16618f.f16631a.f19172d;
            }
        }
        long j10 = this.f16657e;
        this.f16657e = 1 + j10;
        if (this.f16660h == null) {
            this.f16664l = obj;
            this.f16665m = j10;
        }
        return j10;
    }

    public boolean D() {
        d2 d2Var = this.f16662j;
        return d2Var == null || (!d2Var.f16618f.f16639i && d2Var.q() && this.f16662j.f16618f.f16635e != -9223372036854775807L && this.f16663k < 100);
    }

    public final boolean E(o3 o3Var) {
        d2 d2Var = this.f16660h;
        if (d2Var == null) {
            return true;
        }
        int f10 = o3Var.f(d2Var.f16614b);
        while (true) {
            f10 = o3Var.h(f10, this.f16653a, this.f16654b, this.f16658f, this.f16659g);
            while (d2Var.j() != null && !d2Var.f16618f.f16637g) {
                d2Var = d2Var.j();
            }
            d2 j10 = d2Var.j();
            if (f10 == -1 || j10 == null || o3Var.f(j10.f16614b) != f10) {
                break;
            }
            d2Var = j10;
        }
        boolean z10 = z(d2Var);
        d2Var.f16618f = r(o3Var, d2Var.f16618f);
        return !z10;
    }

    public boolean F(o3 o3Var, long j10, long j11) {
        e2 e2Var;
        d2 d2Var = this.f16660h;
        d2 d2Var2 = null;
        while (d2Var != null) {
            e2 e2Var2 = d2Var.f16618f;
            if (d2Var2 == null) {
                e2Var = r(o3Var, e2Var2);
            } else {
                e2 i10 = i(o3Var, d2Var2, j10);
                if (i10 == null) {
                    return !z(d2Var2);
                }
                if (!e(e2Var2, i10)) {
                    return !z(d2Var2);
                }
                e2Var = i10;
            }
            d2Var.f16618f = e2Var.a(e2Var2.f16633c);
            if (!d(e2Var2.f16635e, e2Var.f16635e)) {
                d2Var.A();
                long j12 = e2Var.f16635e;
                return !z(d2Var) && !(d2Var == this.f16661i && !d2Var.f16618f.f16636f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : d2Var.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : d2Var.z(j12)) ? 0 : -1)) >= 0));
            }
            d2Var2 = d2Var;
            d2Var = d2Var.j();
        }
        return true;
    }

    public boolean G(o3 o3Var, int i10) {
        this.f16658f = i10;
        return E(o3Var);
    }

    public boolean H(o3 o3Var, boolean z10) {
        this.f16659g = z10;
        return E(o3Var);
    }

    public d2 b() {
        d2 d2Var = this.f16660h;
        if (d2Var == null) {
            return null;
        }
        if (d2Var == this.f16661i) {
            this.f16661i = d2Var.j();
        }
        this.f16660h.t();
        int i10 = this.f16663k - 1;
        this.f16663k = i10;
        if (i10 == 0) {
            this.f16662j = null;
            d2 d2Var2 = this.f16660h;
            this.f16664l = d2Var2.f16614b;
            this.f16665m = d2Var2.f16618f.f16631a.f19172d;
        }
        this.f16660h = this.f16660h.j();
        x();
        return this.f16660h;
    }

    public d2 c() {
        d2 d2Var = this.f16661i;
        c5.a.f((d2Var == null || d2Var.j() == null) ? false : true);
        this.f16661i = this.f16661i.j();
        x();
        return this.f16661i;
    }

    public final boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    public final boolean e(e2 e2Var, e2 e2Var2) {
        return e2Var.f16632b == e2Var2.f16632b && e2Var.f16631a.equals(e2Var2.f16631a);
    }

    public void f() {
        if (this.f16663k != 0) {
            d2 d2Var = (d2) c5.a.h(this.f16660h);
            this.f16664l = d2Var.f16614b;
            this.f16665m = d2Var.f16618f.f16631a.f19172d;
            while (d2Var != null) {
                d2Var.t();
                d2Var = d2Var.j();
            }
            this.f16660h = null;
            this.f16662j = null;
            this.f16661i = null;
            this.f16663k = 0;
            x();
        }
    }

    public d2 g(d3[] d3VarArr, b0 b0Var, b bVar, j2 j2Var, e2 e2Var, c0 c0Var) {
        d2 d2Var = this.f16662j;
        d2 d2Var2 = new d2(d3VarArr, d2Var == null ? 1000000000000L : (d2Var.l() + this.f16662j.f16618f.f16635e) - e2Var.f16632b, b0Var, bVar, j2Var, e2Var, c0Var);
        d2 d2Var3 = this.f16662j;
        if (d2Var3 != null) {
            d2Var3.w(d2Var2);
        } else {
            this.f16660h = d2Var2;
            this.f16661i = d2Var2;
        }
        this.f16664l = null;
        this.f16662j = d2Var2;
        this.f16663k++;
        x();
        return d2Var2;
    }

    public final e2 h(p2 p2Var) {
        return k(p2Var.f16875a, p2Var.f16876b, p2Var.f16877c, p2Var.f16893s);
    }

    public final m3.e2 i(m3.o3 r20, m3.d2 r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: m3.g2.i(m3.o3, m3.d2, long):m3.e2");
    }

    public d2 j() {
        return this.f16662j;
    }

    public final e2 k(o3 o3Var, s.b bVar, long j10, long j11) {
        o3Var.l(bVar.f19169a, this.f16653a);
        return bVar.b() ? l(o3Var, bVar.f19169a, bVar.f19170b, bVar.f19171c, j10, bVar.f19172d) : m(o3Var, bVar.f19169a, j11, j10, bVar.f19172d);
    }

    public final e2 l(o3 o3Var, Object obj, int i10, int i11, long j10, long j11) {
        s.b bVar = new s.b(obj, i10, i11, j11);
        long e10 = o3Var.l(bVar.f19169a, this.f16653a).e(bVar.f19170b, bVar.f19171c);
        long j12 = i11 == this.f16653a.n(i10) ? this.f16653a.j() : 0L;
        return new e2(bVar, (e10 == -9223372036854775807L || j12 < e10) ? j12 : Math.max(0L, e10 - 1), j10, -9223372036854775807L, e10, this.f16653a.t(bVar.f19170b), false, false, false);
    }

    public final m3.e2 m(m3.o3 r25, java.lang.Object r26, long r27, long r29, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: m3.g2.m(m3.o3, java.lang.Object, long, long, long):m3.e2");
    }

    public final long n(o3 o3Var, Object obj, int i10) {
        o3Var.l(obj, this.f16653a);
        long i11 = this.f16653a.i(i10);
        if (i11 == Long.MIN_VALUE) {
            return this.f16653a.M;
        }
        return i11 + this.f16653a.l(i10);
    }

    public e2 o(long j10, p2 p2Var) {
        d2 d2Var = this.f16662j;
        if (d2Var == null) {
            return h(p2Var);
        }
        return i(p2Var.f16875a, d2Var, j10);
    }

    public d2 p() {
        return this.f16660h;
    }

    public d2 q() {
        return this.f16661i;
    }

    public m3.e2 r(m3.o3 r19, m3.e2 r20) {
        throw new UnsupportedOperationException("Method not decompiled: m3.g2.r(m3.o3, m3.e2):m3.e2");
    }

    public final boolean s(s.b bVar) {
        return !bVar.b() && bVar.f19173e == -1;
    }

    public final boolean t(o3 o3Var, s.b bVar, boolean z10) {
        int f10 = o3Var.f(bVar.f19169a);
        return !o3Var.r(o3Var.j(f10, this.f16653a).f16862c, this.f16654b).R && o3Var.v(f10, this.f16653a, this.f16654b, this.f16658f, this.f16659g) && z10;
    }

    public final boolean u(o3 o3Var, s.b bVar) {
        if (!s(bVar)) {
            return false;
        }
        return o3Var.r(o3Var.l(bVar.f19169a, this.f16653a).f16862c, this.f16654b).Y == o3Var.f(bVar.f19169a);
    }

    public boolean v(p pVar) {
        d2 d2Var = this.f16662j;
        return d2Var != null && d2Var.f16613a == pVar;
    }

    public final void x() {
        final q.a x10 = q.x();
        for (d2 d2Var = this.f16660h; d2Var != null; d2Var = d2Var.j()) {
            x10.a(d2Var.f16618f.f16631a);
        }
        d2 d2Var2 = this.f16661i;
        final s.b bVar = d2Var2 == null ? null : d2Var2.f16618f.f16631a;
        this.f16656d.post(new Runnable() {
            @Override
            public final void run() {
                g2.this.w(x10, bVar);
            }
        });
    }

    public void y(long j10) {
        d2 d2Var = this.f16662j;
        if (d2Var != null) {
            d2Var.s(j10);
        }
    }

    public boolean z(d2 d2Var) {
        boolean z10 = false;
        c5.a.f(d2Var != null);
        if (d2Var.equals(this.f16662j)) {
            return false;
        }
        this.f16662j = d2Var;
        while (d2Var.j() != null) {
            d2Var = d2Var.j();
            if (d2Var == this.f16661i) {
                this.f16661i = this.f16660h;
                z10 = true;
            }
            d2Var.t();
            this.f16663k--;
        }
        this.f16662j.w(null);
        x();
        return z10;
    }
}
