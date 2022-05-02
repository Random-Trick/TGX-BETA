package p306w;

import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p293v.C9810e;

public class C9925c {
    public final C9810e f32303a;
    public final Set<Size> f32304b;

    public C9925c(C9810e eVar) {
        Set<Size> set;
        this.f32303a = eVar;
        if (eVar != null) {
            set = new HashSet<>(eVar.m6822a());
        } else {
            set = Collections.emptySet();
        }
        this.f32304b = set;
    }
}
