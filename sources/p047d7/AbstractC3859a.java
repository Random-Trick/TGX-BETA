package p047d7;

import java.util.Set;
import p178m7.AbstractC6794b;

public abstract class AbstractC3859a implements AbstractC3870e {
    @Override
    public <T> T mo29679a(Class<T> cls) {
        AbstractC6794b<T> b = mo29678b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    @Override
    public <T> Set<T> mo29676d(Class<T> cls) {
        return mo29677c(cls).get();
    }
}
