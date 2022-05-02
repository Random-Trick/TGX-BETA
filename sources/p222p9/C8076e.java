package p222p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import qa.C8298k;

public final class C8076e {
    public final Map<String, ShortBuffer> f26304a = new LinkedHashMap();

    public final ShortBuffer m13609a(String str, int i) {
        C8298k.m12934e(str, "name");
        ShortBuffer shortBuffer = this.f26304a.get(str);
        if (shortBuffer == null || shortBuffer.capacity() < i) {
            shortBuffer = ByteBuffer.allocateDirect(i * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        C8298k.m12936c(shortBuffer);
        shortBuffer.clear();
        shortBuffer.limit(i);
        this.f26304a.put(str, shortBuffer);
        return shortBuffer;
    }
}
