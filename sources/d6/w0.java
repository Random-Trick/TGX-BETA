package d6;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class w0 {
    public static int a(@NullableDecl Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
