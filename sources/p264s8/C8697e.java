package p264s8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class C8697e extends AbstractC8693b {
    public boolean f28029a;
    public short f28030b;

    @Override
    public ByteBuffer mo11723a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (this.f28029a ? Log.TAG_YOUTUBE : 0));
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11722b() {
        return "tele";
    }

    @Override
    public void mo11721c(ByteBuffer byteBuffer) {
        this.f28029a = (byteBuffer.get() & 128) == 128;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8697e eVar = (C8697e) obj;
        return this.f28029a == eVar.f28029a && this.f28030b == eVar.f28030b;
    }

    public int hashCode() {
        return ((this.f28029a ? 1 : 0) * 31) + this.f28030b;
    }

    public String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.f28029a + '}';
    }
}
