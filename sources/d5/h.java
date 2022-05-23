package d5;

import c5.b0;
import c5.e;
import c5.x;
import java.util.Collections;
import java.util.List;
import m3.k2;

public final class h {
    public final List<byte[]> f6262a;
    public final int f6263b;
    public final int f6264c;
    public final int f6265d;
    public final float f6266e;
    public final String f6267f;

    public h(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f6262a = list;
        this.f6263b = i10;
        this.f6264c = i11;
        this.f6265d = i12;
        this.f6266e = f10;
        this.f6267f = str;
    }

    public static h a(b0 b0Var) {
        int i10;
        int i11;
        try {
            b0Var.Q(21);
            int D = b0Var.D() & 3;
            int D2 = b0Var.D();
            int e10 = b0Var.e();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < D2; i14++) {
                b0Var.Q(1);
                int J = b0Var.J();
                for (int i15 = 0; i15 < J; i15++) {
                    int J2 = b0Var.J();
                    i13 += J2 + 4;
                    b0Var.Q(J2);
                }
            }
            b0Var.P(e10);
            byte[] bArr = new byte[i13];
            String str = null;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            int i19 = -1;
            float f10 = 1.0f;
            while (i16 < D2) {
                int D3 = b0Var.D() & 127;
                int J3 = b0Var.J();
                int i20 = 0;
                while (i20 < J3) {
                    int J4 = b0Var.J();
                    byte[] bArr2 = x.f4901a;
                    D2 = D2;
                    System.arraycopy(bArr2, i12, bArr, i17, bArr2.length);
                    int length = i17 + bArr2.length;
                    System.arraycopy(b0Var.d(), b0Var.e(), bArr, length, J4);
                    if (D3 == 33 && i20 == 0) {
                        x.a h10 = x.h(bArr, length, length + J4);
                        int i21 = h10.f4912h;
                        i19 = h10.f4913i;
                        f10 = h10.f4914j;
                        i11 = D3;
                        i10 = J3;
                        i18 = i21;
                        str = e.c(h10.f4905a, h10.f4906b, h10.f4907c, h10.f4908d, h10.f4909e, h10.f4910f);
                    } else {
                        i11 = D3;
                        i10 = J3;
                    }
                    i17 = length + J4;
                    b0Var.Q(J4);
                    i20++;
                    D3 = i11;
                    J3 = i10;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            return new h(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), D + 1, i18, i19, f10, str);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw k2.a("Error parsing HEVC config", e11);
        }
    }
}
