package vb;

import ab.n;
import ab.o;
import hc.e;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import ra.k;

public final class a {
    public static final boolean a(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (k.f(charAt, 31) <= 0 || k.f(charAt, 127) >= 0 || o.M(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (k.f(charAt, 48) < 0 || k.f(charAt, 57) > 0) {
                    break;
                } else if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i14++;
                }
            }
            if (i14 - i10 == 0) {
                return false;
            }
            i13++;
            bArr[i13] = (byte) i15;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    public static final java.net.InetAddress c(java.lang.String r18, int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: vb.a.c(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final String d(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        e eVar = new e();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                eVar.D(58);
                i10 += i13;
                if (i10 == 16) {
                    eVar.D(58);
                }
            } else {
                if (i10 > 0) {
                    eVar.D(58);
                }
                eVar.X((b.b(bArr[i10], 255) << 8) | b.b(bArr[i10 + 1], 255));
                i10 += 2;
            }
        }
        return eVar.O0();
    }

    public static final String e(String str) {
        InetAddress inetAddress;
        k.e(str, "$this$toCanonicalHost");
        boolean z10 = false;
        if (o.C(str, ":", false, 2, null)) {
            if (!n.x(str, "[", false, 2, null) || !n.k(str, "]", false, 2, null)) {
                inetAddress = c(str, 0, str.length());
            } else {
                inetAddress = c(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                k.d(address, "address");
                return d(address);
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                k.d(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                k.d(locale, "Locale.US");
                if (ascii != null) {
                    String lowerCase = ascii.toLowerCase(locale);
                    k.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() == 0) {
                        z10 = true;
                    }
                    if (!z10 && !a(lowerCase)) {
                        return lowerCase;
                    }
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
