package p293v;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p055e0.AbstractC4106e;
import p266t.C8927z;

public final class C9821p implements AbstractC4106e {
    public static final Set<String> f32090a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    public static boolean m6796a(C8927z zVar) {
        return f32090a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
