package p310w3;

import java.util.Collections;
import p020b5.C1189b0;
import p174m3.C6600g1;
import p199o3.C7576a;
import p270t3.AbstractC8974t;
import p310w3.AbstractC9965e;

public final class C9961a extends AbstractC9965e {
    public static final int[] f32361e = {5512, 11025, 22050, 44100};
    public boolean f32362b;
    public boolean f32363c;
    public int f32364d;

    public C9961a(AbstractC8974t tVar) {
        super(tVar);
    }

    @Override
    public boolean mo6390b(C1189b0 b0Var) {
        if (!this.f32362b) {
            int D = b0Var.m38159D();
            int i = (D >> 4) & 15;
            this.f32364d = i;
            if (i == 2) {
                this.f32386a.mo10797a(new C6600g1.C6602b().m19859e0("audio/mpeg").m19887H(1).m19857f0(f32361e[(D >> 2) & 3]).m19890E());
                this.f32363c = true;
            } else if (i == 7 || i == 8) {
                this.f32386a.mo10797a(new C6600g1.C6602b().m19859e0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m19887H(1).m19857f0(8000).m19890E());
                this.f32363c = true;
            } else if (i != 10) {
                int i2 = this.f32364d;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Audio format not supported: ");
                sb2.append(i2);
                throw new AbstractC9965e.C9966a(sb2.toString());
            }
            this.f32362b = true;
        } else {
            b0Var.m38146Q(1);
        }
        return true;
    }

    @Override
    public boolean mo6389c(C1189b0 b0Var, long j) {
        if (this.f32364d == 2) {
            int a = b0Var.m38145a();
            this.f32386a.mo10795c(b0Var, a);
            this.f32386a.mo10793e(j, 1, a, 0, null);
            return true;
        }
        int D = b0Var.m38159D();
        if (D == 0 && !this.f32363c) {
            int a2 = b0Var.m38145a();
            byte[] bArr = new byte[a2];
            b0Var.m38136j(bArr, 0, a2);
            C7576a.C7578b e = C7576a.m15649e(bArr);
            this.f32386a.mo10797a(new C6600g1.C6602b().m19859e0("audio/mp4a-latm").m19886I(e.f24203c).m19887H(e.f24202b).m19857f0(e.f24201a).m19875T(Collections.singletonList(bArr)).m19890E());
            this.f32363c = true;
            return false;
        } else if (this.f32364d == 10 && D != 1) {
            return false;
        } else {
            int a3 = b0Var.m38145a();
            this.f32386a.mo10795c(b0Var, a3);
            this.f32386a.mo10793e(j, 1, a3, 0, null);
            return true;
        }
    }
}
