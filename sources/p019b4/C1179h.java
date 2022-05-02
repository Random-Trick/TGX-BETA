package p019b4;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p019b4.AbstractC1180i;
import p020b5.C1186a;
import p020b5.C1189b0;
import p174m3.C6600g1;
import p199o3.C7617h0;

public final class C1179h extends AbstractC1180i {
    public static final byte[] f4442o = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean f4443n;

    public static boolean m38211o(C1189b0 b0Var) {
        int a = b0Var.m38142a();
        byte[] bArr = f4442o;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        b0Var.m38133j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public long mo38197f(C1189b0 b0Var) {
        return m38208c(m38212n(b0Var.m38139d()));
    }

    @Override
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean mo38196h(C1189b0 b0Var, long j, AbstractC1180i.C1182b bVar) {
        boolean z = true;
        if (!this.f4443n) {
            byte[] copyOf = Arrays.copyOf(b0Var.m38139d(), b0Var.m38137f());
            int c = C7617h0.m15469c(copyOf);
            bVar.f4457a = new C6600g1.C6602b().m19858e0("audio/opus").m19886H(c).m19856f0(48000).m19874T(C7617h0.m15471a(copyOf)).m19889E();
            this.f4443n = true;
            return true;
        }
        C1186a.m38185e(bVar.f4457a);
        if (b0Var.m38129n() != 1332770163) {
            z = false;
        }
        b0Var.m38144P(0);
        return z;
    }

    @Override
    public void mo38195l(boolean z) {
        super.mo38195l(z);
        if (z) {
            this.f4443n = false;
        }
    }

    public final long m38212n(byte[] bArr) {
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (!(i2 == 1 || i2 == 2)) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5);
    }
}
