package p031c4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p199o3.C7596c;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1562f implements AbstractC1581m {
    public final C1187a0 f5562a;
    public final C1189b0 f5563b;
    public final String f5564c;
    public String f5565d;
    public AbstractC8974t f5566e;
    public int f5567f;
    public int f5568g;
    public boolean f5569h;
    public boolean f5570i;
    public long f5571j;
    public C6600g1 f5572k;
    public int f5573l;
    public long f5574m;

    public C1562f() {
        this(null);
    }

    public final boolean m36466a(C1189b0 b0Var, byte[] bArr, int i) {
        int min = Math.min(b0Var.m38142a(), i - this.f5568g);
        b0Var.m38133j(bArr, this.f5568g, min);
        int i2 = this.f5568g + min;
        this.f5568g = i2;
        return i2 == i;
    }

    @Override
    public void mo36333b(C1189b0 b0Var) {
        C1186a.m38182h(this.f5566e);
        while (b0Var.m38142a() > 0) {
            int i = this.f5567f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(b0Var.m38142a(), this.f5573l - this.f5568g);
                        this.f5566e.mo10796c(b0Var, min);
                        int i2 = this.f5568g + min;
                        this.f5568g = i2;
                        int i3 = this.f5573l;
                        if (i2 == i3) {
                            long j = this.f5574m;
                            if (j != -9223372036854775807L) {
                                this.f5566e.mo10794e(j, 1, i3, 0, null);
                                this.f5574m += this.f5571j;
                            }
                            this.f5567f = 0;
                        }
                    }
                } else if (m36466a(b0Var, this.f5563b.m38139d(), 16)) {
                    m36465g();
                    this.f5563b.m38144P(0);
                    this.f5566e.mo10796c(this.f5563b, 16);
                    this.f5567f = 2;
                }
            } else if (m36464h(b0Var)) {
                this.f5567f = 1;
                this.f5563b.m38139d()[0] = -84;
                this.f5563b.m38139d()[1] = (byte) (this.f5570i ? 65 : 64);
                this.f5568g = 2;
            }
        }
    }

    @Override
    public void mo36332c() {
        this.f5567f = 0;
        this.f5568g = 0;
        this.f5569h = false;
        this.f5570i = false;
        this.f5574m = -9223372036854775807L;
    }

    @Override
    public void mo36331d() {
    }

    @Override
    public void mo36330e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36406a();
        this.f5565d = dVar.m36405b();
        this.f5566e = hVar.mo6039r(dVar.m36404c(), 1);
    }

    @Override
    public void mo36329f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5574m = j;
        }
    }

    @RequiresNonNull({"output"})
    public final void m36465g() {
        this.f5562a.m38165p(0);
        C7596c.C7598b d = C7596c.m15546d(this.f5562a);
        C6600g1 g1Var = this.f5572k;
        if (g1Var == null || d.f24318c != g1Var.f20591h0 || d.f24317b != g1Var.f20592i0 || !"audio/ac4".equals(g1Var.f20575U)) {
            C6600g1 E = new C6600g1.C6602b().m19875S(this.f5565d).m19858e0("audio/ac4").m19886H(d.f24318c).m19856f0(d.f24317b).m19872V(this.f5564c).m19889E();
            this.f5572k = E;
            this.f5566e.mo10798a(E);
        }
        this.f5573l = d.f24319d;
        this.f5571j = (d.f24320e * 1000000) / this.f5572k.f20592i0;
    }

    public final boolean m36464h(C1189b0 b0Var) {
        boolean z;
        int D;
        while (true) {
            z = false;
            if (b0Var.m38142a() <= 0) {
                return false;
            }
            if (!this.f5569h) {
                if (b0Var.m38156D() == 172) {
                    z = true;
                }
                this.f5569h = z;
            } else {
                D = b0Var.m38156D();
                this.f5569h = D == 172;
                if (D == 64 || D == 65) {
                    break;
                }
            }
        }
        if (D == 65) {
            z = true;
        }
        this.f5570i = z;
        return true;
    }

    public C1562f(String str) {
        C1187a0 a0Var = new C1187a0(new byte[16]);
        this.f5562a = a0Var;
        this.f5563b = new C1189b0(a0Var.f4469a);
        this.f5567f = 0;
        this.f5568g = 0;
        this.f5569h = false;
        this.f5570i = false;
        this.f5574m = -9223372036854775807L;
        this.f5564c = str;
    }
}
