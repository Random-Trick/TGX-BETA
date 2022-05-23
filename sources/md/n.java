package md;

import java.util.ArrayList;

public class n {
    public j f17457a;
    public e f17458b;
    public ArrayList<s> f17459c;

    public n(j jVar, e eVar, s sVar) {
        this.f17457a = jVar;
        this.f17458b = eVar;
        ArrayList<s> arrayList = new ArrayList<>(2);
        this.f17459c = arrayList;
        arrayList.add(sVar);
    }

    public boolean a(s sVar) {
        ArrayList<s> arrayList = this.f17459c;
        if (arrayList == null || arrayList.contains(sVar)) {
            return false;
        }
        this.f17458b.Q(sVar);
        this.f17459c.add(sVar);
        return true;
    }

    public e b() {
        return this.f17458b;
    }

    public j c() {
        return this.f17457a;
    }

    public ArrayList<s> d() {
        return this.f17459c;
    }

    public boolean e() {
        ArrayList<s> arrayList = this.f17459c;
        return arrayList != null && !arrayList.isEmpty();
    }

    public boolean f(s sVar) {
        ArrayList<s> arrayList = this.f17459c;
        if (arrayList == null || !arrayList.contains(sVar)) {
            return false;
        }
        this.f17459c.remove(sVar);
        return true;
    }
}
