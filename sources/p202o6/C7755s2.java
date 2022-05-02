package p202o6;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import p233q6.C8260d;
import p262s6.AbstractC8689y;

public final class C7755s2 {
    public final C7688f0 f24835a;
    public final AbstractC8689y f24836b;
    public final C7789z1 f24837c;
    public final AbstractC8689y f24838d;
    public final C7714k1 f24839e;
    public final C8260d f24840f;
    public final C7765u2 f24841g;

    public C7755s2(C7688f0 f0Var, AbstractC8689y yVar, C7789z1 z1Var, AbstractC8689y yVar2, C7714k1 k1Var, C8260d dVar, C7765u2 u2Var) {
        this.f24835a = f0Var;
        this.f24836b = yVar;
        this.f24837c = z1Var;
        this.f24838d = yVar2;
        this.f24839e = k1Var;
        this.f24840f = dVar;
        this.f24841g = u2Var;
    }

    public final void m15143a(final C7740p2 p2Var) {
        File w = this.f24835a.m15229w(p2Var.f24582b, p2Var.f24787c, p2Var.f24788d);
        File y = this.f24835a.m15227y(p2Var.f24582b, p2Var.f24787c, p2Var.f24788d);
        if (!w.exists() || !y.exists()) {
            throw new C7694g1(String.format("Cannot find pack files to move for pack %s.", p2Var.f24582b), p2Var.f24581a);
        }
        File u = this.f24835a.m15231u(p2Var.f24582b, p2Var.f24787c, p2Var.f24788d);
        u.mkdirs();
        if (w.renameTo(u)) {
            new File(this.f24835a.m15231u(p2Var.f24582b, p2Var.f24787c, p2Var.f24788d), "merge.tmp").delete();
            File v = this.f24835a.m15230v(p2Var.f24582b, p2Var.f24787c, p2Var.f24788d);
            v.mkdirs();
            if (y.renameTo(v)) {
                if (this.f24840f.m13017a("assetOnlyUpdates")) {
                    try {
                        this.f24841g.m15113b(p2Var.f24582b, p2Var.f24787c, p2Var.f24788d, p2Var.f24789e);
                        ((Executor) this.f24838d.zza()).execute(new Runnable() {
                            @Override
                            public final void run() {
                                C7755s2.this.m15142b(p2Var);
                            }
                        });
                    } catch (IOException e) {
                        throw new C7694g1(String.format("Could not write asset pack version tag for pack %s: %s", p2Var.f24582b, e.getMessage()), p2Var.f24581a);
                    }
                } else {
                    final C7688f0 f0Var = this.f24835a;
                    f0Var.getClass();
                    ((Executor) this.f24838d.zza()).execute(new Runnable() {
                        @Override
                        public final void run() {
                            C7688f0.this.m15253I();
                        }
                    });
                }
                this.f24837c.m15092i(p2Var.f24582b, p2Var.f24787c, p2Var.f24788d);
                this.f24839e.m15184c(p2Var.f24582b);
                ((AbstractC7680d4) this.f24836b.zza()).mo15141a(p2Var.f24581a, p2Var.f24582b);
                return;
            }
            throw new C7694g1("Cannot move metadata files to final location.", p2Var.f24581a);
        }
        throw new C7694g1("Cannot move merged pack files to final location.", p2Var.f24581a);
    }

    public final void m15142b(C7740p2 p2Var) {
        this.f24835a.m15250b(p2Var.f24582b, p2Var.f24787c, p2Var.f24788d);
    }
}
