package w;

import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import v.e;

public class c {
    public final e f25678a;
    public final Set<Size> f25679b;

    public c(e eVar) {
        Set<Size> set;
        this.f25678a = eVar;
        if (eVar != null) {
            set = new HashSet<>(eVar.a());
        } else {
            set = Collections.emptySet();
        }
        this.f25679b = set;
    }
}
