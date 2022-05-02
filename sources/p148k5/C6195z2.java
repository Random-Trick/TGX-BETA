package p148k5;

import android.os.Bundle;
import p118i5.C5217a;
import p133j5.AbstractC5867f;
import p133j5.C5850a;
import p163l5.C6378r;

public final class C6195z2 implements AbstractC5867f.AbstractC5869b, AbstractC5867f.AbstractC5870c {
    public final C5850a<?> f19595a;
    public final boolean f19596b;
    public AbstractC6084a3 f19597c;

    public C6195z2(C5850a<?> aVar, boolean z) {
        this.f19595a = aVar;
        this.f19596b = z;
    }

    public final void m21082a(AbstractC6084a3 a3Var) {
        this.f19597c = a3Var;
    }

    public final AbstractC6084a3 m21081b() {
        C6378r.m20505l(this.f19597c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f19597c;
    }

    @Override
    public final void mo21080q(int i) {
        m21081b().mo21080q(i);
    }

    @Override
    public final void mo11484s(C5217a aVar) {
        m21081b().mo21119E0(aVar, this.f19595a, this.f19596b);
    }

    @Override
    public final void mo21079t(Bundle bundle) {
        m21081b().mo21079t(bundle);
    }
}
