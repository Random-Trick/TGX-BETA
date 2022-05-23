package ja;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ra.k;

public class r extends q {
    public static final <T extends Comparable<? super T>> void p(List<T> list) {
        k.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void q(List<T> list, Comparator<? super T> comparator) {
        k.e(list, "<this>");
        k.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
