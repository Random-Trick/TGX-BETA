package p113i0;

import android.os.Build;
import p336y.AbstractC10311w1;

public class C5162d implements AbstractC10311w1 {
    public static boolean m23788a() {
        String str = Build.DEVICE;
        return "F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str);
    }

    public static boolean m23787b() {
        return "SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER) && m23788a();
    }
}
