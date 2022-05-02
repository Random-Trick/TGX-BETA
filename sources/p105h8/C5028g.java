package p105h8;

import p093g8.AbstractC4519b;
import p093g8.AbstractC4524g;
import p093g8.C4525h;

public class C5028g extends AbstractC4519b {
    public static final byte[] f16984d = new byte[0];
    public byte[] f16985b = f16984d;
    public final int[] f16986c = new int[32];

    public C5028g(AbstractC4524g gVar) {
        super(gVar);
    }

    public static int m24259c(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            i5 = i3;
            i3 = i5;
        }
        if (i3 - i5 > length / 16) {
            int i10 = i3 - 1;
            int i11 = i10;
            int i12 = -1;
            while (i10 > i5) {
                int i13 = i10 - i5;
                int i14 = i13 * i13 * (i3 - i10) * (i2 - iArr[i10]);
                if (i14 > i12) {
                    i11 = i10;
                    i12 = i14;
                }
                i10--;
            }
            return i11 << 3;
        }
        throw C4525h.m27496a();
    }

    @Override
    public C5022a mo24254a() {
        AbstractC4524g b = m27502b();
        int d = b.m27497d();
        int a = b.m27498a();
        C5022a aVar = new C5022a(d, a);
        m24258d(d);
        int[] iArr = this.f16986c;
        for (int i = 1; i < 5; i++) {
            byte[] c = b.mo27494c((a * i) / 5, this.f16985b);
            int i2 = (d << 2) / 5;
            for (int i3 = d / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int c2 = m24259c(iArr);
        byte[] b2 = b.mo27495b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d;
            for (int i7 = 0; i7 < d; i7++) {
                if ((b2[i6 + i7] & 255) < c2) {
                    aVar.m24276i(i7, i5);
                }
            }
        }
        return aVar;
    }

    public final void m24258d(int i) {
        if (this.f16985b.length < i) {
            this.f16985b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f16986c[i2] = 0;
        }
    }
}
