package p249r8;

import java.nio.ByteBuffer;
import p258s2.C8632e;
import p258s2.C8634g;

@AbstractC8385g(tags = {6})
public class C8392n extends AbstractC8380b {
    public int f27254d;

    @Override
    public void mo12590e(ByteBuffer byteBuffer) {
        this.f27254d = C8632e.m11862n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f27254d == ((C8392n) obj).f27254d;
    }

    public ByteBuffer m12593f() {
        ByteBuffer allocate = ByteBuffer.allocate(3);
        C8634g.m11851j(allocate, 6);
        C8634g.m11851j(allocate, 1);
        C8634g.m11851j(allocate, this.f27254d);
        return allocate;
    }

    public int m12592g() {
        return 3;
    }

    public void m12591h(int i) {
        this.f27254d = i;
    }

    public int hashCode() {
        return this.f27254d;
    }

    @Override
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.f27254d + '}';
    }
}
