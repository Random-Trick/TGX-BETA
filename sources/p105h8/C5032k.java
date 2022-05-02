package p105h8;

import java.nio.charset.Charset;
import java.util.Map;
import org.thunderdog.challegram.Log;
import p093g8.EnumC4522e;

public final class C5032k {
    public static final String f16998a;
    public static final boolean f16999b;

    static {
        String name = Charset.defaultCharset().name();
        f16998a = name;
        f16999b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name);
    }

    public static String m24243a(byte[] bArr, Map<EnumC4522e, ?> map) {
        byte[] bArr2 = bArr;
        if (map != null) {
            EnumC4522e eVar = EnumC4522e.CHARACTER_SET;
            if (map.containsKey(eVar)) {
                return map.get(eVar).toString();
            }
        }
        int length = bArr2.length;
        boolean z = true;
        int i = 0;
        boolean z2 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z || z3 || z4)) {
            int i13 = bArr2[i3] & 255;
            if (z4) {
                if (i4 > 0) {
                    if ((i13 & Log.TAG_YOUTUBE) != 0) {
                        i4--;
                    }
                    z4 = false;
                } else if ((i13 & Log.TAG_YOUTUBE) != 0) {
                    if ((i13 & 64) != 0) {
                        i4++;
                        if ((i13 & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((i13 & 16) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((i13 & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                    z4 = false;
                }
            }
            if (z) {
                if (i13 > 127 && i13 < 160) {
                    z = false;
                } else if (i13 > 159 && (i13 < 192 || i13 == 215 || i13 == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (i13 >= 64 && i13 != 127 && i13 <= 252) {
                        i5--;
                    }
                    z3 = false;
                } else {
                    if (!(i13 == 128 || i13 == 160 || i13 > 239)) {
                        if (i13 <= 160 || i13 >= 224) {
                            if (i13 > 127) {
                                i5++;
                                int i14 = i11 + 1;
                                if (i14 > i) {
                                    i = i14;
                                    i11 = i;
                                } else {
                                    i11 = i14;
                                }
                            } else {
                                i11 = 0;
                            }
                            i12 = 0;
                        } else {
                            i2++;
                            int i15 = i12 + 1;
                            if (i15 > i9) {
                                i9 = i15;
                                i12 = i9;
                            } else {
                                i12 = i15;
                            }
                            i11 = 0;
                        }
                    }
                    z3 = false;
                }
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        return (!z4 || (!z2 && (i6 + i7) + i8 <= 0)) ? (!z3 || (!f16999b && i9 < 3 && i < 3)) ? (!z || !z3) ? z ? "ISO8859_1" : z3 ? "SJIS" : z4 ? "UTF8" : f16998a : (!(i9 == 2 && i2 == 2) && i10 * 10 < length) ? "ISO8859_1" : "SJIS" : "SJIS" : "UTF8";
    }
}
