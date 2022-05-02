package p031c4;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p174m3.C6556a2;
import p174m3.C6600g1;
import p199o3.C7576a;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1594s implements AbstractC1581m {
    public final String f5811a;
    public final C1189b0 f5812b;
    public final C1187a0 f5813c;
    public AbstractC8974t f5814d;
    public String f5815e;
    public C6600g1 f5816f;
    public int f5817g;
    public int f5818h;
    public int f5819i;
    public int f5820j;
    public long f5821k = -9223372036854775807L;
    public boolean f5822l;
    public int f5823m;
    public int f5824n;
    public int f5825o;
    public boolean f5826p;
    public long f5827q;
    public int f5828r;
    public long f5829s;
    public int f5830t;
    public String f5831u;

    public C1594s(String str) {
        this.f5811a = str;
        C1189b0 b0Var = new C1189b0((int) Log.TAG_CAMERA);
        this.f5812b = b0Var;
        this.f5813c = new C1187a0(b0Var.m38142d());
    }

    public static long m36345a(C1187a0 a0Var) {
        return a0Var.m38176h((a0Var.m38176h(2) + 1) * 8);
    }

    @Override
    public void mo36336b(C1189b0 b0Var) {
        C1186a.m38185h(this.f5814d);
        while (b0Var.m38145a() > 0) {
            int i = this.f5817g;
            if (i != 0) {
                if (i == 1) {
                    int D = b0Var.m38159D();
                    if ((D & 224) == 224) {
                        this.f5820j = D;
                        this.f5817g = 2;
                    } else if (D != 86) {
                        this.f5817g = 0;
                    }
                } else if (i == 2) {
                    int D2 = ((this.f5820j & (-225)) << 8) | b0Var.m38159D();
                    this.f5819i = D2;
                    if (D2 > this.f5812b.m38142d().length) {
                        m36338m(this.f5819i);
                    }
                    this.f5818h = 0;
                    this.f5817g = 3;
                } else if (i == 3) {
                    int min = Math.min(b0Var.m38145a(), this.f5819i - this.f5818h);
                    b0Var.m38136j(this.f5813c.f4469a, this.f5818h, min);
                    int i2 = this.f5818h + min;
                    this.f5818h = i2;
                    if (i2 == this.f5819i) {
                        this.f5813c.m38168p(0);
                        m36344g(this.f5813c);
                        this.f5817g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (b0Var.m38159D() == 86) {
                this.f5817g = 1;
            }
        }
    }

    @Override
    public void mo36335c() {
        this.f5817g = 0;
        this.f5821k = -9223372036854775807L;
        this.f5822l = false;
    }

    @Override
    public void mo36334d() {
    }

    @Override
    public void mo36333e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36409a();
        this.f5814d = hVar.mo6039r(dVar.m36407c(), 1);
        this.f5815e = dVar.m36408b();
    }

    @Override
    public void mo36332f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5821k = j;
        }
    }

    @RequiresNonNull({"output"})
    public final void m36344g(C1187a0 a0Var) {
        if (!a0Var.m38177g()) {
            this.f5822l = true;
            m36339l(a0Var);
        } else if (!this.f5822l) {
            return;
        }
        if (this.f5823m != 0) {
            throw C6556a2.m20113a(null, null);
        } else if (this.f5824n == 0) {
            m36340k(a0Var, m36341j(a0Var));
            if (this.f5826p) {
                a0Var.m38166r((int) this.f5827q);
            }
        } else {
            throw C6556a2.m20113a(null, null);
        }
    }

    public final int m36343h(C1187a0 a0Var) {
        int b = a0Var.m38182b();
        C7576a.C7578b d = C7576a.m15650d(a0Var, true);
        this.f5831u = d.f24203c;
        this.f5828r = d.f24201a;
        this.f5830t = d.f24202b;
        return b - a0Var.m38182b();
    }

    public final void m36342i(C1187a0 a0Var) {
        int h = a0Var.m38176h(3);
        this.f5825o = h;
        if (h == 0) {
            a0Var.m38166r(8);
        } else if (h == 1) {
            a0Var.m38166r(9);
        } else if (h == 3 || h == 4 || h == 5) {
            a0Var.m38166r(6);
        } else if (h == 6 || h == 7) {
            a0Var.m38166r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final int m36341j(C1187a0 a0Var) {
        int h;
        if (this.f5825o == 0) {
            int i = 0;
            do {
                h = a0Var.m38176h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw C6556a2.m20113a(null, null);
    }

    @RequiresNonNull({"output"})
    public final void m36340k(C1187a0 a0Var, int i) {
        int e = a0Var.m38179e();
        if ((e & 7) == 0) {
            this.f5812b.m38147P(e >> 3);
        } else {
            a0Var.m38175i(this.f5812b.m38142d(), 0, i * 8);
            this.f5812b.m38147P(0);
        }
        this.f5814d.mo10795c(this.f5812b, i);
        long j = this.f5821k;
        if (j != -9223372036854775807L) {
            this.f5814d.mo10793e(j, 1, i, 0, null);
            this.f5821k += this.f5829s;
        }
    }

    @RequiresNonNull({"output"})
    public final void m36339l(C1187a0 a0Var) {
        boolean g;
        int h = a0Var.m38176h(1);
        int h2 = h == 1 ? a0Var.m38176h(1) : 0;
        this.f5823m = h2;
        if (h2 == 0) {
            if (h == 1) {
                m36345a(a0Var);
            }
            if (a0Var.m38177g()) {
                this.f5824n = a0Var.m38176h(6);
                int h3 = a0Var.m38176h(4);
                int h4 = a0Var.m38176h(3);
                if (h3 == 0 && h4 == 0) {
                    if (h == 0) {
                        int e = a0Var.m38179e();
                        int h5 = m36343h(a0Var);
                        a0Var.m38168p(e);
                        byte[] bArr = new byte[(h5 + 7) / 8];
                        a0Var.m38175i(bArr, 0, h5);
                        C6600g1 E = new C6600g1.C6602b().m19876S(this.f5815e).m19859e0("audio/mp4a-latm").m19886I(this.f5831u).m19887H(this.f5830t).m19857f0(this.f5828r).m19875T(Collections.singletonList(bArr)).m19873V(this.f5811a).m19890E();
                        if (!E.equals(this.f5816f)) {
                            this.f5816f = E;
                            this.f5829s = 1024000000 / E.f20592i0;
                            this.f5814d.mo10797a(E);
                        }
                    } else {
                        a0Var.m38166r(((int) m36345a(a0Var)) - m36343h(a0Var));
                    }
                    m36342i(a0Var);
                    boolean g2 = a0Var.m38177g();
                    this.f5826p = g2;
                    this.f5827q = 0L;
                    if (g2) {
                        if (h == 1) {
                            this.f5827q = m36345a(a0Var);
                        } else {
                            do {
                                g = a0Var.m38177g();
                                this.f5827q = (this.f5827q << 8) + a0Var.m38176h(8);
                            } while (g);
                        }
                    }
                    if (a0Var.m38177g()) {
                        a0Var.m38166r(8);
                        return;
                    }
                    return;
                }
                throw C6556a2.m20113a(null, null);
            }
            throw C6556a2.m20113a(null, null);
        }
        throw C6556a2.m20113a(null, null);
    }

    public final void m36338m(int i) {
        this.f5812b.m38151L(i);
        this.f5813c.m38170n(this.f5812b.m38142d());
    }
}
