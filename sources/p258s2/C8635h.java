package p258s2;

import java.nio.ByteBuffer;

public final class C8635h {
    public static void m11847a(long j, ByteBuffer byteBuffer, int i) {
        if (i == 1) {
            C8634g.m11850j(byteBuffer, (int) (j & 255));
        } else if (i == 2) {
            C8634g.m11855e(byteBuffer, (int) (j & 65535));
        } else if (i == 3) {
            C8634g.m11854f(byteBuffer, (int) (j & 16777215));
        } else if (i == 4) {
            C8634g.m11853g(byteBuffer, j);
        } else if (i == 8) {
            C8634g.m11851i(byteBuffer, j);
        } else {
            throw new RuntimeException("I don't know how to read " + i + " bytes");
        }
    }
}
