package d5;

import c5.b0;
import c5.e;
import c5.x;
import java.util.ArrayList;
import java.util.List;
import m3.k2;

public final class a {
    public final List<byte[]> f6199a;
    public final int f6200b;
    public final int f6201c;
    public final int f6202d;
    public final float f6203e;
    public final String f6204f;

    public a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f6199a = list;
        this.f6200b = i10;
        this.f6201c = i11;
        this.f6202d = i12;
        this.f6203e = f10;
        this.f6204f = str;
    }

    public static byte[] a(b0 b0Var) {
        int J = b0Var.J();
        int e10 = b0Var.e();
        b0Var.Q(J);
        return e.d(b0Var.d(), e10, J);
    }

    public static a b(b0 b0Var) {
        float f10;
        int i10;
        try {
            b0Var.Q(4);
            int D = (b0Var.D() & 3) + 1;
            if (D != 3) {
                ArrayList arrayList = new ArrayList();
                int D2 = b0Var.D() & 31;
                for (int i11 = 0; i11 < D2; i11++) {
                    arrayList.add(a(b0Var));
                }
                int D3 = b0Var.D();
                for (int i12 = 0; i12 < D3; i12++) {
                    arrayList.add(a(b0Var));
                }
                String str = null;
                int i13 = -1;
                if (D2 > 0) {
                    x.c l10 = x.l((byte[]) arrayList.get(0), D, ((byte[]) arrayList.get(0)).length);
                    int i14 = l10.f4922e;
                    int i15 = l10.f4923f;
                    float f11 = l10.f4924g;
                    str = e.a(l10.f4918a, l10.f4919b, l10.f4920c);
                    i13 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, D, i13, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw k2.a("Error parsing AVC config", e10);
        }
    }
}
