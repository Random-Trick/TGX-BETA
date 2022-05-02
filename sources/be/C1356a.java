package be;

import android.os.Build;
import p108hb.C5069h;

public class C1356a {
    public static final boolean f4950a;

    static {
        f4950a = Build.VERSION.SDK_INT >= 12;
    }

    public static float m37558a(float f) {
        return C5069h.m24089e(f, -0.2f, 1.0f);
    }
}
