package v;

import android.os.Build;
import e0.e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import t.z;

public final class p implements e {
    public static final Set<String> f24672a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    public static boolean a(z zVar) {
        return f24672a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
