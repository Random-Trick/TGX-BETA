package p036c9;

import java.nio.ByteBuffer;
import p258s2.C8632e;
import p258s2.C8634g;
import p264s8.AbstractC8693b;

public class C2041c extends AbstractC8693b {
    public int f7244a;
    public int f7245b;

    @Override
    public ByteBuffer mo11723a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        C8634g.m11851j(allocate, this.f7245b + (this.f7244a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    @Override
    public String mo11722b() {
        return "sync";
    }

    @Override
    public void mo11721c(ByteBuffer byteBuffer) {
        int n = C8632e.m11862n(byteBuffer);
        this.f7244a = (n & 192) >> 6;
        this.f7245b = n & 63;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2041c cVar = (C2041c) obj;
        return this.f7245b == cVar.f7245b && this.f7244a == cVar.f7244a;
    }

    public int hashCode() {
        return (this.f7244a * 31) + this.f7245b;
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.f7244a + ", nalUnitType=" + this.f7245b + '}';
    }
}
