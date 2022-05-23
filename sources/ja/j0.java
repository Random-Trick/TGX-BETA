package ja;

import java.util.LinkedHashSet;
import java.util.Set;
import ra.k;

public class j0 extends i0 {
    public static final <T> Set<T> b() {
        return z.f15180a;
    }

    public static final <T> Set<T> c(T... tArr) {
        k.e(tArr, "elements");
        return (Set) i.K(tArr, new LinkedHashSet(g0.a(tArr.length)));
    }

    public static final <T> Set<T> d(Set<? extends T> set) {
        k.e(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : i0.a(set.iterator().next());
        }
        return b();
    }

    public static final <T> Set<T> e(T... tArr) {
        k.e(tArr, "elements");
        return tArr.length > 0 ? i.Q(tArr) : b();
    }
}
