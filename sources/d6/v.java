package d6;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

public final class v extends j1 {
    public final x f7040a;

    public v(x xVar) {
        this.f7040a = xVar;
    }

    @Override
    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.f7040a.f7099c.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final Map f() {
        return this.f7040a;
    }

    @Override
    public final Iterator<Map.Entry> iterator() {
        return new w(this.f7040a);
    }

    @Override
    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        g0.n(this.f7040a.M, entry.getKey());
        return true;
    }
}
