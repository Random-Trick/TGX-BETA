package t8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class e extends b {
    public boolean f22989a;
    public short f22990b;

    @Override
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (this.f22989a ? Log.TAG_YOUTUBE : 0));
        allocate.rewind();
        return allocate;
    }

    @Override
    public String b() {
        return "tele";
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        this.f22989a = (byteBuffer.get() & 128) == 128;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f22989a == eVar.f22989a && this.f22990b == eVar.f22990b;
    }

    public int hashCode() {
        return ((this.f22989a ? 1 : 0) * 31) + this.f22990b;
    }

    public String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.f22989a + '}';
    }
}
