package gd;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p082fd.C4403w;

public class C4629f {
    public final ArrayList<C4619e> f15370a;

    public C4629f(C4619e eVar) {
        ArrayList<C4619e> arrayList = new ArrayList<>();
        this.f15370a = arrayList;
        arrayList.add(eVar);
    }

    public int m26797a(C4619e eVar) {
        ArrayList<C4619e> arrayList = this.f15370a;
        C4619e eVar2 = arrayList.get(arrayList.size() - 1);
        int C0 = C4779t2.m25716C0(eVar.m26858d(), false);
        if (C0 != C4779t2.m25716C0(eVar2.m26858d(), false) || C4779t2.m25469m5(C0, eVar2.m26858d(), eVar.m26858d())) {
            return 0;
        }
        if (eVar2.m26842t(eVar)) {
            return 2;
        }
        this.f15370a.add(eVar);
        return 1;
    }

    public ArrayList<C4619e> m26796b() {
        return this.f15370a;
    }

    public String m26795c() {
        return C4403w.m27914Y0(this.f15370a.get(0).m26858d(), TimeUnit.SECONDS, false);
    }

    public boolean m26794d() {
        return this.f15370a.isEmpty();
    }

    public int m26793e(C4619e eVar) {
        C4619e eVar2 = this.f15370a.get(0);
        int C0 = C4779t2.m25716C0(eVar.m26858d(), false);
        if (C0 != C4779t2.m25716C0(eVar2.m26858d(), false) || C4779t2.m25469m5(C0, eVar2.m26858d(), eVar.m26858d())) {
            return 0;
        }
        if (eVar2.m26842t(eVar)) {
            return 2;
        }
        this.f15370a.add(0, eVar);
        return 1;
    }

    public void m26792f(C4619e eVar) {
        this.f15370a.remove(eVar);
    }
}
