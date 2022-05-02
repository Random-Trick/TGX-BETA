package p123ia;

import java.util.LinkedHashSet;
import java.util.Set;
import qa.C8298k;

public class C5300j0 extends C5298i0 {
    public static final <T> Set<T> m23378b() {
        return C5317z.f17493a;
    }

    public static final <T> Set<T> m23377c(T... tArr) {
        C8298k.m12933e(tArr, "elements");
        return (Set) C5296i.m23403K(tArr, new LinkedHashSet(C5293g0.m23437a(tArr.length)));
    }

    public static final <T> Set<T> m23376d(Set<? extends T> set) {
        C8298k.m12933e(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : C5298i0.m23380a(set.iterator().next());
        }
        return m23378b();
    }

    public static final <T> Set<T> m23375e(T... tArr) {
        C8298k.m12933e(tArr, "elements");
        return tArr.length > 0 ? C5296i.m23397Q(tArr) : m23378b();
    }
}
