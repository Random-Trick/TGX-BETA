package p310w3;

import p020b5.C1189b0;
import p020b5.C1237x;
import p032c5.C1604a;
import p174m3.C6600g1;
import p270t3.AbstractC8974t;
import p310w3.AbstractC9965e;

public final class C9967f extends AbstractC9965e {
    public final C1189b0 f32384b = new C1189b0(C1237x.f4572a);
    public final C1189b0 f32385c = new C1189b0(4);
    public int f32386d;
    public boolean f32387e;
    public boolean f32388f;
    public int f32389g;

    public C9967f(AbstractC8974t tVar) {
        super(tVar);
    }

    @Override
    public boolean mo6390b(C1189b0 b0Var) {
        int D = b0Var.m38156D();
        int i = (D >> 4) & 15;
        int i2 = D & 15;
        if (i2 == 7) {
            this.f32389g = i;
            return i != 5;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Video format not supported: ");
        sb2.append(i2);
        throw new AbstractC9965e.C9966a(sb2.toString());
    }

    @Override
    public boolean mo6389c(C1189b0 b0Var, long j) {
        int D = b0Var.m38156D();
        long o = j + (b0Var.m38128o() * 1000);
        if (D == 0 && !this.f32387e) {
            C1189b0 b0Var2 = new C1189b0(new byte[b0Var.m38142a()]);
            b0Var.m38133j(b0Var2.m38139d(), 0, b0Var.m38142a());
            C1604a b = C1604a.m36293b(b0Var2);
            this.f32386d = b.f5876b;
            this.f32383a.mo10798a(new C6600g1.C6602b().m19858e0("video/avc").m19885I(b.f5880f).m19848j0(b.f5877c).m19877Q(b.f5878d).m19866a0(b.f5879e).m19874T(b.f5875a).m19889E());
            this.f32387e = true;
            return false;
        } else if (D != 1 || !this.f32387e) {
            return false;
        } else {
            int i = this.f32389g == 1 ? 1 : 0;
            if (!this.f32388f && i == 0) {
                return false;
            }
            byte[] d = this.f32385c.m38139d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i2 = 4 - this.f32386d;
            int i3 = 0;
            while (b0Var.m38142a() > 0) {
                b0Var.m38133j(this.f32385c.m38139d(), i2, this.f32386d);
                this.f32385c.m38144P(0);
                int H = this.f32385c.m38152H();
                this.f32384b.m38144P(0);
                this.f32383a.mo10796c(this.f32384b, 4);
                this.f32383a.mo10796c(b0Var, H);
                i3 = i3 + 4 + H;
            }
            this.f32383a.mo10794e(o, i, i3, 0, null);
            this.f32388f = true;
            return true;
        }
    }
}
