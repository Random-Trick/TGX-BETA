package p123ia;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import qa.C8298k;

public class C5308r extends C5307q {
    public static final <T extends Comparable<? super T>> void m23356p(List<T> list) {
        C8298k.m12934e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void m23355q(List<T> list, Comparator<? super T> comparator) {
        C8298k.m12934e(list, "<this>");
        C8298k.m12934e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
