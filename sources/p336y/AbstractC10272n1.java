package p336y;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractC10272n1<C> {
    public Set<C> f33090a = new HashSet();

    public void m5576a(List<C> list) {
        this.f33090a.addAll(list);
    }

    public abstract AbstractC10272n1<C> clone();

    public List<C> m5574c() {
        return Collections.unmodifiableList(new ArrayList(this.f33090a));
    }
}
