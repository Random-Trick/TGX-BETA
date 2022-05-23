package a1;

import android.text.TextUtils;
import java.util.Locale;

public final class e {
    public static final Locale f72a = new Locale("", "");

    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
