package p293v;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p336y.AbstractC10311w1;

public class C9823r implements AbstractC10311w1 {
    public static final List<String> f32089a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean m6793a() {
        return "Google".equals(Build.MANUFACTURER) && f32089a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
