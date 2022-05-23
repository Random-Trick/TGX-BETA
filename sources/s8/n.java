package s8;

import java.nio.ByteBuffer;
import s2.e;
import s2.g;

@g(tags = {6})
public class n extends b {
    public int f22624d;

    @Override
    public void e(ByteBuffer byteBuffer) {
        this.f22624d = e.n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f22624d == ((n) obj).f22624d;
    }

    public ByteBuffer f() {
        ByteBuffer allocate = ByteBuffer.allocate(3);
        g.j(allocate, 6);
        g.j(allocate, 1);
        g.j(allocate, this.f22624d);
        return allocate;
    }

    public int g() {
        return 3;
    }

    public void h(int i10) {
        this.f22624d = i10;
    }

    public int hashCode() {
        return this.f22624d;
    }

    @Override
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.f22624d + '}';
    }
}
