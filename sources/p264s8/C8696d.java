package p264s8;

import java.nio.ByteBuffer;

public class C8696d extends AbstractC8693b {
    public short f28031a;

    @Override
    public ByteBuffer mo11722a() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.f28031a);
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11721b() {
        return "roll";
    }

    @Override
    public void mo11720c(ByteBuffer byteBuffer) {
        this.f28031a = byteBuffer.getShort();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f28031a == ((C8696d) obj).f28031a;
    }

    public int hashCode() {
        return this.f28031a;
    }
}
