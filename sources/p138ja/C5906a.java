package p138ja;

import java.util.Comparator;

public class C5906a {
    public static final <T extends Comparable<?>> int m21863a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final <T extends Comparable<? super T>> Comparator<T> m21862b() {
        return C5907b.f18809a;
    }
}
