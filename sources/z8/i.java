package z8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public class i {
    public static UUID a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public static byte[] b(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[i10] = (byte) (mostSignificantBits >>> ((7 - i10) * 8));
        }
        for (int i11 = 8; i11 < 16; i11++) {
            bArr[i11] = (byte) (leastSignificantBits >>> ((7 - i11) * 8));
        }
        return bArr;
    }
}
