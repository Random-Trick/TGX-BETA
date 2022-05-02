package p095gc;

import qa.C8298k;

public final class C4543c0 {
    public static final long m27472a(String str, int i, int i2) {
        int i3;
        C8298k.m12933e(str, "$this$utf8Size");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (z) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                i3 = 3;
                            } else {
                                int i4 = i + 1;
                                char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                                if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                    j++;
                                    i = i4;
                                } else {
                                    j += 4;
                                    i += 2;
                                }
                            }
                            j += i3;
                        }
                        i++;
                    }
                    return j;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    public static long m27471b(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m27472a(str, i, i2);
    }
}
