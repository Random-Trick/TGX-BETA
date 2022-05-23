package y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class x1 {
    public final List<w1> f26441a;

    public x1(List<w1> list) {
        this.f26441a = new ArrayList(list);
    }

    public boolean a(Class<? extends w1> cls) {
        for (w1 w1Var : this.f26441a) {
            if (cls.isAssignableFrom(w1Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends w1> T b(Class<T> cls) {
        Iterator<w1> it = this.f26441a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }
}
