package l5;

import android.content.Context;
import j5.e;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import k5.a;
import k6.f;
import m5.l0;

public final class f0 extends k0 {
    public final Map<a.f, c0> f16084b;
    public final l0 f16085c;

    public f0(l0 l0Var, Map<a.f, c0> map) {
        super(l0Var, null);
        this.f16085c = l0Var;
        this.f16084b = map;
    }

    @Override
    @GuardedBy("mLock")
    public final void a() {
        e eVar;
        boolean z10;
        Context context;
        u0 u0Var;
        f fVar;
        f fVar2;
        u0 u0Var2;
        Context context2;
        Context context3;
        boolean z11;
        eVar = this.f16085c.f16131d;
        l0 l0Var = new l0(eVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar3 : this.f16084b.keySet()) {
            if (fVar3.n()) {
                z11 = this.f16084b.get(fVar3).f16040c;
                if (!z11) {
                    arrayList.add(fVar3);
                }
            }
            arrayList2.add(fVar3);
        }
        int i10 = -1;
        int i11 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i11 < size) {
                context3 = this.f16085c.f16130c;
                i10 = l0Var.a(context3, (a.f) arrayList2.get(i11));
                i11++;
                if (i10 == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i11 < size2) {
                context2 = this.f16085c.f16130c;
                i10 = l0Var.a(context2, (a.f) arrayList.get(i11));
                i11++;
                if (i10 != 0) {
                    break;
                }
            }
        }
        if (i10 != 0) {
            j5.a aVar = new j5.a(i10, null);
            u0Var2 = this.f16085c.f16128a;
            u0Var2.k(new d0(this, this.f16085c, aVar));
            return;
        }
        z10 = this.f16085c.f16140m;
        if (z10) {
            fVar = this.f16085c.f16138k;
            if (fVar != null) {
                fVar2 = this.f16085c.f16138k;
                fVar2.c();
            }
        }
        for (a.f fVar4 : this.f16084b.keySet()) {
            c0 c0Var = this.f16084b.get(fVar4);
            if (fVar4.n()) {
                context = this.f16085c.f16130c;
                if (l0Var.a(context, fVar4) != 0) {
                    u0Var = this.f16085c.f16128a;
                    u0Var.k(new e0(this, this.f16085c, c0Var));
                }
            }
            fVar4.r(c0Var);
        }
    }
}
