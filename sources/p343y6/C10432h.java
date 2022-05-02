package p343y6;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C10432h extends AbstractC10429e {
    public static boolean m5139a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int m5138b(@NullableDecl Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
