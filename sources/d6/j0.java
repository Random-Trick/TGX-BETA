package d6;

import java.util.ArrayList;
import java.util.Collection;

public final class j0<K, V> extends k0<K, V> {
    public j0() {
        super(new u0(12));
    }

    public static <K, V> j0<K, V> p() {
        return new j0<>();
    }

    @Override
    public final Collection g() {
        return new ArrayList(3);
    }
}
