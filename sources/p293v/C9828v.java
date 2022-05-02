package p293v;

import android.os.Build;
import p055e0.AbstractC4105d;
import p266t.C8927z;

public final class C9828v implements AbstractC4105d {
    public static boolean m6788a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean m6787b() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean m6786c() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean m6785d(C8927z zVar) {
        return m6788a() || m6787b() || m6786c();
    }
}
