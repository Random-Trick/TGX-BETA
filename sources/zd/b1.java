package zd;

import ce.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.b1;

public abstract class b1<T> implements kb.c, Iterable<T> {
    public boolean M;
    public boolean N;
    public boolean O;
    public final int Q;
    public final int R;
    public boolean S;
    public final o6 f27260a;
    public final List<T> f27261b = new ArrayList();
    public int f27262c = 0;
    public int P = -1;
    public final List<b<T>> T = new ArrayList();

    public class a implements Client.g {
        public final int f27263a;
        public final boolean f27264b;
        public final Runnable f27265c;

        public a(int i10, boolean z10, Runnable runnable) {
            this.f27263a = i10;
            this.f27264b = z10;
            this.f27265c = runnable;
        }

        public void b(c cVar, boolean z10, Runnable runnable) {
            b1.this.T(cVar, z10);
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void r2(TdApi.Object object) {
            if (object.getConstructor() == -1679978726) {
                j0.t0(object);
                return;
            }
            final c<T> U = b1.this.U(object, this, this.f27263a, this.f27264b);
            if (U != null) {
                b1 b1Var = b1.this;
                final boolean z10 = this.f27264b;
                final Runnable runnable = this.f27265c;
                b1Var.X(new Runnable() {
                    @Override
                    public final void run() {
                        b1.a.this.b(U, z10, runnable);
                    }
                });
            }
        }
    }

    public interface b<T> {
        void C3(b1<T> b1Var, T t10, int i10, int i11);

        void D(b1<T> b1Var, List<T> list, int i10, boolean z10);

        void G1(b1<T> b1Var, T t10, int i10);

        void I2(b1<T> b1Var, int i10);

        void K(b1<T> b1Var, boolean z10);

        void T2(b1<T> b1Var, T t10, int i10, int i11);

        void V5(b1<T> b1Var);

        void e4(b1<T> b1Var);

        void s3(b1<T> b1Var, T t10, int i10);
    }

    public static class c<T> {
        public final List<T> f27266a;
        public final int f27267b;

        public c(List<T> list, int i10) {
            this.f27266a = list;
            this.f27267b = i10;
        }
    }

    public b1(o6 o6Var, int i10, int i11, boolean z10, b<T> bVar) {
        this.f27260a = o6Var;
        this.Q = i10;
        this.R = i11;
        this.O = !z10;
        if (bVar != null) {
            r(bVar);
        }
        a0();
    }

    public void C(Runnable runnable) {
        if (!y()) {
            runnable.run();
        }
    }

    public void D(Runnable runnable) {
        if (B()) {
            runnable.run();
        }
    }

    public final boolean A() {
        return this.S;
    }

    public final boolean B() {
        int i10 = this.f27262c;
        return i10 == 1 || i10 == 2;
    }

    public final void E(Runnable runnable) {
        if (this.f27261b.isEmpty()) {
            G(false, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void F(int i10, boolean z10, Runnable runnable) {
        int i11;
        if (!this.M && (i11 = this.f27262c) != 2 && i11 != 3) {
            if (z10) {
                if (this.O) {
                    return;
                }
            } else if (this.N) {
                return;
            }
            this.M = true;
            this.f27260a.v4().o(J(z10, this.f27261b.size(), i10), new a(i10, z10, runnable));
        }
    }

    public final void G(boolean z10, Runnable runnable) {
        F(this.f27261b.isEmpty() ? this.Q : this.R, z10, runnable);
    }

    public void I(Runnable runnable) {
    }

    public abstract TdApi.Function J(boolean z10, int i10, int i11);

    public final void K(boolean z10) {
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).K(this, z10);
        }
    }

    public final void L() {
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).e4(this);
        }
    }

    public final void M(int i10, int i11) {
        T t10 = this.f27261b.get(i10);
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).T2(this, t10, i10, i11);
        }
    }

    public final void N(int i10) {
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).I2(this, i10);
        }
    }

    public final void O(boolean z10) {
    }

    public final void P(T t10, int i10) {
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).s3(this, t10, i10);
        }
        t();
    }

    public final void Q(T t10, int i10, int i11) {
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).C3(this, t10, i10, i11);
        }
    }

    @Override
    public void Q2() {
        if (this.f27262c != 3) {
            b0();
            this.f27262c = 3;
        }
    }

    public final void R(T t10, int i10) {
        t();
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).G1(this, t10, i10);
        }
    }

    public final void S(List<T> list, int i10, boolean z10) {
        for (int size = this.T.size() - 1; size >= 0; size--) {
            this.T.get(size).D(this, list, i10, z10);
        }
        t();
    }

    public final void T(c<T> cVar, boolean z10) {
        if (!y()) {
            this.M = false;
            int i10 = 1;
            boolean z11 = this.f27262c != 0;
            if (cVar.f27266a.isEmpty()) {
                if (z10) {
                    this.O = true;
                } else {
                    this.N = true;
                }
                if ((this.N && this.O) || this.f27261b.size() == cVar.f27267b) {
                    this.f27262c = 2;
                }
                O(z10);
            } else {
                if (this.f27261b.size() + cVar.f27266a.size() == this.P) {
                    i10 = 2;
                }
                this.f27262c = i10;
                int size = this.f27261b.size();
                if (size == 0 || !z10) {
                    this.f27261b.addAll(cVar.f27266a);
                    S(cVar.f27266a, size, z11);
                } else {
                    this.f27261b.addAll(0, cVar.f27266a);
                    S(cVar.f27266a, 0, z11);
                }
            }
            int i11 = cVar.f27267b;
            if (i11 != -1) {
                Z(i11);
            }
            if (!z11) {
                L();
            }
        }
    }

    public abstract c<T> U(TdApi.Object object, Client.g gVar, int i10, boolean z10);

    public final void V(b<T> bVar) {
        this.T.remove(bVar);
    }

    public final void X(final Runnable runnable) {
        this.f27260a.hd().post(new Runnable() {
            @Override
            public final void run() {
                b1.this.C(runnable);
            }
        });
    }

    public final void Y(final Runnable runnable) {
        this.f27260a.hd().post(new Runnable() {
            @Override
            public final void run() {
                b1.this.D(runnable);
            }
        });
    }

    public final boolean Z(int i10) {
        if (this.P == i10) {
            return false;
        }
        this.P = i10;
        if (i10 > this.f27261b.size() && this.f27262c == 2) {
            this.f27262c = 1;
        }
        N(i10);
        return t();
    }

    public abstract void a0();

    public abstract void b0();

    @Override
    public final Iterator<T> iterator() {
        return this.f27261b.iterator();
    }

    public final void r(b<T> bVar) {
        this.T.add(bVar);
    }

    public final boolean s(int i10) {
        int i11 = this.P;
        if (i11 == -1 || i10 == 0) {
            return false;
        }
        if (i11 + i10 >= 0) {
            return Z(i11 + i10);
        }
        boolean Z = Z(this.f27261b.size());
        I(null);
        return Z;
    }

    public final boolean t() {
        boolean z10 = true;
        boolean z11 = !this.f27261b.isEmpty() || this.P > 0;
        if (this.S == z11) {
            z10 = false;
        }
        if (z10) {
            this.S = z11;
            K(z11);
        }
        if (this.f27261b.size() < this.Q) {
            G(false, null);
        }
        return z10;
    }

    public final int u() {
        return this.f27261b.size();
    }

    public final int v() {
        int i10 = this.P;
        if (i10 == -1) {
            return -1;
        }
        if (!this.O || !this.N) {
            return Math.max(i10, this.f27261b.size());
        }
        return this.f27261b.size();
    }

    public final int w(T t10) {
        int i10 = 0;
        for (T t11 : this.f27261b) {
            if (t11.equals(t10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean x() {
        return A();
    }

    public final boolean y() {
        return this.f27262c == 3;
    }

    public final boolean z() {
        return this.f27262c == 2;
    }
}
