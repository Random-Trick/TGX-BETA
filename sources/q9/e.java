package q9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import ra.k;

public final class e {
    public final Map<String, ShortBuffer> f21490a = new LinkedHashMap();

    public final ShortBuffer a(String str, int i10) {
        k.e(str, "name");
        ShortBuffer shortBuffer = this.f21490a.get(str);
        if (shortBuffer == null || shortBuffer.capacity() < i10) {
            shortBuffer = ByteBuffer.allocateDirect(i10 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        k.c(shortBuffer);
        shortBuffer.clear();
        shortBuffer.limit(i10);
        this.f21490a.put(str, shortBuffer);
        return shortBuffer;
    }
}
