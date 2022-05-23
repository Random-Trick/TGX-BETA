package f1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class c {
    public static Field f11775a;
    public static boolean f11776b;

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f11776b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f11775a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
            }
            f11776b = true;
        }
        Field field = f11775a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e11) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                f11775a = null;
            }
        }
        return null;
    }

    public static void b(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
