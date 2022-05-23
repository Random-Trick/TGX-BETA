package o4;

import b5.i0;
import java.util.HashMap;
import java.util.Map;
import m3.o3;
import m3.y1;
import o4.l0;
import o4.s;

@Deprecated
public final class l extends f<Void> {
    public final n f19133k;
    public final int f19134l;
    public final Map<s.b, s.b> f19135m;
    public final Map<p, s.b> f19136n;

    public static final class a extends i {
        public a(o3 o3Var) {
            super(o3Var);
        }

        @Override
        public int i(int i10, int i11, boolean z10) {
            int i12 = this.f19088c.i(i10, i11, z10);
            return i12 == -1 ? e(z10) : i12;
        }

        @Override
        public int p(int i10, int i11, boolean z10) {
            int p10 = this.f19088c.p(i10, i11, z10);
            return p10 == -1 ? g(z10) : p10;
        }
    }

    public static final class b extends m3.a {
        public final o3 O;
        public final int P;
        public final int Q;
        public final int R;

        public b(o3 o3Var, int i10) {
            super(false, new l0.b(i10));
            boolean z10 = false;
            this.O = o3Var;
            int m10 = o3Var.m();
            this.P = m10;
            this.Q = o3Var.t();
            this.R = i10;
            if (m10 > 0) {
                c5.a.g(i10 <= Integer.MAX_VALUE / m10 ? true : z10, "LoopingMediaSource contains too many periods");
            }
        }

        @Override
        public Object C(int i10) {
            return Integer.valueOf(i10);
        }

        @Override
        public int E(int i10) {
            return i10 * this.P;
        }

        @Override
        public int F(int i10) {
            return i10 * this.Q;
        }

        @Override
        public o3 I(int i10) {
            return this.O;
        }

        @Override
        public int m() {
            return this.P * this.R;
        }

        @Override
        public int t() {
            return this.Q * this.R;
        }

        @Override
        public int x(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }

        @Override
        public int y(int i10) {
            return i10 / this.P;
        }

        @Override
        public int z(int i10) {
            return i10 / this.Q;
        }
    }

    public l(s sVar) {
        this(sVar, Integer.MAX_VALUE);
    }

    public s.b B(Void r22, s.b bVar) {
        return this.f19134l != Integer.MAX_VALUE ? this.f19135m.get(bVar) : bVar;
    }

    public void F(Void r12, s sVar, o3 o3Var) {
        o3 o3Var2;
        if (this.f19134l != Integer.MAX_VALUE) {
            o3Var2 = new b(o3Var, this.f19134l);
        } else {
            o3Var2 = new a(o3Var);
        }
        y(o3Var2);
    }

    @Override
    public p a(s.b bVar, b5.b bVar2, long j10) {
        if (this.f19134l == Integer.MAX_VALUE) {
            return this.f19133k.a(bVar, bVar2, j10);
        }
        s.b c10 = bVar.c(m3.a.A(bVar.f19169a));
        this.f19135m.put(c10, bVar);
        m H = this.f19133k.a(c10, bVar2, j10);
        this.f19136n.put(H, c10);
        return H;
    }

    @Override
    public void d(p pVar) {
        this.f19133k.d(pVar);
        s.b remove = this.f19136n.remove(pVar);
        if (remove != null) {
            this.f19135m.remove(remove);
        }
    }

    @Override
    public y1 h() {
        return this.f19133k.h();
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public o3 n() {
        if (this.f19134l != Integer.MAX_VALUE) {
            return new b(this.f19133k.L(), this.f19134l);
        }
        return new a(this.f19133k.L());
    }

    @Override
    public void x(i0 i0Var) {
        super.x(i0Var);
        G(null, this.f19133k);
    }

    public l(s sVar, int i10) {
        c5.a.a(i10 > 0);
        this.f19133k = new n(sVar, false);
        this.f19134l = i10;
        this.f19135m = new HashMap();
        this.f19136n = new HashMap();
    }
}
