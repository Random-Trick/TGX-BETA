package p213p0;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

public final class C7949c {

    public static class C7950a {
        public static int m14012a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        public static String m14011b(Context context) {
            return context.getOpPackageName();
        }

        public static AppOpsManager m14010c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int m14015a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m14014b(context, str, str2);
        }
        AppOpsManager c = C7950a.m14010c(context);
        int a = C7950a.m14012a(c, str, Binder.getCallingUid(), str2);
        return a != 0 ? a : C7950a.m14012a(c, str, i, C7950a.m14011b(context));
    }

    public static int m14014b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    public static String m14013c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
