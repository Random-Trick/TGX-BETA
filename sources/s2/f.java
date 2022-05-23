package s2;

import java.nio.ByteBuffer;

public final class f {
    public static long a(ByteBuffer byteBuffer, int i10) {
        int n10;
        if (i10 == 1) {
            n10 = e.n(byteBuffer);
        } else if (i10 == 2) {
            n10 = e.i(byteBuffer);
        } else if (i10 == 3) {
            n10 = e.j(byteBuffer);
        } else if (i10 == 4) {
            return e.k(byteBuffer);
        } else {
            if (i10 == 8) {
                return e.m(byteBuffer);
            }
            throw new RuntimeException("I don't know how to read " + i10 + " bytes");
        }
        return n10;
    }
}
