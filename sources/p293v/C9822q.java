package p293v;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p336y.AbstractC10311w1;

public class C9822q implements AbstractC10311w1 {
    public static final List<String> f32088a = Arrays.asList("NEXUS 4");

    public static boolean m6794b() {
        return "GOOGLE".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 23 && f32088a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public int m6795a() {
        return 2;
    }
}
