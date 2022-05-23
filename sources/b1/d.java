package b1;

import java.util.Objects;

public class d {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static <T> T c(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static String d(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
