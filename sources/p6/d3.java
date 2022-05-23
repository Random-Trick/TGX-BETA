package p6;

import java.io.File;
import java.util.concurrent.Executor;
import t6.y;

public final class d3 {
    public final f0 f20579a;
    public final y f20580b;
    public final z1 f20581c;
    public final y f20582d;
    public final k1 f20583e;

    public d3(f0 f0Var, y yVar, z1 z1Var, y yVar2, k1 k1Var) {
        this.f20579a = f0Var;
        this.f20580b = yVar;
        this.f20581c = z1Var;
        this.f20582d = yVar2;
        this.f20583e = k1Var;
    }

    public final void a(final b3 b3Var) {
        File u10 = this.f20579a.u(b3Var.f20556b, b3Var.f20557c, b3Var.f20559e);
        if (u10.exists()) {
            File u11 = this.f20579a.u(b3Var.f20556b, b3Var.f20558d, b3Var.f20559e);
            u11.mkdirs();
            if (u10.renameTo(u11)) {
                ((Executor) this.f20582d.zza()).execute(new Runnable() {
                    @Override
                    public final void run() {
                        d3.this.b(b3Var);
                    }
                });
                this.f20581c.i(b3Var.f20556b, b3Var.f20558d, b3Var.f20559e);
                this.f20583e.c(b3Var.f20556b);
                ((d4) this.f20580b.zza()).a(b3Var.f20555a, b3Var.f20556b);
                return;
            }
            throw new g1(String.format("Cannot promote pack %s from %s to %s", b3Var.f20556b, u10.getAbsolutePath(), u11.getAbsolutePath()), b3Var.f20555a);
        }
        throw new g1(String.format("Cannot find pack files to promote for pack %s at %s", b3Var.f20556b, u10.getAbsolutePath()), b3Var.f20555a);
    }

    public final void b(b3 b3Var) {
        this.f20579a.b(b3Var.f20556b, b3Var.f20558d, b3Var.f20559e);
    }
}
