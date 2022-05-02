package za;

import java.util.Collection;
import java.util.Iterator;
import p123ia.AbstractC5286d0;
import p317wa.C10022g;
import p317wa.C10030l;
import qa.C8298k;

public class C11451n extends C11450m {
    public static final boolean m635j(String str, String str2, boolean z) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m631n(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean m634k(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m635j(str, str2, z);
    }

    public static final boolean m633l(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final boolean m632m(CharSequence charSequence) {
        boolean z;
        C8298k.m12934e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            C10022g G = C11452o.m614G(charSequence);
            if (!(G instanceof Collection) || !((Collection) G).isEmpty()) {
                Iterator<Integer> it = G.iterator();
                while (it.hasNext()) {
                    if (!C11434a.m659c(charSequence.charAt(((AbstractC5286d0) it).mo6206e()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m631n(String str, int i, String str2, int i2, int i3, boolean z) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String m629p(CharSequence charSequence, int i) {
        C8298k.m12934e(charSequence, "<this>");
        int i2 = 1;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i);
                if (1 <= i) {
                    while (true) {
                        i2++;
                        sb2.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                    }
                }
                String sb3 = sb2.toString();
                C8298k.m12935d(sb3, "{\n                    va…tring()\n                }");
                return sb3;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final String m628q(String str, char c, char c2, boolean z) {
        C8298k.m12934e(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            C8298k.m12935d(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            if (C11435b.m656f(charAt, c, z)) {
                charAt = c2;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        C8298k.m12935d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static final String m627r(String str, String str2, String str3, boolean z) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "oldValue");
        C8298k.m12934e(str3, "newValue");
        int i = 0;
        int J = C11452o.m611J(str, str2, 0, z);
        if (J < 0) {
            return str;
        }
        int length = str2.length();
        int d = C10030l.m6193d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i, J);
                sb2.append(str3);
                i = J + length;
                if (J >= str.length()) {
                    break;
                }
                J = C11452o.m611J(str, str2, J + d, z);
            } while (J > 0);
            sb2.append((CharSequence) str, i, str.length());
            String sb3 = sb2.toString();
            C8298k.m12935d(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static String m626s(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m628q(str, c, c2, z);
    }

    public static String m625t(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m627r(str, str2, str3, z);
    }

    public static final boolean m624u(String str, String str2, int i, boolean z) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m631n(str, i, str2, 0, str2.length(), z);
    }

    public static final boolean m623v(String str, String str2, boolean z) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m631n(str, 0, str2, 0, str2.length(), z);
    }

    public static boolean m622w(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m624u(str, str2, i, z);
    }

    public static boolean m621x(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m623v(str, str2, z);
    }
}
