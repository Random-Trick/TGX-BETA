package ld;

import java.util.ArrayList;
import org.thunderdog.challegram.loader.a;

public class t {
    public h f16426a;
    public a f16427b;
    public ArrayList<y> f16428c;

    public t(h hVar, a aVar, y yVar) {
        this.f16426a = hVar;
        this.f16427b = aVar;
        ArrayList<y> arrayList = new ArrayList<>(2);
        this.f16428c = arrayList;
        arrayList.add(yVar);
    }

    public boolean a(y yVar) {
        ArrayList<y> arrayList = this.f16428c;
        if (arrayList == null || arrayList.contains(yVar)) {
            return false;
        }
        this.f16427b.l(yVar);
        this.f16428c.add(yVar);
        return true;
    }

    public a b() {
        return this.f16427b;
    }

    public h c() {
        return this.f16426a;
    }

    public ArrayList<y> d() {
        return this.f16428c;
    }

    public boolean e() {
        ArrayList<y> arrayList = this.f16428c;
        return arrayList != null && !arrayList.isEmpty();
    }

    public boolean f(y yVar) {
        ArrayList<y> arrayList = this.f16428c;
        if (arrayList == null || !arrayList.contains(yVar)) {
            return false;
        }
        this.f16428c.remove(yVar);
        return true;
    }
}
