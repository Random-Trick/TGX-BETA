package e5;

import c5.a0;
import c5.b0;
import c5.l0;
import e5.d;
import java.util.ArrayList;
import java.util.zip.Inflater;

public final class e {
    public static d a(byte[] bArr, int i10) {
        ArrayList<d.a> arrayList;
        b0 b0Var = new b0(bArr);
        try {
            arrayList = c(b0Var) ? f(b0Var) : e(b0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new d(arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new d(arrayList.get(0), arrayList.get(1), i10);
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    public static boolean c(b0 b0Var) {
        b0Var.Q(4);
        int n10 = b0Var.n();
        b0Var.P(0);
        return n10 == 1886547818;
    }

    public static d.a d(b0 b0Var) {
        int n10 = b0Var.n();
        if (n10 > 10000) {
            return null;
        }
        float[] fArr = new float[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            fArr[i10] = b0Var.m();
        }
        int n11 = b0Var.n();
        if (n11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(n10 * 2.0d) / log);
        a0 a0Var = new a0(b0Var.d());
        int i11 = 8;
        a0Var.p(b0Var.e() * 8);
        float[] fArr2 = new float[n11 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < n11) {
            int i15 = 0;
            while (i15 < i12) {
                int b10 = iArr[i15] + b(a0Var.h(ceil));
                if (b10 >= n10 || b10 < 0) {
                    return null;
                }
                i14++;
                fArr2[i14] = fArr[b10];
                iArr[i15] = b10;
                i15++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        a0Var.p((a0Var.e() + 7) & (-8));
        int i16 = 32;
        int h10 = a0Var.h(32);
        d.b[] bVarArr = new d.b[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = a0Var.h(i11);
            int h12 = a0Var.h(i11);
            int h13 = a0Var.h(i16);
            if (h13 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(n11 * d10) / log);
            float[] fArr3 = new float[h13 * 3];
            float[] fArr4 = new float[h13 * 2];
            int i18 = 0;
            for (int i19 = 0; i19 < h13; i19++) {
                i18 += b(a0Var.h(ceil2));
                if (i18 < 0 || i18 >= n11) {
                    return null;
                }
                int i20 = i19 * 3;
                int i21 = i18 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i19 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
            }
            bVarArr[i17] = new d.b(h11, fArr3, fArr4, h12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new d.a(bVarArr);
    }

    public static ArrayList<d.a> e(b0 b0Var) {
        if (b0Var.D() != 0) {
            return null;
        }
        b0Var.Q(7);
        int n10 = b0Var.n();
        if (n10 == 1684433976) {
            b0 b0Var2 = new b0();
            Inflater inflater = new Inflater(true);
            try {
                if (!l0.g0(b0Var, b0Var2, inflater)) {
                    return null;
                }
                inflater.end();
                b0Var = b0Var2;
            } finally {
                inflater.end();
            }
        } else if (n10 != 1918990112) {
            return null;
        }
        return g(b0Var);
    }

    public static ArrayList<d.a> f(b0 b0Var) {
        int n10;
        b0Var.Q(8);
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        while (e10 < f10 && (n10 = b0Var.n() + e10) > e10 && n10 <= f10) {
            int n11 = b0Var.n();
            if (n11 == 2037673328 || n11 == 1836279920) {
                b0Var.O(n10);
                return e(b0Var);
            }
            b0Var.P(n10);
            e10 = n10;
        }
        return null;
    }

    public static ArrayList<d.a> g(b0 b0Var) {
        ArrayList<d.a> arrayList = new ArrayList<>();
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        while (e10 < f10) {
            int n10 = b0Var.n() + e10;
            if (n10 <= e10 || n10 > f10) {
                return null;
            }
            if (b0Var.n() == 1835365224) {
                d.a d10 = d(b0Var);
                if (d10 == null) {
                    return null;
                }
                arrayList.add(d10);
            }
            b0Var.P(n10);
            e10 = n10;
        }
        return arrayList;
    }
}
