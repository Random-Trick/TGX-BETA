package p249r8;

import java.nio.ByteBuffer;
import p258s2.C8632e;

@AbstractC8385g(tags = {0})
public abstract class AbstractC8380b {
    public int f27213a;
    public int f27214b;
    public int f27215c;

    public int m12637a() {
        return this.f27214b + 1 + this.f27215c;
    }

    public int m12636b() {
        return this.f27215c;
    }

    public int m12635c() {
        return this.f27214b;
    }

    public final void m12634d(int i, ByteBuffer byteBuffer) {
        this.f27213a = i;
        int n = C8632e.m11862n(byteBuffer);
        this.f27214b = n & 127;
        int i2 = 1;
        while ((n >>> 7) == 1) {
            n = C8632e.m11862n(byteBuffer);
            i2++;
            this.f27214b = (this.f27214b << 7) | (n & 127);
        }
        this.f27215c = i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f27214b);
        mo12590e(slice);
        byteBuffer.position(byteBuffer.position() + this.f27214b);
    }

    public abstract void mo12590e(ByteBuffer byteBuffer);

    public String toString() {
        return "BaseDescriptor{tag=" + this.f27213a + ", sizeOfInstance=" + this.f27214b + '}';
    }
}
