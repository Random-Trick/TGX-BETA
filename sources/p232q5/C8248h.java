package p232q5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;

public final class C8248h {
    public static Boolean f26696a;
    public static Boolean f26697b;
    public static Boolean f26698c;
    public static Boolean f26699d;

    public static boolean m13050a(@RecentlyNonNull Context context) {
        return m13049b(context.getPackageManager());
    }

    public static boolean m13049b(@RecentlyNonNull PackageManager packageManager) {
        if (f26699d == null) {
            boolean z = false;
            if (C8251k.m13032g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f26699d = Boolean.valueOf(z);
        }
        return f26699d.booleanValue();
    }

    @TargetApi(20)
    public static boolean m13048c(@RecentlyNonNull Context context) {
        return m13047d(context.getPackageManager());
    }

    @TargetApi(20)
    public static boolean m13047d(@RecentlyNonNull PackageManager packageManager) {
        if (f26696a == null) {
            boolean z = false;
            if (C8251k.m13035d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f26696a = Boolean.valueOf(z);
        }
        return f26696a.booleanValue();
    }

    @TargetApi(26)
    public static boolean m13046e(@RecentlyNonNull Context context) {
        if (m13048c(context)) {
            if (!C8251k.m13033f()) {
                return true;
            }
            if (m13045f(context) && !C8251k.m13032g()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean m13045f(@RecentlyNonNull Context context) {
        if (f26697b == null) {
            boolean z = false;
            if (C8251k.m13034e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f26697b = Boolean.valueOf(z);
        }
        return f26697b.booleanValue();
    }

    public static boolean m13044g(@RecentlyNonNull Context context) {
        if (f26698c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f26698c = Boolean.valueOf(z);
        }
        return f26698c.booleanValue();
    }
}
