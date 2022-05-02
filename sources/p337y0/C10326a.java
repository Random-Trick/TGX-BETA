package p337y0;

import android.os.Build;

public class C10326a {
    public static boolean m5420a(String str, String str2) {
        return !"REL".equals(str2) && str2.compareTo(str) >= 0;
    }

    @Deprecated
    public static boolean m5419b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean m5418c() {
        return Build.VERSION.SDK_INT >= 31 || m5420a("S", Build.VERSION.CODENAME);
    }
}
