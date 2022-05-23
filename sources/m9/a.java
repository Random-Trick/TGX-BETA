package m9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import ra.k;

public final class a {
    public static final ByteBuffer a(int i10) {
        ByteBuffer order = ByteBuffer.allocateDirect(i10 * 1).order(ByteOrder.nativeOrder());
        order.limit(order.capacity());
        k.d(order, "ByteBuffer\n        .allo…it.limit(it.capacity()) }");
        return order;
    }

    public static final FloatBuffer b(int i10) {
        FloatBuffer asFloatBuffer = a(i10 * 4).asFloatBuffer();
        k.d(asFloatBuffer, "byteBuffer(size * Egloo.…OF_FLOAT).asFloatBuffer()");
        return asFloatBuffer;
    }
}
