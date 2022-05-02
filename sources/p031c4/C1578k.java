package p031c4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p199o3.C7601d0;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1578k implements AbstractC1581m {
    public final String f5663b;
    public String f5664c;
    public AbstractC8974t f5665d;
    public int f5667f;
    public int f5668g;
    public long f5669h;
    public C6600g1 f5670i;
    public int f5671j;
    public final C1189b0 f5662a = new C1189b0(new byte[18]);
    public int f5666e = 0;
    public long f5672k = -9223372036854775807L;

    public C1578k(String str) {
        this.f5663b = str;
    }

    public final boolean m36395a(C1189b0 b0Var, byte[] bArr, int i) {
        int min = Math.min(b0Var.m38145a(), i - this.f5667f);
        b0Var.m38136j(bArr, this.f5667f, min);
        int i2 = this.f5667f + min;
        this.f5667f = i2;
        return i2 == i;
    }

    @Override
    public void mo36336b(C1189b0 b0Var) {
        C1186a.m38185h(this.f5665d);
        while (b0Var.m38145a() > 0) {
            int i = this.f5666e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(b0Var.m38145a(), this.f5671j - this.f5667f);
                        this.f5665d.mo10795c(b0Var, min);
                        int i2 = this.f5667f + min;
                        this.f5667f = i2;
                        int i3 = this.f5671j;
                        if (i2 == i3) {
                            long j = this.f5672k;
                            if (j != -9223372036854775807L) {
                                this.f5665d.mo10793e(j, 1, i3, 0, null);
                                this.f5672k += this.f5669h;
                            }
                            this.f5666e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m36395a(b0Var, this.f5662a.m38142d(), 18)) {
                    m36394g();
                    this.f5662a.m38147P(0);
                    this.f5665d.mo10795c(this.f5662a, 18);
                    this.f5666e = 2;
                }
            } else if (m36393h(b0Var)) {
                this.f5666e = 1;
            }
        }
    }

    @Override
    public void mo36335c() {
        this.f5666e = 0;
        this.f5667f = 0;
        this.f5668g = 0;
        this.f5672k = -9223372036854775807L;
    }

    @Override
    public void mo36334d() {
    }

    @Override
    public void mo36333e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36409a();
        this.f5664c = dVar.m36408b();
        this.f5665d = hVar.mo6039r(dVar.m36407c(), 1);
    }

    @Override
    public void mo36332f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5672k = j;
        }
    }

    @RequiresNonNull({"output"})
    public final void m36394g() {
        byte[] d = this.f5662a.m38142d();
        if (this.f5670i == null) {
            C6600g1 g = C7601d0.m15537g(d, this.f5664c, this.f5663b, null);
            this.f5670i = g;
            this.f5665d.mo10797a(g);
        }
        this.f5671j = C7601d0.m15543a(d);
        this.f5669h = (int) ((C7601d0.m15538f(d) * 1000000) / this.f5670i.f20592i0);
    }

    public final boolean m36393h(C1189b0 b0Var) {
        while (b0Var.m38145a() > 0) {
            int i = this.f5668g << 8;
            this.f5668g = i;
            int D = i | b0Var.m38159D();
            this.f5668g = D;
            if (C7601d0.m15540d(D)) {
                byte[] d = this.f5662a.m38142d();
                int i2 = this.f5668g;
                d[0] = (byte) ((i2 >> 24) & 255);
                d[1] = (byte) ((i2 >> 16) & 255);
                d[2] = (byte) ((i2 >> 8) & 255);
                d[3] = (byte) (i2 & 255);
                this.f5667f = 4;
                this.f5668g = 0;
                return true;
            }
        }
        return false;
    }
}
