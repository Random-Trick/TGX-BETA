package p109hc;

import p095gc.C4549e;
import p095gc.C4552h;
import qa.C8298k;

public final class C5073b {
    public static final char[] f17086a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int m24038c(byte[] r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: p109hc.C5073b.m24038c(byte[], int):int");
    }

    public static final void m24037d(C4552h hVar, C4549e eVar, int i, int i2) {
        C8298k.m12934e(hVar, "$this$commonWrite");
        C8298k.m12934e(eVar, "buffer");
        eVar.mo27347U(hVar.m27411e(), i, i2);
    }

    public static final int m24036e(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    public static final char[] m24035f() {
        return f17086a;
    }
}
