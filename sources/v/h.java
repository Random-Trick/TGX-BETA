package v;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import y.w1;

public class h implements w1 {
    public static final List<String> f24664a = Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    public static boolean a() {
        return f24664a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
