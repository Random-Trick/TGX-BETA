package p264s8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class C8699g extends AbstractC8693b {
    public boolean f28033a;
    public short f28034b;

    @Override
    public ByteBuffer mo11723a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((this.f28033a ? Log.TAG_YOUTUBE : 0) | (this.f28034b & 127)));
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11722b() {
        return "rap ";
    }

    @Override
    public void mo11721c(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.f28033a = (b & 128) == 128;
        this.f28034b = (short) (b & Byte.MAX_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8699g gVar = (C8699g) obj;
        return this.f28034b == gVar.f28034b && this.f28033a == gVar.f28033a;
    }

    public int hashCode() {
        return ((this.f28033a ? 1 : 0) * 31) + this.f28034b;
    }

    public String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.f28033a + ", numLeadingSamples=" + ((int) this.f28034b) + '}';
    }
}
