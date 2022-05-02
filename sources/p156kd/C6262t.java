package p156kd;

import java.util.ArrayList;
import org.thunderdog.challegram.loader.C7906a;

public class C6262t {
    public C6246h f19783a;
    public C7906a f19784b;
    public ArrayList<C6267y> f19785c;

    public C6262t(C6246h hVar, C7906a aVar, C6267y yVar) {
        this.f19783a = hVar;
        this.f19784b = aVar;
        ArrayList<C6267y> arrayList = new ArrayList<>(2);
        this.f19785c = arrayList;
        arrayList.add(yVar);
    }

    public boolean m20766a(C6267y yVar) {
        ArrayList<C6267y> arrayList = this.f19785c;
        if (arrayList == null || arrayList.contains(yVar)) {
            return false;
        }
        this.f19784b.m14373l(yVar);
        this.f19785c.add(yVar);
        return true;
    }

    public C7906a m20765b() {
        return this.f19784b;
    }

    public C6246h m20764c() {
        return this.f19783a;
    }

    public ArrayList<C6267y> m20763d() {
        return this.f19785c;
    }

    public boolean m20762e() {
        ArrayList<C6267y> arrayList = this.f19785c;
        return arrayList != null && !arrayList.isEmpty();
    }

    public boolean m20761f(C6267y yVar) {
        ArrayList<C6267y> arrayList = this.f19785c;
        if (arrayList == null || !arrayList.contains(yVar)) {
            return false;
        }
        this.f19785c.remove(yVar);
        return true;
    }
}
