package ja;

import java.util.Collection;
import ra.k;

public class o extends n {
    public static final <T> int o(Iterable<? extends T> iterable, int i10) {
        k.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
