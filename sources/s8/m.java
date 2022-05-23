package s8;

import java.nio.ByteBuffer;
import s2.e;

@g(tags = {20})
public class m extends b {
    public int f22623d;

    @Override
    public void e(ByteBuffer byteBuffer) {
        this.f22623d = e.n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f22623d == ((m) obj).f22623d;
    }

    public int hashCode() {
        return this.f22623d;
    }

    @Override
    public String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.f22623d) + '}';
    }
}
