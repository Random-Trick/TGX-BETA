package p202o6;

import java.io.File;
import java.util.concurrent.Executor;
import p262s6.AbstractC8689y;

public final class C7679d3 {
    public final C7688f0 f24605a;
    public final AbstractC8689y f24606b;
    public final C7789z1 f24607c;
    public final AbstractC8689y f24608d;
    public final C7714k1 f24609e;

    public C7679d3(C7688f0 f0Var, AbstractC8689y yVar, C7789z1 z1Var, AbstractC8689y yVar2, C7714k1 k1Var) {
        this.f24605a = f0Var;
        this.f24606b = yVar;
        this.f24607c = z1Var;
        this.f24608d = yVar2;
        this.f24609e = k1Var;
    }

    public final void m15271a(final C7667b3 b3Var) {
        File u = this.f24605a.m15231u(b3Var.f24582b, b3Var.f24583c, b3Var.f24585e);
        if (u.exists()) {
            File u2 = this.f24605a.m15231u(b3Var.f24582b, b3Var.f24584d, b3Var.f24585e);
            u2.mkdirs();
            if (u.renameTo(u2)) {
                ((Executor) this.f24608d.zza()).execute(new Runnable() {
                    @Override
                    public final void run() {
                        C7679d3.this.m15270b(b3Var);
                    }
                });
                this.f24607c.m15092i(b3Var.f24582b, b3Var.f24584d, b3Var.f24585e);
                this.f24609e.m15184c(b3Var.f24582b);
                ((AbstractC7680d4) this.f24606b.zza()).mo15141a(b3Var.f24581a, b3Var.f24582b);
                return;
            }
            throw new C7694g1(String.format("Cannot promote pack %s from %s to %s", b3Var.f24582b, u.getAbsolutePath(), u2.getAbsolutePath()), b3Var.f24581a);
        }
        throw new C7694g1(String.format("Cannot find pack files to promote for pack %s at %s", b3Var.f24582b, u.getAbsolutePath()), b3Var.f24581a);
    }

    public final void m15270b(C7667b3 b3Var) {
        this.f24605a.m15250b(b3Var.f24582b, b3Var.f24584d, b3Var.f24585e);
    }
}
