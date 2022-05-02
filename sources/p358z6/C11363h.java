package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import p343y6.C10433i;

public final class C11363h {
    public static void m820a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    @CanIgnoreReturnValue
    public static int m819b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void m818c(boolean z) {
        C10433i.m5123o(z, "no calls to next() since the last call to remove()");
    }
}
