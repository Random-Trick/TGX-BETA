package s2;

import java.nio.ByteBuffer;

public final class h {
    public static void a(long j10, ByteBuffer byteBuffer, int i10) {
        if (i10 == 1) {
            g.j(byteBuffer, (int) (j10 & 255));
        } else if (i10 == 2) {
            g.e(byteBuffer, (int) (j10 & 65535));
        } else if (i10 == 3) {
            g.f(byteBuffer, (int) (j10 & 16777215));
        } else if (i10 == 4) {
            g.g(byteBuffer, j10);
        } else if (i10 == 8) {
            g.i(byteBuffer, j10);
        } else {
            throw new RuntimeException("I don't know how to read " + i10 + " bytes");
        }
    }
}
