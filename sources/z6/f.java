package z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

public interface f<F, T> {
    @CanIgnoreReturnValue
    T apply(F f10);

    boolean equals(@CheckForNull Object obj);
}
