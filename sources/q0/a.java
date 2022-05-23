package q0;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import java.util.concurrent.Executor;
import s0.h;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class a {
    public static final Object f21196a = new Object();
    public static final Object f21197b = new Object();

    public static class C0189a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class d {
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static class f {
        public static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static class g {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static Context a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    public static int b(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.a(context, i10);
        }
        return context.getResources().getColor(i10);
    }

    public static ColorStateList c(Context context, int i10) {
        return h.c(context.getResources(), i10, context.getTheme());
    }

    public static Drawable d(Context context, int i10) {
        return c.b(context, i10);
    }

    public static File[] e(Context context) {
        return b.a(context);
    }

    public static File[] f(Context context, String str) {
        return b.b(context, str);
    }

    public static Executor g(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return y0.e.a(new Handler(context.getMainLooper()));
    }

    public static File h(Context context) {
        return c.c(context);
    }

    public static boolean i(Context context, Intent[] intentArr, Bundle bundle) {
        C0189a.a(context, intentArr, bundle);
        return true;
    }

    public static void j(Context context, Intent intent, Bundle bundle) {
        C0189a.b(context, intent, bundle);
    }

    public static void k(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
