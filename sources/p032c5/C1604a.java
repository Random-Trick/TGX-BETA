package p032c5;

import java.util.ArrayList;
import java.util.List;
import p020b5.C1189b0;
import p020b5.C1194e;
import p020b5.C1237x;
import p174m3.C6556a2;

public final class C1604a {
    public final List<byte[]> f5875a;
    public final int f5876b;
    public final int f5877c;
    public final int f5878d;
    public final float f5879e;
    public final String f5880f;

    public C1604a(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f5875a = list;
        this.f5876b = i;
        this.f5877c = i2;
        this.f5878d = i3;
        this.f5879e = f;
        this.f5880f = str;
    }

    public static byte[] m36297a(C1189b0 b0Var) {
        int J = b0Var.m38153J();
        int e = b0Var.m38141e();
        b0Var.m38146Q(J);
        return C1194e.m38096d(b0Var.m38142d(), e, J);
    }

    public static C1604a m36296b(C1189b0 b0Var) {
        float f;
        int i;
        try {
            b0Var.m38146Q(4);
            int D = (b0Var.m38159D() & 3) + 1;
            if (D != 3) {
                ArrayList arrayList = new ArrayList();
                int D2 = b0Var.m38159D() & 31;
                for (int i2 = 0; i2 < D2; i2++) {
                    arrayList.add(m36297a(b0Var));
                }
                int D3 = b0Var.m38159D();
                for (int i3 = 0; i3 < D3; i3++) {
                    arrayList.add(m36297a(b0Var));
                }
                String str = null;
                int i4 = -1;
                if (D2 > 0) {
                    C1237x.C1240c l = C1237x.m37847l((byte[]) arrayList.get(0), D, ((byte[]) arrayList.get(0)).length);
                    int i5 = l.f4593e;
                    int i6 = l.f4594f;
                    float f2 = l.f4595g;
                    str = C1194e.m38099a(l.f4589a, l.f4590b, l.f4591c);
                    i4 = i5;
                    i = i6;
                    f = f2;
                } else {
                    i = -1;
                    f = 1.0f;
                }
                return new C1604a(arrayList, D, i4, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C6556a2.m20113a("Error parsing AVC config", e);
        }
    }
}
