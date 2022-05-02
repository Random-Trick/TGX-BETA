package p031c4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p199o3.C7614g0;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1595t implements AbstractC1581m {
    public final C1189b0 f5832a;
    public final C7614g0.C7615a f5833b;
    public final String f5834c;
    public AbstractC8974t f5835d;
    public String f5836e;
    public int f5837f;
    public int f5838g;
    public boolean f5839h;
    public boolean f5840i;
    public long f5841j;
    public int f5842k;
    public long f5843l;

    public C1595t() {
        this(null);
    }

    public final void m36337a(C1189b0 b0Var) {
        byte[] d = b0Var.m38142d();
        int f = b0Var.m38140f();
        for (int e = b0Var.m38141e(); e < f; e++) {
            boolean z = (d[e] & 255) == 255;
            boolean z2 = this.f5840i && (d[e] & 224) == 224;
            this.f5840i = z;
            if (z2) {
                b0Var.m38147P(e + 1);
                this.f5840i = false;
                this.f5832a.m38142d()[1] = d[e];
                this.f5838g = 2;
                this.f5837f = 1;
                return;
            }
        }
        b0Var.m38147P(f);
    }

    @Override
    public void mo36336b(C1189b0 b0Var) {
        C1186a.m38185h(this.f5835d);
        while (b0Var.m38145a() > 0) {
            int i = this.f5837f;
            if (i == 0) {
                m36337a(b0Var);
            } else if (i == 1) {
                m36330h(b0Var);
            } else if (i == 2) {
                m36331g(b0Var);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override
    public void mo36335c() {
        this.f5837f = 0;
        this.f5838g = 0;
        this.f5840i = false;
        this.f5843l = -9223372036854775807L;
    }

    @Override
    public void mo36334d() {
    }

    @Override
    public void mo36333e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36409a();
        this.f5836e = dVar.m36408b();
        this.f5835d = hVar.mo6039r(dVar.m36407c(), 1);
    }

    @Override
    public void mo36332f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5843l = j;
        }
    }

    @RequiresNonNull({"output"})
    public final void m36331g(C1189b0 b0Var) {
        int min = Math.min(b0Var.m38145a(), this.f5842k - this.f5838g);
        this.f5835d.mo10795c(b0Var, min);
        int i = this.f5838g + min;
        this.f5838g = i;
        int i2 = this.f5842k;
        if (i >= i2) {
            long j = this.f5843l;
            if (j != -9223372036854775807L) {
                this.f5835d.mo10793e(j, 1, i2, 0, null);
                this.f5843l += this.f5841j;
            }
            this.f5838g = 0;
            this.f5837f = 0;
        }
    }

    @RequiresNonNull({"output"})
    public final void m36330h(C1189b0 b0Var) {
        int min = Math.min(b0Var.m38145a(), 4 - this.f5838g);
        b0Var.m38136j(this.f5832a.m38142d(), this.f5838g, min);
        int i = this.f5838g + min;
        this.f5838g = i;
        if (i >= 4) {
            this.f5832a.m38147P(0);
            if (!this.f5833b.m15473a(this.f5832a.m38132n())) {
                this.f5838g = 0;
                this.f5837f = 1;
                return;
            }
            C7614g0.C7615a aVar = this.f5833b;
            this.f5842k = aVar.f24374c;
            if (!this.f5839h) {
                this.f5841j = (aVar.f24378g * 1000000) / aVar.f24375d;
                this.f5835d.mo10797a(new C6600g1.C6602b().m19876S(this.f5836e).m19859e0(this.f5833b.f24373b).m19872W(Log.TAG_EMOJI).m19887H(this.f5833b.f24376e).m19857f0(this.f5833b.f24375d).m19873V(this.f5834c).m19890E());
                this.f5839h = true;
            }
            this.f5832a.m38147P(0);
            this.f5835d.mo10795c(this.f5832a, 4);
            this.f5837f = 2;
        }
    }

    public C1595t(String str) {
        this.f5837f = 0;
        C1189b0 b0Var = new C1189b0(4);
        this.f5832a = b0Var;
        b0Var.m38142d()[0] = -1;
        this.f5833b = new C7614g0.C7615a();
        this.f5843l = -9223372036854775807L;
        this.f5834c = str;
    }
}
