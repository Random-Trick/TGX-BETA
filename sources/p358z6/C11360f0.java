package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class C11360f0 {
    @CanIgnoreReturnValue
    public static Object m827a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    @CanIgnoreReturnValue
    public static Object[] m826b(Object... objArr) {
        return m825c(objArr, objArr.length);
    }

    @CanIgnoreReturnValue
    public static Object[] m825c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m827a(objArr[i2], i2);
        }
        return objArr;
    }

    public static <T> T[] m824d(T[] tArr, int i) {
        return (T[]) C11364h0.m816b(tArr, i);
    }
}
