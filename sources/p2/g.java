package p2;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.a;
import f2.j;
import java.lang.reflect.Method;
import java.util.List;

public class g {
    public static final String f20420a = j.f("ProcessUtils");

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, g.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            j.c().a(f20420a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static boolean b(Context context, a aVar) {
        String a10 = a(context);
        if (!TextUtils.isEmpty(aVar.c())) {
            return TextUtils.equals(a10, aVar.c());
        }
        return TextUtils.equals(a10, context.getApplicationInfo().processName);
    }
}
