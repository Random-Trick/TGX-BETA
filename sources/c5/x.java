package c5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class x {
    public static final byte[] f4901a = {0, 0, 0, 1};
    public static final float[] f4902b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f4903c = new Object();
    public static int[] f4904d = new int[10];

    public static final class a {
        public final int f4905a;
        public final boolean f4906b;
        public final int f4907c;
        public final int f4908d;
        public final int[] f4909e;
        public final int f4910f;
        public final int f4911g;
        public final int f4912h;
        public final int f4913i;
        public final float f4914j;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10) {
            this.f4905a = i10;
            this.f4906b = z10;
            this.f4907c = i11;
            this.f4908d = i12;
            this.f4909e = iArr;
            this.f4910f = i13;
            this.f4911g = i14;
            this.f4912h = i15;
            this.f4913i = i16;
            this.f4914j = f10;
        }
    }

    public static final class b {
        public final int f4915a;
        public final int f4916b;
        public final boolean f4917c;

        public b(int i10, int i11, boolean z10) {
            this.f4915a = i10;
            this.f4916b = i11;
            this.f4917c = z10;
        }
    }

    public static final class c {
        public final int f4918a;
        public final int f4919b;
        public final int f4920c;
        public final int f4921d;
        public final int f4922e;
        public final int f4923f;
        public final float f4924g;
        public final boolean f4925h;
        public final boolean f4926i;
        public final int f4927j;
        public final int f4928k;
        public final int f4929l;
        public final boolean f4930m;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f4918a = i10;
            this.f4919b = i11;
            this.f4920c = i12;
            this.f4921d = i13;
            this.f4922e = i14;
            this.f4923f = i15;
            this.f4924g = f10;
            this.f4925h = z10;
            this.f4926i = z11;
            this.f4927j = i16;
            this.f4928k = i17;
            this.f4929l = i18;
            this.f4930m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                int i13 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i13 == 0) {
                    i11++;
                }
                if (i13 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        boolean z10 = false;
        c5.a.f(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 <= 2 || !zArr[2] || bArr[i10] != 0 || bArr[i10 + 1] != 1) {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                if ((bArr[i14] & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            zArr[0] = i12 <= 2 ? !(i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
            zArr[1] = i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
            if (bArr[i13] == 0) {
                z10 = true;
            }
            zArr[2] = z10;
            return i11;
        } else {
            a(zArr);
            return i10 - 1;
        }
    }

    public static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        if (!"video/avc".equals(str) || (b10 & 31) != 6) {
            return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
        }
        return true;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        c0 c0Var = new c0(bArr, i10, i11);
        c0Var.l(4);
        int e10 = c0Var.e(3);
        c0Var.k();
        int e11 = c0Var.e(2);
        boolean d10 = c0Var.d();
        int e12 = c0Var.e(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (c0Var.d()) {
                i12 |= 1 << i13;
            }
        }
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = c0Var.e(8);
        }
        int e13 = c0Var.e(8);
        int i15 = 0;
        for (int i16 = 0; i16 < e10; i16++) {
            if (c0Var.d()) {
                i15 += 89;
            }
            if (c0Var.d()) {
                i15 += 8;
            }
        }
        c0Var.l(i15);
        if (e10 > 0) {
            c0Var.l((8 - e10) * 2);
        }
        int h10 = c0Var.h();
        int h11 = c0Var.h();
        if (h11 == 3) {
            c0Var.k();
        }
        int h12 = c0Var.h();
        int h13 = c0Var.h();
        if (c0Var.d()) {
            int h14 = c0Var.h();
            int h15 = c0Var.h();
            int h16 = c0Var.h();
            int h17 = c0Var.h();
            h12 -= ((h11 == 1 || h11 == 2) ? 2 : 1) * (h14 + h15);
            h13 -= (h11 == 1 ? 2 : 1) * (h16 + h17);
        }
        c0Var.h();
        c0Var.h();
        int h18 = c0Var.h();
        for (int i17 = c0Var.d() ? 0 : e10; i17 <= e10; i17++) {
            c0Var.h();
            c0Var.h();
            c0Var.h();
        }
        c0Var.h();
        c0Var.h();
        c0Var.h();
        c0Var.h();
        c0Var.h();
        c0Var.h();
        if (c0Var.d() && c0Var.d()) {
            n(c0Var);
        }
        c0Var.l(2);
        if (c0Var.d()) {
            c0Var.l(8);
            c0Var.h();
            c0Var.h();
            c0Var.k();
        }
        p(c0Var);
        if (c0Var.d()) {
            for (int i18 = 0; i18 < c0Var.h(); i18++) {
                c0Var.l(h18 + 4 + 1);
            }
        }
        c0Var.l(2);
        float f10 = 1.0f;
        if (c0Var.d()) {
            if (c0Var.d()) {
                int e14 = c0Var.e(8);
                if (e14 == 255) {
                    int e15 = c0Var.e(16);
                    int e16 = c0Var.e(16);
                    if (!(e15 == 0 || e16 == 0)) {
                        f10 = e15 / e16;
                    }
                } else {
                    float[] fArr = f4902b;
                    if (e14 < fArr.length) {
                        f10 = fArr[e14];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(e14);
                        s.i("NalUnitUtil", sb2.toString());
                    }
                }
            }
            if (c0Var.d()) {
                c0Var.k();
            }
            if (c0Var.d()) {
                c0Var.l(4);
                if (c0Var.d()) {
                    c0Var.l(24);
                }
            }
            if (c0Var.d()) {
                c0Var.h();
                c0Var.h();
            }
            c0Var.k();
            if (c0Var.d()) {
                h13 *= 2;
            }
        }
        return new a(e11, d10, e12, i12, iArr, e13, h10, h12, h13, f10);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        c0 c0Var = new c0(bArr, i10, i11);
        int h10 = c0Var.h();
        int h11 = c0Var.h();
        c0Var.k();
        return new b(h10, h11, c0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    public static c5.x.c m(byte[] r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: c5.x.m(byte[], int, int):c5.x$c");
    }

    public static void n(c0 c0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!c0Var.d()) {
                    c0Var.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        c0Var.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void o(c0 c0Var, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((c0Var.g() + i12) + Log.TAG_CRASH) % Log.TAG_CRASH;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    public static void p(c0 c0Var) {
        int h10 = c0Var.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = c0Var.d();
            }
            if (z10) {
                c0Var.k();
                c0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (!c0Var.d()) {
                        c0Var.k();
                    }
                }
            } else {
                int h11 = c0Var.h();
                int h12 = c0Var.h();
                i10 = h11 + h12;
                for (int i13 = 0; i13 < h11; i13++) {
                    c0Var.h();
                    c0Var.k();
                }
                for (int i14 = 0; i14 < h12; i14++) {
                    c0Var.h();
                    c0Var.k();
                }
            }
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f4903c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f4904d;
                        if (iArr.length <= i13) {
                            f4904d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        i13++;
                        f4904d[i13] = i12;
                        i12 += 3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f4904d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
