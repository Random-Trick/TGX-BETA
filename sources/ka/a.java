package ka;

import java.util.Comparator;

public class a {
    public static final <T extends Comparable<?>> int a(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    public static final <T extends Comparable<? super T>> Comparator<T> b() {
        return b.f15745a;
    }
}
