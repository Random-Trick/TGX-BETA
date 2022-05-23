package l5;

import java.util.ArrayList;
import k5.a;
import m5.k;

public final class g0 extends k0 {
    public final ArrayList<a.f> f16096b;
    public final l0 f16097c;

    public g0(l0 l0Var, ArrayList<a.f> arrayList) {
        super(l0Var, null);
        this.f16097c = l0Var;
        this.f16096b = arrayList;
    }

    @Override
    public final void a() {
        u0 u0Var;
        k kVar;
        u0 u0Var2;
        u0Var = this.f16097c.f16128a;
        u0Var.f16252n.f16199p = l0.z(this.f16097c);
        ArrayList<a.f> arrayList = this.f16096b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            kVar = this.f16097c.f16142o;
            u0Var2 = this.f16097c.f16128a;
            arrayList.get(i10).g(kVar, u0Var2.f16252n.f16199p);
        }
    }
}
