package p222p9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import qa.C8298k;

public final class C8076e {
    public final Map<String, ShortBuffer> f26307a = new LinkedHashMap();

    public final ShortBuffer m13608a(String str, int i) {
        C8298k.m12933e(str, "name");
        ShortBuffer shortBuffer = this.f26307a.get(str);
        if (shortBuffer == null || shortBuffer.capacity() < i) {
            shortBuffer = ByteBuffer.allocateDirect(i * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        C8298k.m12935c(shortBuffer);
        shortBuffer.clear();
        shortBuffer.limit(i);
        this.f26307a.put(str, shortBuffer);
        return shortBuffer;
    }
}
