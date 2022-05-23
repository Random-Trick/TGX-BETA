package s8;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

public class o extends b {
    public static Logger f22625e = Logger.getLogger(o.class.getName());
    public ByteBuffer f22626d;

    @Override
    public void e(ByteBuffer byteBuffer) {
        this.f22626d = (ByteBuffer) byteBuffer.slice().limit(c());
    }

    @Override
    public String toString() {
        return "UnknownDescriptor{tag=" + this.f22583a + ", sizeOfInstance=" + this.f22584b + ", data=" + this.f22626d + '}';
    }
}
