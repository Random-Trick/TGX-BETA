package a7;

import javax.annotation.CheckForNull;

public final class n {
    public static int a(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int b(@CheckForNull Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
