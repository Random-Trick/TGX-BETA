package f0;

import android.media.MediaCodec;
import androidx.camera.core.b2;
import androidx.camera.core.h3;
import e0.a;
import e0.f;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import y.q0;

public class c {
    public final boolean f11757a;

    public c() {
        this.f11757a = a.a(f.class) != null;
    }

    public int c(q0 q0Var, q0 q0Var2) {
        return b(q0Var) - b(q0Var2);
    }

    public final int b(q0 q0Var) {
        if (q0Var.e() == MediaCodec.class || q0Var.e() == h3.class) {
            return 2;
        }
        return q0Var.e() == b2.class ? 0 : 1;
    }

    public void d(List<q0> list) {
        if (this.f11757a) {
            Collections.sort(list, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int c10;
                    c10 = c.this.c((q0) obj, (q0) obj2);
                    return c10;
                }
            });
        }
    }
}
