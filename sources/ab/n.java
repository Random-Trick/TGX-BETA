package ab;

import ja.d0;
import java.util.Collection;
import java.util.Iterator;
import ra.k;
import xa.g;
import xa.l;

public class n extends m {
    public static final boolean j(String str, String str2, boolean z10) {
        k.e(str, "<this>");
        k.e(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return n(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean k(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j(str, str2, z10);
    }

    public static final boolean l(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        if (!z10) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final boolean m(CharSequence charSequence) {
        boolean z10;
        k.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            g G = o.G(charSequence);
            if (!(G instanceof Collection) || !((Collection) G).isEmpty()) {
                Iterator<Integer> it = G.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((d0) it).d()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean n(String str, int i10, String str2, int i11, int i12, boolean z10) {
        k.e(str, "<this>");
        k.e(str2, "other");
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final String p(CharSequence charSequence, int i10) {
        k.e(charSequence, "<this>");
        int i11 = 1;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        } else if (i10 == 0) {
            return "";
        } else {
            if (i10 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                if (1 <= i10) {
                    while (true) {
                        sb2.append(charSequence);
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                String sb3 = sb2.toString();
                k.d(sb3, "{\n                    va…tring()\n                }");
                return sb3;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final String q(String str, char c10, char c11, boolean z10) {
        k.e(str, "<this>");
        if (!z10) {
            String replace = str.replace(c10, c11);
            k.d(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (b.f(charAt, c10, z10)) {
                charAt = c11;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        k.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static final String r(String str, String str2, String str3, boolean z10) {
        k.e(str, "<this>");
        k.e(str2, "oldValue");
        k.e(str3, "newValue");
        int i10 = 0;
        int J = o.J(str, str2, 0, z10);
        if (J < 0) {
            return str;
        }
        int length = str2.length();
        int d10 = l.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i10, J);
                sb2.append(str3);
                i10 = J + length;
                if (J >= str.length()) {
                    break;
                }
                J = o.J(str, str2, J + d10, z10);
            } while (J > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String sb3 = sb2.toString();
            k.d(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static String s(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return q(str, c10, c11, z10);
    }

    public static String t(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return r(str, str2, str3, z10);
    }

    public static final boolean u(String str, String str2, int i10, boolean z10) {
        k.e(str, "<this>");
        k.e(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return n(str, i10, str2, 0, str2.length(), z10);
    }

    public static final boolean v(String str, String str2, boolean z10) {
        k.e(str, "<this>");
        k.e(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return n(str, 0, str2, 0, str2.length(), z10);
    }

    public static boolean w(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return u(str, str2, i10, z10);
    }

    public static boolean x(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(str, str2, z10);
    }
}
