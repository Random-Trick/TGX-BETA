package p020b5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class C1237x {
    public static final byte[] f4572a = {0, 0, 0, 1};
    public static final float[] f4573b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f4574c = new Object();
    public static int[] f4575d = new int[10];

    public static final class C1238a {
        public final int f4576a;
        public final boolean f4577b;
        public final int f4578c;
        public final int f4579d;
        public final int[] f4580e;
        public final int f4581f;
        public final int f4582g;
        public final int f4583h;
        public final int f4584i;
        public final float f4585j;

        public C1238a(int i, boolean z, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, float f) {
            this.f4576a = i;
            this.f4577b = z;
            this.f4578c = i2;
            this.f4579d = i3;
            this.f4580e = iArr;
            this.f4581f = i4;
            this.f4582g = i5;
            this.f4583h = i6;
            this.f4584i = i7;
            this.f4585j = f;
        }
    }

    public static final class C1239b {
        public final int f4586a;
        public final int f4587b;
        public final boolean f4588c;

        public C1239b(int i, int i2, boolean z) {
            this.f4586a = i;
            this.f4587b = i2;
            this.f4588c = z;
        }
    }

    public static final class C1240c {
        public final int f4589a;
        public final int f4590b;
        public final int f4591c;
        public final int f4592d;
        public final int f4593e;
        public final int f4594f;
        public final float f4595g;
        public final boolean f4596h;
        public final boolean f4597i;
        public final int f4598j;
        public final int f4599k;
        public final int f4600l;
        public final boolean f4601m;

        public C1240c(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f4589a = i;
            this.f4590b = i2;
            this.f4591c = i3;
            this.f4592d = i4;
            this.f4593e = i5;
            this.f4594f = i6;
            this.f4595g = f;
            this.f4596h = z;
            this.f4597i = z2;
            this.f4598j = i7;
            this.f4599k = i8;
            this.f4600l = i9;
            this.f4601m = z3;
        }
    }

    public static void m37855a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void m37854b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int m37853c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        C1186a.m38184f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m37855a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m37855a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                if ((bArr[i5] & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                        m37855a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i2;
        } else {
            m37855a(zArr);
            return i - 1;
        }
    }

    public static int m37852d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int m37851e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int m37850f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean m37849g(String str, byte b) {
        if (!"video/avc".equals(str) || (b & 31) != 6) {
            return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
        }
        return true;
    }

    public static C1238a m37848h(byte[] bArr, int i, int i2) {
        return m37847i(bArr, i + 2, i2);
    }

    public static C1238a m37847i(byte[] bArr, int i, int i2) {
        C1191c0 c0Var = new C1191c0(bArr, i, i2);
        c0Var.m38099l(4);
        int e = c0Var.m38106e(3);
        c0Var.m38100k();
        int e2 = c0Var.m38106e(2);
        boolean d = c0Var.m38107d();
        int e3 = c0Var.m38106e(5);
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            if (c0Var.m38107d()) {
                i3 |= 1 << i4;
            }
        }
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = c0Var.m38106e(8);
        }
        int e4 = c0Var.m38106e(8);
        int i6 = 0;
        for (int i7 = 0; i7 < e; i7++) {
            if (c0Var.m38107d()) {
                i6 += 89;
            }
            if (c0Var.m38107d()) {
                i6 += 8;
            }
        }
        c0Var.m38099l(i6);
        if (e > 0) {
            c0Var.m38099l((8 - e) * 2);
        }
        int h = c0Var.m38103h();
        int h2 = c0Var.m38103h();
        if (h2 == 3) {
            c0Var.m38100k();
        }
        int h3 = c0Var.m38103h();
        int h4 = c0Var.m38103h();
        if (c0Var.m38107d()) {
            int h5 = c0Var.m38103h();
            int h6 = c0Var.m38103h();
            int h7 = c0Var.m38103h();
            int h8 = c0Var.m38103h();
            h3 -= ((h2 == 1 || h2 == 2) ? 2 : 1) * (h5 + h6);
            h4 -= (h2 == 1 ? 2 : 1) * (h7 + h8);
        }
        c0Var.m38103h();
        c0Var.m38103h();
        int h9 = c0Var.m38103h();
        for (int i8 = c0Var.m38107d() ? 0 : e; i8 <= e; i8++) {
            c0Var.m38103h();
            c0Var.m38103h();
            c0Var.m38103h();
        }
        c0Var.m38103h();
        c0Var.m38103h();
        c0Var.m38103h();
        c0Var.m38103h();
        c0Var.m38103h();
        c0Var.m38103h();
        if (c0Var.m38107d() && c0Var.m38107d()) {
            m37842n(c0Var);
        }
        c0Var.m38099l(2);
        if (c0Var.m38107d()) {
            c0Var.m38099l(8);
            c0Var.m38103h();
            c0Var.m38103h();
            c0Var.m38100k();
        }
        m37840p(c0Var);
        if (c0Var.m38107d()) {
            for (int i9 = 0; i9 < c0Var.m38103h(); i9++) {
                c0Var.m38099l(h9 + 4 + 1);
            }
        }
        c0Var.m38099l(2);
        float f = 1.0f;
        if (c0Var.m38107d()) {
            if (c0Var.m38107d()) {
                int e5 = c0Var.m38106e(8);
                if (e5 == 255) {
                    int e6 = c0Var.m38106e(16);
                    int e7 = c0Var.m38106e(16);
                    if (!(e6 == 0 || e7 == 0)) {
                        f = e6 / e7;
                    }
                } else {
                    float[] fArr = f4573b;
                    if (e5 < fArr.length) {
                        f = fArr[e5];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(e5);
                        C1230s.m37881i("NalUnitUtil", sb2.toString());
                    }
                }
            }
            if (c0Var.m38107d()) {
                c0Var.m38100k();
            }
            if (c0Var.m38107d()) {
                c0Var.m38099l(4);
                if (c0Var.m38107d()) {
                    c0Var.m38099l(24);
                }
            }
            if (c0Var.m38107d()) {
                c0Var.m38103h();
                c0Var.m38103h();
            }
            c0Var.m38100k();
            if (c0Var.m38107d()) {
                h4 *= 2;
            }
        }
        return new C1238a(e2, d, e3, i3, iArr, e4, h, h3, h4, f);
    }

    public static C1239b m37846j(byte[] bArr, int i, int i2) {
        return m37845k(bArr, i + 1, i2);
    }

    public static C1239b m37845k(byte[] bArr, int i, int i2) {
        C1191c0 c0Var = new C1191c0(bArr, i, i2);
        int h = c0Var.m38103h();
        int h2 = c0Var.m38103h();
        c0Var.m38100k();
        return new C1239b(h, h2, c0Var.m38107d());
    }

    public static C1240c m37844l(byte[] bArr, int i, int i2) {
        return m37843m(bArr, i + 1, i2);
    }

    public static p020b5.C1237x.C1240c m37843m(byte[] r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: p020b5.C1237x.m37843m(byte[], int, int):b5.x$c");
    }

    public static void m37842n(C1191c0 c0Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!c0Var.m38107d()) {
                    c0Var.m38103h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c0Var.m38104g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        c0Var.m38104g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void m37841o(C1191c0 c0Var, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((c0Var.m38104g() + i3) + Log.TAG_CRASH) % Log.TAG_CRASH;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    public static void m37840p(C1191c0 c0Var) {
        int h = c0Var.m38103h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = c0Var.m38107d();
            }
            if (z) {
                c0Var.m38100k();
                c0Var.m38103h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (c0Var.m38107d()) {
                        c0Var.m38100k();
                    }
                }
            } else {
                int h2 = c0Var.m38103h();
                int h3 = c0Var.m38103h();
                i = h2 + h3;
                for (int i4 = 0; i4 < h2; i4++) {
                    c0Var.m38103h();
                    c0Var.m38100k();
                }
                for (int i5 = 0; i5 < h3; i5++) {
                    c0Var.m38103h();
                    c0Var.m38100k();
                }
            }
        }
    }

    public static int m37839q(byte[] bArr, int i) {
        int i2;
        synchronized (f4574c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m37852d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = f4575d;
                        if (iArr.length <= i4) {
                            f4575d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        i4++;
                        f4575d[i4] = i3;
                        i3 += 3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f4575d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
