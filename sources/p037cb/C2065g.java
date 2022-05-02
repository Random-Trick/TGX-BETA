package p037cb;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

public final class C2065g {
    public static void m35721a(View view) {
        try {
            Method declaredMethod = view.getClass().getDeclaredMethod("resetTouch", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(view, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static void m35720b(View view, boolean z, boolean z2) {
        if (view != null) {
            int i = 0;
            int i2 = z ? 0 : 3;
            if (z2) {
                i = 2;
            }
            view.performHapticFeedback(i2, i);
        }
    }

    public static void m35719c(View view) {
        if (view != null) {
            view.playSoundEffect(0);
        }
    }

    public static void m35718d(View view, Drawable drawable) {
        if (view == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
