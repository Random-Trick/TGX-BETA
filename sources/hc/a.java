package hc;

import hc.h;
import ra.k;

public final class a {
    public static final byte[] f12626a;
    public static final byte[] f12627b;

    static {
        h.a aVar = h.N;
        f12626a = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").e();
        f12627b = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").e();
    }

    public static final String a(byte[] bArr, byte[] bArr2) {
        k.e(bArr, "$this$encodeBase64");
        k.e(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            i10 = i13 + 1;
            byte b12 = bArr[i13];
            int i14 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i15 = i14 + 1;
            bArr3[i14] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i16 + 1;
            bArr3[i16] = bArr2[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i17 = i11 + 1;
            bArr3[i11] = bArr2[(b13 & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr3[i18] = b14;
            bArr3[i18 + 1] = b14;
        } else if (length2 == 2) {
            int i19 = i10 + 1;
            byte b15 = bArr[i10];
            byte b16 = bArr[i19];
            int i20 = i11 + 1;
            bArr3[i11] = bArr2[(b15 & 255) >> 2];
            int i21 = i20 + 1;
            bArr3[i20] = bArr2[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr3[i21] = bArr2[(b16 & 15) << 2];
            bArr3[i21 + 1] = (byte) 61;
        }
        return b.b(bArr3);
    }

    public static String b(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f12626a;
        }
        return a(bArr, bArr2);
    }
}
