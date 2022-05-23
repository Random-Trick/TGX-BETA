package o7;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class m {
    public static final byte f19305a = Byte.parseByte("01110000", 2);
    public static final byte f19306b = Byte.parseByte("00001111", 2);

    public static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    public String a() {
        byte[] c10 = c(UUID.randomUUID(), new byte[17]);
        c10[16] = c10[0];
        c10[0] = (byte) ((f19306b & c10[0]) | f19305a);
        return b(c10);
    }
}
