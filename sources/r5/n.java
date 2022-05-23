package r5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.lang.reflect.Method;
import t5.b;

public class n {
    public static final int f21748a = Process.myUid();
    public static final Method f21749b;
    public static final Method f21750c;
    public static final Method f21751d;
    public static final Method f21752e;
    public static final Method f21753f;
    public static final Method f21754g;
    public static final Method f21755h;

    static {
        throw new UnsupportedOperationException("Method not decompiled: r5.n.<clinit>():void");
    }

    @RecentlyNullable
    public static WorkSource a(@RecentlyNonNull Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo b10 = b.a(context).b(str, 0);
                if (b10 == null) {
                    Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                    return null;
                }
                int i10 = b10.uid;
                WorkSource workSource = new WorkSource();
                d(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            }
        }
        return null;
    }

    @androidx.annotation.RecentlyNonNull
    public static java.util.List<java.lang.String> b(android.os.WorkSource r10) {
        throw new UnsupportedOperationException("Method not decompiled: r5.n.b(android.os.WorkSource):java.util.List");
    }

    public static boolean c(@RecentlyNonNull Context context) {
        return (context == null || context.getPackageManager() == null || b.a(context).a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    public static void d(@RecentlyNonNull WorkSource workSource, int i10, String str) {
        Method method = f21750c;
        if (method != null) {
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        } else {
            Method method2 = f21749b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, Integer.valueOf(i10));
                } catch (Exception e11) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                }
            }
        }
    }
}
