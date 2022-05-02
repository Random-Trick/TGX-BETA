package p249r8;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

public class C8393o extends AbstractC8380b {
    public static Logger f27255e = Logger.getLogger(C8393o.class.getName());
    public ByteBuffer f27256d;

    @Override
    public void mo12590e(ByteBuffer byteBuffer) {
        this.f27256d = (ByteBuffer) byteBuffer.slice().limit(m12635c());
    }

    @Override
    public String toString() {
        return "UnknownDescriptor{tag=" + this.f27213a + ", sizeOfInstance=" + this.f27214b + ", data=" + this.f27256d + '}';
    }
}
