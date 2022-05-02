package p123ia;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import qa.C8298k;

public class C5303m {
    public static final <T> Object[] m23372a(T[] tArr, boolean z) {
        C8298k.m12933e(tArr, "<this>");
        if (z && C8298k.m12936b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C8298k.m12934d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static final <T> List<T> m23371b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C8298k.m12934d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
