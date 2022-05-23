package m3;

import android.util.Pair;
import m3.o3;
import o4.l0;

public abstract class a extends o3 {
    public final l0 M;
    public final boolean N;
    public final int f16482c;

    public a(boolean z10, l0 l0Var) {
        this.N = z10;
        this.M = l0Var;
        this.f16482c = l0Var.a();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract Object C(int i10);

    public abstract int E(int i10);

    public abstract int F(int i10);

    public final int G(int i10, boolean z10) {
        if (z10) {
            return this.M.e(i10);
        }
        if (i10 < this.f16482c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int H(int i10, boolean z10) {
        if (z10) {
            return this.M.d(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract o3 I(int i10);

    @Override
    public int e(boolean z10) {
        if (this.f16482c == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.N) {
            z10 = false;
        }
        if (z10) {
            i10 = this.M.c();
        }
        while (I(i10).u()) {
            i10 = G(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return F(i10) + I(i10).e(z10);
    }

    @Override
    public final int f(Object obj) {
        int f10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object B = B(obj);
        Object A = A(obj);
        int x10 = x(B);
        if (x10 == -1 || (f10 = I(x10).f(A)) == -1) {
            return -1;
        }
        return E(x10) + f10;
    }

    @Override
    public int g(boolean z10) {
        int i10 = this.f16482c;
        if (i10 == 0) {
            return -1;
        }
        if (this.N) {
            z10 = false;
        }
        int g10 = z10 ? this.M.g() : i10 - 1;
        while (I(g10).u()) {
            g10 = H(g10, z10);
            if (g10 == -1) {
                return -1;
            }
        }
        return F(g10) + I(g10).g(z10);
    }

    @Override
    public int i(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.N) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F = F(z11);
        o3 I = I(z11);
        int i13 = i10 - F;
        if (i11 != 2) {
            i12 = i11;
        }
        int i14 = I.i(i13, i12, z10);
        if (i14 != -1) {
            return F + i14;
        }
        int G = G(z11, z10);
        while (G != -1 && I(G).u()) {
            G = G(G, z10);
        }
        if (G != -1) {
            return F(G) + I(G).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override
    public final o3.b k(int i10, o3.b bVar, boolean z10) {
        int y10 = y(i10);
        int F = F(y10);
        I(y10).k(i10 - E(y10), bVar, z10);
        bVar.f16862c += F;
        if (z10) {
            bVar.f16861b = D(C(y10), c5.a.e(bVar.f16861b));
        }
        return bVar;
    }

    @Override
    public final o3.b l(Object obj, o3.b bVar) {
        Object B = B(obj);
        Object A = A(obj);
        int x10 = x(B);
        int F = F(x10);
        I(x10).l(A, bVar);
        bVar.f16862c += F;
        bVar.f16861b = obj;
        return bVar;
    }

    @Override
    public int p(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.N) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F = F(z11);
        o3 I = I(z11);
        int i13 = i10 - F;
        if (i11 != 2) {
            i12 = i11;
        }
        int p10 = I.p(i13, i12, z10);
        if (p10 != -1) {
            return F + p10;
        }
        int H = H(z11, z10);
        while (H != -1 && I(H).u()) {
            H = H(H, z10);
        }
        if (H != -1) {
            return F(H) + I(H).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override
    public final Object q(int i10) {
        int y10 = y(i10);
        return D(C(y10), I(y10).q(i10 - E(y10)));
    }

    @Override
    public final o3.d s(int i10, o3.d dVar, long j10) {
        int z10 = z(i10);
        int F = F(z10);
        int E = E(z10);
        I(z10).s(i10 - F, dVar, j10);
        Object C = C(z10);
        if (!o3.d.f16864a0.equals(dVar.f16868a)) {
            C = D(C, dVar.f16868a);
        }
        dVar.f16868a = C;
        dVar.X += E;
        dVar.Y += E;
        return dVar;
    }

    public abstract int x(Object obj);

    public abstract int y(int i10);

    public abstract int z(int i10);
}
