package p109hc;

import p095gc.C4571x;
import qa.C8298k;

public final class C5074c {
    public static final int m24035a(int[] iArr, int i, int i2, int i3) {
        C8298k.m12933e(iArr, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int m24034b(C4571x xVar, int i) {
        C8298k.m12933e(xVar, "$this$segment");
        int a = m24035a(xVar.m27307w(), i + 1, 0, xVar.m27306x().length);
        return a >= 0 ? a : ~a;
    }
}
