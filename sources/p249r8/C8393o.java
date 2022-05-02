package p249r8;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

public class C8393o extends AbstractC8380b {
    public static Logger f27258e = Logger.getLogger(C8393o.class.getName());
    public ByteBuffer f27259d;

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        this.f27259d = (ByteBuffer) byteBuffer.slice().limit(m12634c());
    }

    @Override
    public String toString() {
        return "UnknownDescriptor{tag=" + this.f27216a + ", sizeOfInstance=" + this.f27217b + ", data=" + this.f27259d + '}';
    }
}
