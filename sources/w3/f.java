package w3;

import c5.b0;
import c5.x;
import d5.a;
import m3.q1;
import t3.t;
import w3.e;

public final class f extends e {
    public final b0 f25756b = new b0(x.f4901a);
    public final b0 f25757c = new b0(4);
    public int f25758d;
    public boolean f25759e;
    public boolean f25760f;
    public int f25761g;

    public f(t tVar) {
        super(tVar);
    }

    @Override
    public boolean b(b0 b0Var) {
        int D = b0Var.D();
        int i10 = (D >> 4) & 15;
        int i11 = D & 15;
        if (i11 == 7) {
            this.f25761g = i10;
            return i10 != 5;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Video format not supported: ");
        sb2.append(i11);
        throw new e.a(sb2.toString());
    }

    @Override
    public boolean c(b0 b0Var, long j10) {
        int D = b0Var.D();
        long o10 = j10 + (b0Var.o() * 1000);
        if (D == 0 && !this.f25759e) {
            b0 b0Var2 = new b0(new byte[b0Var.a()]);
            b0Var.j(b0Var2.d(), 0, b0Var.a());
            a b10 = a.b(b0Var2);
            this.f25758d = b10.f6200b;
            this.f25755a.a(new q1.b().e0("video/avc").I(b10.f6204f).j0(b10.f6201c).Q(b10.f6202d).a0(b10.f6203e).T(b10.f6199a).E());
            this.f25759e = true;
            return false;
        } else if (D != 1 || !this.f25759e) {
            return false;
        } else {
            int i10 = this.f25761g == 1 ? 1 : 0;
            if (!this.f25760f && i10 == 0) {
                return false;
            }
            byte[] d10 = this.f25757c.d();
            d10[0] = 0;
            d10[1] = 0;
            d10[2] = 0;
            int i11 = 4 - this.f25758d;
            int i12 = 0;
            while (b0Var.a() > 0) {
                b0Var.j(this.f25757c.d(), i11, this.f25758d);
                this.f25757c.P(0);
                int H = this.f25757c.H();
                this.f25756b.P(0);
                this.f25755a.d(this.f25756b, 4);
                this.f25755a.d(b0Var, H);
                i12 = i12 + 4 + H;
            }
            this.f25755a.f(o10, i10, i12, 0, null);
            this.f25760f = true;
            return true;
        }
    }
}
