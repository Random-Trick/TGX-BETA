package db;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.reflect.Method;

public final class g {
    public static void a(View view) {
        try {
            Method declaredMethod = view.getClass().getDeclaredMethod("resetTouch", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(view, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static void b(View view, boolean z10, boolean z11) {
        if (view != null) {
            int i10 = 0;
            int i11 = z10 ? 0 : 3;
            if (z11) {
                i10 = 2;
            }
            view.performHapticFeedback(i11, i10);
        }
    }

    public static void c(View view) {
        if (view != null) {
            view.playSoundEffect(0);
        }
    }

    public static void d(View view, Drawable drawable) {
        if (view != null) {
            view.setBackground(drawable);
        }
    }
}
