package v;

import android.os.Build;
import e0.d;
import t.z;

public final class v implements d {
    public static boolean a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean c() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d(z zVar) {
        return a() || b() || c();
    }
}
