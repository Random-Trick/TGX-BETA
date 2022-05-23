package y;

import java.util.ArrayList;
import java.util.List;

public final class f2 {
    public final List<g2> f26306a = new ArrayList();

    public static void b(List<int[]> list, int i10, int[] iArr, int i11) {
        boolean z10;
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    z10 = false;
                    break;
                } else if (i12 == iArr[i13]) {
                    z10 = true;
                    break;
                } else {
                    i13++;
                }
            }
            if (!z10) {
                iArr[i11] = i12;
                b(list, i10, iArr, i11 + 1);
            }
        }
    }

    public boolean a(g2 g2Var) {
        return this.f26306a.add(g2Var);
    }

    public final List<int[]> c(int i10) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    public boolean d(List<g2> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f26306a.size()) {
            return false;
        }
        for (int[] iArr : c(this.f26306a.size())) {
            boolean z10 = true;
            for (int i10 = 0; i10 < this.f26306a.size() && (iArr[i10] >= list.size() || ((z10 = z10 & this.f26306a.get(i10).d(list.get(iArr[i10]))))); i10++) {
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
