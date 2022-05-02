package p249r8;

import java.nio.ByteBuffer;
import p258s2.C8632e;
import p258s2.C8634g;

@AbstractC8385g(tags = {6})
public class C8392n extends AbstractC8380b {
    public int f27257d;

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        this.f27257d = C8632e.m11861n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f27257d == ((C8392n) obj).f27257d;
    }

    public ByteBuffer m12592f() {
        ByteBuffer allocate = ByteBuffer.allocate(3);
        C8634g.m11850j(allocate, 6);
        C8634g.m11850j(allocate, 1);
        C8634g.m11850j(allocate, this.f27257d);
        return allocate;
    }

    public int m12591g() {
        return 3;
    }

    public void m12590h(int i) {
        this.f27257d = i;
    }

    public int hashCode() {
        return this.f27257d;
    }

    @Override
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.f27257d + '}';
    }
}
