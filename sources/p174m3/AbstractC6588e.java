package p174m3;

import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;

public abstract class AbstractC6588e implements AbstractC6618i2 {
    public final AbstractC6604g3.C6608d f20519a = new AbstractC6604g3.C6608d();

    @Override
    @Deprecated
    public final int mo19782F() {
        return m19941U();
    }

    @Override
    public final void mo19781G(int i, int i2) {
        if (i != i2) {
            mo19309H(i, i + 1, i2);
        }
    }

    public AbstractC6618i2.C6620b m19944R(AbstractC6618i2.C6620b bVar) {
        boolean z = true;
        AbstractC6618i2.C6620b.C6621a d = new AbstractC6618i2.C6620b.C6621a().m19769b(bVar).m19767d(4, !mo19265h()).m19767d(5, m19934b0() && !mo19265h()).m19767d(6, m19937Y() && !mo19265h()).m19767d(7, !mo19302L().m19820w() && (m19937Y() || !m19935a0() || m19934b0()) && !mo19265h()).m19767d(8, m19938X() && !mo19265h()).m19767d(9, !mo19302L().m19820w() && (m19938X() || (m19935a0() && m19936Z())) && !mo19265h()).m19767d(10, !mo19265h()).m19767d(11, m19934b0() && !mo19265h());
        if (!m19934b0() || mo19265h()) {
            z = false;
        }
        return d.m19767d(12, z).m19766e();
    }

    public final long m19943S() {
        AbstractC6604g3 L = mo19302L();
        if (L.m19820w()) {
            return -9223372036854775807L;
        }
        return L.m19821t(mo19315D(), this.f20519a).m19793f();
    }

    public final C6660o1 m19942T() {
        AbstractC6604g3 L = mo19302L();
        if (L.m19820w()) {
            return null;
        }
        return L.m19821t(mo19315D(), this.f20519a).f20664c;
    }

    public final int m19941U() {
        AbstractC6604g3 L = mo19302L();
        if (L.m19820w()) {
            return -1;
        }
        return L.mo17346i(mo19315D(), m19939W(), mo19298N());
    }

    public final int m19940V() {
        AbstractC6604g3 L = mo19302L();
        if (L.m19820w()) {
            return -1;
        }
        return L.mo17345r(mo19315D(), m19939W(), mo19298N());
    }

    public final int m19939W() {
        int K = mo19304K();
        if (K == 1) {
            return 0;
        }
        return K;
    }

    public final boolean m19938X() {
        return m19941U() != -1;
    }

    public final boolean m19937Y() {
        return m19940V() != -1;
    }

    public final boolean m19936Z() {
        AbstractC6604g3 L = mo19302L();
        return !L.m19820w() && L.m19821t(mo19315D(), this.f20519a).f20653R;
    }

    public final boolean m19935a0() {
        AbstractC6604g3 L = mo19302L();
        return !L.m19820w() && L.m19821t(mo19315D(), this.f20519a).m19791h();
    }

    public final boolean m19934b0() {
        AbstractC6604g3 L = mo19302L();
        return !L.m19820w() && L.m19821t(mo19315D(), this.f20519a).f20652Q;
    }

    @Override
    public final void mo19780c(long j) {
        mo19259j(mo19315D(), j);
    }

    @Override
    public final void mo19779q(int i) {
        mo19232t(i, i + 1);
    }

    @Override
    public final int mo19778r() {
        return mo19302L().mo17297v();
    }

    @Override
    @Deprecated
    public final int mo19777u() {
        return mo19315D();
    }

    @Override
    public final void mo19776w(int i) {
        mo19259j(i, -9223372036854775807L);
    }

    @Override
    @Deprecated
    public final int mo19775y() {
        return m19940V();
    }
}
