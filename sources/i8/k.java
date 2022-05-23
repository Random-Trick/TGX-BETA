package i8;

import h8.e;
import java.nio.charset.Charset;
import java.util.Map;
import org.thunderdog.challegram.Log;

public final class k {
    public static final String f14094a;
    public static final boolean f14095b;

    static {
        String name = Charset.defaultCharset().name();
        f14094a = name;
        f14095b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name);
    }

    public static String a(byte[] bArr, Map<e, ?> map) {
        byte[] bArr2 = bArr;
        if (map != null) {
            e eVar = e.CHARACTER_SET;
            if (map.containsKey(eVar)) {
                return map.get(eVar).toString();
            }
        }
        int length = bArr2.length;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i11 = 0;
        boolean z12 = true;
        boolean z13 = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i12 < length && (z10 || z12 || z13)) {
            int i22 = bArr2[i12] & 255;
            if (z13) {
                if (i13 > 0) {
                    if ((i22 & Log.TAG_YOUTUBE) != 0) {
                        i13--;
                    }
                    z13 = false;
                } else if ((i22 & Log.TAG_YOUTUBE) != 0) {
                    if ((i22 & 64) != 0) {
                        i13++;
                        if ((i22 & 32) == 0) {
                            i15++;
                        } else {
                            i13++;
                            if ((i22 & 16) == 0) {
                                i16++;
                            } else {
                                i13++;
                                if ((i22 & 8) == 0) {
                                    i17++;
                                }
                            }
                        }
                    }
                    z13 = false;
                }
            }
            if (z10) {
                if (i22 > 127 && i22 < 160) {
                    z10 = false;
                } else if (i22 > 159 && (i22 < 192 || i22 == 215 || i22 == 247)) {
                    i19++;
                }
            }
            if (z12) {
                if (i14 > 0) {
                    if (i22 >= 64 && i22 != 127 && i22 <= 252) {
                        i14--;
                    }
                    z12 = false;
                } else {
                    if (!(i22 == 128 || i22 == 160 || i22 > 239)) {
                        if (i22 <= 160 || i22 >= 224) {
                            if (i22 > 127) {
                                i14++;
                                int i23 = i20 + 1;
                                if (i23 > i10) {
                                    i10 = i23;
                                    i20 = i10;
                                } else {
                                    i20 = i23;
                                }
                            } else {
                                i20 = 0;
                            }
                            i21 = 0;
                        } else {
                            i11++;
                            int i24 = i21 + 1;
                            if (i24 > i18) {
                                i18 = i24;
                                i21 = i18;
                            } else {
                                i21 = i24;
                            }
                            i20 = 0;
                        }
                    }
                    z12 = false;
                }
            }
            i12++;
            bArr2 = bArr;
        }
        if (z13 && i13 > 0) {
            z13 = false;
        }
        if (z12 && i14 > 0) {
            z12 = false;
        }
        return (!z13 || (!z11 && (i15 + i16) + i17 <= 0)) ? (!z12 || (!f14095b && i18 < 3 && i10 < 3)) ? (!z10 || !z12) ? z10 ? "ISO8859_1" : z12 ? "SJIS" : z13 ? "UTF8" : f14094a : (!(i18 == 2 && i11 == 2) && i19 * 10 < length) ? "ISO8859_1" : "SJIS" : "SJIS" : "UTF8";
    }
}
