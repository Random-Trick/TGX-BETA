package p316w9;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class C9999a {
    public static final byte[] f32608a = {0, 0, 1};
    public static final byte[] f32609b = {0, 0, 0, 1};

    public static ByteBuffer m6298a(MediaFormat mediaFormat) {
        ByteBuffer asReadOnlyBuffer = mediaFormat.getByteBuffer("csd-0").asReadOnlyBuffer();
        ByteBuffer order = ByteBuffer.allocate(asReadOnlyBuffer.limit()).order(asReadOnlyBuffer.order());
        order.put(asReadOnlyBuffer);
        order.flip();
        m6297b(order);
        byte b = order.get();
        if (b == 103 || b == 39 || b == 71) {
            return order.slice();
        }
        throw new IllegalStateException("Got non SPS NAL data.");
    }

    public static void m6297b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        if (!Arrays.equals(bArr, f32608a)) {
            byte[] copyOf = Arrays.copyOf(bArr, 4);
            copyOf[3] = byteBuffer.get();
            if (!Arrays.equals(copyOf, f32609b)) {
                throw new IllegalStateException("AVC NAL start code not found in csd.");
            }
        }
    }
}
