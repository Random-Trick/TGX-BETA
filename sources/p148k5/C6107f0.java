package p148k5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import p118i5.C5217a;
import p118i5.C5221e;
import p133j5.C5850a;
import p134j6.AbstractC5891f;
import p163l5.C6360l0;

public final class C6107f0 extends AbstractRunnableC6131k0 {
    public final Map<C5850a.AbstractC5859f, C6092c0> f19387b;
    public final C6135l0 f19388c;

    public C6107f0(C6135l0 l0Var, Map<C5850a.AbstractC5859f, C6092c0> map) {
        super(l0Var, null);
        this.f19388c = l0Var;
        this.f19387b = map;
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21232a() {
        C5221e eVar;
        boolean z;
        Context context;
        C6173u0 u0Var;
        AbstractC5891f fVar;
        AbstractC5891f fVar2;
        C6173u0 u0Var2;
        Context context2;
        Context context3;
        boolean z2;
        eVar = this.f19388c.f19444d;
        C6360l0 l0Var = new C6360l0(eVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C5850a.AbstractC5859f fVar3 : this.f19387b.keySet()) {
            if (fVar3.mo21241o()) {
                z2 = this.f19387b.get(fVar3).f19328c;
                if (!z2) {
                    arrayList.add(fVar3);
                }
            }
            arrayList2.add(fVar3);
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                context3 = this.f19388c.f19443c;
                i = l0Var.m20554a(context3, (C5850a.AbstractC5859f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                context2 = this.f19388c.f19443c;
                i = l0Var.m20554a(context2, (C5850a.AbstractC5859f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            C5217a aVar = new C5217a(i, null);
            u0Var2 = this.f19388c.f19441a;
            u0Var2.m21108k(new C6097d0(this, this.f19388c, aVar));
            return;
        }
        z = this.f19388c.f19453m;
        if (z) {
            fVar = this.f19388c.f19451k;
            if (fVar != null) {
                fVar2 = this.f19388c.f19451k;
                fVar2.mo21078c();
            }
        }
        for (C5850a.AbstractC5859f fVar4 : this.f19387b.keySet()) {
            C6092c0 c0Var = this.f19387b.get(fVar4);
            if (fVar4.mo21241o()) {
                context = this.f19388c.f19443c;
                if (l0Var.m20554a(context, fVar4) != 0) {
                    u0Var = this.f19388c.f19441a;
                    u0Var.m21108k(new C6102e0(this, this.f19388c, c0Var));
                }
            }
            fVar4.mo21244i(c0Var);
        }
    }
}
