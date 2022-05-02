package p202o6;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;
import p233q6.C8260d;
import p262s6.AbstractC8689y;
import p262s6.C8646a;
import p286u6.C9450a;
import p300v6.AbstractC9852c;
import p300v6.AbstractC9854e;

public final class C7746q3 {
    public static final C8646a f24795l = new C8646a("AssetPackManager");
    public final C7688f0 f24796a;
    public final AbstractC8689y f24797b;
    public final C7787z f24798c;
    public final C9450a f24799d;
    public final C7789z1 f24800e;
    public final C7714k1 f24801f;
    public final C7753s0 f24802g;
    public final AbstractC8689y f24803h;
    public final C8260d f24804i;
    public final C7765u2 f24805j;
    public final Handler f24806k = new Handler(Looper.getMainLooper());

    public C7746q3(C7688f0 f0Var, AbstractC8689y yVar, C7787z zVar, C9450a aVar, C7789z1 z1Var, C7714k1 k1Var, C7753s0 s0Var, AbstractC8689y yVar2, C8260d dVar, C7765u2 u2Var) {
        this.f24796a = f0Var;
        this.f24797b = yVar;
        this.f24798c = zVar;
        this.f24799d = aVar;
        this.f24800e = z1Var;
        this.f24801f = k1Var;
        this.f24802g = s0Var;
        this.f24803h = yVar2;
        this.f24804i = dVar;
        this.f24805j = u2Var;
    }

    public final void m15153b() {
        AbstractC9854e e = ((AbstractC7680d4) this.f24797b.zza()).mo15137e(this.f24796a.m15255G());
        final C7688f0 f0Var = this.f24796a;
        f0Var.getClass();
        e.mo6726d((Executor) this.f24803h.zza(), new AbstractC9852c() {
            @Override
            public final void mo6713a(Object obj) {
                C7688f0.this.m15249c((List) obj);
            }
        });
        e.mo6728b((Executor) this.f24803h.zza(), C7731n3.f24777a);
    }

    public final void m15152c(boolean z) {
        boolean g = this.f24798c.m10749g();
        this.f24798c.m10752d(z);
        if (z && !g) {
            m15151d();
        }
    }

    public final void m15151d() {
        ((Executor) this.f24803h.zza()).execute(new Runnable() {
            @Override
            public final void run() {
                C7746q3.this.m15153b();
            }
        });
    }
}
