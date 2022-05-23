package hd;

import gd.w;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class f {
    public final ArrayList<e> f12955a;

    public f(e eVar) {
        ArrayList<e> arrayList = new ArrayList<>();
        this.f12955a = arrayList;
        arrayList.add(eVar);
    }

    public int a(e eVar) {
        ArrayList<e> arrayList = this.f12955a;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        int C0 = t2.C0(eVar.d(), false);
        if (C0 != t2.C0(eVar2.d(), false) || t2.m5(C0, eVar2.d(), eVar.d())) {
            return 0;
        }
        if (eVar2.t(eVar)) {
            return 2;
        }
        this.f12955a.add(eVar);
        return 1;
    }

    public ArrayList<e> b() {
        return this.f12955a;
    }

    public String c() {
        return w.Y0(this.f12955a.get(0).d(), TimeUnit.SECONDS, false);
    }

    public boolean d() {
        return this.f12955a.isEmpty();
    }

    public int e(e eVar) {
        e eVar2 = this.f12955a.get(0);
        int C0 = t2.C0(eVar.d(), false);
        if (C0 != t2.C0(eVar2.d(), false) || t2.m5(C0, eVar2.d(), eVar.d())) {
            return 0;
        }
        if (eVar2.t(eVar)) {
            return 2;
        }
        this.f12955a.add(0, eVar);
        return 1;
    }

    public void f(e eVar) {
        this.f12955a.remove(eVar);
    }
}
