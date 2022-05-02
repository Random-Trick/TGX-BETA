package p306w;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p293v.C9814i;
import p293v.C9824s;
import p336y.AbstractC10231g2;

public class C9933k {
    public final C9824s f32314a;

    public C9933k() {
        this((C9824s) C9814i.m6817a(C9824s.class));
    }

    public List<Size> m6466a(AbstractC10231g2.EnumC10233b bVar, List<Size> list) {
        Size c;
        C9824s sVar = this.f32314a;
        if (sVar == null || (c = sVar.m6790c(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        for (Size size : list) {
            if (!size.equals(c)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public C9933k(C9824s sVar) {
        this.f32314a = sVar;
    }
}
