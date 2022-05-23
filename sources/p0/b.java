package p0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public final class b {
    public static final Class<?> f20240a;
    public static final Method f20243d;
    public static final Method f20244e;
    public static final Method f20245f;
    public static final Handler f20246g = new Handler(Looper.getMainLooper());
    public static final Field f20241b = b();
    public static final Field f20242c = f();

    public class a implements Runnable {
        public final d f20247a;
        public final Object f20248b;

        public a(d dVar, Object obj) {
            this.f20247a = dVar;
            this.f20248b = obj;
        }

        @Override
        public void run() {
            this.f20247a.f20253a = this.f20248b;
        }
    }

    public class RunnableC0176b implements Runnable {
        public final Application f20249a;
        public final d f20250b;

        public RunnableC0176b(Application application, d dVar) {
            this.f20249a = application;
            this.f20250b = dVar;
        }

        @Override
        public void run() {
            this.f20249a.unregisterActivityLifecycleCallbacks(this.f20250b);
        }
    }

    public class c implements Runnable {
        public final Object f20251a;
        public final Object f20252b;

        public c(Object obj, Object obj2) {
            this.f20251a = obj;
            this.f20252b = obj2;
        }

        @Override
        public void run() {
            try {
                Method method = b.f20243d;
                if (method != null) {
                    method.invoke(this.f20251a, this.f20252b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    b.f20244e.invoke(this.f20251a, this.f20252b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    public static final class d implements Application.ActivityLifecycleCallbacks {
        public boolean M = false;
        public boolean N = false;
        public boolean O = false;
        public Object f20253a;
        public Activity f20254b;
        public final int f20255c;

        public d(Activity activity) {
            this.f20254b = activity;
            this.f20255c = activity.hashCode();
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            if (this.f20254b == activity) {
                this.f20254b = null;
                this.N = true;
            }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            if (this.N && !this.O && !this.M && b.h(this.f20253a, this.f20255c, activity)) {
                this.O = true;
                this.f20253a = null;
            }
        }

        @Override
        public void onActivityResumed(Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityStarted(Activity activity) {
            if (this.f20254b == activity) {
                this.M = true;
            }
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f20240a = a10;
        f20243d = d(a10);
        f20244e = c(a10);
        f20245f = e(a10);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f20242c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f20246g.postAtFrontOfQueue(new c(f20241b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f20245f == null) {
            return false;
        } else {
            if (f20244e == null && f20243d == null) {
                return false;
            }
            try {
                Object obj2 = f20242c.get(activity);
                if (obj2 == null || (obj = f20241b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f20246g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f20245f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC0176b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
