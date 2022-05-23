package v;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import y.w1;

public class n implements w1 {
    public static final List<String> f24670a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean a() {
        return f24670a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
