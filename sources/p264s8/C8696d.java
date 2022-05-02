package p264s8;

import java.nio.ByteBuffer;

public class C8696d extends AbstractC8693b {
    public short f28028a;

    @Override
    public ByteBuffer mo11723a() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.f28028a);
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11722b() {
        return "roll";
    }

    @Override
    public void mo11721c(ByteBuffer byteBuffer) {
        this.f28028a = byteBuffer.getShort();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f28028a == ((C8696d) obj).f28028a;
    }

    public int hashCode() {
        return this.f28028a;
    }
}
