package p045d5;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p045d5.C3604d;

public final class C3607e {
    public static C3604d m29880a(byte[] bArr, int i) {
        ArrayList<C3604d.C3605a> arrayList;
        C1189b0 b0Var = new C1189b0(bArr);
        try {
            arrayList = m29878c(b0Var) ? m29875f(b0Var) : m29876e(b0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new C3604d(arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new C3604d(arrayList.get(0), arrayList.get(1), i);
    }

    public static int m29879b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static boolean m29878c(C1189b0 b0Var) {
        b0Var.m38146Q(4);
        int n = b0Var.m38132n();
        b0Var.m38147P(0);
        return n == 1886547818;
    }

    public static C3604d.C3605a m29877d(C1189b0 b0Var) {
        int n = b0Var.m38132n();
        if (n > 10000) {
            return null;
        }
        float[] fArr = new float[n];
        for (int i = 0; i < n; i++) {
            fArr[i] = b0Var.m38133m();
        }
        int n2 = b0Var.m38132n();
        if (n2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(n * 2.0d) / log);
        C1187a0 a0Var = new C1187a0(b0Var.m38142d());
        int i2 = 8;
        a0Var.m38168p(b0Var.m38141e() * 8);
        float[] fArr2 = new float[n2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < n2) {
            int i6 = 0;
            while (i6 < i3) {
                int b = iArr[i6] + m29879b(a0Var.m38176h(ceil));
                if (b >= n || b < 0) {
                    return null;
                }
                i5++;
                fArr2[i5] = fArr[b];
                iArr[i6] = b;
                i6++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        a0Var.m38168p((a0Var.m38179e() + 7) & (-8));
        int i7 = 32;
        int h = a0Var.m38176h(32);
        C3604d.C3606b[] bVarArr = new C3604d.C3606b[h];
        int i8 = 0;
        while (i8 < h) {
            int h2 = a0Var.m38176h(i2);
            int h3 = a0Var.m38176h(i2);
            int h4 = a0Var.m38176h(i7);
            if (h4 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(n2 * d) / log);
            float[] fArr3 = new float[h4 * 3];
            float[] fArr4 = new float[h4 * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < h4; i10++) {
                i9 += m29879b(a0Var.m38176h(ceil2));
                if (i9 < 0 || i9 >= n2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = i9 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            bVarArr[i8] = new C3604d.C3606b(h2, fArr3, fArr4, h3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new C3604d.C3605a(bVarArr);
    }

    public static ArrayList<C3604d.C3605a> m29876e(C1189b0 b0Var) {
        if (b0Var.m38159D() != 0) {
            return null;
        }
        b0Var.m38146Q(7);
        int n = b0Var.m38132n();
        if (n == 1684433976) {
            C1189b0 b0Var2 = new C1189b0();
            Inflater inflater = new Inflater(true);
            try {
                if (!C1216l0.m37978f0(b0Var, b0Var2, inflater)) {
                    return null;
                }
                inflater.end();
                b0Var = b0Var2;
            } finally {
                inflater.end();
            }
        } else if (n != 1918990112) {
            return null;
        }
        return m29874g(b0Var);
    }

    public static ArrayList<C3604d.C3605a> m29875f(C1189b0 b0Var) {
        int n;
        b0Var.m38146Q(8);
        int e = b0Var.m38141e();
        int f = b0Var.m38140f();
        while (e < f && (n = b0Var.m38132n() + e) > e && n <= f) {
            int n2 = b0Var.m38132n();
            if (n2 == 2037673328 || n2 == 1836279920) {
                b0Var.m38148O(n);
                return m29876e(b0Var);
            }
            b0Var.m38147P(n);
            e = n;
        }
        return null;
    }

    public static ArrayList<C3604d.C3605a> m29874g(C1189b0 b0Var) {
        ArrayList<C3604d.C3605a> arrayList = new ArrayList<>();
        int e = b0Var.m38141e();
        int f = b0Var.m38140f();
        while (e < f) {
            int n = b0Var.m38132n() + e;
            if (n <= e || n > f) {
                return null;
            }
            if (b0Var.m38132n() == 1835365224) {
                C3604d.C3605a d = m29877d(b0Var);
                if (d == null) {
                    return null;
                }
                arrayList.add(d);
            }
            b0Var.m38147P(n);
            e = n;
        }
        return arrayList;
    }
}
