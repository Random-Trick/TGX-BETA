package t8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class g extends b {
    public boolean f22993a;
    public short f22994b;

    @Override
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((this.f22993a ? Log.TAG_YOUTUBE : 0) | (this.f22994b & 127)));
        allocate.rewind();
        return allocate;
    }

    @Override
    public String b() {
        return "rap ";
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        this.f22993a = (b10 & 128) == 128;
        this.f22994b = (short) (b10 & Byte.MAX_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f22994b == gVar.f22994b && this.f22993a == gVar.f22993a;
    }

    public int hashCode() {
        return ((this.f22993a ? 1 : 0) * 31) + this.f22994b;
    }

    public String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.f22993a + ", numLeadingSamples=" + ((int) this.f22994b) + '}';
    }
}
