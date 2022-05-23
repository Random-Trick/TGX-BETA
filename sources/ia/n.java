package ia;

import java.util.Collection;
import ra.k;
import sa.a;

public final class n implements Collection<m>, a {
    public static int[] f(int i10) {
        return g(new int[i10]);
    }

    public static int[] g(int[] iArr) {
        k.e(iArr, "storage");
        return iArr;
    }

    public static final int m(int[] iArr, int i10) {
        return m.a(iArr[i10]);
    }

    public static int r(int[] iArr) {
        return iArr.length;
    }

    public static final void s(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }
}
