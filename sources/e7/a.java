package e7;

import java.util.Set;
import n7.b;

public abstract class a implements e {
    @Override
    public <T> T a(Class<T> cls) {
        b<T> b10 = b(cls);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    @Override
    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
