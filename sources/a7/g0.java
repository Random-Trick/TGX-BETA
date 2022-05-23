package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

public final class g0 {
    @CanIgnoreReturnValue
    public static Object a(@CheckForNull Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i10);
        throw new NullPointerException(sb2.toString());
    }

    @CanIgnoreReturnValue
    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    @CanIgnoreReturnValue
    public static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i10) {
        return (T[]) i0.b(tArr, i10);
    }
}
