package p255s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p016b1.C1132h;
import p255s.C8549q1;
import p336y.AbstractC10196a2;
import p336y.C10216d2;

public class C8444b1 implements AbstractC10196a2 {
    public final C8549q1 f27414a;
    public final List<C10216d2> f27415b;
    public volatile boolean f27416c = false;

    public C8444b1(C8549q1 q1Var, List<C10216d2> list) {
        boolean z = false;
        z = q1Var.f27704l == C8549q1.EnumC8553d.OPENED ? true : z;
        C1132h.m38325b(z, "CaptureSession state must be OPENED. Current state:" + q1Var.f27704l);
        this.f27414a = q1Var;
        this.f27415b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void m12446a() {
        this.f27416c = true;
    }
}
