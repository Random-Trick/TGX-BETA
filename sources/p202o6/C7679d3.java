package p202o6;

import java.io.File;
import java.util.concurrent.Executor;
import p262s6.AbstractC8689y;

public final class C7679d3 {
    public final C7688f0 f24602a;
    public final AbstractC8689y f24603b;
    public final C7789z1 f24604c;
    public final AbstractC8689y f24605d;
    public final C7714k1 f24606e;

    public C7679d3(C7688f0 f0Var, AbstractC8689y yVar, C7789z1 z1Var, AbstractC8689y yVar2, C7714k1 k1Var) {
        this.f24602a = f0Var;
        this.f24603b = yVar;
        this.f24604c = z1Var;
        this.f24605d = yVar2;
        this.f24606e = k1Var;
    }

    public final void m15271a(final C7667b3 b3Var) {
        File u = this.f24602a.m15231u(b3Var.f24579b, b3Var.f24580c, b3Var.f24582e);
        if (u.exists()) {
            File u2 = this.f24602a.m15231u(b3Var.f24579b, b3Var.f24581d, b3Var.f24582e);
            u2.mkdirs();
            if (u.renameTo(u2)) {
                ((Executor) this.f24605d.zza()).execute(new Runnable() {
                    @Override
                    public final void run() {
                        C7679d3.this.m15270b(b3Var);
                    }
                });
                this.f24604c.m15092i(b3Var.f24579b, b3Var.f24581d, b3Var.f24582e);
                this.f24606e.m15184c(b3Var.f24579b);
                ((AbstractC7680d4) this.f24603b.zza()).mo15141a(b3Var.f24578a, b3Var.f24579b);
                return;
            }
            throw new C7694g1(String.format("Cannot promote pack %s from %s to %s", b3Var.f24579b, u.getAbsolutePath(), u2.getAbsolutePath()), b3Var.f24578a);
        }
        throw new C7694g1(String.format("Cannot find pack files to promote for pack %s at %s", b3Var.f24579b, u.getAbsolutePath()), b3Var.f24578a);
    }

    public final void m15270b(C7667b3 b3Var) {
        this.f24602a.m15250b(b3Var.f24579b, b3Var.f24581d, b3Var.f24582e);
    }
}
