package w;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import v.i;
import v.s;
import y.g2;

public class k {
    public final s f25686a;

    public k() {
        this((s) i.a(s.class));
    }

    public List<Size> a(g2.b bVar, List<Size> list) {
        Size c10;
        s sVar = this.f25686a;
        if (sVar == null || (c10 = sVar.c(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c10);
        for (Size size : list) {
            if (!size.equals(c10)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public k(s sVar) {
        this.f25686a = sVar;
    }
}
