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
    public static final C8646a f24792l = new C8646a("AssetPackManager");
    public final C7688f0 f24793a;
    public final AbstractC8689y f24794b;
    public final C7787z f24795c;
    public final C9450a f24796d;
    public final C7789z1 f24797e;
    public final C7714k1 f24798f;
    public final C7753s0 f24799g;
    public final AbstractC8689y f24800h;
    public final C8260d f24801i;
    public final C7765u2 f24802j;
    public final Handler f24803k = new Handler(Looper.getMainLooper());

    public C7746q3(C7688f0 f0Var, AbstractC8689y yVar, C7787z zVar, C9450a aVar, C7789z1 z1Var, C7714k1 k1Var, C7753s0 s0Var, AbstractC8689y yVar2, C8260d dVar, C7765u2 u2Var) {
        this.f24793a = f0Var;
        this.f24794b = yVar;
        this.f24795c = zVar;
        this.f24796d = aVar;
        this.f24797e = z1Var;
        this.f24798f = k1Var;
        this.f24799g = s0Var;
        this.f24800h = yVar2;
        this.f24801i = dVar;
        this.f24802j = u2Var;
    }

    public final void m15153b() {
        AbstractC9854e e = ((AbstractC7680d4) this.f24794b.zza()).mo15137e(this.f24793a.m15255G());
        final C7688f0 f0Var = this.f24793a;
        f0Var.getClass();
        e.mo6726d((Executor) this.f24800h.zza(), new AbstractC9852c() {
            @Override
            public final void mo6713a(Object obj) {
                C7688f0.this.m15249c((List) obj);
            }
        });
        e.mo6728b((Executor) this.f24800h.zza(), C7731n3.f24774a);
    }

    public final void m15152c(boolean z) {
        boolean g = this.f24795c.m10750g();
        this.f24795c.m10753d(z);
        if (z && !g) {
            m15151d();
        }
    }

    public final void m15151d() {
        ((Executor) this.f24800h.zza()).execute(new Runnable() {
            @Override
            public final void run() {
                C7746q3.this.m15153b();
            }
        });
    }
}
