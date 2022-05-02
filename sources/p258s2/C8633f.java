package p258s2;

import java.nio.ByteBuffer;

public final class C8633f {
    public static long m11860a(ByteBuffer byteBuffer, int i) {
        int n;
        if (i == 1) {
            n = C8632e.m11861n(byteBuffer);
        } else if (i == 2) {
            n = C8632e.m11866i(byteBuffer);
        } else if (i == 3) {
            n = C8632e.m11865j(byteBuffer);
        } else if (i == 4) {
            return C8632e.m11864k(byteBuffer);
        } else {
            if (i == 8) {
                return C8632e.m11862m(byteBuffer);
            }
            throw new RuntimeException("I don't know how to read " + i + " bytes");
        }
        return n;
    }
}
