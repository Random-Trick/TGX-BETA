package e7;

import java.util.Arrays;
import java.util.List;

public class r extends s {
    public final List<d<?>> f11341a;

    public r(List<d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f11341a = list;
    }
}
