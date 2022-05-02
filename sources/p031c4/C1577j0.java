package p031c4;

import p020b5.C1189b0;

public final class C1577j0 {
    public static int m36399a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static boolean m36398b(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long m36397c(C1189b0 b0Var, int i, int i2) {
        b0Var.m38147P(i);
        if (b0Var.m38145a() < 5) {
            return -9223372036854775807L;
        }
        int n = b0Var.m38132n();
        if ((8388608 & n) != 0 || ((2096896 & n) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((n & 32) != 0) && b0Var.m38159D() >= 7 && b0Var.m38145a() >= 7) {
            if ((b0Var.m38159D() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                b0Var.m38136j(bArr, 0, 6);
                return m36396d(bArr);
            }
        }
        return -9223372036854775807L;
    }

    public static long m36396d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
