package p148k5;

import java.util.ArrayList;
import p133j5.C5850a;
import p163l5.AbstractC6355k;

public final class C6112g0 extends AbstractRunnableC6131k0 {
    public final ArrayList<C5850a.AbstractC5859f> f19399b;
    public final C6135l0 f19400c;

    public C6112g0(C6135l0 l0Var, ArrayList<C5850a.AbstractC5859f> arrayList) {
        super(l0Var, null);
        this.f19400c = l0Var;
        this.f19399b = arrayList;
    }

    @Override
    public final void mo21232a() {
        C6173u0 u0Var;
        AbstractC6355k kVar;
        C6173u0 u0Var2;
        u0Var = this.f19400c.f19441a;
        u0Var.f19566n.f19512p = C6135l0.m21204z(this.f19400c);
        ArrayList<C5850a.AbstractC5859f> arrayList = this.f19399b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kVar = this.f19400c.f19455o;
            u0Var2 = this.f19400c.f19441a;
            arrayList.get(i).mo21242n(kVar, u0Var2.f19566n.f19512p);
        }
    }
}
