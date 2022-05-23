package i0;

import android.os.Build;
import y.w1;

public class c implements w1 {
    public static boolean a() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
