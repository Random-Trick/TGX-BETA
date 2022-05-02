package p031c4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p199o3.C7582b;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1555c implements AbstractC1581m {
    public final C1187a0 f5533a;
    public final C1189b0 f5534b;
    public final String f5535c;
    public String f5536d;
    public AbstractC8974t f5537e;
    public int f5538f;
    public int f5539g;
    public boolean f5540h;
    public long f5541i;
    public C6600g1 f5542j;
    public int f5543k;
    public long f5544l;

    public C1555c() {
        this(null);
    }

    public final boolean m36477a(C1189b0 b0Var, byte[] bArr, int i) {
        int min = Math.min(b0Var.m38145a(), i - this.f5539g);
        b0Var.m38136j(bArr, this.f5539g, min);
        int i2 = this.f5539g + min;
        this.f5539g = i2;
        return i2 == i;
    }

    @Override
    public void mo36336b(C1189b0 b0Var) {
        C1186a.m38185h(this.f5537e);
        while (b0Var.m38145a() > 0) {
            int i = this.f5538f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(b0Var.m38145a(), this.f5543k - this.f5539g);
                        this.f5537e.mo10795c(b0Var, min);
                        int i2 = this.f5539g + min;
                        this.f5539g = i2;
                        int i3 = this.f5543k;
                        if (i2 == i3) {
                            long j = this.f5544l;
                            if (j != -9223372036854775807L) {
                                this.f5537e.mo10793e(j, 1, i3, 0, null);
                                this.f5544l += this.f5541i;
                            }
                            this.f5538f = 0;
                        }
                    }
                } else if (m36477a(b0Var, this.f5534b.m38142d(), Log.TAG_YOUTUBE)) {
                    m36476g();
                    this.f5534b.m38147P(0);
                    this.f5537e.mo10795c(this.f5534b, Log.TAG_YOUTUBE);
                    this.f5538f = 2;
                }
            } else if (m36475h(b0Var)) {
                this.f5538f = 1;
                this.f5534b.m38142d()[0] = 11;
                this.f5534b.m38142d()[1] = 119;
                this.f5539g = 2;
            }
        }
    }

    @Override
    public void mo36335c() {
        this.f5538f = 0;
        this.f5539g = 0;
        this.f5540h = false;
        this.f5544l = -9223372036854775807L;
    }

    @Override
    public void mo36334d() {
    }

    @Override
    public void mo36333e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36409a();
        this.f5536d = dVar.m36408b();
        this.f5537e = hVar.mo6039r(dVar.m36407c(), 1);
    }

    @Override
    public void mo36332f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5544l = j;
        }
    }

    @RequiresNonNull({"output"})
    public final void m36476g() {
        this.f5533a.m38168p(0);
        C7582b.C7584b e = C7582b.m15627e(this.f5533a);
        C6600g1 g1Var = this.f5542j;
        if (g1Var == null || e.f24235d != g1Var.f20591h0 || e.f24234c != g1Var.f20592i0 || !C1216l0.m37985c(e.f24232a, g1Var.f20575U)) {
            C6600g1 E = new C6600g1.C6602b().m19876S(this.f5536d).m19859e0(e.f24232a).m19887H(e.f24235d).m19857f0(e.f24234c).m19873V(this.f5535c).m19890E();
            this.f5542j = E;
            this.f5537e.mo10797a(E);
        }
        this.f5543k = e.f24236e;
        this.f5541i = (e.f24237f * 1000000) / this.f5542j.f20592i0;
    }

    public final boolean m36475h(C1189b0 b0Var) {
        while (true) {
            boolean z = false;
            if (b0Var.m38145a() <= 0) {
                return false;
            }
            if (!this.f5540h) {
                if (b0Var.m38159D() == 11) {
                    z = true;
                }
                this.f5540h = z;
            } else {
                int D = b0Var.m38159D();
                if (D == 119) {
                    this.f5540h = false;
                    return true;
                }
                if (D == 11) {
                    z = true;
                }
                this.f5540h = z;
            }
        }
    }

    public C1555c(String str) {
        C1187a0 a0Var = new C1187a0(new byte[Log.TAG_YOUTUBE]);
        this.f5533a = a0Var;
        this.f5534b = new C1189b0(a0Var.f4469a);
        this.f5538f = 0;
        this.f5544l = -9223372036854775807L;
        this.f5535c = str;
    }
}
