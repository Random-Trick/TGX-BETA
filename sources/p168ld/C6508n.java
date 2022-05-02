package p168ld;

import java.util.ArrayList;

public class C6508n {
    public C6503j f20297a;
    public C6496e f20298b;
    public ArrayList<C6516s> f20299c;

    public C6508n(C6503j jVar, C6496e eVar, C6516s sVar) {
        this.f20297a = jVar;
        this.f20298b = eVar;
        ArrayList<C6516s> arrayList = new ArrayList<>(2);
        this.f20299c = arrayList;
        arrayList.add(sVar);
    }

    public boolean m20226a(C6516s sVar) {
        ArrayList<C6516s> arrayList = this.f20299c;
        if (arrayList == null || arrayList.contains(sVar)) {
            return false;
        }
        this.f20298b.m20337Q(sVar);
        this.f20299c.add(sVar);
        return true;
    }

    public C6496e m20225b() {
        return this.f20298b;
    }

    public C6503j m20224c() {
        return this.f20297a;
    }

    public ArrayList<C6516s> m20223d() {
        return this.f20299c;
    }

    public boolean m20222e() {
        ArrayList<C6516s> arrayList = this.f20299c;
        return arrayList != null && !arrayList.isEmpty();
    }

    public boolean m20221f(C6516s sVar) {
        ArrayList<C6516s> arrayList = this.f20299c;
        if (arrayList == null || !arrayList.contains(sVar)) {
            return false;
        }
        this.f20299c.remove(sVar);
        return true;
    }
}
