package s2;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class e {
    public static int a(byte b10) {
        return b10 < 0 ? b10 + 256 : b10;
    }

    public static String b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static double c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((((0 | ((bArr[0] << 24) & (-16777216))) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((((0 | ((bArr[0] << 24) & (-16777216))) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static float e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) (0 | ((bArr[0] << 8) & 65280))) | (bArr[1] & 255))) / 256.0f;
    }

    public static String f(ByteBuffer byteBuffer) {
        int i10 = i(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 3; i11++) {
            sb2.append((char) (((i10 >> ((2 - i11) * 5)) & 31) + 96));
        }
        return sb2.toString();
    }

    public static String g(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b10 = byteBuffer.get();
            if (b10 == 0) {
                return j.a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b10);
        }
    }

    public static String h(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return j.a(bArr);
    }

    public static int i(ByteBuffer byteBuffer) {
        return (a(byteBuffer.get()) << 8) + 0 + a(byteBuffer.get());
    }

    public static int j(ByteBuffer byteBuffer) {
        return (i(byteBuffer) << 8) + 0 + a(byteBuffer.get());
    }

    public static long k(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        return j10 < 0 ? j10 + 4294967296L : j10;
    }

    public static long l(ByteBuffer byteBuffer) {
        long i10 = i(byteBuffer) << 32;
        if (i10 >= 0) {
            return i10 + k(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static long m(ByteBuffer byteBuffer) {
        long k10 = (k(byteBuffer) << 32) + 0;
        if (k10 >= 0) {
            return k10 + k(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int n(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }
}
