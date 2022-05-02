package p264s8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class C8697e extends AbstractC8693b {
    public boolean f28032a;
    public short f28033b;

    @Override
    public ByteBuffer mo11722a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (this.f28032a ? Log.TAG_YOUTUBE : 0));
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11721b() {
        return "tele";
    }

    @Override
    public void mo11720c(ByteBuffer byteBuffer) {
        this.f28032a = (byteBuffer.get() & 128) == 128;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8697e eVar = (C8697e) obj;
        return this.f28032a == eVar.f28032a && this.f28033b == eVar.f28033b;
    }

    public int hashCode() {
        return ((this.f28032a ? 1 : 0) * 31) + this.f28033b;
    }

    public String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.f28032a + '}';
    }
}
