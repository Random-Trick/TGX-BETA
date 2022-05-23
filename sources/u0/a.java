package u0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a {
    public static Method f23453a;
    public static boolean f23454b;
    public static Method f23455c;
    public static boolean f23456d;

    public static void a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static int c(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter d(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static int e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f23456d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f23455c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            f23456d = true;
        }
        Method method = f23455c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                f23455c = null;
            }
        }
        return 0;
    }

    public static void f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean g(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void i(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void j(Drawable drawable, float f10, float f11) {
        drawable.setHotspot(f10, f11);
    }

    public static void k(Drawable drawable, int i10, int i11, int i12, int i13) {
        drawable.setHotspotBounds(i10, i11, i12, i13);
    }

    public static boolean l(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i10);
        }
        if (!f23454b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f23453a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f23454b = true;
        }
        Method method = f23453a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f23453a = null;
            }
        }
        return false;
    }

    public static void m(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }

    public static void n(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void o(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static <T extends Drawable> T p(Drawable drawable) {
        return drawable instanceof c ? (T) ((c) drawable).b() : drawable;
    }

    public static Drawable q(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof b)) ? new e(drawable) : drawable;
    }
}
