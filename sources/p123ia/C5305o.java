package p123ia;

import java.util.Collection;
import qa.C8298k;

public class C5305o extends C5304n {
    public static final <T> int m23357o(Iterable<? extends T> iterable, int i) {
        C8298k.m12934e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
