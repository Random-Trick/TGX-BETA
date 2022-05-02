package p202o6;

import java.util.concurrent.atomic.AtomicBoolean;
import p262s6.AbstractC8689y;
import p262s6.C8646a;

public final class C7699h1 {
    public static final C8646a f24663k = new C8646a("ExtractorLooper");
    public final C7789z1 f24664a;
    public final C7665b1 f24665b;
    public final C7716k3 f24666c;
    public final C7730n2 f24667d;
    public final C7755s2 f24668e;
    public final C7790z2 f24669f;
    public final C7679d3 f24670g;
    public final AbstractC8689y f24671h;
    public final C7672c2 f24672i;
    public final AtomicBoolean f24673j = new AtomicBoolean(false);

    public C7699h1(C7789z1 z1Var, AbstractC8689y yVar, C7665b1 b1Var, C7716k3 k3Var, C7730n2 n2Var, C7755s2 s2Var, C7790z2 z2Var, C7679d3 d3Var, C7672c2 c2Var) {
        this.f24664a = z1Var;
        this.f24671h = yVar;
        this.f24665b = b1Var;
        this.f24666c = k3Var;
        this.f24667d = n2Var;
        this.f24668e = s2Var;
        this.f24669f = z2Var;
        this.f24670g = d3Var;
        this.f24672i = c2Var;
    }

    public final void m15210a() {
        C8646a aVar = f24663k;
        aVar.m11817a("Run extractor loop", new Object[0]);
        if (this.f24673j.compareAndSet(false, true)) {
            while (true) {
                C7666b2 b2Var = null;
                try {
                    b2Var = this.f24672i.m15275a();
                } catch (C7694g1 e) {
                    f24663k.m11816b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f24645a >= 0) {
                        ((AbstractC7680d4) this.f24671h.zza()).mo15138d(e.f24645a);
                        m15209b(e.f24645a, e);
                    }
                }
                if (b2Var != null) {
                    try {
                        if (b2Var instanceof C7659a1) {
                            this.f24665b.m15280a((C7659a1) b2Var);
                        } else if (b2Var instanceof C7711j3) {
                            this.f24666c.m15182a((C7711j3) b2Var);
                        } else if (b2Var instanceof C7725m2) {
                            this.f24667d.m15159a((C7725m2) b2Var);
                        } else if (b2Var instanceof C7740p2) {
                            this.f24668e.m15143a((C7740p2) b2Var);
                        } else if (b2Var instanceof C7785y2) {
                            this.f24669f.m15081a((C7785y2) b2Var);
                        } else if (b2Var instanceof C7667b3) {
                            this.f24670g.m15271a((C7667b3) b2Var);
                        } else {
                            f24663k.m11816b("Unknown task type: %s", b2Var.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f24663k.m11816b("Error during extraction task: %s", e2.getMessage());
                        ((AbstractC7680d4) this.f24671h.zza()).mo15138d(b2Var.f24581a);
                        m15209b(b2Var.f24581a, e2);
                    }
                } else {
                    this.f24673j.set(false);
                    return;
                }
            }
        } else {
            aVar.m11813e("runLoop already looping; return", new Object[0]);
        }
    }

    public final void m15209b(int i, Exception exc) {
        try {
            this.f24664a.m15090k(i, 5);
            this.f24664a.m15089l(i);
        } catch (C7694g1 unused) {
            f24663k.m11816b("Error during error handling: %s", exc.getMessage());
        }
    }
}
