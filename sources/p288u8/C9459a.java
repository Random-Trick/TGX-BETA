package p288u8;

import java.nio.ByteBuffer;
import java.util.UUID;
import p275t8.AbstractC9056a;

public class C9459a extends AbstractC9056a {
    public static UUID f30682c;
    public ByteBuffer f30683b;

    static {
        UUID fromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        f30682c = fromString;
        AbstractC9056a.f29033a.put(fromString, C9459a.class);
    }

    @Override
    public ByteBuffer mo8582b() {
        return this.f30683b;
    }

    @Override
    public void mo8581c(ByteBuffer byteBuffer) {
        this.f30683b = byteBuffer;
    }
}
