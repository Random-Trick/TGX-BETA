package p232q5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.lang.reflect.Method;
import p261s5.C8645b;

public class C8254n {
    public static final int f26705a = Process.myUid();
    public static final Method f26706b;
    public static final Method f26707c;
    public static final Method f26708d;
    public static final Method f26709e;
    public static final Method f26710f;
    public static final Method f26711g;
    public static final Method f26712h;

    static {
        throw new UnsupportedOperationException("Method not decompiled: p232q5.C8254n.<clinit>():void");
    }

    @RecentlyNullable
    public static WorkSource m13027a(@RecentlyNonNull Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo b = C8645b.m11820a(context).m11823b(str, 0);
                if (b == null) {
                    Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                    return null;
                }
                int i = b.uid;
                WorkSource workSource = new WorkSource();
                m13024d(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            }
        }
        return null;
    }

    @androidx.annotation.RecentlyNonNull
    public static java.util.List<java.lang.String> m13026b(android.os.WorkSource r10) {
        throw new UnsupportedOperationException("Method not decompiled: p232q5.C8254n.m13026b(android.os.WorkSource):java.util.List");
    }

    public static boolean m13025c(@RecentlyNonNull Context context) {
        return (context == null || context.getPackageManager() == null || C8645b.m11820a(context).m11824a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    public static void m13024d(@RecentlyNonNull WorkSource workSource, int i, String str) {
        Method method = f26707c;
        if (method != null) {
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f26706b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, Integer.valueOf(i));
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }
}
