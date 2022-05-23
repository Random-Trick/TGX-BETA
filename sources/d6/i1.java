package d6;

import java.util.Iterator;
import java.util.Map;

public final class i1 extends t1 {
    public i1(Iterator it) {
        super(it);
    }

    @Override
    public final Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
