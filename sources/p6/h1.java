package p6;

import java.util.concurrent.atomic.AtomicBoolean;
import t6.a;
import t6.y;

public final class h1 {
    public static final a f20626k = new a("ExtractorLooper");
    public final z1 f20627a;
    public final b1 f20628b;
    public final k3 f20629c;
    public final n2 f20630d;
    public final s2 f20631e;
    public final z2 f20632f;
    public final d3 f20633g;
    public final y f20634h;
    public final c2 f20635i;
    public final AtomicBoolean f20636j = new AtomicBoolean(false);

    public h1(z1 z1Var, y yVar, b1 b1Var, k3 k3Var, n2 n2Var, s2 s2Var, z2 z2Var, d3 d3Var, c2 c2Var) {
        this.f20627a = z1Var;
        this.f20634h = yVar;
        this.f20628b = b1Var;
        this.f20629c = k3Var;
        this.f20630d = n2Var;
        this.f20631e = s2Var;
        this.f20632f = z2Var;
        this.f20633g = d3Var;
        this.f20635i = c2Var;
    }

    public final void a() {
        a aVar = f20626k;
        aVar.a("Run extractor loop", new Object[0]);
        if (this.f20636j.compareAndSet(false, true)) {
            while (true) {
                b2 b2Var = null;
                try {
                    b2Var = this.f20635i.a();
                } catch (g1 e10) {
                    f20626k.b("Error while getting next extraction task: %s", e10.getMessage());
                    if (e10.f20611a >= 0) {
                        ((d4) this.f20634h.zza()).d(e10.f20611a);
                        b(e10.f20611a, e10);
                    }
                }
                if (b2Var != null) {
                    try {
                        if (b2Var instanceof a1) {
                            this.f20628b.a((a1) b2Var);
                        } else if (b2Var instanceof j3) {
                            this.f20629c.a((j3) b2Var);
                        } else if (b2Var instanceof m2) {
                            this.f20630d.a((m2) b2Var);
                        } else if (b2Var instanceof p2) {
                            this.f20631e.a((p2) b2Var);
                        } else if (b2Var instanceof y2) {
                            this.f20632f.a((y2) b2Var);
                        } else if (b2Var instanceof b3) {
                            this.f20633g.a((b3) b2Var);
                        } else {
                            f20626k.b("Unknown task type: %s", b2Var.getClass().getName());
                        }
                    } catch (Exception e11) {
                        f20626k.b("Error during extraction task: %s", e11.getMessage());
                        ((d4) this.f20634h.zza()).d(b2Var.f20555a);
                        b(b2Var.f20555a, e11);
                    }
                } else {
                    this.f20636j.set(false);
                    return;
                }
            }
        } else {
            aVar.e("runLoop already looping; return", new Object[0]);
        }
    }

    public final void b(int i10, Exception exc) {
        try {
            this.f20627a.k(i10, 5);
            this.f20627a.l(i10);
        } catch (g1 unused) {
            f20626k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
