package p293v;

import android.os.Build;
import java.util.Locale;
import p336y.AbstractC10311w1;

public class C9826t implements AbstractC10311w1 {
    public static boolean m6789a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
