package cc;

import ab.n;
import hc.h;
import org.thunderdog.challegram.Log;
import ra.k;
import vb.b;

public final class e {
    public static final String[] f5065d;
    public static final e f5066e = new e();
    public static final h f5062a = h.N.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] f5063b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] f5064c = new String[64];

    static {
        String[] strArr = new String[Log.TAG_CRASH];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            k.d(binaryString, "Integer.toBinaryString(it)");
            strArr[i10] = n.s(b.q("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f5065d = strArr;
        String[] strArr2 = f5064c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = f5064c;
            strArr3[i12 | 8] = k.j(strArr3[i12], "|PADDED");
        }
        String[] strArr4 = f5064c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = f5064c;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + "|" + strArr5[i14];
                strArr5[i17 | 8] = strArr5[i16] + "|" + strArr5[i14] + "|PADDED";
            }
        }
        int length = f5064c.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = f5064c;
            if (strArr6[i18] == null) {
                strArr6[i18] = f5065d[i18];
            }
        }
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (!(i10 == 2 || i10 == 3)) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f5065d[i11];
            }
            if (!(i10 == 7 || i10 == 8)) {
                String[] strArr = f5064c;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    k.c(str);
                } else {
                    str = f5065d[i11];
                }
                String str2 = str;
                if (i10 != 5 || (i11 & 4) == 0) {
                    return (i10 != 0 || (i11 & 32) == 0) ? str2 : n.t(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return n.t(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f5065d[i11];
    }

    public final String b(int i10) {
        String[] strArr = f5063b;
        return i10 < strArr.length ? strArr[i10] : b.q("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return b.q("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
