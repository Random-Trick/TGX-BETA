package s2;

import java.nio.ByteBuffer;

public final class g {
    public static void a(ByteBuffer byteBuffer, double d10) {
        int i10 = (int) (d10 * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i10) >> 24));
        byteBuffer.put((byte) ((16711680 & i10) >> 16));
        byteBuffer.put((byte) ((65280 & i10) >> 8));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void b(ByteBuffer byteBuffer, double d10) {
        int i10 = (int) (d10 * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i10) >> 24));
        byteBuffer.put((byte) ((16711680 & i10) >> 16));
        byteBuffer.put((byte) ((65280 & i10) >> 8));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void c(ByteBuffer byteBuffer, double d10) {
        short s10 = (short) (d10 * 256.0d);
        byteBuffer.put((byte) ((65280 & s10) >> 8));
        byteBuffer.put((byte) (s10 & 255));
    }

    public static void d(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
            }
            e(byteBuffer, i10);
            return;
        }
        throw new IllegalArgumentException("\"" + str + "\" language string isn't exactly 3 characters long!");
    }

    public static void e(ByteBuffer byteBuffer, int i10) {
        int i11 = i10 & 65535;
        j(byteBuffer, i11 >> 8);
        j(byteBuffer, i11 & 255);
    }

    public static void f(ByteBuffer byteBuffer, int i10) {
        int i11 = i10 & 16777215;
        e(byteBuffer, i11 >> 8);
        j(byteBuffer, i11);
    }

    public static void g(ByteBuffer byteBuffer, long j10) {
        byteBuffer.putInt((int) j10);
    }

    public static void h(ByteBuffer byteBuffer, long j10) {
        long j11 = j10 & 281474976710655L;
        e(byteBuffer, (int) (j11 >> 32));
        g(byteBuffer, j11 & 4294967295L);
    }

    public static void i(ByteBuffer byteBuffer, long j10) {
        byteBuffer.putLong(j10);
    }

    public static void j(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void k(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(j.b(str));
        j(byteBuffer, 0);
    }

    public static void l(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(j.b(str));
        j(byteBuffer, 0);
    }
}
