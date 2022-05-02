package p033c6;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C1964w0 {
    public static int m35845a(@NullableDecl Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
