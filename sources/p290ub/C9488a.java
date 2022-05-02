package p290ub;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import p095gc.C4549e;
import qa.C8298k;
import za.C11451n;
import za.C11452o;

public final class C9488a {
    public static final boolean m8549a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C8298k.m12933f(charAt, 31) <= 0 || C8298k.m12933f(charAt, 127) >= 0 || C11452o.m608M(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m8548b(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (C8298k.m12933f(charAt, 48) < 0 || C8298k.m12933f(charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            i4++;
            bArr[i4] = (byte) i6;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    public static final java.net.InetAddress m8547c(java.lang.String r18, int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: p290ub.C9488a.m8547c(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final String m8546d(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C4549e eVar = new C4549e();
        while (i < bArr.length) {
            if (i == i2) {
                eVar.mo27349C(58);
                i += i4;
                if (i == 16) {
                    eVar.mo27349C(58);
                }
            } else {
                if (i > 0) {
                    eVar.mo27349C(58);
                }
                eVar.mo27346W((C9489b.m8522b(bArr[i], 255) << 8) | C9489b.m8522b(bArr[i + 1], 255));
                i += 2;
            }
        }
        return eVar.m27433O0();
    }

    public static final String m8545e(String str) {
        InetAddress inetAddress;
        C8298k.m12934e(str, "$this$toCanonicalHost");
        boolean z = false;
        if (C11452o.m618C(str, ":", false, 2, null)) {
            if (!C11451n.m621x(str, "[", false, 2, null) || !C11451n.m634k(str, "]", false, 2, null)) {
                inetAddress = m8547c(str, 0, str.length());
            } else {
                inetAddress = m8547c(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                C8298k.m12935d(address, "address");
                return m8546d(address);
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                C8298k.m12935d(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                C8298k.m12935d(locale, "Locale.US");
                if (ascii != null) {
                    String lowerCase = ascii.toLowerCase(locale);
                    C8298k.m12935d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() == 0) {
                        z = true;
                    }
                    if (!z && !m8549a(lowerCase)) {
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
