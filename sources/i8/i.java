package i8;

import h8.g;
import java.lang.reflect.Array;

public final class i extends g {
    public a f14084e;

    public i(g gVar) {
        super(gVar);
    }

    public static int[][] e(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = 8;
        int i15 = i13 - 8;
        int i16 = i12 - 8;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i11, i10);
        int i17 = 0;
        while (i17 < i11) {
            int i18 = i17 << 3;
            if (i18 > i15) {
                i18 = i15;
            }
            int i19 = 0;
            while (i19 < i10) {
                int i20 = i19 << 3;
                if (i20 > i16) {
                    i20 = i16;
                }
                int i21 = (i18 * i12) + i20;
                int i22 = 255;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < i14) {
                    int i26 = i25;
                    int i27 = 0;
                    while (i27 < i14) {
                        int i28 = bArr[i21 + i27] & 255;
                        i24 += i28;
                        if (i28 < i22) {
                            i22 = i28;
                        }
                        if (i28 > i26) {
                            i26 = i28;
                        }
                        i27++;
                        i14 = 8;
                    }
                    if (i26 - i22 <= 24) {
                        i23++;
                        i21 += i12;
                        i25 = i26;
                        i14 = 8;
                    }
                    while (true) {
                        i23++;
                        i21 += i12;
                        if (i23 < 8) {
                            int i29 = 0;
                            for (int i30 = 8; i29 < i30; i30 = 8) {
                                i24 += bArr[i21 + i29] & 255;
                                i29++;
                            }
                        }
                    }
                    i23++;
                    i21 += i12;
                    i25 = i26;
                    i14 = 8;
                }
                int i31 = i24 >> 6;
                if (i25 - i22 <= 24) {
                    i31 = i22 / 2;
                    if (i17 > 0 && i19 > 0) {
                        int i32 = i17 - 1;
                        int i33 = i19 - 1;
                        int i34 = ((iArr[i32][i19] + (iArr[i17][i33] * 2)) + iArr[i32][i33]) / 4;
                        if (i22 < i34) {
                            i31 = i34;
                        }
                        iArr[i17][i19] = i31;
                        i19++;
                        i14 = 8;
                    }
                }
                iArr[i17][i19] = i31;
                i19++;
                i14 = 8;
            }
            i17++;
            i14 = 8;
        }
        return iArr;
    }

    public static void f(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, a aVar) {
        int i14 = i13 - 8;
        int i15 = i12 - 8;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 << 3;
            int i18 = i17 > i14 ? i14 : i17;
            int g10 = g(i16, i11 - 3);
            for (int i19 = 0; i19 < i10; i19++) {
                int i20 = i19 << 3;
                int i21 = i20 > i15 ? i15 : i20;
                int g11 = g(i19, i10 - 3);
                int i22 = 0;
                for (int i23 = -2; i23 <= 2; i23++) {
                    int[] iArr2 = iArr[g10 + i23];
                    i22 += iArr2[g11 - 2] + iArr2[g11 - 1] + iArr2[g11] + iArr2[g11 + 1] + iArr2[2 + g11];
                }
                h(bArr, i21, i18, i22 / 25, i12, aVar);
            }
        }
    }

    public static int g(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    public static void h(byte[] bArr, int i10, int i11, int i12, int i13, a aVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    aVar.i(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override
    public a a() {
        a aVar = this.f14084e;
        if (aVar != null) {
            return aVar;
        }
        g b10 = b();
        int d10 = b10.d();
        int a10 = b10.a();
        if (d10 < 40 || a10 < 40) {
            this.f14084e = super.a();
        } else {
            byte[] b11 = b10.b();
            int i10 = d10 >> 3;
            if ((d10 & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = a10 >> 3;
            if ((a10 & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] e10 = e(b11, i11, i13, d10, a10);
            a aVar2 = new a(d10, a10);
            f(b11, i11, i13, d10, a10, e10, aVar2);
            this.f14084e = aVar2;
        }
        return this.f14084e;
    }
}
