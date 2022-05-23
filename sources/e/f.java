package e;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

public class f {
    public static Field f10414a;
    public static boolean f10415b;
    public static Class<?> f10416c;
    public static boolean f10417d;
    public static Field f10418e;
    public static boolean f10419f;
    public static Field f10420g;
    public static boolean f10421h;

    public static void a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            if (i10 >= 24) {
                d(resources);
            } else if (i10 >= 23) {
                c(resources);
            } else {
                b(resources);
            }
        }
    }

    public static void b(Resources resources) {
        if (!f10415b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f10414a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f10415b = true;
        }
        Field field = f10414a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void c(Resources resources) {
        if (!f10415b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f10414a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f10415b = true;
        }
        Object obj = null;
        Field field = f10414a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
        }
        if (obj != null) {
            e(obj);
        }
    }

    public static void d(Resources resources) {
        Object obj;
        if (!f10421h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f10420g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f10421h = true;
        }
        Field field = f10420g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                obj = null;
            }
            if (obj != null) {
                if (!f10415b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f10414a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e12) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                    }
                    f10415b = true;
                }
                Field field2 = f10414a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e13) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                    }
                }
                if (obj2 != null) {
                    e(obj2);
                }
            }
        }
    }

    public static void e(Object obj) {
        if (!f10417d) {
            try {
                f10416c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f10417d = true;
        }
        Class<?> cls = f10416c;
        if (cls != null) {
            if (!f10419f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f10418e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f10419f = true;
            }
            Field field = f10418e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
