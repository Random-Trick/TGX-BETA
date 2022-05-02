package p094g9;

import p106h9.C5039g;
import qa.C8298k;

public final class C4532a {
    public static final void m27483a(float[] fArr) {
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
    }

    public static final float[] m27482b(float[] fArr) {
        C8298k.m12934e(fArr, "$this$makeIdentity");
        m27483a(fArr);
        C5039g.m24202d(fArr);
        return fArr;
    }
}
