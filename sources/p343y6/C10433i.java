package p343y6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C10433i {
    public static String m5137a(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C10443m.m5105a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C10443m.m5105a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    public static String m5136b(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C10443m.m5105a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C10443m.m5105a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    public static String m5135c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m5136b(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? m5136b(i2, i3, "end index") : C10443m.m5105a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void m5134d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m5133e(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void m5132f(boolean z, @NullableDecl String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C10443m.m5105a(str, Long.valueOf(j)));
        }
    }

    @CanIgnoreReturnValue
    public static int m5131g(int i, int i2) {
        return m5130h(i, i2, "index");
    }

    @CanIgnoreReturnValue
    public static int m5130h(int i, int i2, @NullableDecl String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m5137a(i, i2, str));
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T m5129i(@NonNullDecl T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T m5128j(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    public static int m5127k(int i, int i2) {
        return m5126l(i, i2, "index");
    }

    @CanIgnoreReturnValue
    public static int m5126l(int i, int i2, @NullableDecl String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m5136b(i, i2, str));
    }

    public static void m5125m(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m5135c(i, i2, i3));
        }
    }

    public static void m5124n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m5123o(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
