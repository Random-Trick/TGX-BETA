package v;

import android.os.Build;
import java.util.Locale;
import y.w1;

public class t implements w1 {
    public static boolean a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
