package f1;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class j {
    public static Method f11780a;
    public static boolean f11781b;
    public static Field f11782c;
    public static boolean f11783d;

    public static class a {
        public static void a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    public static class b {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        public static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.c(popupWindow, z10);
            return;
        }
        if (!f11783d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f11782c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            f11783d = true;
        }
        Field field = f11782c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z10));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i10);
            return;
        }
        if (!f11781b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f11780a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f11781b = true;
        }
        Method method = f11780a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        a.a(popupWindow, view, i10, i11, i12);
    }
}
