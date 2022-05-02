package p025bc;

import org.thunderdog.challegram.Log;
import p095gc.C4552h;
import p290ub.C9489b;
import qa.C8298k;
import za.C11451n;

public final class C1314e {
    public static final String[] f4756d;
    public static final C1314e f4757e = new C1314e();
    public static final C4552h f4753a = C4552h.f14973N.m27399c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] f4754b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] f4755c = new String[64];

    static {
        String[] strArr = new String[Log.TAG_CRASH];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C8298k.m12935d(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = C11451n.m626s(C9489b.m8507q("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f4756d = strArr;
        String[] strArr2 = f4755c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f4755c;
            strArr3[i3 | 8] = C8298k.m12929j(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f4755c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f4755c;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = f4755c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f4755c;
            if (strArr6[i9] == null) {
                strArr6[i9] = f4756d[i9];
            }
        }
    }

    public final String m37747a(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : f4756d[i2];
            }
            if (!(i == 7 || i == 8)) {
                String[] strArr = f4755c;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    C8298k.m12936c(str);
                } else {
                    str = f4756d[i2];
                }
                String str2 = str;
                if (i != 5 || (i2 & 4) == 0) {
                    return (i != 0 || (i2 & 32) == 0) ? str2 : C11451n.m625t(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return C11451n.m625t(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f4756d[i2];
    }

    public final String m37746b(int i) {
        String[] strArr = f4754b;
        return i < strArr.length ? strArr[i] : C9489b.m8507q("0x%02x", Integer.valueOf(i));
    }

    public final String m37745c(boolean z, int i, int i2, int i3, int i4) {
        return C9489b.m8507q("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m37746b(i3), m37747a(i3, i4));
    }
}
