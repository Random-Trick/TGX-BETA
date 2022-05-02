package p167l9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import qa.C8298k;

public final class C6429a {
    public static final ByteBuffer m20410a(int i) {
        ByteBuffer order = ByteBuffer.allocateDirect(i * 1).order(ByteOrder.nativeOrder());
        order.limit(order.capacity());
        C8298k.m12935d(order, "ByteBuffer\n        .allo…it.limit(it.capacity()) }");
        return order;
    }

    public static final FloatBuffer m20409b(int i) {
        FloatBuffer asFloatBuffer = m20410a(i * 4).asFloatBuffer();
        C8298k.m12935d(asFloatBuffer, "byteBuffer(size * Egloo.…OF_FLOAT).asFloatBuffer()");
        return asFloatBuffer;
    }
}
