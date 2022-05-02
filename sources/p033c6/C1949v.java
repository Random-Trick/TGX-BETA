package p033c6;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

public final class C1949v extends AbstractC1781j1 {
    public final C1977x f6991a;

    public C1949v(C1977x xVar) {
        this.f6991a = xVar;
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.f6991a.f7063c.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final Map mo35864h() {
        return this.f6991a;
    }

    @Override
    public final Iterator<Map.Entry> iterator() {
        return new C1963w(this.f6991a);
    }

    @Override
    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC1735g0.m36039n(this.f6991a.f7062M, entry.getKey());
        return true;
    }
}
