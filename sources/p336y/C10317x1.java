package p336y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C10317x1 {
    public final List<AbstractC10311w1> f33171a;

    public C10317x1(List<AbstractC10311w1> list) {
        this.f33171a = new ArrayList(list);
    }

    public boolean m5480a(Class<? extends AbstractC10311w1> cls) {
        for (AbstractC10311w1 w1Var : this.f33171a) {
            if (cls.isAssignableFrom(w1Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends AbstractC10311w1> T m5479b(Class<T> cls) {
        Iterator<AbstractC10311w1> it = this.f33171a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
