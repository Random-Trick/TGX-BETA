package p016b1;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

public class C1128d {
    public static boolean m38333a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int m38332b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    public static <T> T m38331c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static String m38330d(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
