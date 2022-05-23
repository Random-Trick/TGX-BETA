package c6;

import javax.annotation.CheckForNull;

public final class q0 extends k0 {
    public static boolean a(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
