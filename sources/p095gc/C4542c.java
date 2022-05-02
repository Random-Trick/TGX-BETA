package p095gc;

import p109hc.C5073b;
import qa.C8298k;

public final class C4542c {
    public static final boolean m27476a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C8298k.m12934e(bArr, "a");
        C8298k.m12934e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void m27475b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final int m27474c(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final short m27473d(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public static final String m27472e(byte b) {
        return new String(new char[]{C5073b.m24035f()[(b >> 4) & 15], C5073b.m24035f()[b & 15]});
    }

    public static final String m27471f(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C5073b.m24035f()[(i >> 28) & 15], C5073b.m24035f()[(i >> 24) & 15], C5073b.m24035f()[(i >> 20) & 15], C5073b.m24035f()[(i >> 16) & 15], C5073b.m24035f()[(i >> 12) & 15], C5073b.m24035f()[(i >> 8) & 15], C5073b.m24035f()[(i >> 4) & 15], C5073b.m24035f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }
}
