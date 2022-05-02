package p293v;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p336y.AbstractC10311w1;

public class C9819n implements AbstractC10311w1 {
    public static final List<String> f32085a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean m6798a() {
        return f32085a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
