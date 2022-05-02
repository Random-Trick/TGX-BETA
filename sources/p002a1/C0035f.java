package p002a1;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

public final class C0035f {
    public static final Locale f80a = new Locale("", "");

    public static int m42555a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int m42554b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f80a)) {
            return 0;
        }
        String c = C0023b.m42573c(locale);
        if (c == null) {
            return m42555a(locale);
        }
        return (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
