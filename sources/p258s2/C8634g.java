package p258s2;

import java.nio.ByteBuffer;

public final class C8634g {
    public static void m11860a(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    public static void m11859b(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    public static void m11858c(ByteBuffer byteBuffer, double d) {
        short s = (short) (d * 256.0d);
        byteBuffer.put((byte) ((65280 & s) >> 8));
        byteBuffer.put((byte) (s & 255));
    }

    public static void m11857d(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length == 3) {
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
            }
            m11856e(byteBuffer, i);
            return;
        }
        throw new IllegalArgumentException("\"" + str + "\" language string isn't exactly 3 characters long!");
    }

    public static void m11856e(ByteBuffer byteBuffer, int i) {
        int i2 = i & 65535;
        m11851j(byteBuffer, i2 >> 8);
        m11851j(byteBuffer, i2 & 255);
    }

    public static void m11855f(ByteBuffer byteBuffer, int i) {
        int i2 = i & 16777215;
        m11856e(byteBuffer, i2 >> 8);
        m11851j(byteBuffer, i2);
    }

    public static void m11854g(ByteBuffer byteBuffer, long j) {
        byteBuffer.putInt((int) j);
    }

    public static void m11853h(ByteBuffer byteBuffer, long j) {
        long j2 = j & 281474976710655L;
        m11856e(byteBuffer, (int) (j2 >> 32));
        m11854g(byteBuffer, j2 & 4294967295L);
    }

    public static void m11852i(ByteBuffer byteBuffer, long j) {
        byteBuffer.putLong(j);
    }

    public static void m11851j(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) (i & 255));
    }

    public static void m11850k(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(C8637j.m11844b(str));
        m11851j(byteBuffer, 0);
    }

    public static void m11849l(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(C8637j.m11844b(str));
        m11851j(byteBuffer, 0);
    }
}
