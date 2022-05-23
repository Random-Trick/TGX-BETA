package y;

import androidx.camera.core.p;
import androidx.camera.core.q;
import androidx.camera.core.r;
import b1.h;
import java.util.ArrayList;
import java.util.List;

public class i1 implements q {
    public int f26315b;

    public i1(int i10) {
        this.f26315b = i10;
    }

    @Override
    public x0 a() {
        return p.a(this);
    }

    @Override
    public List<r> b(List<r> list) {
        ArrayList arrayList = new ArrayList();
        for (r rVar : list) {
            h.b(rVar instanceof a0, "The camera info doesn't contain internal implementation.");
            Integer c10 = ((a0) rVar).c();
            if (c10 != null && c10.intValue() == this.f26315b) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f26315b;
    }
}
