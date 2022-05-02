package p028c1;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

public final class C1455g {
    public static Field f5307a;
    public static boolean f5308b;

    public static void m36885a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f5308b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f5307a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f5308b = true;
        }
        Field field = f5307a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    public static void m36884b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m36885a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m36885a(layoutInflater, factory2);
            }
        }
    }
}
