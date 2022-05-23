package d9;

import java.nio.ByteBuffer;
import s2.e;
import s2.g;
import t8.b;

public class c extends b {
    public int f7251a;
    public int f7252b;

    @Override
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        g.j(allocate, this.f7252b + (this.f7251a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    @Override
    public String b() {
        return "sync";
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        int n10 = e.n(byteBuffer);
        this.f7251a = (n10 & 192) >> 6;
        this.f7252b = n10 & 63;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7252b == cVar.f7252b && this.f7251a == cVar.f7251a;
    }

    public int hashCode() {
        return (this.f7251a * 31) + this.f7252b;
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.f7251a + ", nalUnitType=" + this.f7252b + '}';
    }
}
