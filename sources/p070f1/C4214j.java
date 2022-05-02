package p070f1;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p028c1.C1450e;
import p028c1.C1489y;

public final class C4214j {
    public static Method f14233a;
    public static boolean f14234b;
    public static Field f14235c;
    public static boolean f14236d;

    public static class C4215a {
        public static void m28420a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    public static class C4216b {
        public static boolean m28419a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int m28418b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void m28417c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        public static void m28416d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static void m28423a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C4216b.m28417c(popupWindow, z);
        } else if (i >= 21) {
            if (!f14236d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f14235c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f14236d = true;
            }
            Field field = f14235c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    public static void m28422b(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C4216b.m28416d(popupWindow, i);
            return;
        }
        if (!f14234b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f14233a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f14234b = true;
        }
        Method method = f14233a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static void m28421c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            C4215a.m28420a(popupWindow, view, i, i2, i3);
            return;
        }
        if ((C1450e.m36889b(i3, C1489y.m36705v(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }
}
