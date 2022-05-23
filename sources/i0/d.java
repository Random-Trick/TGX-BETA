package i0;

import android.os.Build;
import y.w1;

public class d implements w1 {
    public static boolean a() {
        String str = Build.DEVICE;
        return "F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str);
    }

    public static boolean b() {
        return "SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER) && a();
    }
}
