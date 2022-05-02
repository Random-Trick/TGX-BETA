package p123ia;

import java.lang.reflect.Array;
import java.util.Objects;
import qa.C8298k;

public class C5290f {
    public static final <T> T[] m23439a(T[] tArr, int i) {
        C8298k.m12933e(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    public static final void m23438b(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }
}
