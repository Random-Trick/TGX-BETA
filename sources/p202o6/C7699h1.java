package p202o6;

import java.util.concurrent.atomic.AtomicBoolean;
import p262s6.AbstractC8689y;
import p262s6.C8646a;

public final class C7699h1 {
    public static final C8646a f24660k = new C8646a("ExtractorLooper");
    public final C7789z1 f24661a;
    public final C7665b1 f24662b;
    public final C7716k3 f24663c;
    public final C7730n2 f24664d;
    public final C7755s2 f24665e;
    public final C7790z2 f24666f;
    public final C7679d3 f24667g;
    public final AbstractC8689y f24668h;
    public final C7672c2 f24669i;
    public final AtomicBoolean f24670j = new AtomicBoolean(false);

    public C7699h1(C7789z1 z1Var, AbstractC8689y yVar, C7665b1 b1Var, C7716k3 k3Var, C7730n2 n2Var, C7755s2 s2Var, C7790z2 z2Var, C7679d3 d3Var, C7672c2 c2Var) {
        this.f24661a = z1Var;
        this.f24668h = yVar;
        this.f24662b = b1Var;
        this.f24663c = k3Var;
        this.f24664d = n2Var;
        this.f24665e = s2Var;
        this.f24666f = z2Var;
        this.f24667g = d3Var;
        this.f24669i = c2Var;
    }

    public final void m15210a() {
        C8646a aVar = f24660k;
        aVar.m11818a("Run extractor loop", new Object[0]);
        if (this.f24670j.compareAndSet(false, true)) {
            while (true) {
                C7666b2 b2Var = null;
                try {
                    b2Var = this.f24669i.m15275a();
                } catch (C7694g1 e) {
                    f24660k.m11817b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f24642a >= 0) {
                        ((AbstractC7680d4) this.f24668h.zza()).mo15138d(e.f24642a);
                        m15209b(e.f24642a, e);
                    }
                }
                if (b2Var != null) {
                    try {
                        if (b2Var instanceof C7659a1) {
                            this.f24662b.m15280a((C7659a1) b2Var);
                        } else if (b2Var instanceof C7711j3) {
                            this.f24663c.m15182a((C7711j3) b2Var);
                        } else if (b2Var instanceof C7725m2) {
                            this.f24664d.m15159a((C7725m2) b2Var);
                        } else if (b2Var instanceof C7740p2) {
                            this.f24665e.m15143a((C7740p2) b2Var);
                        } else if (b2Var instanceof C7785y2) {
                            this.f24666f.m15081a((C7785y2) b2Var);
                        } else if (b2Var instanceof C7667b3) {
                            this.f24667g.m15271a((C7667b3) b2Var);
                        } else {
                            f24660k.m11817b("Unknown task type: %s", b2Var.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f24660k.m11817b("Error during extraction task: %s", e2.getMessage());
                        ((AbstractC7680d4) this.f24668h.zza()).mo15138d(b2Var.f24578a);
                        m15209b(b2Var.f24578a, e2);
                    }
                } else {
                    this.f24670j.set(false);
                    return;
                }
            }
        } else {
            aVar.m11814e("runLoop already looping; return", new Object[0]);
        }
    }

    public final void m15209b(int i, Exception exc) {
        try {
            this.f24661a.m15090k(i, 5);
            this.f24661a.m15089l(i);
        } catch (C7694g1 unused) {
            f24660k.m11817b("Error during error handling: %s", exc.getMessage());
        }
    }
}
