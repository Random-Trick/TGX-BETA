package p190n7;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class C7297m {
    public static final byte f23171a = Byte.parseByte("01110000", 2);
    public static final byte f23172b = Byte.parseByte("00001111", 2);

    public static String m17123b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public static byte[] m17122c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    public String m17124a() {
        byte[] c = m17122c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f23172b & c[0]) | f23171a);
        return m17123b(c);
    }
}
