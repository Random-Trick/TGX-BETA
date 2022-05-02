package p227q0;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;
import p016b1.C1128d;
import p256s0.C8614h;
import p337y0.C10331e;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C8117a {
    public static final Object f26400a = new Object();
    public static final Object f26401b = new Object();
    public static TypedValue f26402c;

    public static class C8118a {
        public static void m13430a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void m13429b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    public static class C8119b {
        public static File[] m13428a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] m13427b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] m13426c(Context context) {
            return context.getObbDirs();
        }
    }

    public static class C8120c {
        public static File m13425a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable m13424b(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File m13423c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class C8121d {
        public static int m13422a(Context context, int i) {
            return context.getColor(i);
        }

        public static <T> T m13421b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String m13420c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class C8122e {
        public static Context m13419a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File m13418b(Context context) {
            return context.getDataDir();
        }

        public static boolean m13417c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static class C8123f {
        public static ComponentName m13416a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static class C8124g {
        public static Executor m13415a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int m13443a(Context context, String str) {
        C1128d.m38331c(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static Context m13442b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C8122e.m13419a(context);
        }
        return null;
    }

    public static File m13441c(File file) {
        synchronized (f26401b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static int m13440d(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C8121d.m13422a(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static ColorStateList m13439e(Context context, int i) {
        return C8614h.m11920c(context.getResources(), i, context.getTheme());
    }

    public static Drawable m13438f(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C8120c.m13424b(context, i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f26400a) {
            if (f26402c == null) {
                f26402c = new TypedValue();
            }
            context.getResources().getValue(i, f26402c, true);
            i2 = f26402c.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static File[] m13437g(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? C8119b.m13428a(context) : new File[]{context.getExternalCacheDir()};
    }

    public static File[] m13436h(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? C8119b.m13427b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static Executor m13435i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C8124g.m13415a(context);
        }
        return C10331e.m5410a(new Handler(context.getMainLooper()));
    }

    public static File m13434j(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C8120c.m13423c(context);
        }
        return m13441c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static boolean m13433k(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C8118a.m13430a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void m13432l(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C8118a.m13429b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void m13431m(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C8123f.m13416a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
