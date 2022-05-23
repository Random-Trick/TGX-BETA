package d9;

import java.nio.ByteBuffer;
import t8.b;

public class e extends b {
    @Override
    public ByteBuffer a() {
        return ByteBuffer.allocate(0);
    }

    @Override
    public String b() {
        return "tsas";
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public int hashCode() {
        return 41;
    }
}
