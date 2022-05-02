package p174m3;

import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;

public abstract class AbstractC6588e implements AbstractC6618i2 {
    public final AbstractC6604g3.C6608d f20519a = new AbstractC6604g3.C6608d();

    @Override
    @Deprecated
    public final int mo19781F() {
        return m19940U();
    }

    @Override
    public final void mo19780G(int i, int i2) {
        if (i != i2) {
            mo19308H(i, i + 1, i2);
        }
    }

    public AbstractC6618i2.C6620b m19943R(AbstractC6618i2.C6620b bVar) {
        boolean z = true;
        AbstractC6618i2.C6620b.C6621a d = new AbstractC6618i2.C6620b.C6621a().m19768b(bVar).m19766d(4, !mo19264h()).m19766d(5, m19933b0() && !mo19264h()).m19766d(6, m19936Y() && !mo19264h()).m19766d(7, !mo19301L().m19819w() && (m19936Y() || !m19934a0() || m19933b0()) && !mo19264h()).m19766d(8, m19937X() && !mo19264h()).m19766d(9, !mo19301L().m19819w() && (m19937X() || (m19934a0() && m19935Z())) && !mo19264h()).m19766d(10, !mo19264h()).m19766d(11, m19933b0() && !mo19264h());
        if (!m19933b0() || mo19264h()) {
            z = false;
        }
        return d.m19766d(12, z).m19765e();
    }

    public final long m19942S() {
        AbstractC6604g3 L = mo19301L();
        if (L.m19819w()) {
            return -9223372036854775807L;
        }
        return L.m19820t(mo19314D(), this.f20519a).m19792f();
    }

    public final C6660o1 m19941T() {
        AbstractC6604g3 L = mo19301L();
        if (L.m19819w()) {
            return null;
        }
        return L.m19820t(mo19314D(), this.f20519a).f20664c;
    }

    public final int m19940U() {
        AbstractC6604g3 L = mo19301L();
        if (L.m19819w()) {
            return -1;
        }
        return L.mo17346i(mo19314D(), m19938W(), mo19297N());
    }

    public final int m19939V() {
        AbstractC6604g3 L = mo19301L();
        if (L.m19819w()) {
            return -1;
        }
        return L.mo17345r(mo19314D(), m19938W(), mo19297N());
    }

    public final int m19938W() {
        int K = mo19303K();
        if (K == 1) {
            return 0;
        }
        return K;
    }

    public final boolean m19937X() {
        return m19940U() != -1;
    }

    public final boolean m19936Y() {
        return m19939V() != -1;
    }

    public final boolean m19935Z() {
        AbstractC6604g3 L = mo19301L();
        return !L.m19819w() && L.m19820t(mo19314D(), this.f20519a).f20653R;
    }

    public final boolean m19934a0() {
        AbstractC6604g3 L = mo19301L();
        return !L.m19819w() && L.m19820t(mo19314D(), this.f20519a).m19790h();
    }

    public final boolean m19933b0() {
        AbstractC6604g3 L = mo19301L();
        return !L.m19819w() && L.m19820t(mo19314D(), this.f20519a).f20652Q;
    }

    @Override
    public final void mo19779c(long j) {
        mo19258j(mo19314D(), j);
    }

    @Override
    public final void mo19778q(int i) {
        mo19231t(i, i + 1);
    }

    @Override
    public final int mo19777r() {
        return mo19301L().mo17297v();
    }

    @Override
    @Deprecated
    public final int mo19776u() {
        return mo19314D();
    }

    @Override
    public final void mo19775w(int i) {
        mo19258j(i, -9223372036854775807L);
    }

    @Override
    @Deprecated
    public final int mo19774y() {
        return m19939V();
    }
}
