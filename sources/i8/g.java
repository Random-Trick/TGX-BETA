package i8;

import h8.b;
import h8.h;

public class g extends b {
    public static final byte[] f14080d = new byte[0];
    public byte[] f14081b = f14080d;
    public final int[] f14082c = new int[32];

    public g(h8.g gVar) {
        super(gVar);
    }

    public static int c(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (iArr[i13] > i10) {
                i10 = iArr[i13];
                i12 = i13;
            }
            if (iArr[i13] > i11) {
                i11 = iArr[i13];
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i12;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i12 <= i14) {
            i14 = i12;
            i12 = i14;
        }
        if (i12 - i14 > length / 16) {
            int i19 = i12 - 1;
            int i20 = i19;
            int i21 = -1;
            while (i19 > i14) {
                int i22 = i19 - i14;
                int i23 = i22 * i22 * (i12 - i19) * (i11 - iArr[i19]);
                if (i23 > i21) {
                    i20 = i19;
                    i21 = i23;
                }
                i19--;
            }
            return i20 << 3;
        }
        throw h.a();
    }

    @Override
    public a a() {
        h8.g b10 = b();
        int d10 = b10.d();
        int a10 = b10.a();
        a aVar = new a(d10, a10);
        d(d10);
        int[] iArr = this.f14082c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] c10 = b10.c((a10 * i10) / 5, this.f14081b);
            int i11 = (d10 << 2) / 5;
            for (int i12 = d10 / 5; i12 < i11; i12++) {
                int i13 = (c10[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int c11 = c(iArr);
        byte[] b11 = b10.b();
        for (int i14 = 0; i14 < a10; i14++) {
            int i15 = i14 * d10;
            for (int i16 = 0; i16 < d10; i16++) {
                if ((b11[i15 + i16] & 255) < c11) {
                    aVar.i(i16, i14);
                }
            }
        }
        return aVar;
    }

    public final void d(int i10) {
        if (this.f14081b.length < i10) {
            this.f14081b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f14082c[i11] = 0;
        }
    }
}
