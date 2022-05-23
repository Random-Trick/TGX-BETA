package x9;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class a {
    public static final byte[] f26173a = {0, 0, 1};
    public static final byte[] f26174b = {0, 0, 0, 1};

    public static ByteBuffer a(MediaFormat mediaFormat) {
        ByteBuffer asReadOnlyBuffer = mediaFormat.getByteBuffer("csd-0").asReadOnlyBuffer();
        ByteBuffer order = ByteBuffer.allocate(asReadOnlyBuffer.limit()).order(asReadOnlyBuffer.order());
        order.put(asReadOnlyBuffer);
        order.flip();
        b(order);
        byte b10 = order.get();
        if (b10 == 103 || b10 == 39 || b10 == 71) {
            return order.slice();
        }
        throw new IllegalStateException("Got non SPS NAL data.");
    }

    public static void b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        if (!Arrays.equals(bArr, f26173a)) {
            byte[] copyOf = Arrays.copyOf(bArr, 4);
            copyOf[3] = byteBuffer.get();
            if (!Arrays.equals(copyOf, f26174b)) {
                throw new IllegalStateException("AVC NAL start code not found in csd.");
            }
        }
    }
}
