package ic;

import hc.e;
import hc.h;
import ra.k;

public final class b {
    public static final char[] f14179a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int c(byte[] r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: ic.b.c(byte[], int):int");
    }

    public static final void d(h hVar, e eVar, int i10, int i11) {
        k.e(hVar, "$this$commonWrite");
        k.e(eVar, "buffer");
        eVar.V(hVar.e(), i10, i11);
    }

    public static final int e(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static final char[] f() {
        return f14179a;
    }
}
