package v8;

import java.nio.ByteBuffer;
import java.util.UUID;

public class a extends u8.a {
    public static UUID f24783c;
    public ByteBuffer f24784b;

    static {
        UUID fromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        f24783c = fromString;
        u8.a.f23713a.put(fromString, a.class);
    }

    @Override
    public ByteBuffer b() {
        return this.f24784b;
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        this.f24784b = byteBuffer;
    }
}
