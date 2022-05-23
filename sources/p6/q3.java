package p6;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;
import r6.d;
import t6.a;
import t6.y;
import w6.c;
import w6.e;

public final class q3 {
    public static final a f20749l = new a("AssetPackManager");
    public final f0 f20750a;
    public final y f20751b;
    public final z f20752c;
    public final v6.a f20753d;
    public final z1 f20754e;
    public final k1 f20755f;
    public final s0 f20756g;
    public final y f20757h;
    public final d f20758i;
    public final u2 f20759j;
    public final Handler f20760k = new Handler(Looper.getMainLooper());

    public q3(f0 f0Var, y yVar, z zVar, v6.a aVar, z1 z1Var, k1 k1Var, s0 s0Var, y yVar2, d dVar, u2 u2Var) {
        this.f20750a = f0Var;
        this.f20751b = yVar;
        this.f20752c = zVar;
        this.f20753d = aVar;
        this.f20754e = z1Var;
        this.f20755f = k1Var;
        this.f20756g = s0Var;
        this.f20757h = yVar2;
        this.f20758i = dVar;
        this.f20759j = u2Var;
    }

    public final void b() {
        e e10 = ((d4) this.f20751b.zza()).e(this.f20750a.G());
        final f0 f0Var = this.f20750a;
        f0Var.getClass();
        e10.d((Executor) this.f20757h.zza(), new c() {
            @Override
            public final void a(Object obj) {
                f0.this.c((List) obj);
            }
        });
        e10.b((Executor) this.f20757h.zza(), n3.f20731a);
    }

    public final void c(boolean z10) {
        boolean g10 = this.f20752c.g();
        this.f20752c.d(z10);
        if (z10 && !g10) {
            d();
        }
    }

    public final void d() {
        ((Executor) this.f20757h.zza()).execute(new Runnable() {
            @Override
            public final void run() {
                q3.this.b();
            }
        });
    }
}
