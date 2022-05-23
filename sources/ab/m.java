package ab;

import ra.k;

public class m extends l {
    public static final Integer f(String str) {
        k.e(str, "<this>");
        return g(str, 10);
    }

    public static final Integer g(String str, int i10) {
        boolean z10;
        int i11;
        k.e(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        int i14 = 1;
        if (k.f(charAt, 48) >= 0) {
            z10 = false;
            i14 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z10 = false;
            }
        }
        int i15 = -59652323;
        while (i14 < length) {
            int b10 = a.b(str.charAt(i14), i10);
            if (b10 < 0) {
                return null;
            }
            if ((i12 < i15 && (i15 != -59652323 || i12 < (i15 = i13 / i10))) || (i11 = i12 * i10) < i13 + b10) {
                return null;
            }
            i12 = i11 - b10;
            i14++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static final Long h(String str) {
        k.e(str, "<this>");
        return i(str, 10);
    }

    public static final java.lang.Long i(java.lang.String r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: ab.m.i(java.lang.String, int):java.lang.Long");
    }
}
