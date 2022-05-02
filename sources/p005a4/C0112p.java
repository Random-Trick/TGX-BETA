package p005a4;

import p020b5.C1186a;
import p020b5.C1230s;
import p270t3.AbstractC8974t;

public final class C0112p {
    public final boolean f428a;
    public final String f429b;
    public final AbstractC8974t.C8975a f430c;
    public final int f431d;
    public final byte[] f432e;

    public C0112p(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        C1186a.m38189a((bArr2 != null ? false : z2) ^ (i == 0));
        this.f428a = z;
        this.f429b = str;
        this.f431d = i;
        this.f432e = bArr2;
        this.f430c = new AbstractC8974t.C8975a(m42266a(str), bArr, i2, i3);
    }

    public static int m42266a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                StringBuilder sb2 = new StringBuilder(str.length() + 68);
                sb2.append("Unsupported protection scheme type '");
                sb2.append(str);
                sb2.append("'. Assuming AES-CTR crypto mode.");
                C1230s.m37881i("TrackEncryptionBox", sb2.toString());
                break;
        }
        return 1;
    }
}
