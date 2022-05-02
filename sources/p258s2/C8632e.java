package p258s2;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class C8632e {
    public static int m11874a(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static String m11873b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static double m11872c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((((0 | ((bArr[0] << 24) & (-16777216))) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static double m11871d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((((0 | ((bArr[0] << 24) & (-16777216))) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static float m11870e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) (0 | ((bArr[0] << 8) & 65280))) | (bArr[1] & 255))) / 256.0f;
    }

    public static String m11869f(ByteBuffer byteBuffer) {
        int i = m11866i(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            sb2.append((char) (((i >> ((2 - i2) * 5)) & 31) + 96));
        }
        return sb2.toString();
    }

    public static String m11868g(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b = byteBuffer.get();
            if (b == 0) {
                return C8637j.m11844a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b);
        }
    }

    public static String m11867h(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return C8637j.m11844a(bArr);
    }

    public static int m11866i(ByteBuffer byteBuffer) {
        return (m11874a(byteBuffer.get()) << 8) + 0 + m11874a(byteBuffer.get());
    }

    public static int m11865j(ByteBuffer byteBuffer) {
        return (m11866i(byteBuffer) << 8) + 0 + m11874a(byteBuffer.get());
    }

    public static long m11864k(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long m11863l(ByteBuffer byteBuffer) {
        long i = m11866i(byteBuffer) << 32;
        if (i >= 0) {
            return i + m11864k(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static long m11862m(ByteBuffer byteBuffer) {
        long k = (m11864k(byteBuffer) << 32) + 0;
        if (k >= 0) {
            return k + m11864k(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int m11861n(ByteBuffer byteBuffer) {
        return m11874a(byteBuffer.get());
    }
}
