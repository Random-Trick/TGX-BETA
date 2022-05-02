package p249r8;

import java.nio.ByteBuffer;
import p258s2.C8632e;

@AbstractC8385g(tags = {20})
public class C8391m extends AbstractC8380b {
    public int f27253d;

    @Override
    public void mo12590e(ByteBuffer byteBuffer) {
        this.f27253d = C8632e.m11862n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f27253d == ((C8391m) obj).f27253d;
    }

    public int hashCode() {
        return this.f27253d;
    }

    @Override
    public String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.f27253d) + '}';
    }
}
