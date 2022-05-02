package p232q5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;

public final class C8248h {
    public static Boolean f26699a;
    public static Boolean f26700b;
    public static Boolean f26701c;
    public static Boolean f26702d;

    public static boolean m13049a(@RecentlyNonNull Context context) {
        return m13048b(context.getPackageManager());
    }

    public static boolean m13048b(@RecentlyNonNull PackageManager packageManager) {
        if (f26702d == null) {
            boolean z = false;
            if (C8251k.m13031g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f26702d = Boolean.valueOf(z);
        }
        return f26702d.booleanValue();
    }

    @TargetApi(20)
    public static boolean m13047c(@RecentlyNonNull Context context) {
        return m13046d(context.getPackageManager());
    }

    @TargetApi(20)
    public static boolean m13046d(@RecentlyNonNull PackageManager packageManager) {
        if (f26699a == null) {
            boolean z = false;
            if (C8251k.m13034d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f26699a = Boolean.valueOf(z);
        }
        return f26699a.booleanValue();
    }

    @TargetApi(26)
    public static boolean m13045e(@RecentlyNonNull Context context) {
        if (m13047c(context)) {
            if (!C8251k.m13032f()) {
                return true;
            }
            if (m13044f(context) && !C8251k.m13031g()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean m13044f(@RecentlyNonNull Context context) {
        if (f26700b == null) {
            boolean z = false;
            if (C8251k.m13033e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f26700b = Boolean.valueOf(z);
        }
        return f26700b.booleanValue();
    }

    public static boolean m13043g(@RecentlyNonNull Context context) {
        if (f26701c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f26701c = Boolean.valueOf(z);
        }
        return f26701c.booleanValue();
    }
}
