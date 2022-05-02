package p358z6;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C11382n {
    public static int m787a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int m786b(@NullableDecl Object obj) {
        return m787a(obj == null ? 0 : obj.hashCode());
    }
}
