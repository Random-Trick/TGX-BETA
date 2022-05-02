package p264s8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class C8699g extends AbstractC8693b {
    public boolean f28036a;
    public short f28037b;

    @Override
    public ByteBuffer mo11722a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((this.f28036a ? Log.TAG_YOUTUBE : 0) | (this.f28037b & 127)));
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11721b() {
        return "rap ";
    }

    @Override
    public void mo11720c(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.f28036a = (b & 128) == 128;
        this.f28037b = (short) (b & Byte.MAX_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8699g gVar = (C8699g) obj;
        return this.f28037b == gVar.f28037b && this.f28036a == gVar.f28036a;
    }

    public int hashCode() {
        return ((this.f28036a ? 1 : 0) * 31) + this.f28037b;
    }

    public String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.f28036a + ", numLeadingSamples=" + ((int) this.f28037b) + '}';
    }
}
