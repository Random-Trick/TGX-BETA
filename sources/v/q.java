package v;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import y.w1;

public class q implements w1 {
    public static final List<String> f24673a = Arrays.asList("NEXUS 4");

    public static boolean b() {
        return "GOOGLE".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 23 && f24673a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public int a() {
        return 2;
    }
}
