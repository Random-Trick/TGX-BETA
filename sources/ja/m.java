package ja;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ra.k;

public class m {
    public static final <T> Object[] a(T[] tArr, boolean z10) {
        k.e(tArr, "<this>");
        if (z10 && k.b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        k.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static final <T> List<T> b(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        k.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
