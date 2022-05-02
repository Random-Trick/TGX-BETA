package p343y6;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C10431g {
    public static <T> T m5140a(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }
}
