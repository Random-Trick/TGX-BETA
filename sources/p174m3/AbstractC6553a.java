package p174m3;

import android.util.Pair;
import p020b5.C1186a;
import p174m3.AbstractC6604g3;
import p187n4.AbstractC7214n0;

public abstract class AbstractC6553a extends AbstractC6604g3 {
    public final AbstractC7214n0 f20397M;
    public final boolean f20398N;
    public final int f20399c;

    public AbstractC6553a(boolean z, AbstractC7214n0 n0Var) {
        this.f20398N = z;
        this.f20397M = n0Var;
        this.f20399c = n0Var.mo17325a();
    }

    public static Object m20117C(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object m20116D(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object m20115F(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int mo17344A(int i);

    public abstract int mo17343B(int i);

    public abstract Object mo17342E(int i);

    public abstract int mo17341G(int i);

    public abstract int mo17340H(int i);

    public final int m20114I(int i, boolean z) {
        if (z) {
            return this.f20397M.mo17321e(i);
        }
        if (i < this.f20399c - 1) {
            return i + 1;
        }
        return -1;
    }

    public final int m20113J(int i, boolean z) {
        if (z) {
            return this.f20397M.mo17322d(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    public abstract AbstractC6604g3 mo17339K(int i);

    @Override
    public int mo17401e(boolean z) {
        if (this.f20399c == 0) {
            return -1;
        }
        int i = 0;
        if (this.f20398N) {
            z = false;
        }
        if (z) {
            i = this.f20397M.mo17323c();
        }
        while (mo17339K(i).m19819w()) {
            i = m20114I(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo17340H(i) + mo17339K(i).mo17401e(z);
    }

    @Override
    public final int mo17302f(Object obj) {
        int f;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object D = m20116D(obj);
        Object C = m20117C(obj);
        int z = mo17338z(D);
        if (z == -1 || (f = mo17339K(z).mo17302f(C)) == -1) {
            return -1;
        }
        return mo17341G(z) + f;
    }

    @Override
    public int mo17400g(boolean z) {
        int i = this.f20399c;
        if (i == 0) {
            return -1;
        }
        if (this.f20398N) {
            z = false;
        }
        int g = z ? this.f20397M.mo17319g() : i - 1;
        while (mo17339K(g).m19819w()) {
            g = m20113J(g, z);
            if (g == -1) {
                return -1;
            }
        }
        return mo17340H(g) + mo17339K(g).mo17400g(z);
    }

    @Override
    public int mo17346i(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f20398N) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int B = mo17343B(i);
        int H = mo17340H(B);
        AbstractC6604g3 K = mo17339K(B);
        int i4 = i - H;
        if (i2 != 2) {
            i3 = i2;
        }
        int i5 = K.mo17346i(i4, i3, z);
        if (i5 != -1) {
            return H + i5;
        }
        int I = m20114I(B, z);
        while (I != -1 && mo17339K(I).m19819w()) {
            I = m20114I(I, z);
        }
        if (I != -1) {
            return mo17340H(I) + mo17339K(I).mo17401e(z);
        }
        if (i2 == 2) {
            return mo17401e(z);
        }
        return -1;
    }

    @Override
    public final AbstractC6604g3.C6606b mo17301k(int i, AbstractC6604g3.C6606b bVar, boolean z) {
        int A = mo17344A(i);
        int H = mo17340H(A);
        mo17339K(A).mo17301k(i - mo17341G(A), bVar, z);
        bVar.f20639c += H;
        if (z) {
            bVar.f20638b = m20115F(mo17342E(A), C1186a.m38185e(bVar.f20638b));
        }
        return bVar;
    }

    @Override
    public final AbstractC6604g3.C6606b mo19825l(Object obj, AbstractC6604g3.C6606b bVar) {
        Object D = m20116D(obj);
        Object C = m20117C(obj);
        int z = mo17338z(D);
        int H = mo17340H(z);
        mo17339K(z).mo19825l(C, bVar);
        bVar.f20639c += H;
        bVar.f20638b = obj;
        return bVar;
    }

    @Override
    public int mo17345r(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f20398N) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int B = mo17343B(i);
        int H = mo17340H(B);
        AbstractC6604g3 K = mo17339K(B);
        int i4 = i - H;
        if (i2 != 2) {
            i3 = i2;
        }
        int r = K.mo17345r(i4, i3, z);
        if (r != -1) {
            return H + r;
        }
        int J = m20113J(B, z);
        while (J != -1 && mo17339K(J).m19819w()) {
            J = m20113J(J, z);
        }
        if (J != -1) {
            return mo17340H(J) + mo17339K(J).mo17400g(z);
        }
        if (i2 == 2) {
            return mo17400g(z);
        }
        return -1;
    }

    @Override
    public final Object mo17299s(int i) {
        int A = mo17344A(i);
        return m20115F(mo17342E(A), mo17339K(A).mo17299s(i - mo17341G(A)));
    }

    @Override
    public final AbstractC6604g3.C6608d mo17298u(int i, AbstractC6604g3.C6608d dVar, long j) {
        int B = mo17343B(i);
        int H = mo17340H(B);
        int G = mo17341G(B);
        mo17339K(B).mo17298u(i - H, dVar, j);
        Object E = mo17342E(B);
        if (!AbstractC6604g3.C6608d.f20644a0.equals(dVar.f20662a)) {
            E = m20115F(E, dVar.f20662a);
        }
        dVar.f20662a = E;
        dVar.f20659X += G;
        dVar.f20660Y += G;
        return dVar;
    }

    public abstract int mo17338z(Object obj);
}
