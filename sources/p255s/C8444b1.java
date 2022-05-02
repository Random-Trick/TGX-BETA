package p255s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p016b1.C1132h;
import p255s.C8549q1;
import p336y.AbstractC10196a2;
import p336y.C10216d2;

public class C8444b1 implements AbstractC10196a2 {
    public final C8549q1 f27417a;
    public final List<C10216d2> f27418b;
    public volatile boolean f27419c = false;

    public C8444b1(C8549q1 q1Var, List<C10216d2> list) {
        boolean z = false;
        z = q1Var.f27707l == C8549q1.EnumC8553d.OPENED ? true : z;
        C1132h.m38328b(z, "CaptureSession state must be OPENED. Current state:" + q1Var.f27707l);
        this.f27417a = q1Var;
        this.f27418b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void m12445a() {
        this.f27419c = true;
    }
}
