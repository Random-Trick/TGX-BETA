package za;

import qa.C8298k;

public class C11450m extends C11449l {
    public static final Integer m639f(String str) {
        C8298k.m12934e(str, "<this>");
        return m638g(str, 10);
    }

    public static final Integer m638g(String str, int i) {
        boolean z;
        int i2;
        C8298k.m12934e(str, "<this>");
        C11434a.m661a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        int i5 = 1;
        if (C8298k.m12933f(charAt, 48) >= 0) {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            i5++;
            int b = C11434a.m660b(str.charAt(i5), i);
            if (b < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + b) {
                return null;
            }
            i3 = i2 - b;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static final Long m637h(String str) {
        C8298k.m12934e(str, "<this>");
        return m636i(str, 10);
    }

    public static final java.lang.Long m636i(java.lang.String r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: za.C11450m.m636i(java.lang.String, int):java.lang.Long");
    }
}
