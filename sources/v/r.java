package v;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import y.w1;

public class r implements w1 {
    public static final List<String> f24674a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean a() {
        return "Google".equals(Build.MANUFACTURER) && f24674a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
