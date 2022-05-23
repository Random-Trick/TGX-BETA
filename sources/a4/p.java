package a4;

import c5.a;
import c5.s;
import t3.t;

public final class p {
    public final boolean f369a;
    public final String f370b;
    public final t.a f371c;
    public final int f372d;
    public final byte[] f373e;

    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11 = true;
        a.a((bArr2 != null ? false : z11) ^ (i10 == 0));
        this.f369a = z10;
        this.f370b = str;
        this.f372d = i10;
        this.f373e = bArr2;
        this.f371c = new t.a(a(str), bArr, i11, i12);
    }

    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
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
                s.i("TrackEncryptionBox", sb2.toString());
                break;
        }
        return 1;
    }
}
