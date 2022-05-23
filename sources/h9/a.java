package h9;

import i9.g;
import ra.k;

public final class a {
    public static final void a(float[] fArr) {
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
    }

    public static final float[] b(float[] fArr) {
        k.e(fArr, "$this$makeIdentity");
        a(fArr);
        g.d(fArr);
        return fArr;
    }
}
