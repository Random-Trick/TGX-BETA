package p047d7;

import java.util.Set;
import p178m7.AbstractC6794b;

public abstract class AbstractC3859a implements AbstractC3870e {
    @Override
    public <T> T mo29677a(Class<T> cls) {
        AbstractC6794b<T> b = mo29676b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    @Override
    public <T> Set<T> mo29674d(Class<T> cls) {
        return mo29675c(cls).get();
    }
}
