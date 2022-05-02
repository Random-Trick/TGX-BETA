package p123ia;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import qa.C8298k;

public class C5303m {
    public static final <T> Object[] m23371a(T[] tArr, boolean z) {
        C8298k.m12934e(tArr, "<this>");
        if (z && C8298k.m12937b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C8298k.m12935d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static final <T> List<T> m23370b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C8298k.m12935d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
