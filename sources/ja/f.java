package ja;

import java.lang.reflect.Array;
import java.util.Objects;
import ra.k;

public class f {
    public static final <T> T[] a(T[] tArr, int i10) {
        k.e(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    public static final void b(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
        }
    }
}
