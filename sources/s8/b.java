package s8;

import java.nio.ByteBuffer;
import s2.e;

@g(tags = {0})
public abstract class b {
    public int f22583a;
    public int f22584b;
    public int f22585c;

    public int a() {
        return this.f22584b + 1 + this.f22585c;
    }

    public int b() {
        return this.f22585c;
    }

    public int c() {
        return this.f22584b;
    }

    public final void d(int i10, ByteBuffer byteBuffer) {
        this.f22583a = i10;
        int n10 = e.n(byteBuffer);
        this.f22584b = n10 & 127;
        int i11 = 1;
        while ((n10 >>> 7) == 1) {
            n10 = e.n(byteBuffer);
            i11++;
            this.f22584b = (this.f22584b << 7) | (n10 & 127);
        }
        this.f22585c = i11;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f22584b);
        e(slice);
        byteBuffer.position(byteBuffer.position() + this.f22584b);
    }

    public abstract void e(ByteBuffer byteBuffer);

    public String toString() {
        return "BaseDescriptor{tag=" + this.f22583a + ", sizeOfInstance=" + this.f22584b + '}';
    }
}
