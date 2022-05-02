package p336y;

import androidx.camera.core.AbstractC0638q;
import androidx.camera.core.AbstractC0642r;
import androidx.camera.core.C0632p;
import java.util.ArrayList;
import java.util.List;
import p016b1.C1132h;

public class C10241i1 implements AbstractC0638q {
    public int f33021b;

    public C10241i1(int i) {
        this.f33021b = i;
    }

    @Override
    public AbstractC10316x0 mo5664a() {
        return C0632p.m40706a(this);
    }

    @Override
    public List<AbstractC0642r> mo5663b(List<AbstractC0642r> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0642r rVar : list) {
            C1132h.m38328b(rVar instanceof AbstractC10194a0, "The camera info doesn't contain internal implementation.");
            Integer c = ((AbstractC10194a0) rVar).mo5776c();
            if (c != null && c.intValue() == this.f33021b) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    public int m5662c() {
        return this.f33021b;
    }
}
