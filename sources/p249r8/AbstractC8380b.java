package p249r8;

import java.nio.ByteBuffer;
import p258s2.C8632e;

@AbstractC8385g(tags = {0})
public abstract class AbstractC8380b {
    public int f27216a;
    public int f27217b;
    public int f27218c;

    public int m12636a() {
        return this.f27217b + 1 + this.f27218c;
    }

    public int m12635b() {
        return this.f27218c;
    }

    public int m12634c() {
        return this.f27217b;
    }

    public final void m12633d(int i, ByteBuffer byteBuffer) {
        this.f27216a = i;
        int n = C8632e.m11861n(byteBuffer);
        this.f27217b = n & 127;
        int i2 = 1;
        while ((n >>> 7) == 1) {
            n = C8632e.m11861n(byteBuffer);
            i2++;
            this.f27217b = (this.f27217b << 7) | (n & 127);
        }
        this.f27218c = i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f27217b);
        mo12589e(slice);
        byteBuffer.position(byteBuffer.position() + this.f27217b);
    }

    public abstract void mo12589e(ByteBuffer byteBuffer);

    public String toString() {
        return "BaseDescriptor{tag=" + this.f27216a + ", sizeOfInstance=" + this.f27217b + '}';
    }
}
