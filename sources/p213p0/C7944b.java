package p213p0;

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

public final class C7944b {
    public static final Class<?> f25835a;
    public static final Method f25838d;
    public static final Method f25839e;
    public static final Method f25840f;
    public static final Handler f25841g = new Handler(Looper.getMainLooper());
    public static final Field f25836b = m14024b();
    public static final Field f25837c = m14020f();

    public class RunnableC7945a implements Runnable {
        public final C7948d f25842a;
        public final Object f25843b;

        public RunnableC7945a(C7948d dVar, Object obj) {
            this.f25842a = dVar;
            this.f25843b = obj;
        }

        @Override
        public void run() {
            this.f25842a.f25851a = this.f25843b;
        }
    }

    public class RunnableC7946b implements Runnable {
        public final Application f25844a;
        public final C7948d f25845b;

        public RunnableC7946b(Application application, C7948d dVar) {
            this.f25844a = application;
            this.f25845b = dVar;
        }

        @Override
        public void run() {
            this.f25844a.unregisterActivityLifecycleCallbacks(this.f25845b);
        }
    }

    public class RunnableC7947c implements Runnable {
        public final Object f25846a;
        public final Object f25847b;

        public RunnableC7947c(Object obj, Object obj2) {
            this.f25846a = obj;
            this.f25847b = obj2;
        }

        @Override
        public void run() {
            try {
                Method method = C7944b.f25838d;
                if (method != null) {
                    method.invoke(this.f25846a, this.f25847b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C7944b.f25839e.invoke(this.f25846a, this.f25847b, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    public static final class C7948d implements Application.ActivityLifecycleCallbacks {
        public boolean f25848M = false;
        public boolean f25849N = false;
        public boolean f25850O = false;
        public Object f25851a;
        public Activity f25852b;
        public final int f25853c;

        public C7948d(Activity activity) {
            this.f25852b = activity;
            this.f25853c = activity.hashCode();
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            if (this.f25852b == activity) {
                this.f25852b = null;
                this.f25849N = true;
            }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            if (this.f25849N && !this.f25850O && !this.f25848M && C7944b.m14018h(this.f25851a, this.f25853c, activity)) {
                this.f25850O = true;
                this.f25851a = null;
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
            if (this.f25852b == activity) {
                this.f25848M = true;
            }
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m14025a();
        f25835a = a;
        f25838d = m14022d(a);
        f25839e = m14023c(a);
        f25840f = m14021e(a);
    }

    public static Class<?> m14025a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field m14024b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method m14023c(Class<?> cls) {
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

    public static Method m14022d(Class<?> cls) {
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

    public static Method m14021e(Class<?> cls) {
        if (m14019g() && cls != null) {
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

    public static Field m14020f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean m14019g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean m14018h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f25837c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f25841g.postAtFrontOfQueue(new RunnableC7947c(f25836b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean m14017i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m14019g() && f25840f == null) {
            return false;
        } else {
            if (f25839e == null && f25838d == null) {
                return false;
            }
            try {
                Object obj2 = f25837c.get(activity);
                if (obj2 == null || (obj = f25836b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C7948d dVar = new C7948d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f25841g;
                handler.post(new RunnableC7945a(dVar, obj2));
                if (m14019g()) {
                    Method method = f25840f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC7946b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
