package s;

import b1.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s.q1;
import y.a2;
import y.d2;

public class b1 implements a2 {
    public final q1 f21960a;
    public final List<d2> f21961b;
    public volatile boolean f21962c = false;

    public b1(q1 q1Var, List<d2> list) {
        boolean z10 = false;
        z10 = q1Var.f22226l == q1.d.OPENED ? true : z10;
        h.b(z10, "CaptureSession state must be OPENED. Current state:" + q1Var.f22226l);
        this.f21960a = q1Var;
        this.f21961b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        this.f21962c = true;
    }
}
