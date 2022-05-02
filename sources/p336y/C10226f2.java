package p336y;

import java.util.ArrayList;
import java.util.List;

public final class C10226f2 {
    public final List<AbstractC10231g2> f33003a = new ArrayList();

    public static void m5693b(List<int[]> list, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else if (i3 == iArr[i4]) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                m5693b(list, i, iArr, i2 + 1);
            }
        }
    }

    public boolean m5694a(AbstractC10231g2 g2Var) {
        return this.f33003a.add(g2Var);
    }

    public final List<int[]> m5692c(int i) {
        ArrayList arrayList = new ArrayList();
        m5693b(arrayList, i, new int[i], 0);
        return arrayList;
    }

    public boolean m5691d(List<AbstractC10231g2> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f33003a.size()) {
            return false;
        }
        for (int[] iArr : m5692c(this.f33003a.size())) {
            boolean z = true;
            for (int i = 0; i < this.f33003a.size() && (iArr[i] >= list.size() || ((z = z & this.f33003a.get(i).m5676d(list.get(iArr[i]))))); i++) {
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
