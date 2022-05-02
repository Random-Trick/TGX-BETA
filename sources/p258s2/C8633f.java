package p258s2;

import java.nio.ByteBuffer;

public final class C8633f {
    public static long m11861a(ByteBuffer byteBuffer, int i) {
        int n;
        if (i == 1) {
            n = C8632e.m11862n(byteBuffer);
        } else if (i == 2) {
            n = C8632e.m11867i(byteBuffer);
        } else if (i == 3) {
            n = C8632e.m11866j(byteBuffer);
        } else if (i == 4) {
            return C8632e.m11865k(byteBuffer);
        } else {
            if (i == 8) {
                return C8632e.m11863m(byteBuffer);
            }
            throw new RuntimeException("I don't know how to read " + i + " bytes");
        }
        return n;
    }
}
