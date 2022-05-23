package z6;

import java.util.Objects;
import javax.annotation.CheckForNull;

public final class g {
    public static <T> T a(@CheckForNull T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        Objects.requireNonNull(t11, "Both parameters are null");
        return t11;
    }
}
