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
    public static final Class<?> f25838a;
    public static final Method f25841d;
    public static final Method f25842e;
    public static final Method f25843f;
    public static final Handler f25844g = new Handler(Looper.getMainLooper());
    public static final Field f25839b = m14023b();
    public static final Field f25840c = m14019f();

    public class RunnableC7945a implements Runnable {
        public final C7948d f25845a;
        public final Object f25846b;

        public RunnableC7945a(C7948d dVar, Object obj) {
            this.f25845a = dVar;
            this.f25846b = obj;
        }

        @Override
        public void run() {
            this.f25845a.f25854a = this.f25846b;
        }
    }

    public class RunnableC7946b implements Runnable {
        public final Application f25847a;
        public final C7948d f25848b;

        public RunnableC7946b(Application application, C7948d dVar) {
            this.f25847a = application;
            this.f25848b = dVar;
        }

        @Override
        public void run() {
            this.f25847a.unregisterActivityLifecycleCallbacks(this.f25848b);
        }
    }

    public class RunnableC7947c implements Runnable {
        public final Object f25849a;
        public final Object f25850b;

        public RunnableC7947c(Object obj, Object obj2) {
            this.f25849a = obj;
            this.f25850b = obj2;
        }

        @Override
        public void run() {
            try {
                Method method = C7944b.f25841d;
                if (method != null) {
                    method.invoke(this.f25849a, this.f25850b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C7944b.f25842e.invoke(this.f25849a, this.f25850b, Boolean.FALSE);
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
        public boolean f25851M = false;
        public boolean f25852N = false;
        public boolean f25853O = false;
        public Object f25854a;
        public Activity f25855b;
        public final int f25856c;

        public C7948d(Activity activity) {
            this.f25855b = activity;
            this.f25856c = activity.hashCode();
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            if (this.f25855b == activity) {
                this.f25855b = null;
                this.f25852N = true;
            }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            if (this.f25852N && !this.f25853O && !this.f25851M && C7944b.m14017h(this.f25854a, this.f25856c, activity)) {
                this.f25853O = true;
                this.f25854a = null;
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
            if (this.f25855b == activity) {
                this.f25851M = true;
            }
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m14024a();
        f25838a = a;
        f25841d = m14021d(a);
        f25842e = m14022c(a);
        f25843f = m14020e(a);
    }

    public static Class<?> m14024a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field m14023b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method m14022c(Class<?> cls) {
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

    public static Method m14021d(Class<?> cls) {
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

    public static Method m14020e(Class<?> cls) {
        if (m14018g() && cls != null) {
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

    public static Field m14019f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean m14018g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean m14017h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f25840c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f25844g.postAtFrontOfQueue(new RunnableC7947c(f25839b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean m14016i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m14018g() && f25843f == null) {
            return false;
        } else {
            if (f25842e == null && f25841d == null) {
                return false;
            }
            try {
                Object obj2 = f25840c.get(activity);
                if (obj2 == null || (obj = f25839b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C7948d dVar = new C7948d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f25844g;
                handler.post(new RunnableC7945a(dVar, obj2));
                if (m14018g()) {
                    Method method = f25843f;
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
