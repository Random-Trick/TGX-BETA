package p047d7;

import java.util.Arrays;
import java.util.List;

public class C3891r extends C3892s {
    public final List<C3865d<?>> f13168a;

    public C3891r(List<C3865d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f13168a = list;
    }
}
