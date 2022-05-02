package p310w3;

import java.util.Collections;
import p020b5.C1189b0;
import p174m3.C6600g1;
import p199o3.C7576a;
import p270t3.AbstractC8974t;
import p310w3.AbstractC9965e;

public final class C9961a extends AbstractC9965e {
    public static final int[] f32358e = {5512, 11025, 22050, 44100};
    public boolean f32359b;
    public boolean f32360c;
    public int f32361d;

    public C9961a(AbstractC8974t tVar) {
        super(tVar);
    }

    @Override
    public boolean mo6390b(C1189b0 b0Var) {
        if (!this.f32359b) {
            int D = b0Var.m38156D();
            int i = (D >> 4) & 15;
            this.f32361d = i;
            if (i == 2) {
                this.f32383a.mo10798a(new C6600g1.C6602b().m19858e0("audio/mpeg").m19886H(1).m19856f0(f32358e[(D >> 2) & 3]).m19889E());
                this.f32360c = true;
            } else if (i == 7 || i == 8) {
                this.f32383a.mo10798a(new C6600g1.C6602b().m19858e0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m19886H(1).m19856f0(8000).m19889E());
                this.f32360c = true;
            } else if (i != 10) {
                int i2 = this.f32361d;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Audio format not supported: ");
                sb2.append(i2);
                throw new AbstractC9965e.C9966a(sb2.toString());
            }
            this.f32359b = true;
        } else {
            b0Var.m38143Q(1);
        }
        return true;
    }

    @Override
    public boolean mo6389c(C1189b0 b0Var, long j) {
        if (this.f32361d == 2) {
            int a = b0Var.m38142a();
            this.f32383a.mo10796c(b0Var, a);
            this.f32383a.mo10794e(j, 1, a, 0, null);
            return true;
        }
        int D = b0Var.m38156D();
        if (D == 0 && !this.f32360c) {
            int a2 = b0Var.m38142a();
            byte[] bArr = new byte[a2];
            b0Var.m38133j(bArr, 0, a2);
            C7576a.C7578b e = C7576a.m15649e(bArr);
            this.f32383a.mo10798a(new C6600g1.C6602b().m19858e0("audio/mp4a-latm").m19885I(e.f24200c).m19886H(e.f24199b).m19856f0(e.f24198a).m19874T(Collections.singletonList(bArr)).m19889E());
            this.f32360c = true;
            return false;
        } else if (this.f32361d == 10 && D != 1) {
            return false;
        } else {
            int a3 = b0Var.m38142a();
            this.f32383a.mo10796c(b0Var, a3);
            this.f32383a.mo10794e(j, 1, a3, 0, null);
            return true;
        }
    }
}
