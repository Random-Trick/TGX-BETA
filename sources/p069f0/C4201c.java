package p069f0;

import android.media.MediaCodec;
import androidx.camera.core.C0519c2;
import androidx.camera.core.C0580i3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p055e0.C4102a;
import p055e0.C4107f;
import p336y.AbstractC10287q0;

public class C4201c {
    public final boolean f14196a;

    public C4201c() {
        this.f14196a = C4102a.m28909a(C4107f.class) != null;
    }

    public int m28476c(AbstractC10287q0 q0Var, AbstractC10287q0 q0Var2) {
        return m28477b(q0Var) - m28477b(q0Var2);
    }

    public final int m28477b(AbstractC10287q0 q0Var) {
        if (q0Var.m5549e() == MediaCodec.class || q0Var.m5549e() == C0580i3.class) {
            return 2;
        }
        return q0Var.m5549e() == C0519c2.class ? 0 : 1;
    }

    public void m28475d(List<AbstractC10287q0> list) {
        if (this.f14196a) {
            Collections.sort(list, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int c;
                    c = C4201c.this.m28476c((AbstractC10287q0) obj, (AbstractC10287q0) obj2);
                    return c;
                }
            });
        }
    }
}
