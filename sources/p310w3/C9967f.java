package p310w3;

import p020b5.C1189b0;
import p020b5.C1237x;
import p032c5.C1604a;
import p174m3.C6600g1;
import p270t3.AbstractC8974t;
import p310w3.AbstractC9965e;

public final class C9967f extends AbstractC9965e {
    public final C1189b0 f32387b = new C1189b0(C1237x.f4572a);
    public final C1189b0 f32388c = new C1189b0(4);
    public int f32389d;
    public boolean f32390e;
    public boolean f32391f;
    public int f32392g;

    public C9967f(AbstractC8974t tVar) {
        super(tVar);
    }

    @Override
    public boolean mo6390b(C1189b0 b0Var) {
        int D = b0Var.m38159D();
        int i = (D >> 4) & 15;
        int i2 = D & 15;
        if (i2 == 7) {
            this.f32392g = i;
            return i != 5;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Video format not supported: ");
        sb2.append(i2);
        throw new AbstractC9965e.C9966a(sb2.toString());
    }

    @Override
    public boolean mo6389c(C1189b0 b0Var, long j) {
        int D = b0Var.m38159D();
        long o = j + (b0Var.m38131o() * 1000);
        if (D == 0 && !this.f32390e) {
            C1189b0 b0Var2 = new C1189b0(new byte[b0Var.m38145a()]);
            b0Var.m38136j(b0Var2.m38142d(), 0, b0Var.m38145a());
            C1604a b = C1604a.m36296b(b0Var2);
            this.f32389d = b.f5876b;
            this.f32386a.mo10797a(new C6600g1.C6602b().m19859e0("video/avc").m19886I(b.f5880f).m19849j0(b.f5877c).m19878Q(b.f5878d).m19867a0(b.f5879e).m19875T(b.f5875a).m19890E());
            this.f32390e = true;
            return false;
        } else if (D != 1 || !this.f32390e) {
            return false;
        } else {
            int i = this.f32392g == 1 ? 1 : 0;
            if (!this.f32391f && i == 0) {
                return false;
            }
            byte[] d = this.f32388c.m38142d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i2 = 4 - this.f32389d;
            int i3 = 0;
            while (b0Var.m38145a() > 0) {
                b0Var.m38136j(this.f32388c.m38142d(), i2, this.f32389d);
                this.f32388c.m38147P(0);
                int H = this.f32388c.m38155H();
                this.f32387b.m38147P(0);
                this.f32386a.mo10795c(this.f32387b, 4);
                this.f32386a.mo10795c(b0Var, H);
                i3 = i3 + 4 + H;
            }
            this.f32386a.mo10793e(o, i, i3, 0, null);
            this.f32391f = true;
            return true;
        }
    }
}
