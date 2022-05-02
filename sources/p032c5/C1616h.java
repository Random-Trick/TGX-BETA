package p032c5;

import java.util.Collections;
import java.util.List;
import p020b5.C1189b0;
import p020b5.C1194e;
import p020b5.C1237x;
import p174m3.C6556a2;

public final class C1616h {
    public final List<byte[]> f5957a;
    public final int f5958b;
    public final int f5959c;
    public final int f5960d;
    public final float f5961e;
    public final String f5962f;

    public C1616h(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f5957a = list;
        this.f5958b = i;
        this.f5959c = i2;
        this.f5960d = i3;
        this.f5961e = f;
        this.f5962f = str;
    }

    public static C1616h m36231a(C1189b0 b0Var) {
        int i;
        int i2;
        try {
            b0Var.m38146Q(21);
            int D = b0Var.m38159D() & 3;
            int D2 = b0Var.m38159D();
            int e = b0Var.m38141e();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < D2; i5++) {
                b0Var.m38146Q(1);
                int J = b0Var.m38153J();
                for (int i6 = 0; i6 < J; i6++) {
                    int J2 = b0Var.m38153J();
                    i4 += J2 + 4;
                    b0Var.m38146Q(J2);
                }
            }
            b0Var.m38147P(e);
            byte[] bArr = new byte[i4];
            String str = null;
            int i7 = 0;
            int i8 = 0;
            int i9 = -1;
            int i10 = -1;
            float f = 1.0f;
            while (i7 < D2) {
                int D3 = b0Var.m38159D() & 127;
                int J3 = b0Var.m38153J();
                int i11 = 0;
                while (i11 < J3) {
                    int J4 = b0Var.m38153J();
                    byte[] bArr2 = C1237x.f4572a;
                    D2 = D2;
                    System.arraycopy(bArr2, i3, bArr, i8, bArr2.length);
                    int length = i8 + bArr2.length;
                    System.arraycopy(b0Var.m38142d(), b0Var.m38141e(), bArr, length, J4);
                    if (D3 == 33 && i11 == 0) {
                        C1237x.C1238a h = C1237x.m37851h(bArr, length, length + J4);
                        int i12 = h.f4583h;
                        i10 = h.f4584i;
                        f = h.f4585j;
                        i2 = D3;
                        i = J3;
                        i9 = i12;
                        str = C1194e.m38097c(h.f4576a, h.f4577b, h.f4578c, h.f4579d, h.f4580e, h.f4581f);
                    } else {
                        i2 = D3;
                        i = J3;
                    }
                    i8 = length + J4;
                    b0Var.m38146Q(J4);
                    i11++;
                    D3 = i2;
                    J3 = i;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            return new C1616h(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), D + 1, i9, i10, f, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw C6556a2.m20113a("Error parsing HEVC config", e2);
        }
    }
}
