package p6;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import r6.d;
import t6.y;

public final class s2 {
    public final f0 f20787a;
    public final y f20788b;
    public final z1 f20789c;
    public final y f20790d;
    public final k1 f20791e;
    public final d f20792f;
    public final u2 f20793g;

    public s2(f0 f0Var, y yVar, z1 z1Var, y yVar2, k1 k1Var, d dVar, u2 u2Var) {
        this.f20787a = f0Var;
        this.f20788b = yVar;
        this.f20789c = z1Var;
        this.f20790d = yVar2;
        this.f20791e = k1Var;
        this.f20792f = dVar;
        this.f20793g = u2Var;
    }

    public final void a(final p2 p2Var) {
        File w10 = this.f20787a.w(p2Var.f20556b, p2Var.f20741c, p2Var.f20742d);
        File y10 = this.f20787a.y(p2Var.f20556b, p2Var.f20741c, p2Var.f20742d);
        if (!w10.exists() || !y10.exists()) {
            throw new g1(String.format("Cannot find pack files to move for pack %s.", p2Var.f20556b), p2Var.f20555a);
        }
        File u10 = this.f20787a.u(p2Var.f20556b, p2Var.f20741c, p2Var.f20742d);
        u10.mkdirs();
        if (w10.renameTo(u10)) {
            new File(this.f20787a.u(p2Var.f20556b, p2Var.f20741c, p2Var.f20742d), "merge.tmp").delete();
            File v10 = this.f20787a.v(p2Var.f20556b, p2Var.f20741c, p2Var.f20742d);
            v10.mkdirs();
            if (y10.renameTo(v10)) {
                if (this.f20792f.a("assetOnlyUpdates")) {
                    try {
                        this.f20793g.b(p2Var.f20556b, p2Var.f20741c, p2Var.f20742d, p2Var.f20743e);
                        ((Executor) this.f20790d.zza()).execute(new Runnable() {
                            @Override
                            public final void run() {
                                s2.this.b(p2Var);
                            }
                        });
                    } catch (IOException e10) {
                        throw new g1(String.format("Could not write asset pack version tag for pack %s: %s", p2Var.f20556b, e10.getMessage()), p2Var.f20555a);
                    }
                } else {
                    final f0 f0Var = this.f20787a;
                    f0Var.getClass();
                    ((Executor) this.f20790d.zza()).execute(new Runnable() {
                        @Override
                        public final void run() {
                            f0.this.I();
                        }
                    });
                }
                this.f20789c.i(p2Var.f20556b, p2Var.f20741c, p2Var.f20742d);
                this.f20791e.c(p2Var.f20556b);
                ((d4) this.f20788b.zza()).a(p2Var.f20555a, p2Var.f20556b);
                return;
            }
            throw new g1("Cannot move metadata files to final location.", p2Var.f20555a);
        }
        throw new g1("Cannot move merged pack files to final location.", p2Var.f20555a);
    }

    public final void b(p2 p2Var) {
        this.f20787a.b(p2Var.f20556b, p2Var.f20741c, p2Var.f20742d);
    }
}
