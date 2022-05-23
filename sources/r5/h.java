package r5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;

public final class h {
    public static Boolean f21739a;
    public static Boolean f21740b;
    public static Boolean f21741c;
    public static Boolean f21742d;

    public static boolean a(@RecentlyNonNull Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(@RecentlyNonNull PackageManager packageManager) {
        if (f21742d == null) {
            boolean z10 = false;
            if (k.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f21742d = Boolean.valueOf(z10);
        }
        return f21742d.booleanValue();
    }

    @TargetApi(20)
    public static boolean c(@RecentlyNonNull Context context) {
        return d(context.getPackageManager());
    }

    @TargetApi(20)
    public static boolean d(@RecentlyNonNull PackageManager packageManager) {
        if (f21739a == null) {
            boolean z10 = false;
            if (k.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f21739a = Boolean.valueOf(z10);
        }
        return f21739a.booleanValue();
    }

    @TargetApi(26)
    public static boolean e(@RecentlyNonNull Context context) {
        if (c(context)) {
            if (!k.f()) {
                return true;
            }
            if (f(context) && !k.g()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean f(@RecentlyNonNull Context context) {
        if (f21740b == null) {
            boolean z10 = false;
            if (k.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f21740b = Boolean.valueOf(z10);
        }
        return f21740b.booleanValue();
    }

    public static boolean g(@RecentlyNonNull Context context) {
        if (f21741c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f21741c = Boolean.valueOf(z10);
        }
        return f21741c.booleanValue();
    }
}
