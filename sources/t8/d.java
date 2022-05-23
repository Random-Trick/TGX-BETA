package t8;

import java.nio.ByteBuffer;

public class d extends b {
    public short f22988a;

    @Override
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.f22988a);
        allocate.rewind();
        return allocate;
    }

    @Override
    public String b() {
        return "roll";
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        this.f22988a = byteBuffer.getShort();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f22988a == ((d) obj).f22988a;
    }

    public int hashCode() {
        return this.f22988a;
    }
}
