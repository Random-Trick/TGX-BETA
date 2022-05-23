package y;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class n1<C> {
    public Set<C> f26372a = new HashSet();

    public void a(List<C> list) {
        this.f26372a.addAll(list);
    }

    public abstract n1<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f26372a));
    }
}
