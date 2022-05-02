package p054e;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

public class C4098f {
    public static Field f13850a;
    public static boolean f13851b;
    public static Class<?> f13852c;
    public static boolean f13853d;
    public static Field f13854e;
    public static boolean f13855f;
    public static Field f13856g;
    public static boolean f13857h;

    public static void m28924a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m28921d(resources);
            } else if (i >= 23) {
                m28922c(resources);
            } else if (i >= 21) {
                m28923b(resources);
            }
        }
    }

    public static void m28923b(Resources resources) {
        if (!f13851b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f13850a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f13851b = true;
        }
        Field field = f13850a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void m28922c(Resources resources) {
        if (!f13851b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f13850a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f13851b = true;
        }
        Object obj = null;
        Field field = f13850a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m28920e(obj);
        }
    }

    public static void m28921d(Resources resources) {
        Object obj;
        if (!f13857h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f13856g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f13857h = true;
        }
        Field field = f13856g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f13851b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f13850a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f13851b = true;
                }
                Field field2 = f13850a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m28920e(obj2);
                }
            }
        }
    }

    public static void m28920e(Object obj) {
        if (!f13853d) {
            try {
                f13852c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f13853d = true;
        }
        Class<?> cls = f13852c;
        if (cls != null) {
            if (!f13855f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f13854e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f13855f = true;
            }
            Field field = f13854e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
