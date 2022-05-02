package p105h8;

import java.lang.reflect.Array;
import p093g8.AbstractC4524g;

public final class C5030i extends C5028g {
    public C5022a f16988e;

    public C5030i(AbstractC4524g gVar) {
        super(gVar);
    }

    public static int[][] m24253e(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 8;
        int i6 = i4 - 8;
        int i7 = i3 - 8;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i2, i);
        int i8 = 0;
        while (i8 < i2) {
            int i9 = i8 << 3;
            if (i9 > i6) {
                i9 = i6;
            }
            int i10 = 0;
            while (i10 < i) {
                int i11 = i10 << 3;
                if (i11 > i7) {
                    i11 = i7;
                }
                int i12 = (i9 * i3) + i11;
                int i13 = 255;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i14 < i5) {
                    int i17 = i16;
                    int i18 = 0;
                    while (i18 < i5) {
                        int i19 = bArr[i12 + i18] & 255;
                        i15 += i19;
                        if (i19 < i13) {
                            i13 = i19;
                        }
                        if (i19 > i17) {
                            i17 = i19;
                        }
                        i18++;
                        i5 = 8;
                    }
                    if (i17 - i13 <= 24) {
                        i14++;
                        i12 += i3;
                        i16 = i17;
                        i5 = 8;
                    }
                    while (true) {
                        i14++;
                        i12 += i3;
                        if (i14 < 8) {
                            int i20 = 0;
                            for (int i21 = 8; i20 < i21; i21 = 8) {
                                i15 += bArr[i12 + i20] & 255;
                                i20++;
                            }
                        }
                    }
                    i14++;
                    i12 += i3;
                    i16 = i17;
                    i5 = 8;
                }
                int i22 = i15 >> 6;
                if (i16 - i13 <= 24) {
                    i22 = i13 / 2;
                    if (i8 > 0 && i10 > 0) {
                        int i23 = i8 - 1;
                        int i24 = i10 - 1;
                        int i25 = ((iArr[i23][i10] + (iArr[i8][i24] * 2)) + iArr[i23][i24]) / 4;
                        if (i13 < i25) {
                            i22 = i25;
                        }
                        iArr[i8][i10] = i22;
                        i10++;
                        i5 = 8;
                    }
                }
                iArr[i8][i10] = i22;
                i10++;
                i5 = 8;
            }
            i8++;
            i5 = 8;
        }
        return iArr;
    }

    public static void m24252f(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C5022a aVar) {
        int i5 = i4 - 8;
        int i6 = i3 - 8;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 << 3;
            int i9 = i8 > i5 ? i5 : i8;
            int g = m24251g(i7, i2 - 3);
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 << 3;
                int i12 = i11 > i6 ? i6 : i11;
                int g2 = m24251g(i10, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[g + i14];
                    i13 += iArr2[g2 - 2] + iArr2[g2 - 1] + iArr2[g2] + iArr2[g2 + 1] + iArr2[2 + g2];
                }
                m24250h(bArr, i12, i9, i13 / 25, i3, aVar);
            }
        }
    }

    public static int m24251g(int i, int i2) {
        if (i < 2) {
            return 2;
        }
        return Math.min(i, i2);
    }

    public static void m24250h(byte[] bArr, int i, int i2, int i3, int i4, C5022a aVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    aVar.m24276i(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override
    public C5022a mo24254a() {
        C5022a aVar = this.f16988e;
        if (aVar != null) {
            return aVar;
        }
        AbstractC4524g b = m27502b();
        int d = b.m27497d();
        int a = b.m27498a();
        if (d < 40 || a < 40) {
            this.f16988e = super.mo24254a();
        } else {
            byte[] b2 = b.mo27495b();
            int i = d >> 3;
            if ((d & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] e = m24253e(b2, i2, i4, d, a);
            C5022a aVar2 = new C5022a(d, a);
            m24252f(b2, i2, i4, d, a, e, aVar2);
            this.f16988e = aVar2;
        }
        return this.f16988e;
    }
}
