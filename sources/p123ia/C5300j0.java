package p123ia;

import java.util.LinkedHashSet;
import java.util.Set;
import qa.C8298k;

public class C5300j0 extends C5298i0 {
    public static final <T> Set<T> m23377b() {
        return C5317z.f17493a;
    }

    public static final <T> Set<T> m23376c(T... tArr) {
        C8298k.m12934e(tArr, "elements");
        return (Set) C5296i.m23402K(tArr, new LinkedHashSet(C5293g0.m23436a(tArr.length)));
    }

    public static final <T> Set<T> m23375d(Set<? extends T> set) {
        C8298k.m12934e(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : C5298i0.m23379a(set.iterator().next());
        }
        return m23377b();
    }

    public static final <T> Set<T> m23374e(T... tArr) {
        C8298k.m12934e(tArr, "elements");
        return tArr.length > 0 ? C5296i.m23396Q(tArr) : m23377b();
    }
}
