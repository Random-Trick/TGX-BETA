package ic;

import hc.x;
import ra.k;

public final class c {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        k.e(iArr, "$this$binarySearch");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else if (i15 <= i10) {
                return i14;
            } else {
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(x xVar, int i10) {
        k.e(xVar, "$this$segment");
        int a10 = a(xVar.w(), i10 + 1, 0, xVar.x().length);
        return a10 >= 0 ? a10 : ~a10;
    }
}
