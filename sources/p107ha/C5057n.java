package p107ha;

import java.util.Collection;
import p251ra.AbstractC8415a;
import qa.C8298k;

public final class C5057n implements Collection<C5055m>, AbstractC8415a {
    public static int[] m24187h(int i) {
        return m24186i(new int[i]);
    }

    public static int[] m24186i(int[] iArr) {
        C8298k.m12933e(iArr, "storage");
        return iArr;
    }

    public static final int m24185m(int[] iArr, int i) {
        C8298k.m12933e(iArr, "arg0");
        return C5055m.m24188a(iArr[i]);
    }

    public static int m24184r(int[] iArr) {
        C8298k.m12933e(iArr, "arg0");
        return iArr.length;
    }

    public static final void m24183s(int[] iArr, int i, int i2) {
        C8298k.m12933e(iArr, "arg0");
        iArr[i] = i2;
    }
}
