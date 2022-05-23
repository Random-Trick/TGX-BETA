package w3;

import c5.b0;
import java.util.Collections;
import m3.q1;
import o3.a;
import t3.t;
import w3.e;

public final class a extends e {
    public static final int[] f25730e = {5512, 11025, 22050, 44100};
    public boolean f25731b;
    public boolean f25732c;
    public int f25733d;

    public a(t tVar) {
        super(tVar);
    }

    @Override
    public boolean b(b0 b0Var) {
        if (!this.f25731b) {
            int D = b0Var.D();
            int i10 = (D >> 4) & 15;
            this.f25733d = i10;
            if (i10 == 2) {
                this.f25755a.a(new q1.b().e0("audio/mpeg").H(1).f0(f25730e[(D >> 2) & 3]).E());
                this.f25732c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f25755a.a(new q1.b().e0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000).E());
                this.f25732c = true;
            } else if (i10 != 10) {
                int i11 = this.f25733d;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Audio format not supported: ");
                sb2.append(i11);
                throw new e.a(sb2.toString());
            }
            this.f25731b = true;
        } else {
            b0Var.Q(1);
        }
        return true;
    }

    @Override
    public boolean c(b0 b0Var, long j10) {
        if (this.f25733d == 2) {
            int a10 = b0Var.a();
            this.f25755a.d(b0Var, a10);
            this.f25755a.f(j10, 1, a10, 0, null);
            return true;
        }
        int D = b0Var.D();
        if (D == 0 && !this.f25732c) {
            int a11 = b0Var.a();
            byte[] bArr = new byte[a11];
            b0Var.j(bArr, 0, a11);
            a.b e10 = o3.a.e(bArr);
            this.f25755a.a(new q1.b().e0("audio/mp4a-latm").I(e10.f18650c).H(e10.f18649b).f0(e10.f18648a).T(Collections.singletonList(bArr)).E());
            this.f25732c = true;
            return false;
        } else if (this.f25733d == 10 && D != 1) {
            return false;
        } else {
            int a12 = b0Var.a();
            this.f25755a.d(b0Var, a12);
            this.f25755a.f(j10, 1, a12, 0, null);
            return true;
        }
    }
}
